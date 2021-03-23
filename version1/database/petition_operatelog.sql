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
-- Table structure for table `operatelog`
--

DROP TABLE IF EXISTS `operatelog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `operatelog` (
  `username` varchar(100) NOT NULL,
  `type` varchar(20) NOT NULL,
  `time` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operatelog`
--

LOCK TABLES `operatelog` WRITE;
/*!40000 ALTER TABLE `operatelog` DISABLE KEYS */;
INSERT INTO `operatelog` VALUES ('dejingke','ADD_QA','2020-10-10 12:10:33'),('deke','ADD_LAW','2020-10-10 12:10:33'),('deke','DELETE_LAW','2020-10-10 12:10:33'),('dejingke','DELETE_QA','2020-10-10 12:10:33'),('dejingke','ADD_QA','2020-10-10 12:10:33'),('dejingke','ADD_QA','2021-03-03 10:31:00'),('dejingke','ADD_QA','2021-03-03 10:34:51'),('dejingke','DELETE_QA','2021-03-03 10:37:37'),('dejingke','ADD_QA','2021-03-03 10:44:12'),('dejingke','DELETE_QA','2021-03-03 10:44:34'),('dejingke','ADD_LAW','2021-03-03 10:51:44'),('dejingke','ADD_LAW','2021-03-03 10:55:08'),('dejingke','DELETE_LAW','2021-03-03 10:55:18'),('dejingke','ADD_QA','2021-03-03 15:31:04'),('dejingke','DELETE_QA','2021-03-03 15:34:06'),('dejingke','ADD_QA','2021-03-03 15:35:37'),('dejingke','DELETE_QA','2021-03-03 15:35:58'),('dejingke','ADD_LAW','2021-03-03 15:38:02'),('dejingke','DELETE_LAW','2021-03-03 15:38:38'),('dejingke','ADD_QA','2021-03-07 16:26:43'),('dejingke','DELETE_QA','2021-03-07 16:27:26'),('dejingke','ADD_QA','2021-03-07 16:28:14'),('dejingke','DELETE_QA','2021-03-07 16:29:05'),('dejingke','ADD_QA','2021-03-07 16:30:58'),('dejingke','DELETE_QA','2021-03-07 16:31:54'),('dejingke','ADD_LAW','2021-03-07 16:33:23'),('dejingke','DELETE_LAW','2021-03-07 16:34:07'),('dejingke','ADD_LAW','2021-03-07 16:35:09'),('dejingke','DELETE_LAW','2021-03-07 16:35:25'),('dejingke','ADD_QA','2021-03-07 16:50:55'),('dejingke','DELETE_QA','2021-03-07 16:51:37'),('dejingke','ADD_LAW','2021-03-07 16:56:51'),('dejingke','DELETE_LAW','2021-03-07 16:59:21');
/*!40000 ALTER TABLE `operatelog` ENABLE KEYS */;
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
