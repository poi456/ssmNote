create database test char set utf8;
use test;
create table User(
    id int primary key auto_increment,
    name varchar(32),
    sex char(10)
)char set utf8;
insert into user (name, sex)
values ('xxx', '男')
,('xxx', '男')
,('xxx', '男')
,('xxx', '男')