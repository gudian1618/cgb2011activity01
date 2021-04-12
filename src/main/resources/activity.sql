drop database if exists dbactivity;
create database dbactivity default character set utf8;
use dbactivity;
create table tb_activity(
                            id bigint primary key auto_increment,
                            title varchar(100) not null,
                            category varchar(100) not null,
                            startTime datetime not null,
                            endTime datetime not null,
                            remark text,
                            state tinyint,
                            createdTime datetime not null,
                            createdUser varchar(100) )engine=InnoDB;
insert into tb_activity values (null,'ABS','cuoxiao','2020-02-02 15:00:00','2020-02-03
15:00:00','...',1,now(),'xiaoli');
insert into tb_activity values (null,'VALIDATE','cuoxiao','2020-02-02 15:00:00','2020-02-03
15:00:00','...',1,now(),'xiaoli');
insert into tb_activity values (null,'VALIDATE','cuoxiao','2020-02-02 15:00:00','2020-02-03
15:00:00','...',1,now(),'xiaoli');
insert into tb_activity values (null,'ABS','cuoxiao','2020-02-02 15:00:00','2020-02-03
15:00:00','...',1,now(),'xiaoli');
insert into tb_activity values (null,'ACCESS','cuoxiao','2020-02-02 15:00:00','2020-02-03
15:00:00','...',1,now(),'xiaoli');
