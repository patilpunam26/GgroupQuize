-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: minidb
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `getquize`
--

DROP TABLE IF EXISTS `getquize`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `getquize` (
  `que` varchar(600) DEFAULT NULL,
  `options1` varchar(255) DEFAULT NULL,
  `options2` varchar(255) DEFAULT NULL,
  `options3` varchar(255) DEFAULT NULL,
  `options4` varchar(255) DEFAULT NULL,
  `option5` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `getquize`
--

LOCK TABLES `getquize` WRITE;
/*!40000 ALTER TABLE `getquize` DISABLE KEYS */;
INSERT INTO `getquize` VALUES ('In which area objects are stored?','1) Stack area','2) class area','3) Heap Area','4) Method area','3'),('Which methods are not override?','1)Non-static','2)Static','3)Dynamic','4)Non of the above','2'),('Who is toatly responsible for run application?','1)JDK','2) JRE','3) JVM','4) JVM & JRE','3'),('Which is not possible in java?','1)Operator overloading','2)Method overloading','3)Constructor overloading','4)Non of the above','1'),('Interface can not allow which method?','1)Main method','2)Static method','3)Concate method','4)Private method','3'),('In follow which is not piller of OOPS?','1)Class','2)Nested class','3)Object','4)Inheritance','2'),('In follow classes which is not legacy class?','1)Treemap','2)Vector','3)Hashtable','4)Stack','1'),('Break statement is not allow in...?','1)Switch','2)For loop','3)If loop','4)Non of the above','3'),('How many types having Access Specifiers?','1)1','2)2','3)3','4)4','4'),('By using Instance block we can initialize....?','1)Instance variables','2)Static variables','3)Both','4)Not one of them','3');
/*!40000 ALTER TABLE `getquize` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-06 20:07:05
