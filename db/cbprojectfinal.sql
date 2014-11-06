/*
SQLyog Ultimate v9.63 
MySQL - 5.6.16 : Database - cbprojectfinal
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`cbprojectfinal` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `cbprojectfinal`;

/*Table structure for table `audit` */

DROP TABLE IF EXISTS `audit`;

CREATE TABLE `audit` (
  `idAudit` int(11) NOT NULL AUTO_INCREMENT,
  `date` datetime NOT NULL,
  `method` varchar(10) NOT NULL,
  `advice` varchar(10) NOT NULL,
  `description` varchar(200) NOT NULL,
  PRIMARY KEY (`idAudit`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `audit` */

insert  into `audit`(`idAudit`,`date`,`method`,`advice`,`description`) values (3,'2014-11-05 20:53:15','save','Before','ModelUser{id=null, name=pio, lastname=poi, user=poi, password=poi, profile=2}'),(4,'2014-11-05 20:53:15','save','After','ModelUser{id=14, name=pio, lastname=poi, user=poi, password=poi, profile=2}'),(5,'2014-11-05 20:56:37','save','Before','ModelUser{id=null, name=ghj, lastname=dfg, user=dfg, password=dfg, profile=2}'),(6,'2014-11-05 20:56:37','save','After','ModelUser{id=15, name=ghj, lastname=dfg, user=dfg, password=dfg, profile=2}'),(7,'2014-11-05 21:06:50','save','Before','ModelUser{id=null, name=kl, lastname=jklkl, user=kl, password=kl, profile=3}'),(8,'2014-11-05 21:06:50','save','Before','ModelUser{id=16, name=kl, lastname=jklkl, user=kl, password=kl, profile=3}');

/*Table structure for table `profile` */

DROP TABLE IF EXISTS `profile`;

CREATE TABLE `profile` (
  `idProfile` int(11) NOT NULL,
  `description` varchar(15) NOT NULL,
  PRIMARY KEY (`idProfile`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `profile` */

insert  into `profile`(`idProfile`,`description`) values (1,'ADMIN'),(2,'ASISTENT'),(3,'CLIENT');

/*Table structure for table `programas` */

DROP TABLE IF EXISTS `programas`;

CREATE TABLE `programas` (
  `idprograma` int(11) NOT NULL AUTO_INCREMENT,
  `titulo` varchar(100) NOT NULL,
  `descripcion` varchar(200) NOT NULL,
  `objetivos` varchar(200) DEFAULT NULL,
  `requisitos` varchar(200) DEFAULT NULL,
  `precio` double(13,2) NOT NULL,
  `duracion` double(13,2) NOT NULL,
  `estado` varchar(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`idprograma`),
  UNIQUE KEY `IDX_programas_2` (`titulo`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

/*Data for the table `programas` */

insert  into `programas`(`idprograma`,`titulo`,`descripcion`,`objetivos`,`requisitos`,`precio`,`duracion`,`estado`) values (2,'Java Master','Desarrollo de Aplicaciones Java EE','Objetivos','Requisitos',1500.00,50.00,'1'),(3,'Java Web1','Desarrollo de Aplicaciones Web','Objetivos','Requisitos',1000.00,30.00,'1'),(23,'asd','HOla mundo','asda','hola',1.00,2.00,'1');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `idUser` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `lastname` varchar(100) NOT NULL,
  `user` varchar(6) NOT NULL,
  `password` varchar(6) NOT NULL,
  `profile` tinyint(4) NOT NULL,
  PRIMARY KEY (`idUser`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

/*Data for the table `user` */

insert  into `user`(`idUser`,`name`,`lastname`,`user`,`password`,`profile`) values (1,'Miguel','Pazo','mpazo','123',1),(2,'Rodrigo','Pazo','rpazo','123',2),(3,'Andrea','Pazo','apazo','123',3),(4,'Jotahan','Pazo','jpazo','123',2),(5,'test12','test22','test22','1223',3),(6,'test3','test4','teste','123',1),(7,'tewe','wer','wer','we',1),(8,'qwe','qwe','qwe','qwe',1),(9,'asd','asd','asd','asd',2),(10,'fgh','fg','fgh','fgh',2),(11,'ghj','ghj','ghj','ghj',2),(12,'yui','yui','yui','yui',2),(13,'hjk','hjk','hjk','hjk',2),(14,'pio','poi','poi','poi',2),(15,'ghj','dfg','dfg','dfg',2),(16,'kl','jklkl','kl','kl',3);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
