package com.ing.school.service.impl;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.ing.school.constants.LoginConstants;
import com.ing.school.constants.UserStatusConstants;
import com.ing.school.controller.auth.AuthUtil;
import com.ing.school.controller.auth.UserInfo;
import com.ing.school.dao.mapper.UserMapper;
import com.ing.school.dao.po.User;
import com.ing.school.dao.po.UserExample;
import com.ing.school.service.UserService;
import com.ing.school.utls.CacheUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

/**
 * Created by yujingyang on 2018/4/28.
 */
@Service
public class UserServiceImpl implements UserService, ApplicationContextAware {
    @Autowired
    UserMapper userMapper;

    @Override
    public String pushPermissionCode(String telephone) {
        try {
            //设置超时时间-可自行调整
            String code = "";
            Random random = new Random();
            for (int i = 0; i < 6; i++) {
                code += random.nextInt(10);
            }
            System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
            System.setProperty("sun.net.client.defaultReadTimeout", "10000");
//初始化ascClient需要的几个参数
            final String product = "Dysmsapi";//短信API产品名称（短信产品名固定，无需修改）
            final String domain = "dysmsapi.aliyuncs.com";//短信API产品域名（接口地址固定，无需修改）
//替换成你的AK
            final String accessKeyId = "LTAIGF5AAOfUZhuU";//你的accessKeyId,参考本文档步骤2
            final String accessKeySecret = "zwFaqfst2Etlh8xFr94P0XSFqe6SJD";//你的accessKeySecret，参考本文档步骤2
//初始化ascClient,暂时不支持多region（请勿修改）
            IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId,
                    accessKeySecret);
            DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
            IAcsClient acsClient = new DefaultAcsClient(profile);
            //组装请求对象
            SendSmsRequest request = new SendSmsRequest();
            //使用post提交
            request.setMethod(MethodType.POST);
            //必填:待发送手机号。支持以逗号分隔的形式进行批量调用，批量上限为1000个手机号码,批量调用相对于单条调用及时性稍有延迟,验证码类型的短信推荐使用单条调用的方式；发送国际/港澳台消息时，接收号码格式为00+国际区号+号码，如“0085200000000”
            request.setPhoneNumbers(telephone);
            //必填:短信签名-可在短信控制台中找到
            request.setSignName("阿里云短信测试专用");
            //必填:短信模板-可在短信控制台中找到
            request.setTemplateCode("SMS_136415029");
            //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
            //友情提示:如果JSON中需要带换行符,请参照标准的JSON协议对换行符的要求,比如短信内容中包含\r\n的情况在JSON中需要表示成\\r\\n,否则会导致JSON在服务端解析失败
            request.setTemplateParam("{\"code\":\"" + code + "\"}");
            //可选-上行短信扩展码(扩展码字段控制在7位或以下，无特殊需求用户请忽略此字段)
            //request.setSmsUpExtendCode("90997");
            //可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
            request.setOutId("yourOutId");
            //请求失败这里会抛ClientException异常
            SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);
            if (sendSmsResponse.getCode() != null && sendSmsResponse.getCode().equals("OK")) {
                return "";
            } else {
                System.out.println(sendSmsResponse.getCode() + " " + sendSmsResponse.getMessage());
                throw new RuntimeException("短信服务调用失败");
            }

        } catch (ClientException e) {
            e.printStackTrace();
            throw new RuntimeException("短信服务调用失败");
        }

    }

    @Override
    public UserInfo login(String telephone, String checkCode) {
        String telephoneKey = LoginConstants.TELEPHONE_KEY + telephone;
        String checkCodeCache = CacheUtils.get(telephoneKey);
        CacheUtils.remove(telephoneKey);
        if (checkCodeCache != null) {
//            if (checkCodeCache != null && checkCodeCache.equals(checkCode)) {
            UserExample userExample = new UserExample();
            userExample.createCriteria().andTelephoneEqualTo(telephone).andStatusEqualTo(UserStatusConstants.AFTER_REGISTERED);
            List<User> userList = userMapper.selectByExample(userExample);
            if (userList.size() != 1)
                return null;
            User userDto = userList.get(0);
            UserInfo userInfo = new UserInfo();
            userInfo.setTelephone(userDto.getTelephone());
            userInfo.setAvatarUrl(userDto.getAvatarUrl());
            userInfo.setName(userDto.getName());
            userInfo.setUserId(userDto.getId());
            return userInfo;
        }
        return null;
    }


    @Override
    public Integer createUser(String telephone, String checkCode) {
        String telephoneKey = LoginConstants.TELEPHONE_KEY + telephone;
        String checkCodeCache = CacheUtils.get(telephoneKey);
        CacheUtils.remove(telephoneKey);
        //if (checkCodeCache != null && checkCodeCache.equals(checkCode)) {
        if (checkCodeCache != null) {
            UserExample userExample = new UserExample();
            userExample.createCriteria().andTelephoneEqualTo(telephone);
            List<User> userList = userMapper.selectByExample(userExample);
            User user = new User();
            if (userList.size() > 0) {
                user = userList.get(0);
                if (UserStatusConstants.AFTER_REGISTERED.equals(user.getStatus())) {
                    throw new RuntimeException("该手机号已注册");
                } else {
                    user.setTelephone(telephone);
                    user.setStatus(UserStatusConstants.WAIT_FOR_REGISTER);
                    return user.getId();
                }
            }
            user.setTelephone(telephone);
            user.setStatus(UserStatusConstants.WAIT_FOR_REGISTER);
            userMapper.insertSelective(user);
            return user.getId();
        }
        return null;
    }

    @Override
    public User getUserInfo() {
        return userMapper.selectByPrimaryKey(AuthUtil.getUserId());
    }

    @Override
    public UserInfo editUserInfo(User user, Integer registerId) {
        user.setId(registerId);
        user.setStatus(UserStatusConstants.AFTER_REGISTERED);
        userMapper.updateByPrimaryKeySelective(user);
        UserInfo userInfo = new UserInfo();
        userInfo.setTelephone(user.getTelephone());
        userInfo.setAvatarUrl(user.getAvatarUrl());
        userInfo.setName(user.getName());
        userInfo.setUserId(user.getId());
        return userInfo;
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        applicationContext.getBean(UserService.class);
    }
}
