--1. 데이터 정의어 (DDL) - create, alter, drop(cad)
--2. 데이터 조작어 (DML) - insert, select, update, delete - crud
--3. 데이터 제어어 (DCL) - grant, revoke

/*
트랜잭션
1. 세션 - 어떤 활동을 위한 시간이나 기간
2. lock - 잠금현상, 조작중인 데이터를 다른세션에서 조작할 수 없음. 보류
3. commit - 반영 / rollback - 되돌리기
*/


--Q1. 테이블 복사 dept_tcl
create table dept_tcl as select * from dept; -- dept 테이블 찾아서 복사하기
desc dept_tcl;
--Q2. cmd
--Q3. 1) insert / select     2) select
insert into dept_tcl values (50,'DATABASE', 'SEOUL');
--Q4. 1)developer insert/select         2) cmd - select
--          반영 O                            반영 X
select * from dept_tcl;
--Q5. 1)developer insert/select         2) cmd - select
--          반영 O                            반영 O
commit;
--Q6. 1)developer insert/select         2) cmd - select
--          반영취소
select * from dept_tcl;
update dept_tcl set loc = 'busan' where deptno = 50;
select * from dept_tcl; -- 50 busan
rollback; -- 원상복귀 ( 저장전으로 )
select * from dept_tcl; -- 50 seoul

















