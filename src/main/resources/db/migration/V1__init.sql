CREATE TABLE `post` (
  `id` BIGINT(20),
  `title` VARCHAR(255)
) ENGINE=InnoDB;

CREATE TABLE `post_comment` (
  `id` BIGINT(20),
  `review` VARCHAR(255),
  `post_id` BIGINT(20)
) ENGINE=InnoDB;
