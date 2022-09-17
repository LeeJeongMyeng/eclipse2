package homework_review;

public class A12_0913_8 {

	public static void main(String[] args) {
		/*[1단계:코드] 8. 아래의 1:1관계 객체를을 선언해보세요.
        1) 자동차(차종,최고속도,배기량)와 자동차의소유주(이름,자동차, takeCar(자동차) driving() ) 를 선언
        2) 학생과 성적표
        3) 결혼할 커플(신랑, 신부) */
		
		/*# 코드 순서
			1. 종속될 클래스 선언
				-속성값(필드,메서드)구분
				-출력할 기능 메서드 선언
			2. 포함할 클래스 선언
				-기본 속성-필드 선언
				-종속될 클래스 선언
				-생성자(기본 속성-필드)
				-종속될 클래스를 할당할 메서드 선언
				-전체 데이터 출력 메서드 선언
		*/
		CarOwner co01 =new CarOwner("홍길동");
		
		co01.takeCar(new Car("BMW",280,3500));
		co01.driving();
		Record r01 = new Record("영어",90);
		System.out.println(r01.toString());
		System.out.println(r01);
		
		Student st = new Student("이정명");
		st.setR1(r01);
		st.show();
		st.setR1(new Record("수학",85));
		st.show();
	
		Bride b1 = new Bride("홍연희");
		b1.coupleInfo();
		b1.setWedding(new Groom("홍길동",27));
		b1.coupleInfo();
	}

}
//결혼할 커플(신랑,신부)
class Bride{
	private String name;
	private Groom groom;
	public Bride(String name) {
		this.name = name;
	}
	public void setWedding(Groom groom) {
		
		this.groom = groom;
		System.out.println("신랑 "+groom.getName()+"와 결혼하다.");
	}
	public void coupleInfo() {
		System.out.println("신부 "+name+"");
		if(this.groom!=null) {
			System.out.println(this.groom);
		}else {
			System.out.println("아직 결혼 전입니다.");
		}
	}
}

class Groom{
	private String name;
	private int age;
	public Groom(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "신랑 정보 [신랑 이름=" + name + ", 나이=" + age + "]";
	}
	public String getName() {
		return name;
	}
	
}


// 학생 성적표
class Student{
	private String name;
	private Record r1;
	public Student(String name) {
		this.name = name;
	}
	public void setR1(Record r1) {
		this.r1 = r1;
	}
	public void show() {
		System.out.println("#"+name+"학생 성적표#");
		if(r1!=null) {
			System.out.println(r1);
		}else {
			System.out.println("성적표가 없습니다.");
		}
	}
}
class Record{
	private String subject;
	private int point;
	public Record(String subject, int point) {
		this.subject = subject;
		this.point = point;
	}
	
	@Override
	public String toString() {
		//toString()은 참조변수를 호출 했을 때, 리턴할 내용을 기술
		// 객체의 참조 : 패키지명.클래스명@heap영역의 주소값
		
		return "Record [과목=" + subject + ", 점수=" + point + "]";
	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
}


// 차동자, 차주 관련 문제
class CarOwner{
	private String name;
	private Car car;
	public CarOwner(String name) {
		this.name = name;
	}
	public void takeCar(Car car) {
		System.out.println("#차를 타다#");
		this.car = car;
	}
public void driving() {
	System.out.println(this.name+"차를 운행합니다");
	if(this.car!=null) { //객체가 할당되어 있을 때 
		System.out.println("차를 운행합니다.");
		this.car.showCarInfo();
	}else {
		System.out.println("차가없네요?");
	}
}
}



class Car{
	private String kind;
	private int maxSpeed;
	private int cc;
	public Car() {}
	public Car(String kind, int maxSpeed, int cc) {
		this.kind = kind;
		this.maxSpeed = maxSpeed;
		this.cc = cc;
	}
	public void showCarInfo() {
		System.out.println("차종:"+this.kind);
		System.out.println("최고속도:"+this.maxSpeed+"km/h");
		System.out.println("배기량:"+this.cc+"cc");
	}
}