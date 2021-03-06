# 留学项目前后端接口文档
## 1.统一格式
### 1.请求格式
使用application/json请求头 数据放入requestBody中
<br/>例如:
```json
{
  "requestParamName":"requestParamValue"
}
```
### 2.响应格式
```json
{
  "data":{
    "responseParamName":"responseParamValue"
  },
  "message":"请求成功",
  "status":1
}
```
status枚举如下:
+ 1:true
+ 2:false
+ 200:响应成功（用于无内容响应）
+ 500:服务器错误（此时需要弹框的报错内容会包括入message中 前端可以统一处理）
+ 403:没有访问权限

## 2.common接口

### 1.统一枚举接口
```json
{
  "api":"/api/common/enum/{category}",
  "method":"post",
  "request":{
    "parentCode":"xxx"//例如 根据国家查大洲 需要传国家code
  },
  "response":{
    "data":[
      {
        "code":"code1",
        "name":"name1"
      }
    ],
      "message":"请求成功",
      "status":1
  }
}
```
#### 枚举category整理【gender、englishLevelType不需要登录，其他的随意】
<table>
<th>枚举描述</th><th>category</th>
<tr>
<td>院校性质</td><td>schoolType</td>
</tr>
<tr>
<td>性别</td><td>gender</td>
</tr>
<tr>
<td>外语等级类型（雅思托福）</td><td>englishLevelType</td>
</tr>
<tr>
<td>年级枚举</td><td>grade</td>
</tr>
<tr>
<td>语种枚举</td><td>language</td>
</tr>
<tr>
<td>国家枚举</td><td>country</td>
</tr>
<tr>
<td>洲/省枚举</td><td>state</td>
</tr>
<tr>
<td>城市枚举</td><td>city</td>
</tr>
<tr>
<td>大洲枚举</td><td>continent</td>
</tr>
<tr>
<td>院校性质（男校女校不限）</td><td>schoolGenderType</td>
</tr>
<tr>
<td>院校宗教性质</td><td>religionType</td>
</tr>
<tr>
<td>花费区间</td><td>costInterval</td>
</tr>
<td>hasEsl</td><td>hasEsl</td>
</tr>

</table>

## 2.前台接口

### 1.收藏列表
```json
{
  "url":"/api/record/collectionList",
  "method":"post",
  "request":{
    "pageNo":1,
    "pageSize":20
  },
  "response":{
    "tableBody":[{
      "collectionId":5,
      "id":4,//school id
      "schoolName":"xxxx学校",
      "address":"xxxxxxxxxx",
      "mainPicture":"xxxxxxxxxxxxx",
      "positionX":145.64,//经度
      "positionY":44.56//纬度
    },{}],
    "page":{
      "pageNo":1,
      "pageSize":20,//一页多少,
      "total":502//总条数
    }
  }
}
```
### 2.删除收藏
```json
{
  "url":"/api/operator/collection/delete/{collectionId}",
  "method":"post",
  "request":{},
  "response":
    {
       "data":{},
       "message":"请求成功",
       "status":1
    }
}
```
### 3.添加收藏
```json
{
  "url":"/api/operator/collection/add",
  "method":"post",
  "request":{
    "schoolId":15
  },
  "response":
    {
       "data":{},
       "message":"请求成功",
       "status":1
    }
}
```

### 3.1 .删除收藏
```json
{
  "url":"/api/operator/collection/delete",
  "method":"post",
  "request":{
    "schoolId":15
  },
  "response":
    {
       "data":{},
       "message":"请求成功",
       "status":1
    }
}
```
### 4.获取申请列表
```json
{
  "url":"/api/record/apply/list",
  "method":"post",
  "request":{
      "pageNo":1,
      "pageSize":20//一页多少,
  },
  "response":{
    "data":{
        "tableBody":[{
          "id":5,
          "schoolName":"xxxxxx",
          "followUpStatus":1,//0未跟进 1已跟进
          "followUpContent":"xxxx",
          "applyTime":1687812312//unix时间戳
        },{}],
        "page":{
            "pageNo":1,
            "pageSize":20,//一页多少,
            "total":502//总条数
        }
    },
    "message":"请求成功",
    "status":1
  }
}
```

### 5.删除申请
```json
{
  "url":"/api/operator/apply/delete/{applyId}",
  "method":"post",
  "request":{
  },
  "response":{
    "data":{
    },
    "message":"请求成功",
    "status":1
  }
}
```

