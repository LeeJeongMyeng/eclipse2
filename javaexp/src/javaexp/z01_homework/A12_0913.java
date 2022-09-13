package javaexp.z01_homework;



public class A12_0913 {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 [1단계:개념] 1. 자바의 접근제어자 4가지 범위를 예제를 통하여 설명하세요.
 			private = 모든 외부클래스 접근불가
 			default = 다른 패키지에 소속된 클래스 접근 불가
 			protected = 자식 클래스가 아닌 다른 패키지에 소속된 클래스
 			public = 제한없이 접근 가능
 			*/
/*[1단계:코드] 2. playroom패키지 선언과 내부적으로 친구1, 친구2 클래스 선언, studyroom패키지선언 학생1, 학생2 클래스 선언, 
             친구1, 학생1에서 private, X(default), public에 적절한 필드값을 선언하고, 상호간에 호출하세요.*/
		/* 친구1 클래스 생성
		 package javaexp.z01_homeworkfiends;

public class Friends1 {
String name;
public Friends1(String name){
	this.name=name;
	}
public void getname() {
	System.out.println("public:"+name);
}
}
		 */
		
		/* 친구2 클래스 생성
		 package javaexp.z01_homeworkfiends;

 public class Friends2 {
	 
	private String name2="안녕. private";
	String name3 = "안녕. default";
	
	
}
		 */
		
		/* 친구1,2 클래스에서 private default public 제한자 호출 결과
		 package javaexp.z01_homeworkstudents;
import javaexp.z01_homeworkfiends.Friends1;
import javaexp.z01_homeworkfiends.Friends2;
public class Students1 {

	public static void main(String[] args) {
		
		Friends1 fs01= new Friends1("이정명");
		fs01.getname();
		
		Friends2 fs02= new Friends2();
//		System.out.println("private:"+fs02.name2); private라 호출 불가
//		System.out.println("private:"+fs02.name3); //다른패키지라 소속 불가
	}

}
		 */
			
/*[1단계:개념] 3. 인스턴스변수와 스태틱변수의 차이점을 기술하세요.
 			인스턴스 변수: 객체선언마다 값을 달리하여 적용가능
 			스태틱변수 :  메모리에 할당되어 고정이 되는 값, 따로 인스턴스 변수를 생성없이 바로 사용가능
 			
[1단계:코드] 4. ScoccerPlayer에 팀명, 팀성적, 이름, 개인성적에서 팀명과 팀성적은 static,
 			이름과 개인성적으로 instance변수를 선언하여 데이터를 할당하세요.
 			/*
 			 class ScoccerPlayer{
	String name;
	String grade;
	static String team;
	static String tgrade;
	public ScoccerPlayer(String name, String grade) {
		this.name = name;
		this.grade = grade;
	}
	void getplayer() {
		System.out.println("이름:"+name);
		System.out.println("개인성적:"+grade);
		System.out.println("팀이름:"+team);
		System.out.println("팀성적:"+tgrade);
	}
}
ScoccerPlayer sp01 = new ScoccerPlayer("이정명","B Rank");
		sp01.team = "NC";
		sp01.tgrade ="1티어";
		sp01.getplayer();
 			 */
		/*
[1단계:개념] 5. final와 static final의 필드 차이점을 예제를 통해 기술하세요.
		//final = 객체생성시 처음으로 선언하고 후에 변경 불가
		//static final = 공용데이터로 쓰이며 선언 이후 모든객체에서 똑같은 선언내용으로 사용하며 변경 불가
		 * 
/*[1단계:코드] 6. 컴퓨터의 종류, 사양내용(cpu,ram,hdd)을 static final, static)을 이용하여 초기화 호출하여 출력하세요.
class Computer{
static String cname;
String hdd;
final String cpu;
static final String ram = "DDR4 8GB";
public Computer(String hdd, String cpu) {
	this.hdd = hdd;
	this.cpu = cpu;
}

void getCom() {
	System.out.println("컴이름:"+cname);
	System.out.println("hdd:"+hdd);
	System.out.println("cpu:"+cpu);
	System.out.println("ram:"+ram);
}	
}

Computer c01 = new Computer("1TB","AMD Ryzen");
		c01.cname = "한성컴퓨터";
		c01.getCom();
*/
		/*
/*[1단계:개념] 7. 1:1관계 객체의 선언 순서를 기술하세요.
			1) 종속될 클래스 선언
			2) 포함할 클래스 선언
			*/
	
/*[1단계:코드] 8. 아래의 1:1관계 객체를을 선언해보세요.
            1) 자동차(차종,최고속도,배기량)와 자동차의소유주(이름,자동차, takeCar(자동차) driving() ) 를 선언
            2) 학생과 성적표
            3) 결혼할 커플(신랑, 신부)
 
		Person p02 = new Person("이정명","40000km");
		
		p02.getcar(new Car("sm5","180km","2400cc"));
		p02.getperson();
	}

}
class Car{
	private String carname;
	private String carspeed;
	private String displacement;
	public Car(String carname, String carspeed, String displacement) {
		this.carname = carname;
		this.carspeed = carspeed;
		this.displacement = displacement;
	}
	public void carinfo() {
		System.out.println("차종:"+carname);
		System.out.println("최고속도:"+carname);
		System.out.println("배기량:"+displacement);
	}
}

class Person{
	private String name;
	private Car car;
	private String driving;
	public Person(String name, String driving) {
		this.name = name;
		this.driving = driving;
	}
	public void getcar(Car car) {
		//HandPhone01 phone ==> public HandPhone01(String number, String company)이다.
		this.car = car;
	}
	public void getperson() {
		System.out.println("차주:"+name);
		System.out.println("주행거리:"+driving);
		car.carinfo();
		*/
	}
	
}
