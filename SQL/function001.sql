--RDB ( 테이블들의 관계 )
--테이블 - 관계( 속성 / 필드 ) - 테이블
--데이터베이스 언어 ( DDL, DML, DCL )
--DML - insert, select, update, delete CRUD
--select ( basic / where / function / group / join / subquery )

--Q1. 전체 데이터 가져오기
select * from emp;

--function
--String, Number, Date, nvl( java:if ) / case ( java:switch )


------------------------------------------------------------
------------------------------------------------------------  NULL 값 찾기

  IS NULL        => null인 값 찾기
  IS NOT NULL => null을 제외한 값 찾기

-------------------------------------------------------------------------------------------------------
[지문]
1.  EMP 테이블에서  COMM 이 NULL인값을 찾아 출력하시오. 
   다음중 잘 작동하는 코드는?

  SELECT * FROM EMP WHERE COMM='null'; 
  SELECT * FROM EMP WHERE COMM=null;  
  SELECT * FROM EMP WHERE COMM IS NULL; -- 이거만 가능
  SELECT * FROM EMP WHERE COMM IS NOT NULL; 
  
--------------------------------------------------------------------------------------------------------
-- nvl(  java : if  )   /  case ( java : switch  )

select nvl(null, 1000)from dual;
select nvl(10, 1000) from dual;

--Q. emp 구조확인 / 데이터 확인
desc emp;
select * from emp;
--Q2.  이름(ENAME) , 커미션(COMM) , 커미션이 없으면 0으로 표시한 결과를 다음과 같이 출력하시오.
select ename, comm as 커미션, nvl(comm, 0) as 커미션2 from emp;
--Q3. 이름, 커미션, 합산(sal+comm) 값을 표시.
select ename, comm as 커미션, sal+nvl(comm,0) as 합산 from emp;

-- decode / case --
decode ( value, if1,then1,if2,then2,other )

case
    when 조건 1 then 표시
    when 조건 2 then 표시
    when 조건 3 then 표시
else 모든 조건에 해당하지 않을때
end

DDL : CREATE(#), ALTER, DROP
DML : INSERT, SELECT(#), UPDATE, DELETE

create table a ( no number );
desc a; -- 구조확인
    -- 데이터 삽입 -- 
insert into a values (1);
insert into a values (2);
insert into a values (3);

select * from a;
commit

--Q2. no가 1이면 1, 2면 2, 3이면 3
select no, decode( no, 1,'1이다',2,'2이다',3,'3이다') from a;

select no, case
    when no=1 then '1이다'
    when no=2 then '2이다'
    when no=3 then '3이다'
end from a;

--decode / case 버전으로 풀기
--Test1. emp 테이블에서 부서번호가 10이면 ACCOUNTING, 20이면 RESEARCH, 30이면 SALE를 다음과 같이 출력
    select * from emp;
    select deptno, decode(deptno,10,'ACCOUNTING',20,'RESEARCH',30,'SALES') as deptno2 from emp;
    select deptno, case
            when deptno=10 then 'ACCOUNTING'
            when deptno=20 then 'RESEARCH'
            when deptno=30 then 'SALES'
    end from emp;

--Test2. emp 테이블에서 JOB이 CLERK이면 판매원, SALESMAN이면 영업사원, 그 외는 사원으로 출력
select job, decode(job,'CLERK','판매원','SALESMAN','영업사원','사원') as job2 from emp;

select job, case job
    when 'CLERK' then '판매원'
    when 'SALESMAN' then '영업사원'
else '사원'
end from emp;


----------------------NUMBER
1. round ( 숫자, 자리수 ) -- 반올림
2. ceil(숫자) --올림
3. floor(숫자) --내림
4. mod( 숫자, 나눌 수) --나머지
5. trunc(숫자, 자리수) -- 버림

select ceil(1.1)올림,round(1234.567,2)반올림, floor(1.9)내림,mod(10,3)나머지,trunc(1234.567,2)버림 from dual;

--Test 123.45678을 ceil,floor 를 이용해 다음과 같이 출력
-- 123.45678 124 123
select 123.45678 ceil(123.45678), floor(123.45678) from dual;

-------------DATE
1. SYSDATE 현재 날짜와 시간
2. ADD_MONTHS ( 날짜, 숫자 ) 날짜에서 숫자만큼 월 더해주기
3. MONTHS_BETWEEN( 날짜,날짜 ) 두 날짜 사이의 개월 수 구하기
4. NEXT_DAY(날짜, 요일) 가장 가까운 요일 -- 1일 2월 3화 4수 5목 6금 7토
5. LAST_DAY(날짜) 마지막 날짜

SELECT sysdate 금일 FROM dual;

select SYSDATE 금일, LAST_DAY(SYSDATE) 이달마지막, NEXT_DAY(SYSDATE,'금요일') from dual;
select SYSDATE 금일, LAST_DAY(SYSDATE) 이달마지막, NEXT_DAY(SYSDATE,6) from dual;
select ADD_MONTHS(SYSDATE,1) 다음달, MONTHS_BETWEEn('2025-05-30',SYSDATE) from dual;

--Test emp테이블에서 현재날짜를 기준으로 입사 후 몇개월이 지났는지
select * from emp;
select ename, floor(MONTHS_BETWEEN((SYSDATE,HIREDATE)/12)) from emp;

--String
1.upper (문자열)대문자
2.lower (문자열)소문자
3. initcap(문자열) 첫글자 대문자
4. length(문자열) 문자열 길이
5. substr ( 문자열, 시작, 갯수) 문자열의 일부분 추출
6. instr (문자열, 찾을문자열 ) 문자열 위치
7. lpad (문자열, 전체자리수, 특정문자)
8. rpad (문자열, 전체자리수, 특정문자) 
9. trim, rtrim, ltrim 공백제거
10. concat (문자열, 문자열 ), 문자열 || 문자열

select 'ABC', upper('abc'), lower('ABC'), initcap('abc'),length('abc') from dual;
select substr('ABC',2,2), instr('ABC','B') from dual;
select lpad('ABC',5,'#'),rpad('ABC',5,'#')from dual;
select '#' || 'ABC' || '#', concat('#', concat('ABC','#')) from dual;
select '#' || trim(' ABC')||'#', '#'||rtrim(' ABC')||'#','#'||trim(' ABC')||'#' from dual; -- # ABC#



1.  EMP 테이블에서 사원이름(ENAME)을  다음과 같이 출력하시오.
select ename, lower(ename), upper(ename), initcap(ename) from emp;
     
2.  EMP 테이블에서 직업의 문자열길이를  다음과 같이 출력하시오.
select job, length(job) from emp order by job asc;

3.  EMP 테이블에서 SUBSTR을 이용하여 직업(JOB)의 문자열길이를  다음과 같이 출력하시오.
select job, substr(job,1,2) as S1, substr(job,2,2) as S2, substr(job,3)as S3 from emp; -- 마지막 미기입시 끝까지 출력

4.   EMP 테이블에서 INSTR을  이용하여 직업(JOB)의 문자에서 A의 위치를  다음과 같이 출력하시오.
select job, instr(job,'A'), instr(job,'A',-1), instr(job,'A',2,1),instr(job,'A',2,2)  from emp; -- instr의 시작 위치가 -1이면 뒤에서 부터 검색.

5. LPAD, RPAD를 이용하여 전체자리수를 10자리로 정하고 남는 부분 특정 문자열로 채우는 코드이다 
select job, LPAD(job,10,'#'), RPAD(job,10,'@') from emp;





