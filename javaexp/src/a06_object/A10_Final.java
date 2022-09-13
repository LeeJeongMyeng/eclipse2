package a06_object;

public class A10_Final {

	public static void main(String[] args) {
		/*
		 # final 필드
		 1. 최종적인 값을 갖고 있는 필드 = 값을 변경 할 수 없는 필드
		 2. final필드는 딱 한번 초기값을 지정하면 해당 값을 변경할 수 없다.
		 	-필드 생성시
		 	 final String nation = "한국";
		 	-생성자
		 	 Person(String nation){
		 	 this.name=nation;
		 	 }
		 	 
		 	cf) final만 붙은 필드는 객체마다 다른 상수를 가질 수 있다.
		 
		 # static final
		 1.상수 = 정적 final 필드
		 	- final필드 : 객체마다 가지는 불변의 인스턴스 필드
		 	- static final
		 		-객체마다 가지고 있지 않음
		 		- 메소드 영역에 클래스 별로 관리되는 불변의 정적 필드
		 		- 공용 데이터로서 사용
		 2. 상수 이름은 전부 대문자로 작성
		 3. 다른 단어가 결합되면 _로 연결
		 
		 */
		Asian a10 = new Asian("950828","이정명");
		a10.showInfo();
	//	a10.ssn="4444"; 객체마다 변경 불가
	//  a10.nation="니뽄"; 객체마다 변경불가
	    a10.name="이지은";
	    Asian a11 = new Asian("940000","찌니");
	    a10.showInfo();
	    a11.showInfo();
	    
	    Player01 p01 = new Player01("이정명",10,"NC");
	    p01.showInfo();
	//    p01.what="저격수"; static final이라는 것이 되어잇어 무조건 변경불가
	//    p01.team = "샘숭"; final이 되어있어 객체로 초기생성시 변경불가

	}

}

//Player01 클래스를 선언하여 이름/성적은 인스턴스변수, 팀명은 final변수, 선수분류는 static final
//을 선언하고 초기화하여 출력

class Player01{
	String name;
	int grade;
	final String team; //객체단위로 초기값을 설정
	static final String what = "투수";
	public Player01(String name, int grade, String team) {
		super();
		this.name = name;
		this.grade = grade;
		this.team = team;
	}
	public void showInfo() {
		System.out.println("이름:"+name);
		System.out.println("성적:"+grade);
		System.out.println("팀이름:"+team);
		System.out.println("포지션:"+what);
	}
}
class Asian{
	final String nation="한국";
	final String ssn; //생성자에 의해 초기값 설정
	String name;
	static final String COLOR="갈색"; //클래스 공유 메모리로 객체단위로도 변경이 불가능하다.
	public Asian(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}
	public void showInfo() {
		System.out.println("국적:"+nation);
		System.out.println("주민번호:"+ssn);
		System.out.println("이름:"+name);
		System.out.println("피부색:"+COLOR);
	}
	
}