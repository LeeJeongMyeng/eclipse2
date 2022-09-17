package homework_review.studyroom;

import homework_review.playroom.Friend01;

public class Student02 {
	public void CallFriend1Info() {
		Friend01 f01 = new Friend01();
//		System.out.println("private:"+f01.MyPriv);
//		System.out.println("default:"+f01.meetLoc);

		System.out.println("public:"+f01.outTName);
// 		외부패키지 소속 클래스는 public만 접근가능
		
		
	}
	public void student01Info() {
		Student01 st01 = new Student01();
//		System.out.println("private:"+st01.myPoint);
		System.out.println("private:"+st01.studyName);
		System.out.println("private:"+st01.announce);
	}
}
