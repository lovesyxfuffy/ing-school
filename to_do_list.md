### 管理界面
1. 登不登陆都可以获取到接口内容，这个如果方便可以改一下，必须登录，提高安全性。
2. 广告位配置了内容，接口返回成功，但是用户界面并没有收到。
3. 申请列表缺少跟进状态和跟进信息；
4. 缺少客户收藏列表；
5. 获取精品学校的接口返回出错 api/manage/school/getChoicestSchool；
6. 文件上传接口404 /api/manage/file/upload；
7. 缺导入模板；
8. /api/manage/school/schoolList 返回的id为null、所在城市、坐标、院校类型、院校性质、费用均返回了null，不知道是缺少数据的原因还是其他原因，希望补充数据测试；
9. api/manage/school/addChoicestSchool 设为精选成功，但是并没有体现在api/manage/school/getChoicestSchool，或许是因为这个接口报错了；
10. /api/manage/school/addSchoolInfo 404了。


### 用户界面
1. 搜索出来的学校，默认按照收藏量排序，可以选择按照分数线的高低倒叙；
2. 用户提交申请，接口出错；/api/operator/apply/add
3. 用户a上传的头像叫'a.jpg',用户b也上传了头像也叫'a.jpg',则a的头像变成了b上传的头像。就是即是是不一样的图片，只要名字相同就会被覆盖掉。
4. 不过注册什么手机号，都提示已经注册过。