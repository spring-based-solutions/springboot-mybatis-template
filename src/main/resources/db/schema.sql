create table student
(
    id   bigint auto_increment primary key comment '学生ID',
    name varchar(30) not null comment '学生名字',
    sex boolean default 0 comment '性别',
    birthday datetime(4) comment '生日:true为男性，false为女性'
);