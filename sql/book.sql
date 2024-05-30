-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: book
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `book_borrow`
--

DROP TABLE IF EXISTS `book_borrow`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book_borrow` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '用户管理表',
  `ISBN` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '0' COMMENT '图书编号',
  `user_id` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '职工号',
  `user_name` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '用户名称',
  `book_name` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '图书名称',
  `sex` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '性别',
  `phone` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '联系电话',
  `day` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '30' COMMENT '默认天数',
  `borrow_date` date DEFAULT NULL COMMENT '借书日期',
  `return_date` date DEFAULT NULL COMMENT '还书日期',
  `borrow_ifFlag` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '0' COMMENT '借书标识',
  `return_ifFlag` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '0' COMMENT '还书标识',
  `status` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '未还' COMMENT '状态 借书状态/还书状态/无状态',
  `create_time` date DEFAULT '0000-00-00' COMMENT '还书时间',
  `del_flag` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `remark1` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '备注',
  `remark2` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '备注',
  `remark3` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '备注',
  `remark4` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '备注',
  `remark5` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '备注',
  `remark6` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin COMMENT='借阅表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book_borrow`
--

LOCK TABLES `book_borrow` WRITE;
/*!40000 ALTER TABLE `book_borrow` DISABLE KEYS */;
INSERT INTO `book_borrow` VALUES (16,'1001-2','101','fangfeiqiang','x校园漫画2','男','13551859120','30','2024-05-30',NULL,'0','0','未还','0000-00-00','0','','','','','',''),(17,'','qwe','','','男','','','2024-05-30',NULL,'0','0','未还','0000-00-00','1','','','','','','');
/*!40000 ALTER TABLE `book_borrow` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book_card`
--

DROP TABLE IF EXISTS `book_card`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book_card` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
  `card_id` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '卡编号',
  `name` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '用户名称',
  `lend_flag` int DEFAULT '0' COMMENT '借书标识',
  `del_flag` char(2) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '0' COMMENT '假删除',
  `remark1` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '备注',
  `remark2` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '备注',
  `remark3` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '备注',
  `remark4` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '备注',
  `remark5` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '备注',
  `remark6` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin COMMENT='卡信息管理表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book_card`
--

LOCK TABLES `book_card` WRITE;
/*!40000 ALTER TABLE `book_card` DISABLE KEYS */;
INSERT INTO `book_card` VALUES (2,'1001','fangfeiqiang',1,'0','','','','','',''),(5,'1006','测试',5,'0','','','','','',''),(9,'1002','张三',2,'0','','','','','',''),(10,'1003','李四',3,'0','','','','','',''),(11,'1004','王五',4,'0','','','','','','');
/*!40000 ALTER TABLE `book_card` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book_notice`
--

DROP TABLE IF EXISTS `book_notice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book_notice` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
  `title` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '公告标题',
  `author` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '牛牛作家' COMMENT '作者',
  `content` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '公告内容',
  `create_time` date DEFAULT NULL COMMENT '发布时间',
  `del_flag` varchar(10) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '0' COMMENT '删除为1 假删除',
  `remark3` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '备注',
  `remark4` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '备注',
  `remark5` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '备注',
  `remark6` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin COMMENT='公告表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book_notice`
--

LOCK TABLES `book_notice` WRITE;
/*!40000 ALTER TABLE `book_notice` DISABLE KEYS */;
INSERT INTO `book_notice` VALUES (2,'四大名著来咯','牛牛作家','全书主要描写了孙悟空出世及大闹天宫后，遇见了唐僧、猪八戒、沙僧和白龙马，西行取经，一路上历经艰险、妖怪魔法高强，经历了九九八十一难，终于到达西天见到如来佛祖，最终五圣成真的故事。该小说以“唐僧取经”这一历史事件为蓝本，通过作者的艺术加工，深刻地描绘了明代社会现实。','2022-01-06','0','','','',''),(4,'图书来咯！','牛牛作家','《大妖精》上市拉中国神话的妖精是指修炼后的物类，好比人修道成仙那样，妖精经常被人视同于妖怪，可妖同样有好坏之分，即使是妖若心存善念也可修成正果；而人若心存恶念亦会堕落成魔。妖精和妖怪的性质其实不尽相同，区别也不大，有时可混用：「妖怪」是指除人类和神以外存在于天地中的超自然生物，一般由大型猛兽修炼而成，外表通常凶恶吓人，即由于认知限制，人们暂时难以以科学解释的现象或事物；而「妖精」比较偏向大自然事物化身，一般由小型动植物成精，外表通常美丽迷人，会愚弄人类的神怪。','2022-01-04','0','','','',''),(9,'爱情之海','牛牛作家','这个书是非常的好看','2022-01-08','0','','','',''),(10,'老人与海','牛牛作家','该作围绕一位老年古巴渔夫，与一条巨大的马林鱼在离岸很远的湾流中搏斗而展开故事的讲述。尽管海明威笔下的老人是悲剧性的，但他身上却有着尼采“超人”的品质，泰然自若地接受失败，沉着勇敢地面对死亡，这些“硬汉子”体现了海明威的人生哲学和道德理想，即人类不向命运低头，永不服输的斗士精神和积极向上的乐观人生态度。','2022-01-13','0','','','','');
/*!40000 ALTER TABLE `book_notice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book_shelf`
--

DROP TABLE IF EXISTS `book_shelf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book_shelf` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '书架号',
  `ISBN` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '图书编号',
  `shelf` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '架层',
  `book_position` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '详细位置',
  `del_flag` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `remark1` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '备注',
  `remark2` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '备注',
  `remark3` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '备注',
  `remark4` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '备注',
  `remark5` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '备注',
  `remark6` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin COMMENT='书架表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book_shelf`
--

LOCK TABLES `book_shelf` WRITE;
/*!40000 ALTER TABLE `book_shelf` DISABLE KEYS */;
INSERT INTO `book_shelf` VALUES (1,'1001-1','一架层','1排2号','0','','','','','',''),(2,'1001-2','一架层','1排2号','0','','','','','',''),(3,'1001-3','一架层','1排3号','0','','','','','',''),(4,'2002-1','二架层','2排1号','0','','','','','',''),(5,'2002-2','二架层','2排2号','0','','','','','',''),(6,'2002-3','二架层','2排3号','0','','','','','',''),(7,'3003-1','三架层','3排1号','0','','','','','',''),(8,'3003-2','三架层','3排2号','0','','','','','',''),(9,'3003-3','三架层','3排20号','0','','','','','','');
/*!40000 ALTER TABLE `book_shelf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book_warehouse`
--

DROP TABLE IF EXISTS `book_warehouse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book_warehouse` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '图书仓库id',
  `ISBN` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '一本书对应一个ISBN',
  `book_name` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '书名',
  `type` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '文学类' COMMENT '图书类型',
  `publishing_house` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '出版社',
  `author` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '书作者',
  `shelf` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '架层',
  `url` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '图书封面',
  `number` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '0' COMMENT '上架数量',
  `number_jar` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '0' COMMENT '仓库量',
  `status` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '上线' COMMENT '状态',
  `lend_book` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '0' COMMENT '借书数量',
  `return_boot` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '0' COMMENT '还书数量',
  `del_flag` varchar(2) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `remark4` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '备注',
  `remark5` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '备注',
  `remark6` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=74 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin COMMENT='图书仓库表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book_warehouse`
--

LOCK TABLES `book_warehouse` WRITE;
/*!40000 ALTER TABLE `book_warehouse` DISABLE KEYS */;
INSERT INTO `book_warehouse` VALUES (61,'1001-2','x校园漫画2','漫画类','西南大学出版社','张三','一架层','','100','1','上架','0','0','0','','',''),(63,'2002-1','西游记','小说类','人民邮电出版社','吴承恩','二架层',NULL,'99','0','上架','0','0','0','','',''),(64,'2002-2','水浒传','小说类','人民邮电出版社','施耐庵','二架层',NULL,'100','0','上架','0','0','0','','',''),(65,'2002-3','三国演义','小说类','人民邮电出版社','罗贯中','二架层',NULL,'100','0','上架','0','0','0','','',''),(66,'2002-4','红楼梦','小说类','人民邮电出版社','曹雪芹','二架层','','50','0','下架','0','0','0','','',''),(73,'1001-1','x校园漫画1','漫画类','麻花出版社','麻花','一号架','','10','100','上架','0','0','0','','','');
/*!40000 ALTER TABLE `book_warehouse` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_menu`
--

DROP TABLE IF EXISTS `sys_menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sys_menu` (
  `menu_id` bigint NOT NULL AUTO_INCREMENT COMMENT '菜单ID',
  `menu_name` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NOT NULL COMMENT '菜单名称',
  `parent_id` bigint DEFAULT '0' COMMENT '父菜单ID',
  `order_num` int DEFAULT '0' COMMENT '显示顺序',
  `url` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '#' COMMENT '请求地址',
  `target` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '打开方式（menuItem页签 menuBlank新窗口）',
  `menu_type` char(1) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '菜单类型（M目录 C菜单 F按钮）',
  `visible` char(1) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '0' COMMENT '菜单状态（0显示 1隐藏）',
  `is_refresh` char(1) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '1' COMMENT '是否刷新（0刷新 1不刷新）',
  `perms` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL COMMENT '权限标识',
  `icon` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '#' COMMENT '菜单图标',
  `create_by` varchar(64) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin COMMENT='菜单权限表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_menu`
--

LOCK TABLES `sys_menu` WRITE;
/*!40000 ALTER TABLE `sys_menu` DISABLE KEYS */;
INSERT INTO `sys_menu` VALUES (1,'书架管理',0,1,'/system/shelf','','M','0','1','','fa fa-gear','admin','2023-09-09 10:33:19','',NULL,'系统管理目录'),(2,'借阅管理',0,2,'/system/borrow','','M','0','1','','fa fa-video-camera','admin','2023-09-09 10:33:19','',NULL,'系统监控目录'),(4,'卡信息管理',0,4,'/system/card','','C','0','1','','fa fa-location-arrow','admin','2023-09-09 10:33:19','',NULL,'若依官网地址'),(5,'公告管理',0,0,'/system/notice','','','0','1',NULL,'#','',NULL,'',NULL,''),(6,'用户管理',0,0,'/system/user','','','0','1',NULL,'#','',NULL,'',NULL,'');
/*!40000 ALTER TABLE `sys_menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_user`
--

DROP TABLE IF EXISTS `sys_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sys_user` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `work_id` varchar(20) DEFAULT NULL COMMENT '工作id',
  `login_name` varchar(30) DEFAULT NULL COMMENT '登录账号',
  `user_name` varchar(30) DEFAULT '' COMMENT '用户昵称',
  `user_type` varchar(10) DEFAULT '' COMMENT '用户类型（00系统用户 01注册用户）',
  `email` varchar(50) DEFAULT '' COMMENT '用户邮箱',
  `phone_number` varchar(11) DEFAULT '' COMMENT '手机号码',
  `sex` char(2) DEFAULT '男' COMMENT '用户性别（0男 1女 2未知）',
  `avatar` varchar(100) DEFAULT '' COMMENT '头像路径',
  `password` varchar(50) DEFAULT '' COMMENT '密码',
  `status` varchar(10) DEFAULT '在线' COMMENT '帐号状态（0正常 1停用）',
  `del_flag` char(1) DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
  `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb3 COMMENT='管理员表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_user`
--

LOCK TABLES `sys_user` WRITE;
/*!40000 ALTER TABLE `sys_user` DISABLE KEYS */;
INSERT INTO `sys_user` VALUES (2,'101','admin','fangfeiqiang','管理员','admin@qq.com','13551859120','男','bcd','123456','在线','0','','2024-01-10 15:00:25','',NULL,NULL),(3,'102','zhangsan','张三','用户','1@qq.com','12345678900','男','bcd','123456','在线','0','','2024-01-10 15:00:24','',NULL,NULL),(4,'103','lisi','李四','管理员','1@qq.com','13333338911','男','bcd','123456','在线','0','','2024-01-10 15:00:24','',NULL,NULL),(5,'104','wangwu','王五','用户','1@qq.com','15023355666','女','bcd','123456','在线','0','','2024-01-10 15:00:22','',NULL,NULL),(36,'105','test','测试','管理员','123123123@qq.com','12023484246','女','abc','123456','下线','0','','2024-01-10 15:00:18','',NULL,NULL),(37,'106','dev','开发','用户','456456456@qq.com','12123484246','男','abc','123456','下线','1','','2024-01-10 14:56:41','',NULL,NULL);
/*!40000 ALTER TABLE `sys_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-31  1:18:19
