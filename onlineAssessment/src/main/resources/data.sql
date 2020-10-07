create table userBean (firstName varchar(20),lastName varchar(20),emailId varchar(20) primary key,password varchar(20),userType varchar(20));

drop table testbean;
create table testbean(id int not null auto_increment, testDate  date, assessment varchar(20), testMarks int, emailId varchar(20), totalMarks int, result varchar(20));