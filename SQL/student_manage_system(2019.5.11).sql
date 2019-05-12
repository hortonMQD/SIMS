/*
 Navicat Premium Data Transfer

 Source Server         : MQD
 Source Server Type    : MySQL
 Source Server Version : 50561
 Source Host           : localhost:3306
 Source Schema         : student_manage_system

 Target Server Type    : MySQL
 Target Server Version : 50561
 File Encoding         : 65001

 Date: 11/05/2019 16:51:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `courseID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `courseName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `courseTime` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `courseType` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `courseCredit` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for major
-- ----------------------------
DROP TABLE IF EXISTS `major`;
CREATE TABLE `major`  (
  `majorID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `majorName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for s_c
-- ----------------------------
DROP TABLE IF EXISTS `s_c`;
CREATE TABLE `s_c`  (
  `stuID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `courID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `result` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `stuID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stuName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stuSex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stuEntrance` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stuMajor` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stuClassName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stuHome` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `teaPasswd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_c
-- ----------------------------
DROP TABLE IF EXISTS `t_c`;
CREATE TABLE `t_c`  (
  `teaID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `courseId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `teaID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `teaName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `teaSex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `teaAge` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `teaDuty` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `teaTelephone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `teaPasswd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `tealimit` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- View structure for stu_cour
-- ----------------------------
DROP VIEW IF EXISTS `stu_cour`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `stu_cour` AS select `student`.`stuID` AS `学号`,`student`.`stuName` AS `姓名`,`student`.`stuClassName` AS `班级`,`tea_cour`.`课程编号` AS `课程编号`,`tea_cour`.`课程名称` AS `课程名称`,`tea_cour`.`教师姓名` AS `教师姓名`,`tea_cour`.`教师职务` AS `教师职务`,`tea_cour`.`联系电话` AS `联系电话`,`tea_cour`.`课程类别` AS `课程类别`,`tea_cour`.`课程学分` AS `课程学分`,`s_c`.`result` AS `分数` from ((`s_c` join `student` on((`student`.`stuID` = `s_c`.`stuID`))) join `tea_cour` on((`s_c`.`courID` = `tea_cour`.`课程编号`)));

-- ----------------------------
-- View structure for tea_cour
-- ----------------------------
DROP VIEW IF EXISTS `tea_cour`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `tea_cour` AS select `teacher`.`teaID` AS `教师编号`,`teacher`.`teaName` AS `教师姓名`,`course`.`courseID` AS `课程编号`,`course`.`courseName` AS `课程名称`,`teacher`.`teaDuty` AS `教师职务`,`teacher`.`teaTelephone` AS `联系电话`,`course`.`courseType` AS `课程类别`,`course`.`courseCredit` AS `课程学分` from ((`teacher` join `t_c` on((`teacher`.`teaID` = `t_c`.`teaID`))) join `course` on((`course`.`courseID` = `t_c`.`courseId`)));

SET FOREIGN_KEY_CHECKS = 1;
