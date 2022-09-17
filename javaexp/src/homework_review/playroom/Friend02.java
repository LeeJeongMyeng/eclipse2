package homework_review.playroom;

import homework_review.studyroom.Student01;

public class Friend02 {
	public void CallFriend1Info() {
		Friend01 f01 = new Friend01();
//		System.out.println("private:"+f01.MyPriv);
// 			private는 같은 패키지여도 접근 불가
		System.out.println("default:"+f01.meetLoc);
		System.out.println("public:"+f01.outTName);
	}
	public void student01Info() {
		Student01 st01 = new Student01();
//		System.out.println("private:"+st01.myPoint);
//		System.out.println("private:"+st01.studyName);
		System.out.println("private:"+st01.announce);
	}
}