### 6.新增申请 **(hcy改动过)
```json
{
  "url":"/api/operator/apply/add",
  "method":"post",
  "request":{
        "schoolId":11,
        "schoolName":"学校名称",
        "studentName":"学生姓名",
        "age":22,
        "genderCode":"性别枚举值",
        "telephone":"17621181236",
        "address":"地址",
        "birthDay":"2017-09-20",
        "motherLand":"中国",
        "attendanceGrades":"我也不知道这是啥,跟着图片写的",
        "attendanceDate":"2017-03-24",//使用datepicker组件 传格式化日期
        "cityzenshipCode":"中国",//展示性信息 直接传字符串
        "cityCode":"xx",
        "stateCode":"xx",
        "zip":"ccc",
        "countryCode":"xxx", 
        "homePhone":"111111111",
        "nativeLanguageCode":"1",
        "secondLanguageCode":"2",//第二语言枚举
        "studentEmail":"1@1.com",
        "currentGradeCode":"xx", 
        "applyingGradeCode":"xx",//申请年级枚举值,
        "passportNumber":"xxxx",
        "skypeId":"skypeId",
        "wechatId":"微信号",
        "currentSchoolName":"这是学校姓名",
        "currentSchoolAddress":"这是地址",
        "currentSchoolEmail":"",
        "currentSchoolPhone":"1123124123123",
        "currentSchoolCounselor":"导员名字",
        "currentSchoolCounselorEmail":"123@sdu.com.cn", // 导员的email
        "currentSchoolGuidancePhone":"",
        "schoolTypeCode":"2222",//学校类型枚举 ***hcy 加入数据库
        "englishLevelTypeCode":"",
        "englishLevelScore":"",

  },
  "response":{
      "data":{
        "id":15
      },
      "message":"请求成功",
      "status":1
  }
}
```
### 7.获取个人信息接口（获取当前登录人）
```json
{
  "url":"/api/record/user/get",
  "method":"post",
  "request":{},
  "response":{
    "data":{
        "name":"xxxxx",
        "nickName":"xxx",
        "idcard":"xxxxxx",
        "telephone":"17621181235",
        "age":15,
        "genderCode":"2",
        "address":"xxxxxxx",
        "avatarUrl":"xxxxxxx",//头像url
        "englishLevelCode":"2",//TOEFL或IELTS的code
        "englishLevelScore":45.55
    },
    "status":1
  }

}
```

### 8.编辑个人信息接口 *（url变更-参数去掉id-取登录人id）【不需要登录--注册时候要用到】 *(05-16变更englishLevelCode --> englishLevelTypeCode nickName-->name)
```json
{
  "url":"/api/operator/user/edit",
  "method":"post",
  "request":{
    "name":"xxx",
    "telephone":"17621181235",
    "age":15,
    "genderCode":"2",
    "address":"xxxxxxx",
    "avatarUrl":"xxxxxxx",//头像url
    "englishLevelTypeCode":"2",//TOEFL或IELTS的code
    "englishLevelScore":45.55
  },
 "response":{
     "data":{
     },
     "message":"请求成功",
     "status":1
 }
}
```

### 9.搜索 *(URL变更 + hasEsl变更)
```json
{
  "url":"/api/operator/search/schoolList",
  "method":"post",
  "request":{
    "keyword":"xxxx",//搜索框里内容
    "continentCode":[],
    "countryCode":[],
    "stateCode":[],
    "schoolGenderTypeCode":[],
    "schoolTypeCode":[],
    "religionTypeCode":[],
    "hasEsl":[],
    "costIntervalCode":[],
    "sortByScore":false,
    "pageNo":5,
    "pageSize":10
  },
  "response":{
       "data":{
          "tableBody":[
             {
                "id":3,
                "schoolName":"xxxx",
                "countryName":"美国·纽约",//国家+大洲名称放到一个字段
                "mainPicture":"xxxxxxxx",//小图url
                "positionX":27.44,//纬度 正数表示北半球,负数南半球（google map api和baidu map api都是如此）
                "positionY":-116.84//经度 正数表示东经 负数表示西经 同google map api和baidu
             },{}
        ],
        "page":{
          "pageNo":1,
          "pageSize":20,
          "total":40
        }
       },
       "message":"请求成功",
       "status":1
   }
}
```

