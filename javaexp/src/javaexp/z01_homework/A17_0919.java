package javaexp.z01_homework;

import java.util.Random;

//import homework_review.Bus;
//import homework_review.User03Exception;
//import javaexp.a09_execption.UserException;

public class A17_0919 {

	public static void main(String[] args) {
		/*
		 [1단계:개념] 1. 사용자 정의 예외 클래스의 기본 형식과 Exception 클래스의 기본 생성자2개, 주요메서드2개를 기술하세요
		 				class 클래스명 extends Exception{
		 				public 클래스명Exception{}
		 				public 클래스명Exception(String message){
		 					super(message);
		 					}
		 					}
		 				try {
			if(cnt%3==0) { // 3으로 나눠서 0일경우 try문을 통해 예외처리
				throw new UserException(cnt+"번호예외 더지기");
			}
			}catch(UserException e) { //캐치문으로 예상오류 잡기
				System.out.println("#예외 잡기#");
				System.out.println("메시지:"+e.getMessage());
				e.printStackTrace();
			}
		}
		1단계:코드] 2. User03Exception을 통해 생성자를 매개변수로 문자열을 넘기고, getMessage()를 재정의하여 [사용자정의]라는 문자열을
         포함하여, 이 사용자 정의 예외가 11~20 반복문에서 짝수일 때, 처리되게 하세요
         package homework_review;



public class Exp {

	public static void main(String[] args) {
		
		try {
		for(int cnt01=11;cnt01<=20;cnt01++) {
			if(cnt01%2!=0) {
			 throw new User03Exception(cnt01+"에외처리");
			} 	
		}}catch(User03Exception ue) {
			System.out.println("#예외 잡기#");
			System.out.println("메시지:"+ue.getMessage());
		}finally {
			
		}
}}
class User03Exception extends Exception{
	
	public User03Exception() {
	}

	public User03Exception(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return "[사용자정의]"+super.getMessage();
	}
}
         
[1단계:개념] 3. Object클래스가 기본적으로 가지고 있는 메서드(equals(), toString(), hashCode())를 기술하세요.
				equals()= ==연산자와 동일하게 객체의 주소 결과를 리턴한다(번지주소비교)
				toString()= 클래스의 패키지와 클래스명을 +16진수 주소 리턴
				hashCode()= 객체를 식별하는 용도로 객체의 메모리주소를 정수값으로
				 리턴한다.
[1단계:코드] 4. 같은 클래스의 두개 객체의 속성값이 같으면 hashCode가 동일하게 처리할려고 한다.  Bus(번호,행선지)를 기준으로 처리하세요.
Bus b1 = new Bus("18하1111","서울");
		Bus b2 = new Bus("18하1111","서울");
		Bus b3 = new Bus("18하1111","부산");
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b3.hashCode());
		
}}
class Bus{
	private String busnum;
	private String loc;
	public Bus(String busnum, String loc) {
		this.busnum = busnum;
		this.loc = loc;
	}
	@Override
	public int hashCode() {
		int buscode = busnum.hashCode()+loc.hashCode();
		return buscode;
	}
	
}
[1단계:코드] 5. 특정 프로그램의 실행 시간을 확인할려고 한다. 해당 코드의 메서드와 결과를 설명하세요.
			long sum1=0;
		long sum2=0;
		long startpro = System.currentTimeMillis(); //시작시간 체크
		for(int online=0;online<=10000;online++) { // 0~10000반복
			for(int login=0;login<=300;login++) { // 0~300반복 
				sum1+=login; //login 값 누적
				System.out.println(sum1); 누적된 login값 출력
			}sum2+=sum1; // 10000번 반복동안 누적된 login값을 다시 누적
		}System.out.println(sum2); //출력
		
		long endpro = System.currentTimeMillis(); //종료시간 체크
		long time = endpro-startpro; // 종료시간- 시작시간하여 총 소요시간 체크
		System.out.println("");
		System.out.print("소요시간: "+time/1000/60/60+"시 ");  //값을1000/60/60으로 나누어 시간체크
		System.out.print(time/1000/60+"분 "); //값을 1000/60으로 분 체크
		System.out.println(time/1000+"초"); //값을 1000으로 나누어 초 체크
[1단계:코드] 6. 문자열로 대문자/소문자/특수문자를 선언하고, 이 중에서 8자를 추출하여 비번호를 처리할려고 한다.
      charAt를 활용하여 처리하세요.
      	String ST01 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String st02 = "abcdfghijklmnopqrstuvwxyz";
	String num01 = "1234567890";
	 Random r = new Random();

	char c1 = ST01.charAt(r.nextInt(ST01.length()-1));
	char c2 = st02.charAt(r.nextInt(st02.length()-1));
	char c3 = num01.charAt(r.nextInt(num01.length()-1));
	char c4 = ST01.charAt(r.nextInt(ST01.length()-1));
	char c5 = st02.charAt(r.nextInt(st02.length()-1));
	char c6 = num01.charAt(r.nextInt(num01.length()-1));
	
	char c7 = ST01.charAt(r.nextInt(ST01.length()-1));
	char c8 = st02.charAt(r.nextInt(st02.length()-1));
	
	System.out.println("임시 비밀번호 생성");
	System.out.print(c1);
	System.out.print(c2);
	System.out.print(c3);
	System.out.print(c4);
	System.out.print(c5);
	System.out.print(c6);
	System.out.print(c7);
	System.out.println(c8);
		 */

	}

}
