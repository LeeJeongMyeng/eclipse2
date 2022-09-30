/*
 	
 	 #숫자형 처리함수
 	 	1. 숫자데이터를 처리하기 위한 함수
 	 	2. 종류 
 	 		1) round : 지정한 소수점 자리로 반올림 처리
 	 			round(데이터,자리수)
 	 			자릿수: +값은 소숫점 이하 자리수를 말하고,
 	 				  -값은 10단위(-1),100단위(-2)로 반올림 처리를 하는 것을 말한다.
 	 			ex) round(45.324,2) ==> 45.33
 	 			    round(2543.25,-2)==> 2500
 	 		
 	 		 2) trunc : 지정한 소숫점 자리까지 남기고 절삭처리
 	 		 	 trunc(데이터,자리수)
 	 		 	 자리수는 round와 동일하게 해당 자리수 만큼 절삭처리해준다.
 	 		 	 ex) mod(),/,*,trunc: 중첩함수를 이용해서 다양한 데이터의 범위와 조건을
 	 		 	 	decode,case없이 사용할 수 있다.
 	 		 	floor(특정수/1000) : 0~999,1(1000~1999),2(2000~2999),
 	 		 		 연속된 범위로 조건데이터 처리시
 	 		 		mod():반복된 조건의 데이터를 처리할 떄, 사용
 	 		 		홀짝(0,1), 3의배수 (0,1,2) 5의배수..
 	 		 3) ceil(데이터): 해당 데이터를 정수형으로 올림처리
 	 		 4) floor(데이터): 해당 데이터를 정수형으로 내림처리 
 */
SELECT round(23423.277,3) rou1,
       round(23423.277,1) rou2,
       round(23423.277,-1) rou3,
       round(23423.277,-2) rou4,
       trunc(23423.277,1) tuc1,
       trunc(23423.277,-3) tuc2,
       ceil(23423.277) ceil1,
       floor(23423.277) floor1
       FROM dual;
 --ex1) 급여를 100단뒤로 반올림 처리, 급여+보너스를 1000단위로 절삭하여 출력
 SELECT sal,comm,round(sal,-2) rodSal, trunc(sal+nvl(comm,0),-3) trcSC,
		TRUNC(sal/13,2) tsal2, CEIL(sal/13) ceilsal
 FROM EMP e 

 /*
  #mod
  	1.데이터베이스는 산순연산자%(나머지)가없어 나머지 처리함수를 사용한다.
  	2.형식
  	  mod(데이터,m):데이터를 m으로 나눈 나머지값
  	  ex) mod(10,3) ==>1
 */
 SELECT mod(10,3) d1, mod(10,2) d2, mod(10,3) FROM dual;
--ex)사번이 짝수인 데이터를 사번, 구분자(0/1), 이름을 출력하세요

SELECT empno,mod(empno,2) div, ename
FROM EMP e 
WHERE mod(empno,2)=0;
 
 
 
 
 
 
 