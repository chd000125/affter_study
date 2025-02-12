--RDB ( 테이블들의 관계 )
--테이블 - [관계 : 속성(필드) - 외래키] - 테이블

-- select:basic / where / function / group by / join / subquery
--join
-- 두개 이상의 테이블을 연결하여 하나의 테이블 처럼 사용하는 것.
--

--Q emp 구조 / dept 구조
desc emp; -- DEPTNO          NUMBER(2)
desc dept;-- DEPTNO NOT NULL NUMBER(2)

--1. 모든 데이터가 출력 14 * 4
select * from emp, dept; -- X

--2. 연결 - deptno
select *
from emp, dept
where emp.deptno = dept.deptno;

--3. 별명짓기
select *
from emp e, dept d
where e.deptno = d.deptno;

--4. 원하는 필드만 가져오기
-- 오류 발생 -해결법-> 원하는 필드가 어디꺼인지 표시 ex) emp.ename dept.deptno
select emptno, ename, deptno, dname, loc
from emp e, dept d
where e.deptno = d.deptno

--5. 조건식 : 급여가 3000이상 사원번호, 이름, 급여, 근무부서
select empno, ename, sal, e.deptno, dname, loc
from emp e,dept d
where e.deptno = d.deptno and sal>=3000;

-- Test 6)  SCOTT의 EMP테이블과 DEPT테이블을 이용하여 다음과 같이 출력하시오.
select ename, d.deptno, dname, loc
from emp e, dept d
where e.deptno = d.deptno and ename = 'SCOTT';


    ENAME          DEPTNO DNAME          LOC          
    ---------- ---------- -------------- -------------
    SCOTT              20 RESEARCH       DALLAS       

--7. sql-99
select empno, ename, deptno, dname, loc
from emp natural join dept;

--join using
select empno, ename
from emp e join dept d using(deptno) on(e.deptno = d.deptno);
--where -> on, using

--8. 급여가 3000이상 사원번호, 이름, 급여, 근무부서
--8-1. sql-99이전 등가조인 wherer =
    select empno, ename, sal, e.deptno from emp e, dept d where e.deptno = d.deptno and sal >=3000;
--8-2. natural join
    select empno, ename, sal, deptno from emp e natural join dept where sal >=3000
--8-3. join using
    select empno, ename, sal, deptno from emp e join dept d using (deptno) where sal >=3000;
--8-4. join on
    select empno, ename, sal, d.deptno from emp e join dept d on( e.deptno = d.deptno) where sal >= 3000;

-- 9    emp ,DEPT 테이블에서  각 부서별 평균급여, 최대급여, 최소급여, 사원수를  다음과 같이   조회하시오.
    select deptno, dname, avg(sal) as 'AVG_SAL', max(sal) as 'MAX_SAL', min(sal) as 'MIN_SAL', count(*) as 'CNT'
    from emp natural join dept;
--9-1. sql-99이전 등가조인 wherer =
   select d.deptno, d.dname, round(avg(sal),4), max(sal), min(sal), count(*)
   from emp e, dept d
   where e.deptno = d.deptno
   group by d.deptno, d.dname
   order by deptno asc;
--9-2. natural join
   select d.deptno, d.dname, round(avg(sal),4), max(sal), min(sal), count(*)
   from emp e natural dept d
   group by d.deptno, d.dname
   order by deptno asc;
--9-3. join using
   select d.deptno, d.dname, round(avg(sal),4), max(sal), min(sal), count(*)
   from emp e join dept d using(deptno)
   group by d.deptno, d.dname
   order by deptno asc;
--9-4. join on
   select d.deptno, d.dname, round(avg(sal),4), max(sal), min(sal), count(*)
   from emp e join dept d on(e.deptno = d.deptno)
   group by d.deptno, d.dname
   order by deptno asc;
