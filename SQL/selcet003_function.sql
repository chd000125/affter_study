--function
--String, Number, Date, nvl(java:if) / case(java:switch)

--#function
--Q1. empno, ename 조회
--1. lower 소문자, upper 대문자, initcap 첫글자 대문자
--2. length 문자열 길이
--3. substr (문자열, 시작위치, 추출길이) 문자열 일부분 추출
--4. instr (문자열,찾을문자열,시작위치,몇번째부터) 특정위치 조회
--5. trim 6. concat 7. replace 8. lpad,rpad
select empno, ename from emp;

select empno,ename, length(ename), lower(ename), upper(ename), initcap(ename) from emp;
--Q2. 이름의 앞글자 2개씩만 추출 : substr ( 문자열, 시작위치, 추출길이 )
select ename, substr ( ename,1,1) as 첫글자, substr(ename,1,2) as 이름2글자, substr(ename,1,3) as 이름3글자 from emp;
--Q#. empno,ename,이름의 갯수
select empno, ename, length(ename), instr(ename,'S'), instr(ename,'S',5) from emp;

--Test EMP테이블에서 INSTR 함수로 사원이름에 S가 있는 데이터를 조회하시오.
select * from emp where instr(ename,'S') > 0;
--Test EMP테이블에서 INSTR 함수로 사원이름에 S가 있는 데이터 중 이름의 글자가 5~6개 사이인 데이터를 조회하시오.
select * from emp where instr(ename,'S')>0 and length(ename)>=5 and length(ename)<=6 ;





