#### 管理员界面
5. /api/manage/apply/getApplyInfo/{userid} 返回的项目少了schoolType，currendGradeCode这两个返回了null。

8. 详情页里面 有一个介绍图，学校列表里面也有一个小图。在详情页里面 返回的是headPictureUrl；在列表页里面，返回的是mainPicture；在用户界面/api/manage/school/addSchoolInfo提交的是mainPicture。
 (详情页头图-headPicture 学校基础信息-mainPicture addSchoolInfo(学校详情) 提交的是headPicture 文档没错)
——————————————在配置详情页这个接口里把两个图的接口都加上


6. 删Excel的主页图 -- 已解决

7.  广告位，从管理员页面更新，没写入数据库。

8. 富文本编辑器的每一个项目的设置应该是独立的

## 前端
筛选那里发两遍请求是因为，要先去拿到有几页数据，创建分页，然后再请求一下来获取第一页的数据，所以发了两遍。。
小地图是显示出来了，但是那个位置好像就是个无人区吧。。