/*
 # 조인(join)
  	1) 하나의 sql명령문에 의해 여러 테이블에 저장된 데이터를 한번에
  		조회할 수 있는 것을 말한다.
  	2) 관계형 데이터베이스 분야의 표준
  		entity relation diagram(ERD)
  	3) 두개 이상의 테이블을 결합한다는 의미
  2. 조인의 필요성
  	1) 조인을 사용하지 않는 일반적인 예
  		학생 주소록을 출력하기 위해 학생들의 학번, 이름, 소속학과이름 검색
  		학생에 대한 정보 검색하는 단계 필요
  		학생 정보에서 소속학과번호 정보를 추출하여 소속학과
  		이름을 검색하는 단계 필요
  		ex) 사원번호가 7369인 사원의 이름과 부서이름, 부서위치를 출력
  			-사원 정보에서 부서번호를 가져온다
  			-부서정보에서 부서이름과 부서위치를 가져온다.
  	2) 조인을 하는 경우
  		연관관계까 있는 부서번호를 조회 조건으로 검색을 하면 한번에
  		원하는 데이터를 가져올 수 있다.
  		 
 */
--7369 사원의 부서정보 가져오기
SELECT *
FROM EMP e 
WHERE empno=7369;
-- 부서정보 확인 20
SELECT *
FROM DEPT d 
WHERE deptno=20; --7369 사원의 부서명은 RESEARCH이다.
--두개의 검색을 통해서 데이터를 가져온다.
--조인을 하는경우 ==>바로 부서의 정보를 확인할 수 있다.
SELECT E.*, D.*
FROM EMP e ,DEPT d 
WHERE E.DEPTNO = D.DEPTNO
AND EMPNO=7369;

/*
 # equi join
 	1. 개념
 		1) 조인 대상 테이블에서 공통 컬럼을 '='equal비교를 통해 같은 값을
 			가지는 행을 연결하여 결과를 생성하는 조인 방법
 		2) SQL명령문에서 가장 많이 사용하는 조인 방법
 		3) 조인 애트리뷰트(속성)을 활용하는 대표적인 형식
 	2. where 절을 이용한 equi join 사용방법
 	 	select 테이블1.컬럼명, 테이블2.컬럼명, ....
 	 	from 테이블1, 테이블2
 	 	where 테이블1.공통컬럼 = 테이블2.공통컬럼
 	 	1) from :조인 대상 테이블을 기술한다. 테이블은 콤보, 구분
 	 	2) where: 조인 애트리뷰트와 '='연산자를 사용하여 조인 조건을 기술
 	 		-기타 조건에 대한 설정을 and조건으로 연결하여 처리한다.
 */
-- 연봉이 3000이상인 사원의 사원명과 부서명을 출력
SELECT ename, sal, dname, e.DEPTNO -- 공통컬럼(deptno)만 alias이름 선언한다.
FROM mp e, dept d
WHERE e.DEPTNO = d.DEPTNO 
AND sal>=3000;
--ex) 직책이  salesman인 사원의 부서번호, 부서명, 사원명, 직책을 출력하세요
SELECT ename, job, e.deptno,dname
FROM EMP e ,DEPT d 
WHERE  e.DEPTNO  = d.DEPTNO 
AND JOB = 'SALESMAN';
--  dept(부서 테이블): 부서번호(deptno),부서명(dname),부서위치(loc)
--ex) 부서명 별로 최고 급여자
SELECT dname, max(sal) --필요한 것 나열
FROM EMP e, DEPT d  --필요한 테이블 나열
WHERE e.DEPTNO =d.DEPTNO  --필요한 테이블의 공통점 작성
GROUP BY dname; -- 그룹별 설정
--ex) 부서 위치별로 가장 나중ㅇ
SELECT d.loc, max(HIREDATE) 최근입사
FROM EMP e ,DEPT d 
WHERE e.DEPTNO = d.DEPTNO
GROUP BY loc
ORDER BY 최근입사;
