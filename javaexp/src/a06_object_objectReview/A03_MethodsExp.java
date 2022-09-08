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
		System.out.println("총 갯수 : "+m1.getProdCnt());
		Mart m2= new Mart();
		m2.buyprodCnt("사과");
		m2.buyprodCnt("바나나");
		m2.buyprodCnt("딸기");
		System.out.println("총 갯수 : "+m2.getProdCnt2());
		m2.buyProd("컴퓨터");
		m2.buyProd("컴퓨터");
		m2.buyProd("컴퓨터");
		m2.buyProd("컴퓨터");
		m2.buyProd("컴퓨터");
		m2.showList();
	}

}

	class Mart{
		int count;
		int totcount;
		String pnames;
		String totpname;
		String buylist[];
		int buyIdx;
		Mart(){
			this.pnames="";  //이거 안붙히면 앞에 null이 불음
			buylist = new String[5]; //배열 선언
		}
		void buyProd(String pname) {
			if(buyIdx<5) {
				buylist[buyIdx++]=pnames;
			}else {
				System.out.println("구매물건은 총 5개까지 가능합니다");
			}
			
		}
		
		void showList() {
			for(int idx=0;idx<buylist.length;idx++) {
				System.out.println(idx+1+")"+buylist[idx]);
			}
		}
		void buyProd(int count) {
			this.totcount+=count; // 누적저장
			System.out.println("현재까지 저장된 카운트:"+totcount);
		}
		void buyprodCnt(String pname) {
			this.pnames=pname;
			
		}
		
		int getProdCnt() {
			return this.totcount;
			
		}
		String getProdCnt2() {
			return this.pnames+=pnames+",";
			
		}
	}
	
	
