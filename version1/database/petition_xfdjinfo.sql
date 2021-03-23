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
-- Table structure for table `xfdjinfo`
--

DROP TABLE IF EXISTS `xfdjinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `xfdjinfo` (
  `xfid` varchar(20) NOT NULL,
  `xfsub` varchar(6) DEFAULT NULL,
  `xfpcount` varchar(10) NOT NULL,
  `firstpid` varchar(18) NOT NULL,
  `firstpname` varchar(40) NOT NULL,
  `firstpcontact` varchar(11) NOT NULL,
  `firstpemail` varchar(30) DEFAULT NULL,
  `firstpaddress` varchar(100) DEFAULT NULL,
  `nodedata` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xfdjinfo`
--

LOCK TABLES `xfdjinfo` WRITE;
/*!40000 ALTER TABLE `xfdjinfo` DISABLE KEYS */;
INSERT INTO `xfdjinfo` VALUES ('XF00000016','他人','2','111111222211112222','王某','13471570429','2840387088@qq.com','China','1312'),('XF00000017','本人','2','111111222211112222','王某','13471570429','2840387088@qq.com','China',''),('XF00000018','本人','10人以上','111111222211112222','王某','13471570429','2840387088@qq.com','China',''),('XF00000019','他人','10人以上','111111222211112222','王某','13471570429','2840387088@qq.com','China',''),('XF00000020','本人','1','111111222211112222','王某','13471570429','2840387088@qq.com','China','');
/*!40000 ALTER TABLE `xfdjinfo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-12 16:46:09
