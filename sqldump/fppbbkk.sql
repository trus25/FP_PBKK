/*
SQLyog Ultimate v12.5.1 (64 bit)
MySQL - 10.1.38-MariaDB : Database - fppbkk
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`fppbkk` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `fppbkk`;

/*Table structure for table `barang` */

DROP TABLE IF EXISTS `barang`;

CREATE TABLE `barang` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama_barang` varchar(50) DEFAULT NULL,
  `jenis_barang` varchar(50) DEFAULT NULL,
  `harga_pinjaman` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_USER` (`user_id`),
  CONSTRAINT `FK_USER` FOREIGN KEY (`user_id`) REFERENCES `pengguna` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `barang` */

insert  into `barang`(`id`,`nama_barang`,`jenis_barang`,`harga_pinjaman`,`user_id`) values 
(1,'barang1','elektronik',20000,1),
(2,'barang2','buku',5000,2),
(3,'barang3','buku',5000,2);

/*Table structure for table `peminjaman` */

DROP TABLE IF EXISTS `peminjaman`;

CREATE TABLE `peminjaman` (
  `id_pinjaman` int(11) NOT NULL AUTO_INCREMENT,
  `id_user` int(11) DEFAULT NULL,
  `id_barang` int(11) DEFAULT NULL,
  `waktu_pinjam` date DEFAULT NULL,
  `waktu_kembali` date DEFAULT NULL,
  `total_harga` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_pinjaman`),
  KEY `KEY1` (`id_user`),
  KEY `KEY2` (`id_barang`),
  CONSTRAINT `FK_Barang` FOREIGN KEY (`id_barang`) REFERENCES `barang` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `FK_UserPeminjam` FOREIGN KEY (`id_user`) REFERENCES `pengguna` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

/*Data for the table `peminjaman` */

insert  into `peminjaman`(`id_pinjaman`,`id_user`,`id_barang`,`waktu_pinjam`,`waktu_kembali`,`total_harga`) values 
(7,1,1,'2019-05-01','2019-05-19',20000),
(8,1,1,'2019-05-01','2019-05-19',360000),
(9,1,1,'2019-05-01','2019-05-19',360000),
(10,1,1,'2019-05-01','2019-05-19',360000),
(11,2,1,'2019-05-01','2019-05-19',90000),
(12,1,1,'2019-05-01','2019-05-19',360000),
(13,2,1,'2019-05-01','2019-05-19',90000);

/*Table structure for table `pengguna` */

DROP TABLE IF EXISTS `pengguna`;

CREATE TABLE `pengguna` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(16) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `pengguna` */

insert  into `pengguna`(`id`,`username`,`email`,`password`) values 
(1,'test1','test1@gmail.com','abcd'),
(2,'tes2','tes2@gmail.com','dbcda');

/* Procedure structure for procedure `country_hos` */

/*!50003 DROP PROCEDURE IF EXISTS  `country_hos` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `country_hos`(IN con CHAR(20))
BEGIN
  SELECT Name, HeadOfState FROM Country
  WHERE Continent = con;
END */$$
DELIMITER ;

/* Procedure structure for procedure `updateharga` */

/*!50003 DROP PROCEDURE IF EXISTS  `updateharga` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `updateharga`(IN namabarang varchar(50), IN namauser varchar(50), IN waktupinjam date, IN waktukembali date)
BEGIN
  DECLARE total INT;
  declare idbarang int;
  declare iduser int;
  select id into idbarang from barang where nama_barang=namabarang;
  select id into iduser	from pengguna where username = namauser;
  SELECT (SELECT harga_pinjaman FROM barang WHERE id = idbarang)*(SELECT DATEDIFF(waktukembali, waktupinjam) AS diff) into total;
  INSERT INTO peminjaman VALUES(0,idbarang,iduser,waktupinjam,waktukembali,total);
END */$$
DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
