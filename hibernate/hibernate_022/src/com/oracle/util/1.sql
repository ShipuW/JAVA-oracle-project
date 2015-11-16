drop database studb; 
create database studb; 

create table COURSE (
        ID varchar(255) not null,
        NAME varchar(255),
        primary key (ID)
    );

    create table STUDENT (
        ID varchar(255) not null,
        NAME varchar(255),
        cardId varchar(255),
        age integer,
        team_id varchar(255),
        primary key (ID)
    );

    create table TEAM (
        ID varchar(255) not null,
        teamName varchar(255),
        primary key (ID)
    );

    create table student_course (
        stu_id varchar(255) not null,
        course_id varchar(255) not null,
        primary key (stu_id, course_id)
    );

    alter table STUDENT 
        add constraint FK_3qqsuq937jpc87a6ao08ts33t 
        foreign key (team_id) 
        references TEAM (ID);

    alter table student_course 
        add constraint FK_8eu2c4tg0i8amuwx6n6d4i8h0 
        foreign key (course_id) 
        references COURSE (ID);

    alter table student_course 
        add constraint FK_f9ksomvcwo1c1wt2dktgkqc5l 
        foreign key (stu_id) 
        references STUDENT (ID);


insert into team values ("001","team1");
insert into team values ("002","team2");
insert into team values ("003","team3");

insert into student values("001","张三","001",23,"001");
insert into student values("002","李四","002",24,"001");
insert into student values("003","王麻子","003",18,"002");
insert into student values("004","张小小","004",60,"003");

insert into course values ("001","历史");
insert into course values ("002","计算机");
insert into course values ("003","音乐");
insert into course values ("004","经济");
insert into course values ("005","政治");

insert into student_course values("001","001");
insert into student_course values("001","002");
insert into student_course values("001","003");

insert into student_course values("002","002");
insert into student_course values("002","004");
insert into student_course values("003","002");
insert into student_course values("003","003");

select * from team;
select * from student;
select * from COURSE;
select * from student_course;


/*内连接*/
select * from team inner join student on team.ID=student.team_id;
select * from team,student where team.ID=student.team_id;



insert into team values ("004","team4");
/*左连接*/
select * from team left outer join student on team.ID=student.team_id;
/*右连接*/
select * from team right outer join student on team.ID=student.team_id;












