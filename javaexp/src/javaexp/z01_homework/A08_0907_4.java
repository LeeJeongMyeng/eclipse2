package javaexp.z01_homework;

public class A08_0907_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1단계:코드] 4. AutoSeller 클래스 선언 메서드 insertCoin()를 통해서 입력된 동전을 필드
			//curMoney에 누적 저장하고, getCurMoney()를 통해
			//현재 저장된 돈을 리턴 처리하는 기능을 처리하세요.
		
		conset as = new conset();
		System.out.println("초기 현재 저장된 금액:"+as.getcoin());
		as.setcoin(500);
		as.setcoin(1000);
		as.setcoin(1500);
		as.setcoin(2000);
		as.setcoin(2500);
		System.out.println("현재 저장된 금액:"+as.getcoin());
	}

}
class conset{
	String start;
	int coin;
	int totcoin;
	int inputcoin;
	void setcoin(int money) {
		this.coin+=money; // 누적저장
	}
	int getcoin() {
		return coin;
	}
}