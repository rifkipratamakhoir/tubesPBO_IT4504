-- MySQL dump 10.16  Distrib 10.1.48-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: db
-- ------------------------------------------------------
-- Server version	10.1.48-MariaDB-0+deb9u2

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `LogIn`
--

DROP TABLE IF EXISTS `LogIn`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `LogIn` (
  `ID` varchar(5) DEFAULT NULL,
  `Password` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `LogIn`
--

LOCK TABLES `LogIn` WRITE;
/*!40000 ALTER TABLE `LogIn` DISABLE KEYS */;
INSERT INTO `LogIn` VALUES ('a','a'),('megha','Megha'),('abc','abc');
/*!40000 ALTER TABLE `LogIn` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Result`
--

DROP TABLE IF EXISTS `Result`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Result` (
  `ID` varchar(3) DEFAULT NULL,
  `javaResult` smallint(6) DEFAULT NULL,
  `dbmsResult` tinyint(4) DEFAULT NULL,
  `htmlResult` tinyint(4) DEFAULT NULL,
  `networkingResult` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Result`
--

LOCK TABLES `Result` WRITE;
/*!40000 ALTER TABLE `Result` DISABLE KEYS */;
INSERT INTO `Result` VALUES ('abc',100,10,30,25);
/*!40000 ALTER TABLE `Result` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `StudInfo`
--

DROP TABLE IF EXISTS `StudInfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `StudInfo` (
  `Name` varchar(5) DEFAULT NULL,
  `Age` tinyint(4) DEFAULT NULL,
  `DOB` varchar(19) DEFAULT NULL,
  `Gender` varchar(1) DEFAULT NULL,
  `Address` varchar(14) DEFAULT NULL,
  `College` varchar(14) DEFAULT NULL,
  `University` varchar(9) DEFAULT NULL,
  `ID` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `StudInfo`
--

LOCK TABLES `StudInfo` WRITE;
/*!40000 ALTER TABLE `StudInfo` DISABLE KEYS */;
INSERT INTO `StudInfo` VALUES ('Megha',21,'1989-02-21 00:00:00','F','abcd efgh ijkl','mnop qrdt uvwx','IP univ.','megha'),('abc',23,'1989-02-21 00:00:00','F','afef dfd sdf','drf rdfr','sf dfds f','abc');
/*!40000 ALTER TABLE `StudInfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dbms`
--

DROP TABLE IF EXISTS `dbms`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dbms` (
  `SNo` tinyint(4) DEFAULT NULL,
  `Question` varchar(105) DEFAULT NULL,
  `a` varchar(25) DEFAULT NULL,
  `b` varchar(28) DEFAULT NULL,
  `c` varchar(25) DEFAULT NULL,
  `d` varchar(21) DEFAULT NULL,
  `Result` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dbms`
--

LOCK TABLES `dbms` WRITE;
/*!40000 ALTER TABLE `dbms` DISABLE KEYS */;
INSERT INTO `dbms` VALUES (1,'Which of the following elements are the valid components of \r\r\nACID in a relational database transaction?','Atomicity','Consistency','Isolation','All of the above','d'),(2,'What does SQL stand for?','Strong Question Language','Structured Question Language','Structured Query Language','None of these','c'),(3,'Which SQL statement is used to extract data from a database?','GET','EXTRACT','SELECT','QUERY','c'),(4,'Which SQL statement is used to update data in a database?','UPDATE','SAVE AS','MODIFY','SAVE','a'),(5,'Which SQL statement is used to delete data from a database?','TRUNCATE','DELETE','REMOVE','DROP','b'),(6,'Which SQL statement is used to insert new data in a database?','ADD RECORD','ADD INTO','INSERT','ADD NEW','c'),(7,'With SQL, how do you select all the columns from a table \r\r\nnamed \"Persons\"?','SELECT [all] FROM Persons','SELECT All Persons','SELECT *.Persons','SELECT * FROM Persons','d'),(8,'Which SQL statement is used to return only different values?','SELECT UNIQUE','SELECT INDENTITY','SELECT DIFFERENT','SELECT DISTINCT','d'),(9,'Which SQL keyword is used to sort the result-set?','SORT BY','ORDER BY','ORDER','SORT','b'),(10,'The left outer join is one type of outer join. Another one \r\r\nis the.','right','full','right outer','full outer','c');
/*!40000 ALTER TABLE `dbms` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `html`
--

DROP TABLE IF EXISTS `html`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `html` (
  `SNo` tinyint(4) DEFAULT NULL,
  `Question` varchar(89) DEFAULT NULL,
  `a` varchar(22) DEFAULT NULL,
  `b` varchar(26) DEFAULT NULL,
  `c` varchar(23) DEFAULT NULL,
  `d` varchar(28) DEFAULT NULL,
  `Result` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `html`
--

LOCK TABLES `html` WRITE;
/*!40000 ALTER TABLE `html` DISABLE KEYS */;
INSERT INTO `html` VALUES (1,'Which is correct?','<b>Click Here<b>','<strong>Click Here<strong>','<b>Click Here</b>','</strong>Click Here</strong>','c'),(2,'What is HTML stands for?','Hypertext Mailing List','Hypertext Markup Language','Hypertext Mark Language','Hyper Markup Language','b'),(3,'The page title is inside the____tag.','Body','Head','Division','Table','b'),(4,'Which tag makes the largest headline?','H1','H2','H3','H4','a'),(5,'The line below is called a _______________.','Heavy Rule','Horizontal Rule','Hard Return','Hypertext Return','b'),(6,'Between which set of tags does most of the content of your web \r\r\npage need to be placed?','<text></text>','<body></body>','<title></title>','<head></head>','b'),(7,'Which set of tags looks like this? ·Dogs ·Cats ·Birds','<ul></ul>','<u></u>','<ol></ol>\r\n<ol></ol>','<dl></dl>','a'),(8,'To begin a new line without starting a new paragraph, which code \r\r\nwould you use?','<l>','<newline>','<line>','<br>','d'),(9,'What is the file extension used for HTML file ?','.webpage','.shtml','.html','.doc','c'),(10,'What does vlink mean ?','active link','virtuallink','visited link','very good link','c');
/*!40000 ALTER TABLE `html` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `java`
--

DROP TABLE IF EXISTS `java`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `java` (
  `SNo` tinyint(4) DEFAULT NULL,
  `Question` varchar(90) DEFAULT NULL,
  `a` varchar(26) DEFAULT NULL,
  `b` varchar(17) DEFAULT NULL,
  `c` varchar(14) DEFAULT NULL,
  `d` varchar(26) DEFAULT NULL,
  `Result` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `java`
--

LOCK TABLES `java` WRITE;
/*!40000 ALTER TABLE `java` DISABLE KEYS */;
INSERT INTO `java` VALUES (1,'Java runs on _______.','Windows','Unix/Linux','Mac','All of the Above','d'),(2,'What is the size of a Char?','4 bits','7 bits','8 bits','16 bits','d'),(3,'What is the proper way to declare a variable ?','variableName variableType;','variableName;','variableType;','variableType variableName;','d'),(4,'Booleans are _______.','True or False','Single characters','Text','All numbers','a'),(5,'Which is NOT a section of all types of loops ?','Initialization','Loop Body','Test statement','The word \"while\"','d'),(6,'In a ‘for’ loop, what section of the loop is not included in the parentheses after “for” ?','Initialization','Loop Body','Test statement','Update','b');
/*!40000 ALTER TABLE `java` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `networking`
--

DROP TABLE IF EXISTS `networking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `networking` (
  `SNo` tinyint(4) DEFAULT NULL,
  `Question` varchar(100) DEFAULT NULL,
  `a` varchar(14) DEFAULT NULL,
  `b` varchar(18) DEFAULT NULL,
  `c` varchar(20) DEFAULT NULL,
  `d` varchar(22) DEFAULT NULL,
  `Result` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `networking`
--

LOCK TABLES `networking` WRITE;
/*!40000 ALTER TABLE `networking` DISABLE KEYS */;
INSERT INTO `networking` VALUES (1,'Which is not an exmple of transmission media?','Wire','Coaxial cable','Radio waves','None of the above','d'),(2,'How many layers in the OSI model?','5','7','6','8','c'),(3,'An organization that share devices, saves','Money','Time\r\nTime','Space','All of the above.','d'),(4,'A network of computers and other devices that is confined to a relatively small space.','Global network','Local area network','Peer-to-Peer network','Metropolitan network','b'),(5,'If a computer on the network shares resources for others to use, it is called ____','Server','Client','Mainframe','All of the above.','a'),(6,'A distributed network configuration in which all data/information pass through a central computer is','bus network','ring network','star network','point-to-point network','c'),(7,'A central Computer surrounded by one or more satellite computers is called a','bus network','ring network','star network','none of the above','c'),(8,'which cable connectors are used to connect a cable from a router\'s console port to a PC','RJ-11','RJ-45','RJ-12','none of the above','b');
/*!40000 ALTER TABLE `networking` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-11 11:57:00
