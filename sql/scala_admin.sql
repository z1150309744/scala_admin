/*
Navicat MySQL Data Transfer

Source Server         : mysql5.5
Source Server Version : 50512
Source Host           : localhost:3306
Source Database       : scala_admin

Target Server Type    : MYSQL
Target Server Version : 50512
File Encoding         : 65001

Date: 2017-08-17 13:56:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sys_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` varchar(32) NOT NULL DEFAULT '',
  `name` varchar(100) DEFAULT NULL COMMENT '角色名称',
  `code` varchar(255) DEFAULT NULL COMMENT '英文名称',
  `usable` int(1) DEFAULT NULL COMMENT '是否可用',
  `create_by` varchar(32) DEFAULT NULL COMMENT '创建者',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) DEFAULT NULL COMMENT '更新者',
  `update_date` datetime DEFAULT NULL COMMENT '更新时间',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注信息',
  `del_flag` char(1) NOT NULL DEFAULT '0' COMMENT '删除标记',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` varchar(32) NOT NULL DEFAULT '' COMMENT '主键',
  `realname` varchar(255) DEFAULT NULL COMMENT '姓名',
  `username` varchar(100) DEFAULT NULL COMMENT '用户名',
  `portrait` varchar(250) DEFAULT NULL COMMENT '头像',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `email` varchar(20) DEFAULT NULL COMMENT '邮件',
  `phone` varchar(20) DEFAULT NULL COMMENT '联系电话',
  `status` int(1) DEFAULT NULL COMMENT '系统用户状态',
  `create_by` varchar(32) DEFAULT NULL COMMENT '谁创建得',
  `create_date` datetime DEFAULT NULL,
  `update_by` varchar(32) DEFAULT NULL COMMENT '谁最后更新得',
  `update_date` datetime DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1231231231', '邹文文', 'shock', 'sdf', '626', '234', '23432', '1', '23234234', '2017-08-02 16:26:06', null, null, '23423');
