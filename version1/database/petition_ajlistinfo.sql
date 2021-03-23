-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: petition
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Table structure for table `ajlistinfo`
--

DROP TABLE IF EXISTS `ajlistinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ajlistinfo` (
  `ajid` varchar(100) NOT NULL,
  `ajcause` varchar(100) NOT NULL,
  `dsr` varchar(40) NOT NULL,
  `ajtime` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ajlistinfo`
--

LOCK TABLES `ajlistinfo` WRITE;
/*!40000 ALTER TABLE `ajlistinfo` DISABLE KEYS */;
INSERT INTO `ajlistinfo` VALUES ('(2004) 云刑初字第83号刑事','继承纠纷','王某','2010.1.12'),('(2005) 云民初字第83号民事','民事纠纷','王某','2012.4.21'),('(2019)津03民特2号','民特案件纠纷','王某','2009.9.07'),('市场监食罚【2019】5号','市场食品纠纷','王某','2005.2.20'),('(2019)津03民终13号','财产纠纷','王某','2007.11.09'),('(2013) 乌执字第40号','遗产纠纷','张某','2001.5.13'),('(2010) 西秀初字第1161号','抚养纠纷','林某','2015.6.14'),('(2007) 乌民初字第1021号','刑事纠纷','黄某','2000.9.25'),('(2013) 乌执字第40号','遗产纠纷','李某','2001.5.13'),('(2010) 西秀初字第1161号','抚养纠纷','张某','2015.6.14'),('(2007) 乌民初字第1021号','刑事纠纷','赵某','2000.9.25'),('(2005) 云民初字第13号民事','婚姻纠纷','李某','2003.12.13'),('(2005) 云民初字第13号民事','婚姻纠纷','张某','2003.12.13');
/*!40000 ALTER TABLE `ajlistinfo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-12 16:46:10
