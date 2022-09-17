package homework_review.playroom;

public class Friend01 {
	private String MyPriv="친구1의 비밀";
	String meetLoc="친구들과 강남에서 모였다.";
	public String outTName="우리는 고등학교 친구들이다.";
	
	public void CallFriend1Info() {
		Friend01 f01 = new Friend01();
		System.out.println("private:"+f01.MyPriv);
		System.out.println("default:"+f01.meetLoc);
		System.out.println("public:"+f01.outTName);
	}
}
