
# JavaWeb学习总结(一)
## JavaWeb开发入门
#### 基本概念
- web发展：静态web、动态web
- 静态web开发技术：html
- 动态web开发技术：Servlet/JSP、ASP、PHP等
- 在Java中，动态web开发的技术统称Javaweb
- web应用开发好后，如果想要外界访问，需把web所在目录交给web服务器，这个过程称为虚拟目录的映射

#### 静态web
一图解所有👇 

![web静态][image-1]

存在一些问题：
1. web页面无法动态更新，展示页面所有人都一样
2. 无法连接数据库，无法与用户进行交互

#### 动态web
一图解所有 👇

![web动态][image-2]

如上，动态web主要是与通过用户的操作与数据库进行交互，实现动态展示页面的功能

## Web服务器
#### 基本概念
web服务器是常驻程序，是可以向发出请求的浏览器（客户端）提供文档的程序，因为它只有在接受到来自客户端的请求时，才会做出响应，因此，它属于一种被动程序

常见的web服务器
- WebLogic
- WebSphere
- Tomcat
- IIS

## Tomcat服务器学习和使用(一)

#### 浏览器与服务器交互的过程
一图解所有 👇
![][image-3]

## Servlet开发(一)

servlet是一个供其他java程序调用的类，它不能独立运行，它的运行依靠servlet引擎来控制和调度，用ide编辑器进行创建时，其内部自带doget和dopost方法，用于对客户端请求所需要响应的内容，同时客户端是通过地址访问web资源，因此每次写完servlet，还需要在web.xml下进行地址的映射配置

## Servlet开发(二)

#### ServletContext
每次启动web时，会生成一个servletContext，用于web应用中的所有servlet共享数据



[image-1]:	https://github.com/hacksman/learning/blob/master/picture/web_stable.png
[image-2]:	https://github.com/hacksman/learning/blob/master/picture/web_dynamic.png
[image-3]:	https://github.com/hacksman/learning/blob/master/picture/jiaohu.png