package javaexp.a10_api;

public class A01_Begin {

	public static void main(String[] args) {
		/*
		 #자바 API 도규먼트
		 	1. 자바에서 기본적으로 제공하는 라이브러리
		 		프로그램 개발에 자주 사용되는 클래스 및 인터페이스 모음
		 	2. API 도규먼트
		 		- 쉽게 api  찾아 이용할 수 있도록 문서화한 것
		 		- html 페이지로 작성되어 있어 웹브라우저로 바로 불 수 있다.
		 
		 #java.lang 패키지
		 1. 자바 프로그램의 기본적인 클래스를 담은 패키지
		 2. 포함된 클래스와 인터페이스는 import없이 사용
		 3. 주요 클래스
		 	Object = 자바 클래스의 최상위 클래스로 사용
		 	system = 표준입력(키보드)으로부터 데이터를 입력 받는다.
		 			System.in
		 			표준 출력창치(모니터)로 출력하기 위해 사용
		 			System.out
		 			자바 가상머신을 종료 시킬때 사용
		 			쓰레기 수집기를 실행 요청할 때 사용
		 	Class - 클래스를 메모리로 로딩할 때 사용
		 	String - 문자열을 저장하고 여러가지 정보를 얻을 때
		 	StringBuffer, StringBuilder
		 			- 문자열을 저장하고 내부 문자열을 조작할 때 사용
		 	Math - 수학 함수를 이용할 떄 사용
		 	Wrapper class(기본데이터유형의 객체유형화)
		 		Byte,Short, Character, Integer.Float, Double,Boolean
		 		-기본 타입의 데이터를 갖는 객체를 만들때 사용
		 		- 문자열을 기본타입으로 변환할 때 사용
		 		-입력값 검사에 사용
		 */
		/*
		 #Object 클래스
		 1. 자바의 최상위 클래스
		 2. 객체비교 equals()메소드 지원
		 3. 기본적으로 == 연산자와 동일한 결과 리턴(번지 비교)
		 4. 논리적 동등 위해 오버라이딩 필요
		 	1) 논리적 동등이란?
		 		- 같은 객체이건 다른 객체이건 상관없이 객체 저장 데이터 동일
		 	2) Object의 equals()메소드
		 		- 재정의하여 논리적 동등비교할 떄 이용
		 5.객체 해시코드(hashCode())
		 	1) 객체 해시코드란?
		 		- 객체 식별할 하나의 정수값
		 		-객체의 메모리 번지를 이용해 해시코드 만들어 리턴
		 			개별 객체는 해시코드가 모두 다름
		 	2) 논리적 동등 비교시 hashCode() 오버라이딩의 필요성
		 		컬랙션 프레임 워크의 HashSet, HashMap,
		 		Hashtable과 같은 클래스는 두 객체가 동등한 객체인지 판단할 때 사용한다.
		 
		 */

				Member m01 = new Member("홍길동");
				Member m02 = new Member("홍길동");
				Member m03 = new Member("마길동");
		System.out.println("비교연산자:"+(m01==m02));
		System.out.println("equals메소드:"+(m01.equals(m02)));
		System.out.println("비교연산자:"+(m01==m03));
		System.out.println("equals메소드:"+(m01.equals(m03)));
	}

}
class Member{
	private String name;
	public Member() {
		super();
	}

	public Member(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) { //Object obj ="홍길동"
		//참조값 instanceof 객체 : 두개의 객체가 같은 클래스를 
		// 참조할 때, true로 처리
		boolean isEquals = false;
		Member m = (Member)obj;
		//해당 객체의 속성을 사용할려면 type casting이 필요
		//문자열로
		if(this.name.equals(m.)) {
			isEquals = true;
		}return isEquals;
		
		
		return super.equals(obj);
	}
	
}