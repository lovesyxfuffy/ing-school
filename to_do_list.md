### 用户界面
1. 搜索返回了500-null
2. /api/record/get/schoolInfo/{schoolId} 返回null。
3. /api/operator/search/schoolList 的筛选条件，costIntervalCode费用区间似乎并不起作用。
4. api/operator/collection/add 收藏了一个学校之后，在个人中心没有查到记录。 【初步怀疑2和4都是schoolId的问题吧】


#### 管理员界面
1. 没有精选学校的时候，api/manage/school/getChoicestSchool返回了500，null。
2. /api/manage/school/addChoicestSchool在后台设置精选学校成功之后，前台没有显示出来。/api/manage/school/getChoicestSchool也依然报错500-null。
3. 在后台配置了学校的具体情况之后，用户界面/api/record/get/schoolInfo/{schoolId} 报错：查询学校详情错误
4. /api/manage/school/addSchoolInfo 这个接口应该是，同一个id，每次传入的内容覆盖前面的内容，不是新建一个记录。【看数据库】
5. /api/manage/apply/getApplyInfo/{userid} 返回的项目和用户界面的不一样