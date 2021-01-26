-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: projpst
-- ------------------------------------------------------
-- Server version	8.0.22


--
-- Table structure for table `client`
--

CREATE TABLE IF NOT EXISTS projpst.`client` (
                                                `UserID` int NOT NULL AUTO_INCREMENT,
                                                `Email` varchar(20) DEFAULT NULL,
    `Parola` varchar(20) DEFAULT NULL,
    `Telefon` int DEFAULT NULL,
    PRIMARY KEY (`UserID`)
    ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
INSERT INTO `client` VALUES (1,'john@gmail.com','john12345',7451234),(2,'michael@gmail.com','mike911',888112),(3,'johnnyCage@yahoo.com','mk4',788233);
UNLOCK TABLES;

--
-- Table structure for table `client_secv`
--

CREATE TABLE IF NOT EXISTS projpst.`client_secv` (
    `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `client_secv`
--

LOCK TABLES `client_secv` WRITE;
INSERT INTO `client_secv` VALUES (1);
UNLOCK TABLES;

--
-- Table structure for table `destination`
--

CREATE TABLE IF NOT EXISTS projpst.`destination` (
                                                     `AdressID` int NOT NULL AUTO_INCREMENT,
                                                     `Adresa` varchar(20) DEFAULT NULL,
    `Locatie` varchar(20) DEFAULT NULL,
    PRIMARY KEY (`AdressID`)
    ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `destination`
--

LOCK TABLES `destination` WRITE;
INSERT INTO `destination` VALUES (1,'strada Dacia','Codlea'),(2,'strada Florilor','Ghimbav'),(3,'strada Nuferilor','Brasov');
UNLOCK TABLES;

--
-- Table structure for table `destionation_secv`
--

CREATE TABLE IF NOT EXISTS projpst.`destionation_secv` (
    `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `destionation_secv`
--

LOCK TABLES `destionation_secv` WRITE;
INSERT INTO `destionation_secv` VALUES (1);
UNLOCK TABLES;

--
-- Table structure for table `feedback`
--

CREATE TABLE IF NOT EXISTS projpst.`feedback` (
                                                  `FeedbackID` int NOT NULL AUTO_INCREMENT,
                                                  `Apreciere` int DEFAULT NULL,
                                                  `Detalii` varchar(40) DEFAULT NULL,
    PRIMARY KEY (`FeedbackID`)
    ) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `feedback`
--

LOCK TABLES `feedback` WRITE;
INSERT INTO `feedback` VALUES (1,4,'Mancarea buna dar prea prajita'),(2,5,'Foarte buna mancarea va multumesc'),(3,1,'Nu mi-a placut , a intarziat si curierul'),(4,2,'Nu mi-a placut nimic :(');
UNLOCK TABLES;

--
-- Table structure for table `feedback_secv`
--

CREATE TABLE IF NOT EXISTS projpst.`feedback_secv` (
    `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `feedback_secv`
--

LOCK TABLES `feedback_secv` WRITE;
INSERT INTO `feedback_secv` VALUES (1);
UNLOCK TABLES;

--
-- Table structure for table `foodmenu`
--

CREATE TABLE IF NOT EXISTS projpst.`foodmenu` (
                                                  `FoodID` int NOT NULL AUTO_INCREMENT,
                                                  `DenumireProd` varchar(20) DEFAULT NULL,
    `Ingrediente` varchar(20) DEFAULT NULL,
    `Pret` int DEFAULT NULL,
    `foodOrder_OrderID` int DEFAULT NULL,
    PRIMARY KEY (`FoodID`),
    KEY `FKkbjtc6a7kckj7p77kbw7vhmqi` (`foodOrder_OrderID`),
    CONSTRAINT `FKkbjtc6a7kckj7p77kbw7vhmqi` FOREIGN KEY (`foodOrder_OrderID`) REFERENCES `foodorder` (`OrderID`)
    ) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `foodmenu`
--

LOCK TABLES `foodmenu` WRITE;
INSERT INTO `foodmenu` VALUES (1,'pizza','branza,rosii,salam',15,1),(2,'paste','branza,rosii',9,1),(3,'suc','pepsi,fanta',3,1),(4,'bere','blonda,bruna',2,2),(5,'pizza','sunca,branza,sos',25,2),(6,'burger','vita,cascaval,rosie',19,2),(7,'ciorba','legume,carne de porc',14,3),(8,'spanac','spanac,usturoi',7,3);
UNLOCK TABLES;

--
-- Table structure for table `foodmenu_secv`
--

CREATE TABLE IF NOT EXISTS projpst.`foodmenu_secv` (
    `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `foodmenu_secv`
--

LOCK TABLES `foodmenu_secv` WRITE;
INSERT INTO `foodmenu_secv` VALUES (1);
UNLOCK TABLES;

--
-- Table structure for table `foodorder`
--

CREATE TABLE IF NOT EXISTS projpst.`foodorder` (
                                                   `OrderID` int NOT NULL AUTO_INCREMENT,
                                                   `Produse` varchar(20) DEFAULT NULL,
    `Cantitate` int DEFAULT NULL,
    PRIMARY KEY (`OrderID`)
    ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `foodorder`
--

LOCK TABLES `foodorder` WRITE;
INSERT INTO `foodorder` VALUES (1,'pizza,paste,suc',3),(2,'pizza,bere,burger',3),(3,'ciorba,spanac',2);
UNLOCK TABLES;

--
-- Table structure for table `foodorder_secv`
--

CREATE TABLE IF NOT EXISTS projpst.`foodorder_secv` (
    `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `foodorder_secv`
--

LOCK TABLES `foodorder_secv` WRITE;
INSERT INTO `foodorder_secv` VALUES (1);
UNLOCK TABLES;


-- Dump completed on 2021-01-25 19:19:24
