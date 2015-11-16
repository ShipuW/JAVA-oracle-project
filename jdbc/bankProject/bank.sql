--使用的数据库是MySQL数据库

--定义数据库test
create database tests;
use tests;

--定义表student，此表是JDBC课堂示例代码用到的表
create table student(
id int not null primary key auto_increment,
name varchar(45) not null,
age int not null
);

insert into student(name,age) values('zhangsan',10);
insert into student(name,age) values('lisi',20);
insert into student(name,age) values('wangwu',30);
insert into student(name,age) values('zhaoliu',40);
insert into student(name,age) values('sunqi',50);
insert into student(name,age) values('wuyuanping',20);
insert into student(name,age) values('xiaoming',60);
insert into student(name,age) values('name1',70);
insert into student(name,age) values('test1',80);
insert into student(name,age) values('oracle',90);

select * from student;

--定义表score，此表是JDBC课后作业用到的表
create table score(
id int not null primary key auto_increment,
chinese int not null,
english int not null,
history int not null
);

insert into score(chinese,english,history) values(10,10,10);
insert into score(chinese,english,history) values(20,20,20);
insert into score(chinese,english,history) values(30,30,30);
insert into score(chinese,english,history) values(40,40,40);
insert into score(chinese,english,history) values(50,50,50);
insert into score(chinese,english,history) values(60,60,60);
insert into score(chinese,english,history) values(70,70,70);
insert into score(chinese,english,history) values(80,80,80);
insert into score(chinese,english,history) values(90,90,90);
insert into score(chinese,english,history) values(100,100,100);


--定义存储过程
--向表student中插入数据的存储过程proc_insert_test
DELIMITER //  
CREATE PROCEDURE proc_insert_test(vname varchar(45),in vage int)
begin
     insert into student(`name`,age) values(vname,vage);     
end
DELIMITER; //  

--从表student中根据年龄查询数据的存储过程proc_select_test
DELIMITER //  
CREATE PROCEDURE proc_select_test(stu_age int)
begin
     select * from student where age>stu_age;     
end
DELIMITER; //  

--显示所有存储过程
SHOW  PROCEDURE  STATUS;    
--删除存储过程
drop procedure if exists proc_insert_test;

--第七章银行系统相关表
--银行账户表
create table bankaccount(
accno bigint not null primary key auto_increment,
name varchar(45) not null,
balance float not null
);
insert into bankaccount values(null,'可',212);
select last_insert_id();
select * from bankaccount order by accno desc;
select * from bankaccount where name='可';
select last_insert_id();

insert into bankstatement (action,txdate,amt,fromaccno) values(?,?,?,?);
--账户操作表
create table bankstatement(
id bigint not null primary key auto_increment,
action varchar(45) not null,
txdate date not null,
amt float not null,
toaccno bigint,
fromaccno bigint,
INDEX accno_ind (fromaccno), 
foreign key(fromaccno) REFERENCES bankaccount(accno) 
on update CASCADE 
);
select * from bankaccount;
select * from bankstatement;