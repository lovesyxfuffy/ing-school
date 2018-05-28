#### 管理员界面
5. /api/manage/apply/getApplyInfo/{userid} 返回的项目少了schoolType，attendanceGrades和currendGradeCode这两个返回了null。


7. 富文本配置，只有synopsis和applicationGuide成功，其他都是配置显示成功，但是没到数据库里。

8. 详情页里面 有一个介绍图，学校列表里面也有一个小图。在详情页里面 返回的是headPictureUrl；在列表页里面，返回的是mainPicture；在用户界面/api/manage/school/addSchoolInfo提交的是mainPicture。

9. /api/manage/apply/getApplyList 没有返回age

6. 删Excel的主页图
