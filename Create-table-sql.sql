CREATE TABLE `product` (
                           `id` bigint NOT NULL AUTO_INCREMENT,
                           `isDelete` int DEFAULT NULL,
                           `name` varchar(255) DEFAULT NULL,
                           `price` double DEFAULT NULL,
                           `quantity` bigint DEFAULT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci