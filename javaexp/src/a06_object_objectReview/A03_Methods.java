package a06_object_objectReview;

public class A03_Methods {

	public static void main(String[] args) {
		/*
		 # 메서드 method
		 	1) 필드와 상호관계 속에서 데이터 처리.
		 		ex)물건 구매시, 구매물건의 갯수를 저장 및 전체 계 호출.
		 	
		 	2) 주요 기능 처리
		 		-리턴 타입/실제 리턴값
		 			메서드는 리턴타입을 먼저 선언하고 그 타입에 맞는 데이터를 마지막에
		 			return으로 처리하여야 한다.
		 			(리턴 값이 없으면 void를 선언한다.)
		 		- 매개변수 처리
		 			이 객체를 호출하는 외부 객체나 main()에서 데이터를
		 			넘겨서 처리할 때, 필요로 한다.
		 		- {}(중괄호블럭안)에 처리할 프로세스 처리.
		 */
		/*
		Psesonnal p01 = new Psesonnal();
		System.out.println(p01.getStr());
		String ret = p01.getStr();
		System.out.println("필드 리턴:"+p01.getName());
		*/
		Computer com01 = new Computer();
		System.out.println("컴퓨터 현재 상대:"+com01.curOnOff());
		com01.pushbtn(true);
		System.out.println("컴퓨터 현재 상대:"+com01.curOnOff());
		// ex) 클래스로 Computer를 선언하고 필드로 컴퓨터 명을 
	}
}
class Computer{
	String name;
	boolean isOper; // boolean은 설정하지 않으면 default값으로 false가 나온다
	int comcount;
	Computer(){
		this.name="한성컴퓨터";
	}
	Computer(String name) {
		this.name=name;
	}
	void pushbtn(boolean on_or_off) {
		isOper = on_or_off;
	}
	String curOnOff() {
		return isOper?"가동":"중지중";
	}
	String getNmae() {
		return this.name;
	}
		void show() {
			System.out.println("컴이름: "+this.name);
		}
	
	int setcount() {
		int num01=10;
		return num01; //선언된 데이터를 할당 후 리턴
}
class Psesonnal{
	String name; 
	Psesonnal(){
		this.name="무명";
	}
	//문자열 리턴하는 경우
	String getStr() {
		return "안녕하세요"; //바로 리턴
	}
	int getInt() {
		int num01=25;
		return num01; //선언된 데이터를 할당 후 리턴
	}
	String getName() {
		return this.name; //필드 값을 리턴 (Person2)
	}
	void show() {
		//리턴 없이 없는 경우void
		System.out.println("이름을 출력:" +this.name);
	}
}
	}
