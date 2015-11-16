--ʹ�õ����ݿ���MySQL���ݿ�

--�������ݿ�test
create database tests;
use tests;

--�����student���˱���JDBC����ʾ�������õ��ı�
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

--�����score���˱���JDBC�κ���ҵ�õ��ı�
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


--����洢����
--���student�в������ݵĴ洢����proc_insert_test
DELIMITER //  
CREATE PROCEDURE proc_insert_test(vname varchar(45),in vage int)
begin
     insert into student(`name`,age) values(vname,vage);     
end
DELIMITER; //  

--�ӱ�student�и��������ѯ���ݵĴ洢����proc_select_test
DELIMITER //  
CREATE PROCEDURE proc_select_test(stu_age int)
begin
     select * from student where age>stu_age;     
end
DELIMITER; //  

--��ʾ���д洢����
SHOW  PROCEDURE  STATUS;    
--ɾ���洢����
drop procedure if exists proc_insert_test;

--����������ϵͳ��ر�
--�����˻���
create table bankaccount(
accno bigint not null primary key auto_increment,
name varchar(45) not null,
balance float not null
);
insert into bankaccount values(null,'��',212);
select last_insert_id();
select * from bankaccount order by accno desc;
select * from bankaccount where name='��';
select last_insert_id();

insert into bankstatement (action,txdate,amt,fromaccno) values(?,?,?,?);
--�˻�������
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