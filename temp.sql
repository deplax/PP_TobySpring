create database spring;
use spring;

create table users(
	id varchar(10) primary key,
    name varchar(20) not null,
    password varchar(20) not null
);
show tables;

select * from users;

delete from users where id = "whiteship";