+--------+------------+-----------+---------+---------+-----+
| DEPTNO | DNAME      | AVG_SAL   | MAX_SAL | MIN_SAL | CNT |
+--------+------------+-----------+---------+---------+-----+
|     10 | ACCOUNTING | 2916.6667 |    5000 |    1300 |   3 |
|     20 | RESEARCH   | 2175.0000 |    3000 |     800 |   5 |
|     30 | SALES      | 1566.6667 |    2850 |     950 |   6 |
+--------+------------+-----------+---------+---------+-----+
3 rows in set (0.00 sec)

--10  EMP, SALGRADE 테이블을 이용하여
--  유저 정보, 급여등급 , 그 등급의 최소급여와 최대급여를  다음과 같이 출력하시오
    select * from emp;
    select * from salgrade;
--10-1. sql-99이전 등가조인 wherer =
    select *
    from emp e, salgrade s
    where e.sal between s.losal and s.hisal;

--11. emp 테이블을 2번 이용하여
--사원정보(empno, ename, mgr)와 직속상관(empno, ename)의 사원번호를 다음과 같이 출력하시오.
--등가조인 where = 
 select e1.empno,e1.ename,e1.mgr,e2.empno,e2.ename
 from emp e1, emp e2
 where e1.mgr = e2.empno;
 --natural join (알아서 X)
 --join using( 같은필드 X )
 select e1.empno,e1.ename,e1.mgr,e2.empno,e2.ename
 from emp e1 join emp e2 on(e1.mgr = e2.empno);
 
 --13줄 (King정보빠짐 : 1줄) 등가 = , natural, join using join on ( 교집합 )
 
--12. emp 테이블을 2번 이용하여
--사원정보(empno, ename, mgr)와 직속상관(empno, ename)의 사원번호를 다음과 같이 출력하시오.
-- 직속상관이 없는 사원의 정보도....... King의 정보까지

 select e1.empno,e1.ename,e1.mgr,e2.empno,e2.ename
 from emp e1 , emp e2
 where e1.mgr = e2.empno(+); --ANSWER) 내 정보 King있지만 / KING 의 직속상관X / 오른쪽의 비는 데이터 처리 
------------------------ (+) => null 붙여줄게
 select e1.empno,e1.ename,e1.mgr,e2.empno,e2.ename
 from emp e1 right join emp e2 -- 오른쪽은 데이터가 다 나옴.
 on (e1.mgr = e2.empno); --ANSWER) 내 정보 King있지만 / KING 의 직속상관X 오른쪽의 비는 데이터 처리

 select e1.empno,e1.ename,e1.mgr,e2.empno,e2.ename
 from emp e1 left join emp e2 -- 왼쪽은 데이터가 다 나옴.
 on (e1.mgr = e2.empno); --ANSWER) 내 정보 King있지만 / KING 의 직속상관X 오른쪽의 비는 데이터 처리

--1. 모든 부서정보와 사원정보, 급여등급정보, 각사원의 직속상관의 정보를
--2. 부서번호, 사원번호 순서로 정렬해 출력하시오.
--1) SQL-99이전
    select d.deptno, d.dname,
    e.empno, e.ename, e.mgr, e.deptno,
    s.losal, s.hisal, s.grade,
    e2.empno mgr_empno, e2.ename mgr_ename
    from detp d, mep e, salgrade s, emp e2
    where e.deptno(+) = d.deptno 
    and   e.sal between s.losal(+) and s.hisal(+)
    and   e.mgr = e2.empno(+)
    order by d.demptno , e.empno;
    
--2) SQL-99방식
select   d.deptno,   d.dname ,  
           e.empno,   e.ename,  e.mgr , e.sal  , e.deptno , 
           s.losal    ,   s.hisal  , s.grade ,
       e2.empno  mgr_empno  ,   e2.ename  mgr_ename
from emp e right join dept d on(e.deptno = d.deptno)
           left  join salgrade s on(e.sal between s.losal and s.hisal)
           left  join emp e2 on (e.mgr=e2.empno)
order by d.deptno, e.empno;
    