### 10.返回轮播图信息（精品学校）* （URL变更）【不需要登录--首页】
```json
{
    "url":"/api/common/choicestSchool",
    "method":"post",
    "request":{

    },
    "response":{
      "data":[
        {
            "schoolId":4,
            "mainPicture":"",
            "schoolName":"xxxx",
            "schoolEnglishName":"xxxx",
            "choicestContent":"xxx"
        }
      ]
    }
}
```

### 11.footer内容获取(已废弃)
```json

```

### 12.广告位获取 *(URL变更)【不需要登录--首页】
```json
{
  "url":"/api/common/ad",
  "method":"post",
  "request":{
  },
  "response":{
    "data":"广告html",
    "status":1
  }
}
```
### 13.获取验证码【不需要登录】
```json
{
  "url":"/api/user/getCheckCode",
  "method":"post",
  "request":{
    "telephone":"17655512321"
  },
  "response":{
    "data":"",
    "status":1
  }
}
```

### 14.注册第一步（验证手机号）【不需要登录】
```json
{
  "url":"/api/user/register",
  "method":"post",
  "request":{
    "telephone":"17655512321",
    "checkCode":"223345"
  },
  "response":{
    "data":{
    },
    "status":1
  }
}
```

### 15.注册第二步
```json
{
  "url":"/api/user/perfect",
  "method":"post",
  "request":{
    "name":"xxx",
    "idcard":"xxxxx",
    "genderCode":"2",
    "address":"xxxxx",
    "englishLevelTypeCode":"4",
    "englishLevelScore":100.6
  },
  "response":{
    "data":"",
    "status":1
  }
}
```
### 16.登录（在获取验证码接口后调用）【不需要登录】
```json
{
  "url":"/api/user/login",
  "method":"post",
  "request":{
    "telephone":"17654321234",
    "checkCode":"223456"
  },
  "response":{
    "data":"",
    "status":1
  }
}
```

### 16.5 登出
```json
{
  "url":"/api/user/logout",
  "method":"post",
  "request":{
  },
  "response":{
    "data":"",
    "status":1
  }
}
```

### 17.学校详情页接口
```json
{
  "url":"/api/record/get/schoolInfo/{schoolId}",
  "request":{},
  "response":{
    "headPictureUrl":"xxxxxxx",
    "schoolName":"xxxx",
    "schoolEnglishName":"xxxx",
    "isCollected":false,//是否被收藏
    "positionX":"xxx",
    "positionY":"xxx",
    "synopsis":"xxx",
    "badge":"xxxx",
    "applicationGuide":"xxx",
    "classes":"xxxx",
    "advantage":"xxxx",
    "afterGraduation":"xxxx",
    "applyCondition":"xxxx",
    "activity":"xxxx",
    "applyCase":"xxxx",
    "accommodation":"xxxx"

  }
}
```

### 18.获取申请详情接口
```json
{
  "url":"/api/record/applyInfo/get/{applyId}",
  "method":"post",
  "request":{
  },
  "response":{
        "data":{
                "studentName":"学生姓名",
                "age":22,
                "genderCode":"性别枚举值",
                "telephone":"17621181236",
                "address":"地址",
                "attendanceGrades":"我也不知道这是啥,跟着图片写的",
                "attendanceDate":"2017-03-24",//使用datepicker组件 传格式化日期
                "currentSchoolEmail":"123@sdu.com.cn",
                "currentSchoolPhone":"1123124123123",
                "currentSchoolAddress":"这是地址",
                "currentSchoolName":"这是学校姓名",
                "wechatId":"微信号",
                "skypeId":"skypeId",
                "passportNumber":"xxxx",
                "applyingGradeCode":"xx",//申请年级枚举值,
                "currentGradeCode":"xx",
                "studentEmail":"1@1.com",
                "secondLanguageCode":"2",//第二语言枚举
                "nativeLanguageCode":"1",
                "cityzenshipCode":"xx",
                "homePhone":"111111111",
                "countryCode":"xxx",
                "zip":"ccc",
                "cityCode":"xx",
                "stateCode":"xx",
                "applyTime":15098824213,//Unix时间戳
                "englishLevelTypeCode":"4",
                "englishLevelScore":"S+"
        },
        "status":1
  }
}
```

