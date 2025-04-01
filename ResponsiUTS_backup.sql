-- MariaDB dump 10.19  Distrib 10.4.32-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: Perpustakaan2
-- ------------------------------------------------------
-- Server version	10.4.32-MariaDB

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
-- Table structure for table `anggota`
--

DROP TABLE IF EXISTS `anggota`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `anggota` (
  `id_anggota` varchar(10) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jurusan` varchar(20) DEFAULT 'Umum',
  `tgl_daftar` date NOT NULL,
  PRIMARY KEY (`id_anggota`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `anggota`
--

LOCK TABLES `anggota` WRITE;
/*!40000 ALTER TABLE `anggota` DISABLE KEYS */;
INSERT INTO `anggota` VALUES ('101','Kartika Salsabila','Teknologi Informasi','2024-08-12'),('102','Talitha Azmi','Teknik Sipil','2024-09-15'),('103','Desfin Setianingrum','Administrasi Negara','2025-01-20');
/*!40000 ALTER TABLE `anggota` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `anggota_n1`
--

DROP TABLE IF EXISTS `anggota_n1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `anggota_n1` (
  `id_anggota` varchar(10) NOT NULL,
  `nama_anggota` varchar(50) NOT NULL,
  `jurusan_anggota` varchar(30) NOT NULL,
  PRIMARY KEY (`id_anggota`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `anggota_n1`
--

LOCK TABLES `anggota_n1` WRITE;
/*!40000 ALTER TABLE `anggota_n1` DISABLE KEYS */;
INSERT INTO `anggota_n1` VALUES ('NA101','Kartika','Teknologi Informasi'),('NA102','Musa','Teknologi Informasi'),('NA103','Nicolas','Teknologi Informasi');
/*!40000 ALTER TABLE `anggota_n1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `buku`
--

DROP TABLE IF EXISTS `buku`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `buku` (
  `id_buku` varchar(10) NOT NULL,
  `judul` varchar(100) NOT NULL,
  `penerbit` varchar(50) DEFAULT NULL,
  `tahun_terbit` int(11) DEFAULT NULL CHECK (`tahun_terbit` between 1900 and 2025),
  `id_penerbit` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_buku`),
  KEY `fk_penerbit` (`id_penerbit`),
  CONSTRAINT `fk_penerbit` FOREIGN KEY (`id_penerbit`) REFERENCES `penerbit` (`id_penerbit`) ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `buku`
--

LOCK TABLES `buku` WRITE;
/*!40000 ALTER TABLE `buku` DISABLE KEYS */;
INSERT INTO `buku` VALUES ('201','Matematika Diskrit','Bandung: Informatika',2012,'301'),('202','Logika Matematika','Ercontara Rajawali',2006,'302'),('203','Pengantar Teknik Sipil','WBP Bandung',2020,'303'),('204','Metode Numerik Aplikasi untuk Teknik Sipil','Widina',2022,'304'),('205','Ilmu Administrasi Negara','Pustaka Setia',2016,'305');
/*!40000 ALTER TABLE `buku` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `buku_n1`
--

DROP TABLE IF EXISTS `buku_n1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `buku_n1` (
  `id_buku` varchar(10) NOT NULL,
  `judul_buku` varchar(100) NOT NULL,
  `id_penerbit` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_buku`),
  KEY `id_penerbit` (`id_penerbit`),
  CONSTRAINT `buku_n1_ibfk_1` FOREIGN KEY (`id_penerbit`) REFERENCES `penerbit_n1` (`id_penerbit`) ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `buku_n1`
--

LOCK TABLES `buku_n1` WRITE;
/*!40000 ALTER TABLE `buku_n1` DISABLE KEYS */;
INSERT INTO `buku_n1` VALUES ('NB301','Jaringan Komputer Informatika','NP205'),('NB302','Basis Data','NP201'),('NB303','Pengantar Teknologi Informasi','NP202'),('NB304','Algoritma dan Struktur Data','NP204'),('NB305','Paradigma System','NP203');
/*!40000 ALTER TABLE `buku_n1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `peminjaman`
--

DROP TABLE IF EXISTS `peminjaman`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `peminjaman` (
  `id_peminjaman` int(11) NOT NULL AUTO_INCREMENT,
  `id_anggota` varchar(10) DEFAULT NULL,
  `id_buku` varchar(10) DEFAULT NULL,
  `tgl_pinjam` date NOT NULL,
  `tgl_kembali` date DEFAULT NULL,
  `denda` int(11) DEFAULT 0,
  PRIMARY KEY (`id_peminjaman`),
  KEY `id_anggota` (`id_anggota`),
  KEY `id_buku` (`id_buku`),
  CONSTRAINT `peminjaman_ibfk_1` FOREIGN KEY (`id_anggota`) REFERENCES `anggota` (`id_anggota`) ON DELETE CASCADE,
  CONSTRAINT `peminjaman_ibfk_2` FOREIGN KEY (`id_buku`) REFERENCES `buku` (`id_buku`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `peminjaman`
--

LOCK TABLES `peminjaman` WRITE;
/*!40000 ALTER TABLE `peminjaman` DISABLE KEYS */;
INSERT INTO `peminjaman` VALUES (4,'101','201','2025-02-01','2025-02-05',0),(5,'102','203','2025-02-03','2025-02-10',4000),(6,'103','205','2025-02-05','2025-02-12',4000);
/*!40000 ALTER TABLE `peminjaman` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `peminjaman_n1`
--

DROP TABLE IF EXISTS `peminjaman_n1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `peminjaman_n1` (
  `id_transaksi` int(11) NOT NULL AUTO_INCREMENT,
  `id_anggota` varchar(10) NOT NULL,
  `id_buku` varchar(10) NOT NULL,
  `tgl_pinjam` date NOT NULL,
  `tgl_kembali` date DEFAULT NULL,
  `denda` int(11) DEFAULT 0,
  PRIMARY KEY (`id_transaksi`),
  KEY `id_anggota` (`id_anggota`),
  KEY `id_buku` (`id_buku`),
  CONSTRAINT `peminjaman_n1_ibfk_1` FOREIGN KEY (`id_anggota`) REFERENCES `anggota_n1` (`id_anggota`) ON DELETE CASCADE,
  CONSTRAINT `peminjaman_n1_ibfk_2` FOREIGN KEY (`id_buku`) REFERENCES `buku_n1` (`id_buku`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `peminjaman_n1`
--

LOCK TABLES `peminjaman_n1` WRITE;
/*!40000 ALTER TABLE `peminjaman_n1` DISABLE KEYS */;
INSERT INTO `peminjaman_n1` VALUES (1,'NA101','NB301','2025-01-10','2025-01-15',0),(2,'NA102','NB304','2025-01-09','2025-01-18',10000),(3,'NA103','NB302','2025-01-12','2025-01-18',0);
/*!40000 ALTER TABLE `peminjaman_n1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `penerbit`
--

DROP TABLE IF EXISTS `penerbit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `penerbit` (
  `id_penerbit` varchar(10) NOT NULL,
  `nama_penerbit` varchar(50) NOT NULL,
  `alamat` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id_penerbit`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `penerbit`
--

LOCK TABLES `penerbit` WRITE;
/*!40000 ALTER TABLE `penerbit` DISABLE KEYS */;
INSERT INTO `penerbit` VALUES ('301','Bandung: Informatika','Bandung'),('302','Econtara Rajawali','Jakarta'),('303','WBP Bandung','Bandung'),('304','Widina','Bandung'),('305','Pustaka Setia','Bandung'),('NP201','Gramedia',NULL),('NP202','Erlangga',NULL),('NP203','Bukunesia',NULL),('NP204','Grasindo',NULL),('NP205','Citra Pustaka',NULL);
/*!40000 ALTER TABLE `penerbit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `penerbit_n1`
--

DROP TABLE IF EXISTS `penerbit_n1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `penerbit_n1` (
  `id_penerbit` varchar(10) NOT NULL,
  `nama_penerbit` varchar(50) NOT NULL,
  PRIMARY KEY (`id_penerbit`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `penerbit_n1`
--

LOCK TABLES `penerbit_n1` WRITE;
/*!40000 ALTER TABLE `penerbit_n1` DISABLE KEYS */;
INSERT INTO `penerbit_n1` VALUES ('NP201','Gramedia'),('NP202','Erlangga'),('NP203','Bukunesia'),('NP204','Grasindo'),('NP205','Citra Pustaka');
/*!40000 ALTER TABLE `penerbit_n1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transaksi_peminjaman`
--

DROP TABLE IF EXISTS `transaksi_peminjaman`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transaksi_peminjaman` (
  `id_transaksi` int(11) NOT NULL AUTO_INCREMENT,
  `nama_anggota` varchar(50) NOT NULL,
  `jurusan_anggota` varchar(29) NOT NULL,
  `judul_buku` varchar(99) NOT NULL,
  `penerbit_buku` varchar(50) NOT NULL,
  `tgl_pinjam` date NOT NULL,
  `tgl_kembali` date DEFAULT NULL,
  `denda` int(11) DEFAULT 0,
  PRIMARY KEY (`id_transaksi`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaksi_peminjaman`
--

LOCK TABLES `transaksi_peminjaman` WRITE;
/*!40000 ALTER TABLE `transaksi_peminjaman` DISABLE KEYS */;
INSERT INTO `transaksi_peminjaman` VALUES (1,'Kartika','Teknologi Informasi','Jaringan Komputer Informatika','Citra Pustaka','2025-01-10','2025-01-15',2000),(2,'Musa','Teknologi Informas','Algoritma dan Struktur Data','Grasindo','2025-01-09','2025-01-18',10000),(3,'Nicolas','Teknologi Informasi','Basis Data','Gramedia','2025-01-12',NULL,0);
/*!40000 ALTER TABLE `transaksi_peminjaman` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-04-01 12:47:47
