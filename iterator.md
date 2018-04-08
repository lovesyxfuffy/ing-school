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



