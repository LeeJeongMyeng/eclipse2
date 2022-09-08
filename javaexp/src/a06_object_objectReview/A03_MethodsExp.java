package a06_object_objectReview;

public class A03_MethodsExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// ex) Mart 클래스 선언  필드 pcnt(구매물건 갯수), 기능메서드 buyProd(int cnt) 매개 변수로
		// getProdCnt()는 리턴 값으로 pcnt로 처리하여 현개 구매한 물건 갯수 확인
		Mart m1= new Mart();
		m1.buyProd(30);
		m1.buyProd(30);
		m1.buyProd(30);
		m1.buyProd(30);
		System.out.println(m1.getProdCnt());
	}

}

	class Mart{
		int count;
		int totcount;
		
		void buyProd(int count) {
			this.totcount+=count; // 누적저장
			System.out.println("현재까지 저장된 카운트:"+totcount);
		}
		int getProdCnt() {
			return this.totcount;
		}
	}
	
	
