package homework_review.studyroom;

public class Student01 {
	private int myPoint=80;
	String studyName="우리는 자바스터디 모임이다.";
	public String announce="스프링은 언제 배우나요?";
	
	public void student01Info() {
		Student01 st01 = new Student01();
		System.out.println("private:"+st01.myPoint);
		System.out.println("private:"+st01.studyName);
		System.out.println("private:"+st01.announce);
	}
}
