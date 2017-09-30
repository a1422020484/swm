
/* create database swm */
CREATE DATABASE `swm`CHARACTER SET utf8 COLLATE utf8_bin; 

/* create table t_user */
CREATE TABLE `swm`.`t_user`( `id` INT(32) NOT NULL AUTO_INCREMENT, `username` VARCHAR(32), PRIMARY KEY (`id`) ); 

INSERT INTO `swm`.`t_user` (`id`, `username`) VALUES ('1', 'yang'); 
INSERT INTO `swm`.`t_user` (`id`, `username`) VALUES ('2', 'liu'); 
