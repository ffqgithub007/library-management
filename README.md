# 图书管理系统

图书管理系统是一个基于Java的简单图书管理应用，允许用户进行图书的增删改查操作。

## 功能特点
- 用户注册和登录
- 图书的增加、删除、修改和查询
- 借阅管理
- 权限控制
- 图书卡管理
- 图书公告管理
- 图书仓库管理
- 图书上下架管理
- 系统管理

## 待完善功能
- 

## 接口文档 
- Swagger访问链接：http://localhost:8080/swagger-ui.html

## 项目架构目录结构



## 技术栈
- Java 8
- Spring Boot
- Spring Security/Jwt
- Thymeleaf
- MySQL
- Maven
- H2
- Swagger


## 环境搭建
### 技术要求
- Java 8 或更高版本
- Maven 3.6 或更高版本

### 安装步骤
1. 克隆仓库到本地机器
 git clone https://github.com/ffqgithub007/library-management.git
 
2. 安装MySQL和初始化数据库-执行sql脚本【sql目录中的book.sql】

3. idea导入maven项目

4.直接运行即可 
   启动类：com.net.library.LibraryManagementApplication
   
5.浏览器访问 
    http://localhost:8080/index