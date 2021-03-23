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
-- Table structure for table `ajinfo`
--

DROP TABLE IF EXISTS `ajinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ajinfo` (
  `ajid` varchar(100) NOT NULL,
  `ajname` varchar(100) NOT NULL,
  `ajtype` varchar(40) NOT NULL,
  `ajcourt` varchar(50) NOT NULL,
  `isappeal` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ajinfo`
--

LOCK TABLES `ajinfo` WRITE;
/*!40000 ALTER TABLE `ajinfo` DISABLE KEYS */;
INSERT INTO `ajinfo` VALUES ('(2004) 云刑初字第83号刑事','王某诉李某xxx一案','刑事纠纷','重庆二中院','是'),('(2005) 云民初字第83号民事','王某诉李某xxx一案','民事纠纷','万州区院','是'),('(2019)津03民特2号','王某诉李某xxx一案','民事纠纷','万州区院','否'),('市场监食罚【2019】5号','王某诉李某xxx一案','民事纠纷','梁平法院','否'),('(2019)津03民终13号','王某诉李某xxx一案','民事纠纷','梁平法院','是'),('(2013) 乌执字第40号','王某诉李某xxx一案','民事纠纷','梁平法院','否'),('(2010) 西秀初字第1161号','王某诉李某xxx一案','民事纠纷','开州区院','是'),('(2004) 云民初字第13号民事','王某诉李某xxx一案','民事纠纷','重庆二中院','是'),('(2007) 乌民初字第1021号','王某诉李某xxx一案','民事纠纷','重庆二中院','否');
/*!40000 ALTER TABLE `ajinfo` ENABLE KEYS */;
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
