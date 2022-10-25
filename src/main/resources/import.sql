create table items (
                       id bigint not null auto_increment,
                       count varchar(255),
                       name varchar(255),
                       status varchar(255),
                       primary key (id)
) engine=InnoDB;

INSERT INTO items (name, count, status) VALUES ('first', '3', 'open');
INSERT INTO items (name, count, status) VALUES ('second', '5', 'closed');
INSERT INTO items (name, count, status) VALUES ('third', '2', 'closed');