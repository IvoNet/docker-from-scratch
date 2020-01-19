CREATE DATABASE if NOT EXISTS `quote`;
USE quote;
DROP TABLE IF EXISTS `quote`;

CREATE TABLE IF NOT EXISTS `quote` (
  `id` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `author` varchar(250) NOT NULL,
  `quote` text  NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

INSERT INTO `quote` (`author`, `quote`) VALUES('Anonymous', 'A dirty mind is a joy forever.');
INSERT INTO `quote` (`author`, `quote`) VALUES('Unsourced', 'A Fool with a Tool is Still a Fool, but at least know your tool fool.');
INSERT INTO `quote` (`author`, `quote`) VALUES('Putts law', 'Technology is dominated by two types of people. Those who understand what they do not manage and those who manage what they do not understand.');
INSERT INTO `quote` (`author`, `quote`) VALUES('Edward V Berard', 'Walking on water and developing software from a specification are easy if both are frozen.');
