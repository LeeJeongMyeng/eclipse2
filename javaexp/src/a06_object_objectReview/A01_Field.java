package a06_object_objectReview;

public class A01_Field {

	public static void main(String[] args) {
		/*
		 #필드
		 1. 클래스의 정역 변수역할을 하며, 객체로 만들었을 때 주로 저장할 내용을 
		 	지정하여 처리한다.
		 2. 클래스명 밑에 선언하여 처리한다.
		 3. 생성자에 의해 초기화 되거나 메서드에 의해 값을 변경 저장하는 경우가 많다.
		 
		 #생성자
		 1. 클래스에서 객체로 생성할 때, 필드로 초기값이 설정이 필요한 경웨 보통 활용된다
		 2. defualt생성자는 생성자를 선언하지 않을 때, 컴파일 과정에서 자동으로 생성되는 것을
		 	말하고, 추가적인 생정자를 코드를 직접 입력하는 순간 사라진다.
		 */
		 Person p01 = new Person();
		 p01.name ="홍길동";
		 p01.visiInfo="가을의 파란하늘";
		 p01.audioInfo="좋아하는 가을 음악";
		 System.out.println(p01.audioInfo);
		 System.out.println(p01.name);
		 System.out.println(p01.visiInfo);
		 
		 students st = new students();
		 st.setgrade("이지은", 90, 80, 70);
		System.out.println(st.getgrade());
		
		Person p02 = new Person();
		System.out.println("#초기화 된 생성자#");
		System.out.println("이름: "+p02.name);
		
	}

}
class Person{
	String name; 
	String visiInfo; // 시각 정보 
	String audioInfo; // 청각 정보 
	Person(){ //생성자 만듦
		this.name="익명";
		this.visiInfo="";
		this.audioInfo="";
	}
} 

class students{
	String name;
	int gook;
	int yung;
	int math;
void setgrade(String name,int gook,int yung,int math) {
	this.name=name;
	this.gook=gook;
	this.yung=yung;
	this.math=math;
}
String getgrade(String name) {
	return name;
	
}
int getgradesum(int gook,int yung,int math) {
	int total1 = gook+yung+math;
	return total1;
	
}
int getgrade() {
	int total2 = (gook+yung+math)/3;
	int totla11 = gook+yung+math;
	System.out.println("학생이름:"+name+"\t총점: "+totla11+"\t평균: "+total2);
	return total2;
}

}