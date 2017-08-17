# Play slick  简单连通mysql
#play框架文档地址
```
https://playframework.com/documentation/2.6.x/Home
```
## 下载
scala下载地址--版本2.12.3
```
http://www.scala-lang.org/download/
```
sbt下载地址--版本1.0.0
```
http://www.scala-sbt.org/download.html
```
## 配置
打开配置文件conf/application.conf，配置Mysql连接（用的是slick db框架）：
```
slick.dbs.default{
  driver="slick.driver.MySQLDriver$"
  db.driver="com.mysql.jdbc.Driver"
  db.url="jdbc:mysql://127.0.0.1:3306/scala_admin?characterEncoding=UTF-8"
  db.user="root"
  db.password="zww626"
}
```
## sbt启动
在项目的根目录下，打开shell控制台。 （shift+右键 -> 选择点击）
```
1.执行sbt
2.执行compile 
3.执行run  若该执行命令加~符号，相当于热部署，实时编译运行代码
sbt手册地址
http://wiki.jikexueyuan.com/project/sbt-getting-started/running.html

```
#route访问接口
conf/routes该文件包括所有的访问地址（接口）
```
```



