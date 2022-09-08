package javaexp.z01_homework;

public class A08_0907_5 {

	public static void main(String[] args) {
		/*
	* [1단계:코드] 5. GoTravel 클래스를 선언하고  오버로딩의 원칙에 따라 메서드를 선언하되 
      - 리턴유형을 void
      1) setTarget : 목적지를 1, 2, 3개로 선언하여 출력
      2) setTarget : 비용을 선언하는 내용 처리 
      3) setTarget : 목적지와 비용을 순서를 다르게 선언 출력..
      */
		GoGO gt01 = new GoGO();
		gt01.setTarget("서울", "창원", "공주");
		gt01.setTarget("미국");
		gt01.setTarget(1000000);
		gt01.setTarget("니뽄",20000);
		gt01.setTarget(2000000,"하와이");
	}

}
class GoGO{ //아래 void setTarget들은 이름은 같아도 순서가 다르기에 오버로딩
	void setTarget(String loc1,String loc2,String loc3) {
		System.out.println("# 목적지 3개 메서드");
		System.out.println("목적지1:"+loc1);
		System.out.println("목적지2:"+loc2);
		System.out.println("목적지3:"+loc3);
	}
	void setTarget(String loc1) {
		System.out.println("# 목적지 1개 메서드");
		System.out.println("목적지1:"+loc1);

	}
	void setTarget(int pay) {
		System.out.println("#비용 메서드");
		System.out.println("비용1:"+pay);
	}
	void setTarget(String loc1,int pay) {
		System.out.println("# 매개순서(목적지, 비용)#");
		System.out.println("목적지1:"+loc1);
		System.out.println("비용1:"+pay);
	}
	void setTarget(int pay,String loc1) {
		System.out.println("# 매개순서(비용, 목적지)#");
		System.out.println("목적지1:"+loc1);
		System.out.println("비용1:"+pay);
	}
}