CREATE TABLE IF NOT EXISTS `quote` (
    `id` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `author` varchar(250) NOT NULL,
    `quote` text  NOT NULL
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;
