package javaexp.a09_execption;

public class A01_Begin {

	public static void main(String[] args) {
		int num01=1;
		try {
		
		String str = null;
		System.out.println("번호:"+(++num01));
		System.out.println("번호:"+(++num01));
		//객체를 생성하지 않았는데 객체.메서드 호출
		System.out.println("코드:"+str.toString());
		System.out.println("번호:"+(++num01));
		System.out.println("번호:"+(++num01));
		} catch(NullPointerException e) {
			// e.getMessage() 예외내용을 처리한다.
			System.out.println("예외가 발생했습니다."+e.getMessage());
		}finally {
			System.out.println("예외발생 없이 처리할 코드");
		}System.out.println("번호:"+(++num01));
		System.out.println("번호:"+(++num01));
		/*
		 #예외 처리순서
		 	1. 기본 코드 내용 실행
		 	2. 예외가 발생했을 때, 예외 처리 복사.
		 	3. try{}catch(예외클래스 내용선언){}
		 		catch매개변수에 발생한 예외 처리 내용 선언.
		 		하위{} 블럭에 예외 발생시 내용기술
		 		finally{} 예외 발생 상관 없이 처리할 내용 처리
		 		기타 이후 처리 할 내용 기술..
		 */
	}

}
/*
  # 예외와 예외 클래스
  1. 오류의 종류
  	1) 에러
  		-하드웨어의 잘못된 동작 또는 고장으로 인한 오류
  		-에러가 발생되면 프로그램 종료
  		- 정상 실행 상태로 돌아갈 수 없음.
  	2) 예외(Exception)
  		- 사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 인한 오류
  		- 예외가 발생되면 프로그램 종료
  		- 예외 처리 추가하면 정상 실행 상태로 돌아갈 수 있음.
	3) 구분
		- 일반(컴파일 체크) 예외
			예외 처리 코드 없으면, 컴파일 오류 발생
		- 실행(RuntimeException) 예외
			예외처리 코드를 생략하더라도 컴파일이 되는 예외
			경험 따라 예외 처리 코드 작성 필요

   2. 예외 클래스(계층구조)
   	Exception
   	
   		ClassNotFoundException InterruptedException
   			- 일반(컴파일체크) 예외
   			
   		RuntimeException (실행예외)
   			NullPonterException
   			NumberFormatException
   	
   3. 실행 예외
   1) NullPointerException
   		- 객체 참조가 없는 상태
   		null값 갖는 참조변수로 객체 접근 연산자인 도트(.)사용했을 때 발생
   		String data = null;;
   		System.out.println(data.toString());
   
   4. 예외 처리 코드
   		1) 예외 발생시 프로그램 종료를 막고, 정상 실행 유지할 수 있도록 처리
   			- 일반 예외 : 반드시 작성해야 컴파일 가능
   			- 실행 예외 :  컴파일러가 체크해주지 않으면 개발자 경험에 의해서 작성
   		2) 기본 형식 
   			try{
   			//예외 발생 가능 코드
   			
   			}catch(예클래스 선언 e){
   				예외처리
   			}finally{
   				예외 상관없이 처리.
   			}
*/


