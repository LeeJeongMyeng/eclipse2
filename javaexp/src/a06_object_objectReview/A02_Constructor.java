package a06_object_objectReview;

public class A02_Constructor {

	public static void main(String[] args) {
		//ex BasePlayer 클래스를 선언하고 팀명, 이름 타율을 필드로
		// 선언하고 생성자를 통해서 팀명과 이름을 초기화하고 출력하세요.
		BasePlayer bp01 = new BasePlayer();
		bp01.name = "이정명";
		bp01.team = "NC다이노스";
		bp01.tata = 0.342;
		System.out.println("팀명 : "+bp01.team);
		System.out.println("이름 : "+bp01.name);
		System.out.println("타율 : "+bp01.tata);
		BasePlayer bp02 = new BasePlayer();
		System.out.println("팀명 : "+bp02.team);
		System.out.println("이름 : "+bp02.name);
		System.out.println("타율 : "+bp02.tata);
		BasePlayer bp03 = new BasePlayer("막장","찌니",0.033);
		System.out.println("팀명 : "+bp03.team);
		System.out.println("이름 : "+bp03.name);
		System.out.println("타율 : "+bp03.tata);
		
	}

}
class BasePlayer{
	String team;
	String name;
	double tata;
	/*
	 # 생성자 overloading
	 	1. 생성자를 선언할 수 있는 규칙을 말한다. - 메서드 오버로딩 규칙과 동일
	 	2. 규칙
	 		1) 매개변수의 갯수가 다를 때
	 		2) 매개변수의 갯수가 같더라도 타입이 다를 때
	 		3) 매개변수의 갯수가 같고 타입이 다르더라도 선언된 순서가 다를 때
	 */
	BasePlayer(){ //생성자 만듦
		this.name="이지은";
		this.team="몰루?";
		this.tata=0.409;
	}
	BasePlayer(String team,String name,double tata){
		this.team=team;
		this.name=name;
		this.tata=tata;
	}
	// 클래스내에는 오버로딩 규칙에 의해 여러 생성자를 선언 가능
	// 객체 생성시 이중 하나만 사용하여 처리가능
	
}
class Product{
	String name;
	int cost;
	int count;
	Product(){
		this.name="";
	}
	Product(int cost,int count){
		this(); //정의된 생서자를 호출할 떄 사용..
		this.cost=cost;
		this.count=count;
	}
Product(int cost,String name,int count){
	this.cost=cost;
	this.name=name;
	this.count=count;
	}
}