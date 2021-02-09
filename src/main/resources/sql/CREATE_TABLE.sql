CREATE TABLE `supplier` (
 `id` int(11) NOT NULL,
 `cif` varchar(255) DEFAULT NULL,
 `create_date` date DEFAULT NULL,
 `logo` varchar(255) DEFAULT NULL,
 `name` varchar(255) DEFAULT NULL,
 `score` int(11) DEFAULT NULL,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4