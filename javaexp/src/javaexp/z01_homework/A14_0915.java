
package javaexp.z01_homework;

//import javaexp.a08_inheritance.Worker;

//import javaexp.a08_inheritance.Father01;

public class A14_0915 {

	public static void main(String[] args) {
		/* 
[1단계:개념] 2. this/super의 사용을 생성자와 메서드를 나누어 기본예제를 통해 설명하세요.


#super
class Father01{
	private String name;
	
	Father01(String s){
	this.name=s; // private String name;의 name을 해당 생성자의 매개변수s로 변수처리하여 해당값을 받는다.
	}
	public String getName() {
		return name;
	}
}

class Son02 extends Father01{
	Son02(){
		super("홍길동"); // 상위(상속받는) 클래스의 Father01(String s){this.name=s;} 를 이어받아 사용한다.
	} 
}
System.out.println(s1.getName()); // extends문으로 상속받은 getName()을 이용하여 출력

[1단계:코드] 3. 상위클래스 School 학교의 분류 , 하위클래스 EleSchool/MiddleSchool/HighSchool을 선언하여 상위 생성자를 통해 하위객체를 할당처리하세요.
			EleSchool e1 = new EleSchool();
		e1.showSchool();
		MiddleSchool m1 = new MiddleSchool();
		m1.showSchool();
		HighSchool h1 = new HighSchool();
		h1.showSchool();
//===========================================================================================		
		class HighSchool extends School{
	HighSchool(){
		super("남산고등학교"); 
	} 
}
class MiddleSchool extends School{
	MiddleSchool(){
		super("남산중학교"); 
	} 
}
class EleSchool extends School{
	EleSchool(){
		super("성주초등학교"); 
	} 
}
class School{
	private String sname;
	
	public School(String sname) {
		this.sname = sname;
	}
	public String getSname() {
		return sname;
	}
	void showSchool() {
		System.out.println("제가 졸업한 학교는"+sname+"입니다.");
	}
}
[1단계:개념] 4. 메서드 overriding이란 무엇인가? overloading과 차이점과 함께 기본예제를 통해 기술하세요.
		#overriding =  상속 받은 클래스에서 같은 이름을 가진 생성자를 통해 해당 클래스에서 재정의한다.
		class Worker{
	private String kind;
	// Worker(){}
	public Worker(String kind) {
		this.kind = kind;
	}
	public void working() {
		System.out.println(this.kind+"열심히 일을 한다.");
	}
}

class PoliceMan extends Worker{

	public PoliceMan() {
		super("경찰관"); // Worker 클래스의 public Worker(String kind) {this.kind = kind;}를 super를 통해 재설정
		
	}
	public void working() { //상위와 동일한 이름으로 메서드를 자식클래스에서 새로정의
		super.working(); // super.working()이라는 메소드를 통해 가져와서 그대로 출력 
		System.out.println("치안을 위한 일을한다."); // 물려받아 새로정의된 메서드에서 출력문을 새로 추가한다
	}
}
//=========================================================================================
		#overloading = 생성자를 만들시, 매개변수의 타입,순서,갯수다 다르다면 같은 이름의 생성자를 여러개 만들 수 있다.
		class Exp{
	private String exp1;
	private String exp2;
	private int exp3;
	public Exp(String exp1, String exp2, int exp3) {
		this.exp1 = exp1;
		this.exp2 = exp2;
		this.exp3 = exp3;
	}
	public Exp(String exp1,int exp3, String exp2) {
		this.exp1 = exp1;
		this.exp2 = exp2;
		this.exp3 = exp3;
	}
	
}

[1단계:코드] 5. 상위클래스 ComPart 컴퓨터 부품, partFunction()부품의 기능,  하위클래스 Cpu, Ram, Ssd를 선언하여 오버라이딩을 처리하여 구현하세요.
Cpu c01 = new Cpu();
c01.function();
Ram r01 = new Ram();
r01.function();
Ssd s01 = new Ssd();
s01.function();
//=====================================================
 * class Compart{
	private String name;

	public Compart(String name) {
		this.name = name;
	}
	public void function() {
		System.out.println(this.name+"부품의 역할↓");
	}
	
}
class Cpu extends Compart{

	public Cpu() {
		super("CPU");
	}
	public void function() {
		super.function();
		System.out.println("기계어로 쓰인 컴퓨터 프로그램의 명령어를 해석하여 실행한다.");
		
	}
	
}
class Ram extends Compart{

	public Ram() {
		super("Ram");
	}
	public void function() {
		super.function();
		System.out.println("정보에 빠르게 액세스할 수 있도록 컴퓨터가 실시간으로 사용하는 정보를 저장합니다.");
		
	}
	
}
class Ssd extends Compart{

	public Ssd() {
		super("Ssd");
	}
	public void function() {
		super.function();
		System.out.println("컴퓨터의 저장장치로써, HDD보다 처리속도가 빠르다.");
		
	}
	
}
[1단계:개념] 6. 다형성이란 무엇인가? 개념을 기술하세요.
		#다형성
		 - 상위 클래스를 상속받은 하위클래스들이 각자 물려받아 각 객체별로 다르게 동작시킬수있도록하는 것
		  * 오늘배운것 자동타입변환
		  * 
[1단계:코드] 7. 상위클래스 Blabar 나비애벌래로 다양한 나비(호랑나비, 노랑나비, 파랑나비)가 나오게 다형성 처리하고 showColor()메서드를 통해서 재정의 하세요
		 */
		Blabar b1 = new nabi1();
		b1.showcolor();
		Blabar b2 = new nabi2();
		b2.showcolor();
		Blabar b3 = new nabi3();
		b3.showcolor();
	}

}
class Blabar{
	private String name;
	private String color;
	
	public Blabar(String name,String color) {
		this.name=name;
		this.color=color;
	}
	public void showcolor(){
		System.out.println(name+"의 색깔은 "+color+"입니다.");
	}
}

class nabi1 extends Blabar{

	public nabi1() {
		super("호랑나비", "호랑이색");
	}
	
}
class nabi2 extends Blabar{

	public nabi2() {
		super("노랑나비", "노란색");
	}
	
}
class nabi3 extends Blabar{

	public nabi3() {
		super("파랑나비", "파란색");
	}
	
}