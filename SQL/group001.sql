--group ( 집계 함수 )
--sum,  avg, max, min, count

--Q1. emp테이블 sql급여
select sal from emp;

select sum(sal) 총액, avg(sal) 평균, max(sal) 최대, min(sal) 최소, count(sal) 갯수 from emp;

select count(*) from emp; --14
select count (comm) from emp; --4(null 제외)

--step2) 각부서별 급여의 총액
--특정필드를 기준으로 그룹을 만들어 그룹별 집계함수를 구한다.
/*
select 집계함수, 집계함수.....
from 테이블명
where  ★그룹화 전 필터링
group by 그룹
having ★그룹화 후 필터링
*/
-- 각 부서별 급여의 총액
select deptno 부서, sum(sal) 급여총액
from emp
group by deptno -- 집계함수 빼고 전부
order by deptno;

-- Q1. 각부서별 급여의 총액
select  deptno  부서 , sum(sal)  급여총액
from   emp
group by deptno
order  by deptno ;   -- 집계함수 빼고 다


-- 2. dept테이블의  부서의 개수를 출력하시오.
    select count(distinct(deptno)) 부서갯수 from emp ;

-- 3. 사원테이블(emp)에서 부서번호(deptno)가 30인 사원의 급여(sal)컬럼값에서 평균 급여를 소수점 1자리 이하에서 반올림하여 출력하시오.
select round(avg(sal),1) AVG_SALARY from emp group by deptno having deptno = 30;

-- 4. 사원테이블(emp)에서 부서번호(deptno)가 30인 사원의 급여(sal)컬럼값에서 급여들의 합을 출력하시오.
select sum(sal)as SALARY from emp group by deptno having deptno = 30;

-- 5.  사원테이블(emp)에서 부서번호(deptno)가 30인 사원의 급여(sal)컬럼값에서 급여의 표준편차를 소수점 3째자리까지 출력하시오.
select round(stddev(sal),3)from emp group by deptno having deptno =30;

            SALARY
            --------
             668.331      
             

-- 6.  사원테이블(emp)에서 부서별(deptno) 사원수, 최대급여, 최소급여, 급여합계, 평균급여를 급여합계의 내림차순으로 조회하시오
select deptno 부서번호, count(*) 사원수, max(sal) 최대급여, min(sal) 최소급여, sum(sal) 급여합계, round(avg(sal),1) 평균급여
from emp group by deptno
order by sum(sal);

-- 7. 사원테이블(emp)에서 부서별(deptno)  부서번호(deptno), 사원수를 조회하시오.
select '2019년' year, deptno 부서번호, count(*) 사원수
from emp
group by deptno
order by count(*) desc;
 
-- 8. 사원테이블(emp)에서 부서별(deptno) 부서번호, 인원수, 급여의 평균, 급여의 합을 출력하시오
    select deptno, count(*), round(avg(sal),0), sum(sal) from emp group by deptno;

-- 9. 사원테이블(emp)에서 업무별(job)별 인원수, 평균 급여액, 최고 급여액, 최저 급여액 및 합계를 출력하시오
select job 업무별, count(job) 인원수, round(avg(sal),0) 평균급여액, max(sal) 최고급여액, min(sal) 최저급여액, sum(sal) 합계
from emp
group by job;
-- 10. 사원테이블(emp)과 부서테이블(dept)에서 사원번호(deptno)가 같은데이터 중 사원수가 다섯 명이 넘는 부서명(dname)와 사원수를 조회하시오.
    select dname 부서명, count(emp.empno)사원수 from emp, dept
    where emp.deptno = dept.deptno -- group 전에 카운트
    group by dname
    having count(emp.empno) > 5; -- group 후에

--rdb - 테이블 관계 - table - [관계 : 속성(필드)] - table 
-- 11.  사원테이블(emp)에서 전체 월급이 5000을 초과하는 JOB에 대해서 JOB과 월급여 합계를 조회하시오.
--단 판매원(SALES)은 제외하고 월 급여 합계로 내림차순 정렬하시오.
    select job 업무별, sum(sal) 급여합계
    from emp
    where job != 'SALES'
    group by job
    having sum(sal) > 5000
    order by sum(sal) desc;
