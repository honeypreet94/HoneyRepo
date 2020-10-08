create table userBean (firstName varchar(20),lastName varchar(20),emailId varchar(20) primary key,password varchar(20),userType varchar(20));

drop table testresult;
create table testresult(id int not null auto_increment, test_date  datetime, assessment varchar(20), test_marks int, email_id varchar(20), total_marks int, result varchar(20));