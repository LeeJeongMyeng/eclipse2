package javaexp.a09_execption;
class UserExp extends Exception{
	
}
public class A08_UserException {

	
		/*
		 # 사용자 정의 예외
		 1. 자바 표준 api에서 제공하지 않는 예외를 선언하여 사용한다.
		 2. 애플리케이션 서비스와 관련된 예외
		 	ex) 잔고 부족 예외, 계와이체 실패 예외, 회원 가입 실패 예외
		 # 사용자 정의 예외 클래스 선언 방법
		 1. 형식
		   public class XXXException extends[Exception|Runtime]{
		   	public XXXEception(){}
		   	PUBLIC xxxEception(String message){
		   	super(message);
		   	}
		   	}
		  
		  #예외 발생 시키기
		  1. 코드에서 예외 발생 시키는 법
		  1) 예외 발생처리throw)
		   throw new XXXException()
		   throw new XXXException("메세지")
		   2) 예외 위임처리(throws)
		   public void method throws XXXException{
		   	throw new XXXException("메세지");
		   }
		 
		   2. 호출된 곳에서 발생한 예외를 처리하도록 한다.
		   # 예외 정보
		   1. getMessage() :예외 발생시킬 때, 생성자 매개값으로 사용한다.
		   		메세지 리턴
		   		throw new XXXException("예외 메시지")
		   		원인을 세분화하기위해 예외코드 포함
		   		catch()절에서 활용한다.
		   		}catch(Exception e){
		   			String mag = e.egetMesaage();
		   		}
		   	2. printStackTrace()
		   		예외 발생 코드 추적한 내용을 모두 콘솔에 출력
		   		프로그램 테스트하면서 오류 찾을 때 유용하게 활용.
		   		
		 */
	public static void main(String[] args) {
		for(int cnt=1;cnt<=10;cnt++) {
			try {
			if(cnt%3==0) {
				throw new UserException(cnt+"번호예외 더지기");
			}
			}catch(UserException e) {
				System.out.println("#예외 잡기#");
				System.out.println("메시지:"+e.getMessage());
				e.printStackTrace();
			}
		}
		
	// 1~100반복문 수행 %5로 0일때
		try {
		for(int cnt2=0;cnt2<=100;cnt2++) {
			if(cnt2%5==0) {
			 throw new Use01Exception(cnt2+"에외처리");
			} 	
		}}catch(Use01Exception ue) {
			System.out.println("#예외 잡기#");
			System.out.println("메시지:"+ue.getMessage());
		}	
		}

}
class Use01Exception extends Exception{

	

	public Use01Exception(String message) {
		super(message);
	}
	public Use01Exception(String message, String name) {
		super(message+":예외명 -"+name);
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "반갑습니다. 예외입니다."+super.getMessage();
	}
	
}
class UserException extends Exception{
	//생성자
	public UserException() {
	}

	public UserException(String message) {
		super();
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "[재정의 메시지]"+super.getMessage();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[재정의 참조값]"+super.toString();
	}

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.out.println("#재정의 메시지#");
		super.printStackTrace();
	}
	
	
	//기능 메서드 재정의 선언
}