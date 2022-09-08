package a06_object_objectReview;

public class A04_Method {

	public static void main(String[] args) {
		/*
		 #객체에서 생성자와 메서드 처리.
			1. 생성자는 주로 객체가 생성될 때, 초기 값을 주로 설정한다.
			2. 메서드는 변경되는 필드값을 처리할 때 활용된다.
		 */
		Calculator c01 =new Calculator(25,5);
		System.out.println(c01.plus());
		System.out.println(c01.minus());
		System.out.println(c01.multi());
		System.out.println(c01.divide());

	}

}

class Calculator{
	int num01;
	int num02;
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Calculator(int num01, int num02) {
		super();
		this.num01 = num01;
		this.num02 = num02;
	}
	int plus() {
		return this.num01+this.num02;
	}
	int minus() {
		return this.num01-this.num02;
	}
	int multi() {
		return this.num01*this.num02;
	}
	int divide() {
		return this.num01/this.num02;
	}
}
