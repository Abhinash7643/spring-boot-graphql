CREATE TABLE `category` (
                            `id` int unsigned NOT NULL AUTO_INCREMENT,
                            `name` varchar(50) NOT NULL,
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1;

CREATE TABLE `product` (
                           `id` int unsigned NOT NULL AUTO_INCREMENT,
                           `name` varchar(255) NOT NULL,
                           `code` varchar(255) NOT NULL,
                           `price` double NOT NULL,
                           `category_id` int unsigned NOT NULL,
                           PRIMARY KEY (`id`),
                           FOREIGN KEY (category_id) REFERENCES category(id)
) ENGINE=InnoDB AUTO_INCREMENT=1;

CREATE TABLE author
(
    id   BIGINT NOT NULL AUTO_INCREMENT,
    age int  NOT NULL,
    name CHAR(30)  NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE tutorial
(
    id   BIGINT NOT NULL AUTO_INCREMENT,
    title CHAR(30)  NOT NULL,
    description CHAR(60)  NOT NULL,
    author_id BIGINT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (author_id) REFERENCES author(id)
);