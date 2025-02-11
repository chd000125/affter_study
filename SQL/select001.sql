--1. RDB //면접
-- 관계 DATABASE
-- 테이블들의 관계 ( 엔티티 / 관계 / 속성 )

--2. DATABASE 언어
--      정의어(ddl)        -- create, alter, drop
--      조작어(dml) //면접 -- insert, select(#), update, delete
--      제어어(dcl)        -- grant, revoke

--3. select
--1) baisc 2) where (조건) 3) function 4) group (집계함수) 5) join 6) subquery

-- SELECT(1)
-- 테이블 -엔티티
-- 테이블 (표)
--Q001. EMP 테이블 구성

desc emp;

--Q2. DEPT 테이블 구성
desc dept;

--Q3. salgrade 테이블 구성
desc salgrade;

--Q4. emp 테이블의 전체 데이터 조회
select *from emp;

-- 참고) 조작어(dml) //면접 -- insert, select(#), update, delete(삭제)

delete from emp;
select *from emp;
desc emp;
INSERT INTO EMP VALUES (7839,'KING','PRESIDENT',NULL,TO_DATE('1981-11-17','YYYY-MM-DD'),5000,NULL,10);
INSERT INTO EMP VALUES (7698,'BLAKE','MANAGER',7839,TO_DATE('1981-05-01','YYYY-MM-DD'),2850,NULL,30);
INSERT INTO EMP VALUES (7782,'CLARK','MANAGER',7839,TO_DATE('1981-05-09','YYYY-MM-DD'),2450,NULL,10);
INSERT INTO EMP VALUES (7566,'JONES','MANAGER',7839,TO_DATE('1981-04-01','YYYY-MM-DD'),2975,NULL,20);
INSERT INTO EMP VALUES (7654,'MARTIN','SALESMAN',7698,TO_DATE('1981-09-10','YYYY-MM-DD'),1250,1400,30);
INSERT INTO EMP VALUES (7499,'ALLEN','SALESMAN',7698,TO_DATE('1981-02-11','YYYY-MM-DD'),1600,300,30);
INSERT INTO EMP VALUES (7844,'TURNER','SALESMAN',7698,TO_DATE('1981-08-21','YYYY-MM-DD'),1500,0,30);
INSERT INTO EMP VALUES (7900,'JAMES','CLERK',7698,TO_DATE('1981-12-11','YYYY-MM-DD'),950,NULL,30);
INSERT INTO EMP VALUES (7521,'WARD','SALESMAN',7698,TO_DATE('1981-02-23','YYYY-MM-DD'),1250,500,30);
INSERT INTO EMP VALUES (7902,'FORD','ANALYST',7566,TO_DATE('1981-12-11','YYYY-MM-DD'),3000,NULL,20);
INSERT INTO EMP VALUES (7369,'SMITH','CLERK',7902,TO_DATE('1980-12-09','YYYY-MM-DD'),800,NULL,20);
INSERT INTO EMP VALUES (7788,'SCOTT','ANALYST',7566,TO_DATE('1982-12-22','YYYY-MM-DD'),3000,NULL,20);
INSERT INTO EMP VALUES (7876,'ADAMS','CLERK',7788,TO_DATE('1983-01-15','YYYY-MM-DD'),1100,NULL,20);
INSERT INTO EMP VALUES (7934,'MILLER','CLERK',7782,TO_DATE('1982-01-11','YYYY-MM-DD'),1300,NULL,10);

--todo1) 전체데이터 보기
   select *from emp;
--todo2) 구조 확인
    desc emp;
    
--Q5. emp 테이블의 empno,ename,deptno 데이터 조회
    select empno, ename, deptno from emp;
    
--Q6. emp 테이블의 deptno 데이터 조회(중복 제거 X) - distinct
select distinct deptno from emp;

--Q7. emp 테이블의 job, deptno 데이터 조회 ( 중복 제거 O )
select distinct deptno, job from emp;

--Q8. emp 테이블의 job, deptno 데이터 조회 ( 중복 제거 X )
select      job, deptno from emp;
select all job, deptno from emp;

--Q9. 계산식 가능 - emp 테이블에서 "연간 총 수입"
select sal * 12 +comm from emp;
select ename,sal *12 + comm, comm from emp;

--Q10. 계산식 가능 - emp 테이블에서 '연간 총 수입'
select ename, sal, sal + sal +sal +sal +sal +sal +sal +sal +sal +sal +sal +sal +comm, comm from emp;

--Q11. 필드 별칭 - 
select ename,sal *12 + comm as 연간총수입, comm from emp;
select ename,sal *12 + comm    연간총수입, comm from emp; --동일

--Q12. 급여기준 오름차순정렬
select * from emp order by sal asc;

--Q12. 급여기준 내림차순정렬
select * from emp order by sal desc;

