/*
 Navicat Premium Data Transfer

 Source Server         : daming
 Source Server Type    : MySQL
 Source Server Version : 50527
 Source Host           : localhost:3306
 Source Schema         : mybatis_2

 Target Server Type    : MySQL
 Target Server Version : 50527
 File Encoding         : 65001

*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_customer
-- ----------------------------
DROP TABLE IF EXISTS `t_customer`;
CREATE TABLE `t_customer`  (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `jobs` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '职业',
  `phone` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '电话号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_customer
-- ----------------------------
INSERT INTO `t_customer` VALUES (1, 'test1', 'bhrder', '666');
INSERT INTO `t_customer` VALUES (2, 'test2', 'bhrder', '777');
INSERT INTO `t_customer` VALUES (3, 'daming', 'woter', '888');
INSERT INTO `t_customer` VALUES (4, 'haimianbaobao', 'student', '2332131');
INSERT INTO `t_customer` VALUES (5, 'test3', '学生', '1');
INSERT INTO `t_customer` VALUES (6, 'test4', '学生', '9');

SET FOREIGN_KEY_CHECKS = 1;
