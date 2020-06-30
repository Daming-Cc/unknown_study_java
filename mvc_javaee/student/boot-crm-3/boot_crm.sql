/*
 Navicat Premium Data Transfer

 Source Server         : mybatis_3
 Source Server Type    : MySQL
 Source Server Version : 50527
 Source Host           : localhost:3306
 Source Schema         : boot_crm

 Target Server Type    : MySQL
 Target Server Version : 50527
 File Encoding         : 65001

 Date: 30/06/2020 23:42:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for base_dict
-- ----------------------------
DROP TABLE IF EXISTS `base_dict`;
CREATE TABLE `base_dict`  (
  `dict_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '数据字典id(主键)',
  `dict_type_code` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '数据字典类别代码',
  `dict_type_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '数据字典类别名称',
  `dict_item_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '数据字典项目名称',
  `dict_item_code` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '数据字典项目代码(可为空)',
  `dict_sort` int(10) DEFAULT NULL COMMENT '排序字段',
  `dict_enable` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '1:使用 0:停用',
  `dict_memo` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`dict_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of base_dict
-- ----------------------------
INSERT INTO `base_dict` VALUES ('1', '001', '客户行业', '教育培训 ', NULL, 1, '1', NULL);
INSERT INTO `base_dict` VALUES ('10', '003', '公司性质', '民企', NULL, 3, '1', NULL);
INSERT INTO `base_dict` VALUES ('12', '004', '年营业额', '1-10万', NULL, 1, '1', NULL);
INSERT INTO `base_dict` VALUES ('13', '004', '年营业额', '10-20万', NULL, 2, '1', NULL);
INSERT INTO `base_dict` VALUES ('14', '004', '年营业额', '20-50万', NULL, 3, '1', NULL);
INSERT INTO `base_dict` VALUES ('15', '004', '年营业额', '50-100万', NULL, 4, '1', NULL);
INSERT INTO `base_dict` VALUES ('16', '004', '年营业额', '100-500万', NULL, 5, '1', NULL);
INSERT INTO `base_dict` VALUES ('17', '004', '年营业额', '500-1000万', NULL, 6, '1', NULL);
INSERT INTO `base_dict` VALUES ('18', '005', '客户状态', '基础客户', NULL, 1, '1', NULL);
INSERT INTO `base_dict` VALUES ('19', '005', '客户状态', '潜在客户', NULL, 2, '1', NULL);
INSERT INTO `base_dict` VALUES ('2', '001', '客户行业', '电子商务', NULL, 2, '1', NULL);
INSERT INTO `base_dict` VALUES ('20', '005', '客户状态', '成功客户', NULL, 3, '1', NULL);
INSERT INTO `base_dict` VALUES ('21', '005', '客户状态', '无效客户', NULL, 4, '1', NULL);
INSERT INTO `base_dict` VALUES ('22', '006', '客户级别', '普通客户', NULL, 1, '1', NULL);
INSERT INTO `base_dict` VALUES ('23', '006', '客户级别', 'VIP客户', NULL, 2, '1', NULL);
INSERT INTO `base_dict` VALUES ('24', '007', '商机状态', '意向客户', NULL, 1, '1', NULL);
INSERT INTO `base_dict` VALUES ('25', '007', '商机状态', '初步沟通', NULL, 2, '1', NULL);
INSERT INTO `base_dict` VALUES ('26', '007', '商机状态', '深度沟通', NULL, 3, '1', NULL);
INSERT INTO `base_dict` VALUES ('27', '007', '商机状态', '签订合同', NULL, 4, '1', NULL);
INSERT INTO `base_dict` VALUES ('3', '001', '客户行业', '对外贸易', NULL, 3, '1', NULL);
INSERT INTO `base_dict` VALUES ('30', '008', '商机类型', '新业务', NULL, 1, '1', NULL);
INSERT INTO `base_dict` VALUES ('31', '008', '商机类型', '现有业务', NULL, 2, '1', NULL);
INSERT INTO `base_dict` VALUES ('32', '009', '商机来源', '电话营销', NULL, 1, '1', NULL);
INSERT INTO `base_dict` VALUES ('33', '009', '商机来源', '网络营销', NULL, 2, '1', NULL);
INSERT INTO `base_dict` VALUES ('34', '009', '商机来源', '推广活动', NULL, 3, '1', NULL);
INSERT INTO `base_dict` VALUES ('35', '010', '系统来源', '国外', NULL, 2, '1', NULL);
INSERT INTO `base_dict` VALUES ('36', '010', '系统来源', '国内', NULL, 1, '1', NULL);
INSERT INTO `base_dict` VALUES ('37', '011', '系统行业', '个人', NULL, 1, '1', NULL);
INSERT INTO `base_dict` VALUES ('38', '011', '系统行业', '企业', NULL, 2, '1', NULL);
INSERT INTO `base_dict` VALUES ('39', '011', '系统行业', '政府', NULL, 3, '1', NULL);
INSERT INTO `base_dict` VALUES ('4', '001', '客户行业', '酒店旅游', NULL, 4, '1', NULL);
INSERT INTO `base_dict` VALUES ('40', '012', '系统级别', '高级', NULL, 3, '1', NULL);
INSERT INTO `base_dict` VALUES ('41', '012', '系统级别', '中级', NULL, 2, '1', NULL);
INSERT INTO `base_dict` VALUES ('42', '012', '系统级别', '初级', NULL, 1, '1', NULL);
INSERT INTO `base_dict` VALUES ('5', '001', '客户行业', '房地产', NULL, 5, '1', NULL);
INSERT INTO `base_dict` VALUES ('6', '002', '客户信息来源', '电话营销', NULL, 1, '1', NULL);
INSERT INTO `base_dict` VALUES ('7', '002', '客户信息来源', '网络营销', NULL, 2, '1', NULL);
INSERT INTO `base_dict` VALUES ('8', '003', '公司性质', '合资', NULL, 1, '1', NULL);
INSERT INTO `base_dict` VALUES ('9', '003', '公司性质', '国企', NULL, 2, '1', NULL);

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer`  (
  `cust_id` int(11) NOT NULL AUTO_INCREMENT,
  `cust_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `cust_user_id` int(11) DEFAULT NULL,
  `cust_create_id` int(11) DEFAULT NULL,
  `cust_source` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `cust_industry` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `cust_level` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `cust_linkman` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `cust_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `cust_mobile` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `cust_zipcode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `cust_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `cust_createtime` datetime DEFAULT NULL,
  PRIMARY KEY (`cust_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 180 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES (1, '\'奔笨\'', NULL, 1, '\'7\'', '\'3\'', '\'23\'', '\'daimng\'', '\'10086\'', '\'13113131313\'', '\'530000\'', '\'民大\'', '2020-06-27 00:37:04');
INSERT INTO `customer` VALUES (2, '大佬', 2, 2, '电子商务', '销售', '高级客户', 'qiumo', '10010', '14114141414', '530001', '9', '2020-06-11 00:39:30');
INSERT INTO `customer` VALUES (4, '233333333333', 0, 0, '电子商务', '销售', 'VIP', '4', '4', '4', '4', '4', '2020-06-18 01:04:32');
INSERT INTO `customer` VALUES (177, '小程', 0, 0, '6', '5', '22', '小韩', '010-88886616', '13718026541', '100000', '北京市昌平区', '2017-05-16 16:25:59');
INSERT INTO `customer` VALUES (178, '7777', 0, 6, '6', '2', '22', '小韩', '10010', '14114141414', '19103', '2415  Linda Street', '2020-06-27 20:49:25');
INSERT INTO `customer` VALUES (179, '歪卜', 0, 6, '', '', '', '', '', '', '', '', '2020-06-29 16:47:51');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `user_id` int(32) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_code` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户账号',
  `user_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名称',
  `user_password` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码',
  `user_state` int(1) NOT NULL COMMENT '1:正常,0:暂停',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (1, 'm0001', '小韩', '123', 1);
INSERT INTO `sys_user` VALUES (2, 'm0002', '小雪', '123', 1);
INSERT INTO `sys_user` VALUES (3, 'm0003', '小石', '123', 1);
INSERT INTO `sys_user` VALUES (4, 'm0004', '小陈', '123', 1);
INSERT INTO `sys_user` VALUES (5, 'm0005', 'admin', '1234', 1);
INSERT INTO `sys_user` VALUES (6, '123', 'daming', '777', 1);

-- ----------------------------
-- Table structure for system
-- ----------------------------
DROP TABLE IF EXISTS `system`;
CREATE TABLE `system`  (
  `syst_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '系统id',
  `syst_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '系统名',
  `syst_user_id` int(11) DEFAULT NULL,
  `syst_create_id` int(11) DEFAULT NULL,
  `syst_source` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '对应编号的系统来源',
  `syst_industry` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '对应编号的系统行业',
  `syst_level` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '对应编号的系统等级',
  `syst_linkman` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '系统关联人',
  `syst_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '系统号',
  `syst_mobile` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '系统移动号',
  `syst_zipcode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '系统编号',
  `syst_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '系统地址',
  `syst_createtime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`syst_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 181 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of system
-- ----------------------------
INSERT INTO `system` VALUES (1, 'son', NULL, NULL, '6', '5', '22', 'daming', '7766', '13131313131', '530001', '派出所', '2020-06-04 18:17:12');
INSERT INTO `system` VALUES (178, 'anmy', 0, 0, '35', '39', '40', 'daming', '10010', '10087', '530000', '530000', '2020-06-27 20:43:37');
INSERT INTO `system` VALUES (179, 'daming', 0, 0, '35', '39', '40', 'qiumo', '10001', '10089', '530001', '530001', '2020-06-27 20:49:01');
INSERT INTO `system` VALUES (180, 'lingling', 0, 6, '36', '39', '41', '110', '110', '100', '100000', '100000', '2020-06-27 20:55:50');

SET FOREIGN_KEY_CHECKS = 1;