--Q12. 부서번호 기준(오름차순정렬) 급여정렬(내림차순
select * from emp order by deptno asc, sal desc;

--Ex1. emp 테이블의 job열 데이터 중복없이 조회
select distinct job from emp;

--Ex2. emp 테이블의 모든 데이터 조회 (별칭 붙여서)
select empno as EMPLOYEE_NO, ename as EMPLOYEE_NAME,
       mgr as MANAGER, sal as SALARY, comm as COMMISSION, deptno as DEPARTMENT_NO 
       from emp order by deptno asc, ename desc;

-- 조건 (where)
--Q1. 전체데이터 출력
    select * from emp;
--Q2. deptno가 30인 데이터 출력
    select * from emp where deptno=30;
--Q3. deptno가 30이고 job이 salesman인 데이터 출력
    select * from emp where deptno=30 and job = 'salesman';
--Q4. deptno가 30이거나 job이 salesman인 데이터 출력
    select * from emp where deptno=30 or job = 'salesman';
    
-- TEST1) 부서번호가 30이고 JOB이 'CLERK' 인 데이터만 조회
    select * from emp where deptno = 30 and job = 'clerk';
    
-- TEST2) 부서번호가 30이거나 JOB이 'CLERK' 인 데이터만 조회
    select * from emp where deptno = 30 or job = 'clerk';

 -- Q5. EMP테이블에서 SAL 열에 12를 곱한값이 36000인 행을 조회하시오.
    select * from emp where sal*12 = 36000;
 -- Q6. EMP테이블에서 SAL 열이 3000이상인 행을 조회하시오.
    select * from emp where sal >= 3000;
 -- Q7. EMP테이블에서  ENAME 열의 첫문자가 F와 같거나 뒤에 있는 행을 조회하시오.
    select * from emp where ename >= 'F';
 -- Q8. EMP테이블에서  ENAME 열의 문자열이 첫문자 F, 두번째 문자 O, 세번째 문자 R, 네번째문자열이 Z 인 문자열보다 앞에 있는 행을 조회하시오.
    select * from emp where ename <= 'FORZ';
-- Q9.  EMP테이블에서   != 를 이용하여 SAL열이 3000이 아닌 행을 조회하시오.
    select * from emp where sal != 3000;
-- Q10.  EMP테이블에서   <> 를 이용하여 SAL열이 3000이 아닌 행을 조회하시오.
    select * from emp where sal <> 3000;
-- Q11.  EMP테이블에서   ^= 를 이용하여 SAL열이 3000이 아닌 행을 조회하시오.
    select *from emp where sal ^= 3000;
-- Q12.  EMP테이블에서   NOT 을 이용하여 SAL열이 3000이 아닌 행을 조회하시오.
    select *from emp where NOT sal = 3000;

--  Q13. EMP테이블에서   OR 를 이용하여 JOB 열이 'MANAGER' ,'SALESMAN' , 'CLERK' 중 하나라도 포함되는 행을 조회하시오.
    select * from emp where job = 'MANAGER' or job = 'SALESMAN' or job = 'CLERK';
-- Q14. EMP테이블에서   IN 를 이용하여 JOB 열이 'MANAGER' ,'SALESMAN' , 'CLERK' 중 하나라도 포함되는 행을 조회하시오.
    select * from emp where job in ('MANAGER','SALESMAN','CLERK');
-- Q17.  EMP테이블에서  대소비교연산자(<=  , >= )  and 를 이용하여 sal 열이 2000이상 3000이하인인 행을 조회하시오.
    select * from emp where sal >=2000 and sal <=3000;
-- Q18.  EMP테이블에서  BETWEEN AND  를 이용하여 sal 열이 2000이상 3000이하인인 행을 조회하시오. #(이상, 이하)
    select * from emp where sal between 2000 and 3000;
-- Q21. EMP테이블에서 ENAME이 S로 시작하는 행을 조회하시오.    ( S로 끝나는, S가 포함되어 있는,  _두번째 글자가 S)
    select * from emp where ename = 'SCOTT'; -- =(같다), 다르다(!=, ^=, <>, NOT)
    select * from emp where ename like 'S%'; -- s로 시작
    select * from emp where ename like '%S'; -- s로 끝남
    select * from emp where ename like '%S%'; -- s가 들어간
-- Q26. EMP테이블에서 COMM이 NULL 인행을 조회
    select * from emp where comm is NULL;
    select * from emp where comm is NOT NULL;
    
-- EX001 EMP 테이블에서 ENAME이 G로 끝나는 사원데이터를 모두 조회
    select * from emp where ename like '%G';
--  EX002  EMP테이블에서 DEPTNO가 30인 사원 중 직책이(JOB)이 SALESMAN 인 사원의 EMPNO, ENAME, JOB, SAL, DEPTNO를 조회하시오 
    select EMPNO, ENAME, JOB, SAL, DEPTNO from emp where deptno=30 and job = 'SALESMAN';


