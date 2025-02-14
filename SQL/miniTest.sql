drop table fruit;
drop table seq_fruit;
--Q1.
create table fruit (fno number not null primary key, fname varchar2(20) not null, fdate date);
create table seq_fruit (sfno number);

--Q2.
insert into fruit (fno, fname, fdate) values (seq_fruit.nextval, 'apple', sysdate);

--Q3.
select * from emp order by sal desc;

--Q4.
select * from emp where ename like '%G';

--Q5.
select * from emp where job in ('MANAGER','SALESMAN','CLERK');

--Q6.
select deptno 부서번호, count(*) 사원수, max(sal) 최대급여,
min(sal) 최소급여, sum(sal) 급여합계, round(avg(sal),0) 급여평균
from emp
group by deptno
order by sum(sal) desc;

--Q7.
select e.ename, d.deptno, d.dname, d.loc
from emp e join dept d on(e.deptno = d.deptno)
where ename ='SCOTT';

--Q8.
select ename, job
from emp
where job like
(select job from emp where empno=7521);

--Q9.
-- emp 테이블 출력 select * from emp
-- deptno(부서)별로 group by deptno
-- sal in (max(sal)),(sal = sal))
select *
from emp
where sal in
(select max(sal) from emp group by deptno);



--Q10.
update dept set loc = 'SEOUL' where deptno = 10;
select * from dept;

