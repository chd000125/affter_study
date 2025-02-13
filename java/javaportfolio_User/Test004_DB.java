package com.company.javaportfolio_User;


public class Test004_DB {
	public static void main(String[] args) {

	}
}
/*
0.  기능
> 자원봉사자관리
		사용자측		관리자측
CREATE  -			등록
READ    -			전체 , 봉사자검색
UPDATE	-			봉사자정보수정
DELETE	-			봉사자정보삭제

1.  model (저장소)  
----------------------------------------------
no		name 		email			date
----------------------------------------------
1		aaa			aaa@gmail.com	2025-02-13
2		bbb			bbb@gmail.com	2025-02-13

1-1. table 명 : userinfo    
    no     숫자		      필수입력		기본키
    name   varchar2(20)   필수입력		
    email  varchar2(20)   필수입력
    udate   timestamp      default current_timestamp
   
    sequence 명 : seq_userinfo
    
    create table userinfo (
    	no    number        not null  primary key , 
    	name  varchar2(20)  not null,
    	email varchar2(20)  not null,
    	udate timestamp     default  current_timestamp
    );
    
    create sequence seq_userinfo;
     		
1-2. crud (insert, select, delete, update)     
** 유저삽입
	insert into userinfo  (no, name, email) values (seq_userinfo.nextval , 'aaa', 'aaa@gmail.com')
	insert into userinfo  (no, name, email) values (seq_userinfo.nextval , 'bbb', 'bbb@gmail.com')

** 유저전체검색 / 해당번호가 2번인 유저검색   #
	select * from userinfo;
	select * from userinfo  where no=2;
	
** 해당번호가 2번인 유저 email 수정 abc@gmail.com   #
	update  userinfo  set email='abc@gmail.com'  where  no=2;

** 해당유저가 2번인 유저 삭제   #
	delete from userinfo  where  no=2;

1-3. Dto   UserInfo
1-4. Dao   

2. controller(처리)

3. view(사용자화면)
*/






