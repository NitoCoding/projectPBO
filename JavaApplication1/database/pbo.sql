/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50505
Source Host           : 127.0.0.1:3306
Source Database       : pbo

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2023-06-20 21:34:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_products
-- ----------------------------
DROP TABLE IF EXISTS `tb_products`;
CREATE TABLE `tb_products` (
  `produkId` int(11) NOT NULL AUTO_INCREMENT,
  `produkName` varchar(255) DEFAULT NULL,
  `produkPrice` decimal(10,0) DEFAULT NULL,
  `produkStock` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`produkId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tb_products
-- ----------------------------
INSERT INTO `tb_products` VALUES ('1', 'wine', '6000', '0');
INSERT INTO `tb_products` VALUES ('3', 'sabun', '5000', '9');
INSERT INTO `tb_products` VALUES ('5', 'bintang', '9000', '30');
INSERT INTO `tb_products` VALUES ('7', 'bir', '3000', '18');
