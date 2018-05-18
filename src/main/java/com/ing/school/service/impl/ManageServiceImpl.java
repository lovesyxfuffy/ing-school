package com.ing.school.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ing.school.dao.mapper.ApplyMapper;
import com.ing.school.dao.mapper.UserMapper;
import com.ing.school.dao.po.ApplyExample;
import com.ing.school.dao.po.User;
import com.ing.school.dao.po.UserExample;
import com.ing.school.dto.ListDto;
import com.ing.school.dto.PageDto;
import com.ing.school.dto.UserDto;
import com.ing.school.service.ManageService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yujingyang on 2018/5/18.
 */
@Service
public class ManageServiceImpl implements ManageService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    ApplyMapper applyMapper;

    @Override
    public ListDto<User> getUserList(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPageNo(), pageDto.getPageSize());
        List<User> result = userMapper.selectByExample(new UserExample());

        ListDto<User> listDto = new ListDto<>();
        listDto.setTableBody(result);
        PageDto page = new PageDto();
        page.setTotal(((Page) result).getTotal());
        page.setPageSize(pageDto.getPageSize());
        page.setPageNo(pageDto.getPageNo());

        listDto.setPage(page);
        return listDto;
    }

    @Override
    public UserDto getUserInfo(Integer userId){
        User user = userMapper.selectByPrimaryKey(userId);
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(user,userDto);
        ApplyExample applyExample = new ApplyExample();
        applyExample.createCriteria().andUserIdEqualTo(userId);
        userDto.setApplyList(applyMapper.selectByExample(applyExample));
        return userDto;
    }
}
