#### 管理员界面
5. /api/manage/apply/getApplyInfo/{userid} 返回的项目少了schoolType，currendGradeCode这两个返回了null。

7. 富文本配置，只有synopsis和applicationGuide成功，其他都是配置显示成功，但是没到数据库里。

8. 详情页里面 有一个介绍图，学校列表里面也有一个小图。在详情页里面 返回的是headPictureUrl；在列表页里面，返回的是mainPicture；在用户界面/api/manage/school/addSchoolInfo提交的是mainPicture。——————————————在配置详情页这个接口里再加一个headPictureUrl

9. /api/manage/apply/getApplyList 没有返回age

6. 删Excel的主页图

7.  广告位，从管理员页面更新，没写入数据库。

8. 富文本编辑器的每一个项目的设置应该是独立的

## 前端
筛选那里发两遍请求是因为，要先去拿到有几页数据，创建分页，然后再请求一下来获取第一页的数据，所以发了两遍。。
小地图是显示出来了，但是那个位置好像就是个无人区吧。。