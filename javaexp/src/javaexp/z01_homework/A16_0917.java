package javaexp.z01_homework;

import java.util.ArrayList;

import homework_review.Exp;

//import homework_review.TicketNum;
//import homework_review.TrainNum;
//import javaexp.a08_inheritance.Father01;
//import javaexp.a08_inheritance.Son02;

//import homework_review.Exp03;
//import homework_review.Product;
//import homework_review.Student10;
//import homework_review.Teacher;

//import homework_review.Exp01;
//import java.util.ArrayList;
public class A16_0917 {

	public static void main(String[] args) {
		/*
[1단계:개념] 1. 일반 배열과 동적배열(ArrayList)의 차이점을 예제를 통해서 기술하세요.
				#일반 배열(정적배열) - 배열을 정의할 때 부터 길이를 정하기때문에 고정적임.
								- 메모리 관리에 용이함
								- 타입[] 변수명= {값1,2,3...};
				#동적 배열 - 배열의 길이를 늘리고 줄일 수 있는 동적인 배열
						 - ArrayList<타입> 변수명 = new ArrayList
[1단계:개념] 2. 동적배열 ArrayList의 활용 방법과 주요 기능 메서드를 기본 예제를 통하여 기술하세요.
				ArrayList<Exp01> explist = new ArrayList(); // 4 Exp01을 explist라는 변수명으로 하여 동적 배열로 선언
		explist.add(new Exp01("이정명")); //5. explist의 배열에 '이정명'이라는 값 추가(add)
		explist.add(new Exp01("이지은"));//6. explist의 배열에 '이지은'이라는 값 추가(add)
		for(int idx=0;idx<2;idx++) {          //for문을 통하여 explist의 배열 값 첫번째부터 출력하도록 함.
			Exp01 exp01 = explist.get(idx);
			System.out.println(exp01.getName());
		}
//===================================================================
  class Exp01{ //1. ArrayList 동적배열에 대한 대상이될 클래스 선언.
	private String name;

	public Exp01(String name) { // 2. Exp01("내용") '내용'의 값을 입력할수있도록 함
		this.name = name;
	}
	public String getName() {	// 3. this.name = name;으로 받은 값을 return
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
[2단계:확인] 3. ArrayList<Product>를 활용하여 구매할 물건 정보 3개를 추가하여 출력처리하세요.

             int tot()메서드로 내용 출력과 물건가격*물건단가를 리턴하게 하여, 물건 3개의 총비용을 누적 처리되게 하세요.
             Product.totalcost =0;
		ArrayList<Product> prodlist = new ArrayList<Product>();
		
		prodlist.add(new Product("딸기",2000,2));
		prodlist.add(new Product("사과",3000,3));
		prodlist.add(new Product("수박",4000,4));
		prodlist.add(new Product("맹고",5000,5));
		
		for(int idx1=0; idx1<prodlist.size();idx1++) {
		Product pd01 = prodlist.get(idx1);
		System.out.println("구매물건: "+pd01.name);
		System.out.println(pd01.name+"의 개당 가격:"+pd01.cost);
		System.out.println("구매 개수: "+pd01.count);
		System.out.println("총계: "+pd01.money);		
		}System.out.println(Product.totalcost);
// ==============================================================================
 class Product {
	String name;
	int cost;
	int count;
	int money;
	static int totalcost;
	public Product(String name, int cost, int count) {
		this.name = name;
		this.cost = cost;
		this.count=count;
		this.money = cost*count;
		totalcost+=money;
		
	}

	int tot(){
		return totalcost;
		
	}
}
      
[1단계:개념] 4. static 멤버와 instance 멤버의 차이점을 예제를 통해 기술하세요.
static 멤버 : instance 멤버와는 다르게 static변수의 값을 정의하게되면, 모든 객체가 해당 값을 공유하게 된다.
instance멤버 : 객체별로 값을 다르게 설정이 가능하다.


				Exp03 exp03 = new Exp03();
Exp03 exp04 = new Exp03();
System.out.println("intstance: "+exp03.a);
System.out.println("intstance: "+exp04.a);
System.out.println("static: "+exp03.b);
System.out.println("static: "+exp04.b);
exp03.a=20;
exp03.b=30;
System.out.println("intstance: "+exp03.a);
System.out.println("intstance: "+exp04.a);
System.out.println("static: "+exp03.b);
System.out.println("static: "+exp04.b);
//===========================================
 * class Exp03{
	int a=1;
	static int b=2;
}
[1단계:개념] 5. static final 상수와 static 변수의 차이점을 기술하세요.
			instance = 객체별로 값 재정의 가능.
			final = 객체별로 값을 한번 설정한 후 변경 불가능
			static = 값설정 시, 모든 객체가 해당 값을 공유
			static final = 모든 객체가 해당 값을 공유하며, 값 재정의 불가능
			
[1단계:개념] 6. package란 무엇이고 클래스/접근제어자/import와 함께 설명하세요.
				1. package = 클래스의 묶음. 관련된 클래스끼리 그룹단위로 묶어놓음으로써 효율적으로 관리가 가능하다.
				2. class = 만들 실체 즉, 객체를 생성하기위한 자바의 설계도이며, 필드와 메서드로 구성된다
						필드(field): 변수
						메서드(Method) : 동작을 위한 명령문의 집합
				3. import = 다른 패키지에 속한 클래스를 사용하기 위한 명령문
						 단, 해당 클래스의 접근제어자가  protected(해당 클래스를 상속(extend)받았을 경우),public이어야 한다.
					 ex) import 패키지이름.클래스이름; (해당 패키지의 클래스를 사용하기 위함.)
					 	 import 패키지이름.* (해당 패키지의 모든 클래스를 사용함. 단, 필요없는 클래스까지 끌고올 수 있으므로 메모리 낭비 우려가 있음.
					 	   단축키 : ctrl+shift+o
				4. 접근제어자
					1)public : 어떠한 제한도 없이 사용가능
					2)protected : 상속받았을 경우, 상속받은 클래스가 타 패키지라면 사용가능
					3)default : 다른 패키지는 접근 불가
					4)private : 모든 외부클래스는 접근불가
				
[1단계:확인] 7. 아래의 여러가지 1:다 관계 클래스를 선언하고 출력하세요.

      1) 담당교수, 수강 학생
     
     
		Teacher tc = new Teacher("이정명");
		tc.showstulist();
		tc.reasonStudent(new Student10("이지은"));
		tc.reasonStudent(new Student10("찌니"));
		tc.showstulist();
		ArrayList<Student10> studentlist = new ArrayList<Student10>();
		studentlist.add(new Student10("벨르"));
		studentlist.add(new Student10("룰루"));
		tc.totalreason(studentlist);
		tc.showstulist();
	
 //====================================================================
  * class Teacher{
	private String tname;
	private ArrayList<Student10> student;
	public Teacher(String tname) {
		this.tname = tname;
		this.student = new ArrayList<Student10>();
	}
	public void reasonStudent(Student10 s) {
		this.student.add(s);
	}
	public void totalreason(ArrayList<Student10> student) {
		this.student.addAll(student);
		System.out.println("총 "+student.size()+"명 수강 중");
	}
	public void showstulist() {
		System.out.println("#담당 교수: "+this.tname+"#");
		System.out.println("#수강생 목록#");
		if(this.student.size()>0) {
			for(Student10 s:this.student) {
				System.out.println("수강생 이름: "+s.getName());
			} 
			}else {
				System.out.println("수강생이 없습니다.");
			
		}System.out.println("총 수강생 : "+student.size());
	}
}
class Student10{
	private String name;

	public Student10(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

 2) 기차, 기차 좌석정보
 public static void main(String[] args) {
		TrainNum tn = new TrainNum(3);
		tn.showTicket();
		tn.setTicket(new TicketNum("이정명","3A"));
		tn.setTicket(new TicketNum("이지은","3B"));
		tn.showTicket();
	}
}
//======================================================
  class TrainNum{
	private int TNum;
	private ArrayList<TicketNum> ticketNum;
	public TrainNum(int tNum) {
		this.TNum = tNum;
		this.ticketNum = new ArrayList<TicketNum>();
	}
	public void setTicket(TicketNum t) {
		this.ticketNum.add(t);

	}
	public void showTicket() {
		System.out.println("예매 기차 번호: "+TNum);
		if(ticketNum.size()==0) {
			System.out.println("현재 내역없음");
		}else {
			System.out.println("==예매==");
			for(TicketNum t:ticketNum) {
				t.getTicket();
			}
		}
	}
	
	
}
class TicketNum{
	private String name;
	private String SeetNum;

	public TicketNum(String name, String seetNum) {
		this.name = name;
		this.SeetNum = seetNum;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSeetNum(String seetNum) {
		SeetNum = seetNum;
	}
	public String getName() {
		return name;
	}
	public String getSeetNum() {
		return SeetNum;
	}
	public void getTicket() {
		System.out.println("예약자: "+this.name);
		System.out.println("예약좌석 번호: "+this.SeetNum);
	}
}

[1단계:개념] 8. 상속 관계에서 super() 생성자관계에서 사용하는 규칙을 기본 예제를 통해서 기술하세요.

					//super는 상/하위 클래스에서 동일한 멤버를 사용할때, 구분하기 위해 활용된다.
			Son02 s1 = new Son02();
		System.out.println(s1.getName());		 
//===============================================================================================
 class Father01{
	private String name;
	
	Father01(String s){
	this.name=s;
	}
	public String getName() {
		return name;
	}
}

class Son02 extends Father01{
	Son02(){
		super("홍길동"); // 하위에서는 반드시 상위 클래스의 생성자를 호출하여야 한다.
	} //default로써, 보이지 않지만 처리가 되어있기에 에러가 나지 않는다.
}

[1단계:확인] 9. 상위로 추상 클래스 Robot 추상 메서드(attack())을 생성자로 로봇의 종류를 할당하게 하고, Dagan, Gundam을
   상속하여 해당 생성자를 통해서  호출하여 처리하고 출력되게 하세요.
   Robot rb = new Robot();
		rb.Attack1();
		rb.SetAttack1(new D_Attacklist1());
		rb.Attack1();
		rb.SetAttack1(new D_Attacklist2());
		rb.Attack1();
		rb.SetAttack1(new D_Attacklist3());
		rb.Attack1();
		rb.Attack2();
		rb.SetAttack2(new G_Attacklist1());
		rb.Attack2();
		rb.SetAttack2(new G_Attacklist2());
		rb.Attack2();
		rb.SetAttack2(new G_Attacklist3());
		rb.Attack2();
 //==========================================================================  
  * class Robot{
	private Dagan dagan;
	private Gundam gundam;
	public void SetAttack1(Dagan dagan) {
		this.dagan = dagan;
	}
	public void Attack1() {
		if(this.dagan!=null) {
			this.dagan.attackWay1();
		} else {
			System.out.println("Dagan이 고장나서 움직일 수 없다.");
		}
	}
	public void SetAttack2(Gundam gundam) {
		this.gundam = gundam;
	}
	public void Attack2() {
		if(this.gundam!=null) {
			this.gundam.attackWay2();
		} else {
			System.out.println("gundam이 고장나서 움직일 수 없다.");
		}
	}
	
	
}

interface Dagan{
	void attackWay1();
}
class D_Attacklist1 implements Dagan{
	@Override
	public void attackWay1() {
		System.out.println("자동차에서 변신을 한다.");
	}
}
class D_Attacklist2 implements Dagan{
	@Override
	public void attackWay1() {
		System.out.println("달려가 주먹공격을한다.");
	}
}
class D_Attacklist3 implements Dagan{
	@Override
	public void attackWay1() {
		System.out.println("검을 들고 휘두른다.");
	}
}
interface Gundam{
	void attackWay2();
}
class G_Attacklist1 implements Gundam{
	@Override
	public void attackWay2() {
		System.out.println("날개가 부착되어 하늘에서 공격한다.");
	}
}
class G_Attacklist2 implements Gundam{
	@Override
	public void attackWay2() {
		System.out.println("무기가 추가되어 미사일을 쏜다.");
	}
}
class G_Attacklist3 implements Gundam{
	@Override
	public void attackWay2() {
		System.out.println("합체하여 공격한다.");
	}
}

[1단계:개념] 10. protected의 접근 범위에 대하여 예제를 통하여 기술하세요
		protected 접근 범위 : 같은 패키지/같은 클래스/상속(extends)받은 다른 패키지의 클래스
	public class Exp {
	private String callexp1="private 예시 문구입니다.";
	String callexp2 = "default 예시 문구입니다.";
	protected String callexp3 = "protected 예시 문구입니다.";
	public String callexp4="public 예시 문구입니다.";

	public void callExp(){
		System.out.println("private:"+callexp1);
		System.out.println("default:"+callexp2);
		System.out.println("protected:"+callexp3);
		System.out.println("Public:"+callexp4);
	}
}	 
		
//=======================================		
		import homework_review.Exp;

		public class Exp2 extends Exp {

			public void callExp(){
			//	System.out.println("private:"+privSec);
			//	System.out.println("default:"+payOurHome);
				System.out.println("protected:"+inheritMoney);
				System.out.println("Public:"+announce);
			}

		}
		*/
	}

}



