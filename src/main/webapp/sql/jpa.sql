--MySQL

drop table boards;
drop table hibernate_sequence;

create table boards(
	no int,	
	writer varchar(50),
	subject varchar(200),
	content varchar(1000),	
	regdate timestamp,
	primary key(no)
);

create table hibernate_sequence(
	next_val int(20) );

-- Oracle
select * from tab;
select * from seq;
create table boards(
	no number primary key,	
	writer varchar2(50),
	subject varchar2(200),
	content varchar2(1000),	
	regdate timestamp );
	
create sequence boards_seq;	


