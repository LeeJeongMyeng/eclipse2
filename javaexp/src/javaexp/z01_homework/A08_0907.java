package javaexp.z01_homework;

import java.util.Scanner;

public class A08_0907 {
	
	public static void main(String[] args) {
		// a06_object 패키지 참고
		
//		 [1단계:개념] 1. 생성자의 this()를 사용하는 경우와 규칙을 예제를 통하여 기술하세요.
		//this()는 같은 class의 다른 생성자의 초기화 된 내용을 가져다 쓸때 사용한다.
		
		 
//[1단계:코드] 2. 자바의 기본데이터 유형으로 class ExpConst에 데이터를 할당하고, 
//				생성자에 할당된 데이터를 출력하세요.
			Home hm = new Home("홍길동","창원");
			
			

//		[1단계:개념] 3. 메서드의 기능적 구성요소를 기술하고 예제를 통해서 설명하세요.
			// 1) 리턴타입 = 메소드가 리턴하는 결과 타입
			// 2)리턴타입 메소드이름(매개변수1,2,...) {(실행할 코드를 작성하는 곳)}
       
       
       
       
//1단계:코드] 4. AutoSeller 클래스 선언 메서드 insertCoin()를 통해서 입력된 동전을 필드
      			//curMoney에 누적 저장하고, getCurMoney()를 통해
      			//현재 저장된 돈을 리턴 처리하는 기능을 처리하세요.
			AutoSeller as = new AutoSeller();
		       as.insertCoin();
      		/*	
[1단계:코드] 5. GoTravel 클래스를 선언하고  오버로딩의 원칙에 따라 메서드를 선언하되 
      - 리턴유형을 void
      1) setTarget : 목적지를 1, 2, 3개로 선언하여 출력
      2) setTarget : 비용을 선언하는 내용 처리 
      3) setTarget : 목적지와 비용을 순서를 다르게 선언 출력..
      */
		       GoTravel gt1 = new GoTravel();
		       gt1.setTarget("창원");
		       GoTravel gt2 = new GoTravel();
		       gt1.setTarget("창원","광양","공주");
		       GoTravel gt3 = new GoTravel();
		       gt1.setTarget("제주도",150000);
		       GoTravel gt4 = new GoTravel();
		       gt1.setTarget(150000,"제주도");
//[2단계:코드] 6. BuyProduct 클래스를 선언하고, 생성자를 통해서 물건명과 가격을 초기화하고
       //getProdName(), getProdPrice(),  물건명, 가격(정수) 리턴
	//  buyProd() 매개변수로 갯수를 할당, 가격과 연산하여 계를 리턴하게 처리하게 하세요.
		       Buyproduct bp1 = new Buyproduct();
		       bp1.setProdName("핸드폰");
		       bp1.setProdPrice(100);
		       bp1.buyProd(3);
		       System.out.println(bp1.gettotal());
		       
  
//[1단계:코드] 7. Member클래스로 선언하여 login()에 매개변수로 id, pass를 입력하여 himan/7777일 때, 로그인
      //성공문자리턴, 그외는 로그인실패문자리턴처리.
		       
		       Member mb = new Member();
		       mb.insertID();
		       mb.insertPass();
		       System.out.println("로그인 성공");
		       
	}

}
class Member{
	String id;
	int pass;
	Scanner scan02 = new Scanner(System.in);
//	Member(String id,String pass){
//	}
	void insertPass(){
			while(true) {
				System.out.println("pw 입력하세요");
				int inputpass = scan02.nextInt();
				if(inputpass==7777) {
					System.out.println("성공");
					break;
					
				} else {
					System.out.println("다시입력");
				}
		}	
}
	void insertID(){
		while(true) {
			System.out.println("ID 입력하세요");
			String inputid = scan02.nextLine();
			if(inputid.equals("himan")) {
				System.out.println("성공");
				break;
				
			} else {
				System.out.println("다시입력");
			}
	}	
}

}
class Home{
	String name;
	String location;
	Home(String name){
		this.name=name;
}
	Home(String name,String location){
		this(name);
		this.location=location;
		System.out.println(name+"의 집 위치는 "+location+"입니다.");
	}
}

class AutoSeller{
	String start;
	int coin;
	int totcoin;
	int inputcoin;
	Scanner scan01 = new Scanner(System.in);
	int insertCoin(){
//		this.start=start;
		System.out.println( "시작합니다 종료시 -1입력.");
			while(true) {
				System.out.println("넣을 동전을 입력하세요");
				int coin = scan01.nextInt();
				if(coin==-1) {
					System.out.println("총 코인은 "+totcoin+"개 입니다.");
					break;
					
				} else {
					totcoin+=coin;
				}
				
		}
		return totcoin;
		
}


class Num{
	int num01;
	int num02;
	int num(int num01,int num02){
		this.num01=num01;
		this.num02=num02;
		System.out.print(num01+"+"+num02+"=");
		return num01+num02;
	}
}
}

class GoTravel {
	String where1;
	String where2;
	String where3;
	int cost1;
	int cost2;
	int cost3;
	void setTarget (String where1){
		this.where1=where1;
		System.out.println("#여행지 1개#");
		System.out.println("목적지 : "+where1);
	}

	void setTarget (String where1, String where2){
		this.where1=where1;
		this.where2=where2;
		System.out.println("#여행지 2개#");
		System.out.println("목적지 1: "+where1);
		System.out.println("목적지 2: "+where2);
}
	void setTarget (String where1, String where2, String where3){
		this.where1=where1;
		this.where2=where2;
		this.where3=where3;
		System.out.println("#여행지 3개#");
		System.out.println("목적지 1: "+where1);
		System.out.println("목적지 2: "+where2);
		System.out.println("목적지 3: "+where3);
}
	void setTarget (String where1, int cost1){
		this.where1=where1;
		this.cost1=cost1;
		System.out.println("#여행지 1개#");
		System.out.println("목적지 1: "+where1);
		System.out.println("비용: "+cost1);
		
		
}
	void setTarget (int cost1,String where1){
		this.where1=where1;
		this.cost1=cost1;
		System.out.println("#여행지 1개#");
		System.out.println("목적지 1: "+where1);
		System.out.println("비용: "+cost1);		
}
}
class Buyproduct{
	String name;
	int price;
	int count;
	
	
		void setProdName(String name) {
	//		this.getProdName(); //이 객체가 소속된 기능 메소드 호출.
			this.name=name;
	}
		void setProdPrice(int price) {
	//		this.getProdName(); //이 객체가 소속된 기능 메소드 호출.
			this.price=price;
	}
		void setProdNP() {
			name = "없음";
			price= 0;
		}
		void  buyProd(int count) {
			this.count=count;
		}
		
		String getProdName() {
			return name;
			
		}
		int getProdPrice() {
			return price;
	}
		int gettotal() {
			return price*count;
		}
}
