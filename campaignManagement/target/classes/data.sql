drop table if exists adminbean;
drop table if exists surveylist;
drop table if exists surveyquestions;
drop table if exists answers;

create table adminbean (objid int not null auto_increment,emailId varchar2(20) primary key ,password varchar2(20));

create table surveylist (objid int auto_increment primary key, title varchar2(100),
 url varchar2(100) unique not null, isActive int, emailId varchar2(20),
 foreign key (emailid) references adminbean(emailid)
);

create table surveyquestions (objid int auto_increment primary key, questions2list int not null,
 question varchar2(2000) not null, answerType varchar2(20) not null, options varchar2(4000) not null,
 foreign key (questions2list) references surveylist(objid)
);

create table answers (objid int auto_increment primary key, answer2question int not null,
 answerType varchar2(20) not null, answer varchar2(4000) not null,
 foreign key(answer2question) references surveyquestions(objid)
);