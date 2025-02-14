/*
0. 기능
> 자원봉사자관리
		사용자측			관리자측
CREATE					등록
READ					전체, 봉사자검색
UPDATE					봉사자 정보수정
DELETE					봉사자 정보삭제

1. model (저장소)
no		name		email		date
1		aaa		aaa@gmail.com	2025-02-13
1		bbb		bbb@gmail.com	2025-02-13

1-1. table 명 : userinfo
	no    숫자	       필수입력	기본키
	name  varchar2(20) 필수입력	
	email varchar2(20) 필수입력
	date  timestamp	   default current_timestamp
	
	sequence 명 : seq_userinfo
*/
    drop table userinfo;
	create table userinfo(
		no number not null primary key,
		name varchar2(20) not null,
		email varchar2(20) not null,
		udate timestamp default	current_timestamp
	);
        drop table seq_userinfo;
        create sequence seq_userinfo;

--1-2. crud ()
--**유저 데이터 추가
	insert into userinfo (no, name, email, date) values ( seq_userinfo.nextval, 'aaa', 'aaa@gmail.com');
	insert into userinfo (no, name, email, date) values ( seq_userinfo.nextval, 'aaa', 'aaa@gmail.com');

--** 유저 전체 검색 / 해당번호가 2번인 유저 검색 #
 select * from userinfo
 select * from userinfo where no = 2
 
** 해당번호가 2번인 유저 email 수정 abc@gmail.com
  update userinfo set email = 'abc@gmail.com' where no = 2;
  
** 해당번호가 2번인 유저 삭제 #
 delete from userinfo where no = 2;
 
 

1-3. Dto
1-4. Dao - db 연결해주는

*/