package javaexp.z01_homework;

public class A01_0829 {

	public static void main(String[] args) {
	/*
	 1. 자바의 컴파일과 실행 과정
	    컴파일: 사람이 이해하는 언어를 기계어로 바꾸는 과정
	    *자바 소스코드(.java)를 작성하고, 컴파일러(javac.exe)를 통해
	    자바바이트코드(.class)로 생성한다.
	    이후, (java.exe)를 통해 기계어로 변경이 잘되면 실행된다. 
	 */
	
	//2.아래 내용 설명
	// - 문자열 선언 방법
	 	String name1 = "안녕하세요";
	 	System.out.println(name1);
	 	
	// - 정수/실수 선언과 할당
	 	int num01 = 10;
	 	double num02 = 20.0;
	 	System.out.println(num01);
	 	System.out.println(num02);
	 	
	 	System.out.println("===================================================");
	//3. 변수명을 아래와 같이 선언 및 출력
	 	// -이름,나이,키 변수 선언
	 	String name2 = "이정명";
	 	int age = 28;
	 	double old = 174.2;
	 	// - 좋아하는 음악명, 발매년도월 변수 선언
	 	String music = "'Tiny Riot'";
	 	int musicDropYear = 2022;
	 	int musicDropMonth = 9;
	 	int musicDropDay = 24;
	 	// 오늘 지출금액 목록과 비용, 합산
	 	String thing1 = "담배";
	 	String thing2 = "캡슐커피";
	 	int cost1 = 4500;
	 	int cost2 = 700;
	 	
	 	//자기소개 출력
	 	System.out.println("제 이름은 "+name2+"입니다");
	 	System.out.println("나이는 올해"+age+"세이고,");
	 	System.out.println("키는 약 "+old+"cm입니다.");
	 	// 음악,발매 출력
	 	System.out.println("제가 자주 듣는 음악은 'Sam Ryder'의 "+music+"이라는 노래이며,");
	 	System.out.println("이 노래는"+musicDropYear+"년 "+musicDropMonth+"월 "+musicDropDay+"일에 발매되었습니다.");
	 	// 오늘 지출 목록 및 비용 출력
	 	System.out.println("오늘은 외출일정이 없어서,"+thing1+"와"+thing2+"에 대한 지출금만 있습니다.");
	 	System.out.println("담배는 "+cost1+"원 캡슐커피는 개당"+cost2+"원 입니다.");
	 	System.out.println("담배는 1갑 및 캡슐커피는 4개를 구매하여, 총"+(cost1+(cost2*4))+"원의 지출이 있었습니다.");
	 	

	}

}
