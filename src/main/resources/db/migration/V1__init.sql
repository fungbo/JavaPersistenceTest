CREATE TABLE `post` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(255),
  PRIMARY KEY(`id`)
) ENGINE=InnoDB;

CREATE TABLE `post_comment` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `review` VARCHAR(255),
  `post_id` BIGINT(20),
  PRIMARY KEY(`id`)
) ENGINE=InnoDB;
