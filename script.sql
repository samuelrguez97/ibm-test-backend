create database db_ibmtest;
create user 'springapiibm'@'%' identified by 'ibmtest';
grant all on db_ibmtest.* to 'springapiibm'@'%';
commit;
CREATE TABLE `supplier` (
 `id` int(11) NOT NULL,
 `cif` varchar(255) DEFAULT NULL,
 `create_date` date DEFAULT NULL,
 `logo` varchar(255) DEFAULT NULL,
 `name` varchar(255) DEFAULT NULL,
 `score` int(11) DEFAULT NULL,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4
commit;
INSERT INTO `supplier`(`id`, `cif`, `create_date`, `logo`, `name`, `score`) VALUES (1, 'D00936971', CURRENT_TIMESTAMP, 'logo1.png', 'Proveedor1', 0);
INSERT INTO `supplier`(`id`, `cif`, `create_date`, `logo`, `name`, `score`) VALUES (2, 'R1096596J', CURRENT_TIMESTAMP, 'logo2.png', 'Proveedor2', 0);
INSERT INTO `supplier`(`id`, `cif`, `create_date`, `logo`, `name`, `score`) VALUES (3, 'H17921412', CURRENT_TIMESTAMP, 'logo3.png', 'Proveedor3', 0);
commit;