### 19.统一文件上传接口 *URL变更
```json
{
  "url":"/api/record/file/upload",
  "method":"post",
  "request":{
    "file":""
  },
  "response":{
    "data":"/static/uploadFileUrl",
    "status":1
  }
}
```

### 20.验证用户是否登录
```json
{
  "url":"/api/user/check",
  "method":"post",
  "request":{

  },
  "response":{
    "data":true,//true登录 false没登录
    "status":1
  }

}
```

### 3.后台部分

### 1.管理员登录
```json
{
  "url":"/api/manage/account/login",
  "method":"post",
  "request":{
    "account":"xxxxx",
    "password":"xxxxx"
  },
  "response":{
    "data":"",
    "status":1
  }
}
```

### 2.统一文件上传接口（包括excel解析）
```json
{
  "url":"/api/manage/file/upload",
  "method":"post",
  "request":{
    "resolver":"school",//normal 不处理,直接返回链接,school 学校excel上传
    "file":""//这里放文件的二进制流
  }
}
```
### 3.创建账号
```json
{
  "url":"/api/manage/account/add",
  "method":"post",
  "request":{
    "account":"xxx",
    "password":"xxxxx"
  },
  "response":{
    "data":"",
    "status":1
  }
}
```

### 4.广告位设置
```json
{
  "url":"/api/manage/config/ad",
  "method":"post",
  "request":{
    "text":"xxxxxx"
  },
  "response":{
    "data":"",
    "status":1
  }
}
```
### 5.客户列表页
```json
{
  "url":"/api/manage/user/getUserList",
  "method":"post",
  "request":{
    "pageNo":3,
    "pageSize":1
  },
  "response":{
    "data":{
      "tableBody":[
        {
        "id":5,
        "name":"xxx",
        "age":22,
        "phone":"xxxx"
        },{}
        ],
        "page":{
          "pageNo":1,
          "pageSize":2,
          "total":500
        }
    }
  }
}
```

### 6.客户详情页
```json
{
  "url":"/api/manage/user/userInfo/{userId}",
  "method":"post",
  "request":{

  },
  "response":{
    "nickName":"xxx",
    "telephone":"17621181235",
    "age":15,
    "genderCode":"2",
    "address":"xxxxxxx",
    "englishLevelCode":"2",//TOEFL或IELTS的code
    "englishLevelScore":45.55,
    "applyList":[
      {
      "id":5,
      "schoolName":"xxxxxx",
      "applyTime":1687812312//unix时间戳
      },{}
    ]
  }
}
```

### 7.所有申请列表页
```json
{
  "url":"/api/manage/apply/getApplyList",
   "method":"post",
  "request":{
    "sortOrder":"desc",//按照申请时间正序、倒序排序-asc升序 desc降序 默认降序
    "startTime":"yyyy-MM-dd",
    "pageNo":1,
    "pageSize":20
  },
  "response":{
    "data":{
      "tableBody":[
            {
              "id":5,
              "userId":7,
              "name":"xxx",
              "age":"xxx",
              "schoolId":6,
              "schoolName":"xxxx",
              "schoolEnglishName":"xxxx",
              "telephone":"111111111111"
            }
        ],
        "page":{
          "pageNo":1,
          "pageSize":20,
          "total":20
        }
    }
  }
}
```

### 8.申请详情页
```json
{
  "url":"/api/manage/apply/getApplyInfo/{userId}",
  "method":"post",
  "request":{

  },
  "response":{
    "data":{
        "studentName":"学生姓名",
        "age":22,
        "genderCode":"性别枚举值",
        "telephone":"17621181236",
        "address":"地址",
        "attendanceGrades":"我也不知道这是啥,跟着图片写的",
        "attendanceDate":"2017-03-24",//使用datepicker组件 传格式化日期
        "currentSchoolEmail":"123@sdu.com.cn",
        "currentSchoolPhone":"1123124123123",
        "currentSchoolAddress":"这是地址",
        "currentSchoolName":"这是学校姓名",
        "wechatId":"微信号",
        "skypeId":"skypeId",
        "passportNumber":"xxxx",
        "applyingGradeCode":"xx",//申请年级枚举值,
        "currentGradeCode":"xx",
        "studentEmail":"1@1.com",
        "secondLanguageCode":"2",//第二语言枚举
        "nativeLanguageCode":"1",
        "cityzenshipCode":"xx",
        "homePhone":"111111111",
        "countryCode":"xxx",
        "zip":"ccc",
        "cityCode":"xx",
        "stateCode":"xx",
        "applyTime":15098824213,//Unix时间戳
        "englishLevelTypeCode":"4",
        "englishLevelScore":"S+"
    }
  }
}
```

