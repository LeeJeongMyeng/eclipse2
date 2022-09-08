package javaexp.z01_homework;

public class A08_0907_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[2단계:코드] 6. BuyProduct 클래스를 선언하고, 생성자를 통해서 물건명과 가격을 초기화하고
	       //getProdName(), getProdPrice(),  물건명, 가격(정수) 리턴
		//  buyProd() 매개변수로 갯수를 할당, 가격과 연산하여 계를 리턴하게 처리하게 하세요.
		BPBP bp02 = new BPBP("핸드폰",300000);
		System.out.println("구매 계:"+bp02.buyProd(2));
		System.out.println("구매 계:"+bp02.buyProd(3));
		System.out.println("구매 계:"+bp02.buyProd(4));
		System.out.println("구매 계:"+bp02.buyProd(5));
	}

}
class BPBP{
	String name;
	int price;
	BPBP(String name,int price){
		this.name=name;
		this.price=price;
	}
	String getProdName() {
		return this.name;
	}
	int getProdPrice() {
		return this.price;
	}
	int buyProd(int cnt) {
		System.out.println("#물건구매");
		System.out.println("물건명:"+this.name);
		System.out.println("물건명:"+this.price);
		System.out.println("갯수:"+cnt);
		return this.price*cnt;
	}
}