### 9.学校信息完善
```json
{
  "url":"/api/manage/school/addSchoolInfo",
  "method":"post",
  "request":{
    "schoolId":4,
    "mainPictureUrl":"xxxxx",
    "headPictureUrl":"xxxx",
    "synopsis":"xxx",
    "badge":"xxxx",
    "applicationGuide":"xxx",
    "classes":"xxxx",
    "advantage":"xxxx",
    "afterGraduation":"xxxx",
    "applyCondition":"xxxx",
    "activity":"xxxx",
    "applyCase":"xxxx",
    "accommodation":"xxxx"
  },
  "response":{
    "data":"",
    "status":1
  }
}
```

### 10.学校列表（列表仅展示基础信息）
```json
{
  "url":"/api/manage/school/schoolList",
  "method":"post",
  "request":{

  },
  "response":{
    "data":{
      "tableBody":[
            {
              "id":5,
              "schoolName":"xxxx",
              "schoolEnglishName":"xxx",
              "continentName":"xx",
              "countryName":"xxxx",
              "stateName":"xxx",
              "cityName":"xxx",
              "schoolTypeName":"xxx",
              "schoolGenderTypeName":"xxx",
              "religionTypeName":"xxx",
              "hasEsl":true
            }
          ],
      "page":{
        "pageNo":2,
        "pageSize":20,
        "total":21
      }
    },
    "status":1
  }
}
```


### 11.学校详情
```json
{
  "url":"/api/manage/school/getSchoolInfo/{schoolId}",
  "method":"post",
  "request":{

  },
  "response":{
    "data":{
        "schoolName":"xxxx",
        "schoolEnglishName":"xxx",
        "continentName":"xx",
        "countryName":"xxxx",
        "stateName":"xxx",
        "cityName":"xxx",
        "schoolTypeName":"xxx",
        "schoolGenderTypeName":"xxx",
        "religionTypeName":"xxx",
        "hasEsl":true,
        "synopsis":"xxx",
        "badge":"xxxx",
        "applicationGuide":"xxx",
        "classes":"xxxx",
        "advantage":"xxxx",
        "afterGraduation":"xxxx",
        "applyCondition":"xxxx",
        "activity":"xxxx",
        "applyCase":"xxxx",
        "accommodation":"xxxx",
        "score":"分数"
    }
  }
}
```


### 12.获取所有精品学校
```json
{
  "url":"/api/manage/school/getChoicestSchool",
  "method":"post",
  "request":{
  },
  "response":{
    "data":{
        "id":4,
        "schoolId":3,
        "schoolName":"xxxxx",
        "choicestContent":"xxxxx"
    },"status":1

  }
}
```

### 13.新增精品学校
```json
{
  "url":"/api/manage/school/addChoicestSchool",
  "method":"post",
  "request":{
    "schoolId":5,
    "mainPicture":"xxxx",
    "choicestContent":"xxxx"
  },
  "response":{
    "data":5,
    "status":1
  }
}
```

### 14.删除接口
```json
{
  "url":"/api/manage/school/deleteSchool/{id}",
  "url":"/api/manage/school/deleteChoicestSchool/{id}",
  "method":"post",
  "request":{

  },
  "response":{
    "data":"",
    "status":1
  }
}
```

### 15.跟进申请
```json
{
    "url":"/api/manage/apply/followUp",
    "request":{
        "applyId":5
        "followUpContent":"这个学生不错"
    },
    "response":{
        "data":{},
        "status":1
    }

}
```

### 16.获取客户申请列表
```json
{
    "url":"/api/manage/apply/getCollectionByUserId
    "method":"post",
      "request":{
          "userId":3
          "pageNo":1,
          "pageSize":20//一页多少,
      },
      "response":{
          "tableBody":[{
            "collectionId":5,
            "id":4,//school id
            "schoolName":"xxxx学校",
            "address":"xxxxxxxxxx",
            "mainPicture":"xxxxxxxxxxxxx",
            "positionX":145.64,//经度
            "positionY":44.56//纬度
          },{}],
          "page":{
            "pageNo":1,
            "pageSize":20,//一页多少,
            "total":502//总条数
          }
        }
}
```

