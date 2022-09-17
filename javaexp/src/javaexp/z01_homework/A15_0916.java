package javaexp.z01_homework;

//import javaexp.a08_inheritance.Comp;

public class A15_0916 {

	public static void main(String[] args) {
		/*
		 [1단계:개념] 1. 추상클래스 사용의 기본 형식을 기본 예제와 함께 설명하세요.
		 abstract class Comp{ // 단독으로 객체를 생성하지 못하는 abstract 추상클래스를 만듦
	public void working() {
		System.out.println("일을 열심히 합니다.");
	}
	public abstract void earnMoney(); // absrtact 메소드를 통해 하위 클래스에서 반드시 재정의 하게됨
}
class Samsung01 extends Comp{ // 실체 클래스 작성 시, 작성해놓은 추상클래스를 상속받아야함

	// 상속하는 상위에있는 추상메서드 earnMoney를 반드시 재정의
	@Override
	public void earnMoney() {
		System.out.println("전자 제품을 만들어서 돈을 번다.");
		
[1단계:코드] 2. 다각형이라는 추상클래스(필드-종류,실제메서드 도화지를 가져오다(), 추상메서드 drawing() @@을 그리다)를 생성하고 
      상속받은 실제 클래스(삼각형,사각형,오각형)을 처리하세요.
      /*
       polygon p1 = new triangle();
		p1.drowing(); p1.showdrowing();
		polygon p2 = new square();
		p2.drowing(); p2.showdrowing();
		polygon p3 = new pentagon();
		p3.drowing(); p3.showdrowing();
//==========================================================
 abstract class polygon{
	private String shape;

	public polygon(String shape) {
		this.shape = shape;
	}
	public void drowing() {
		System.out.println(this.shape+"를 그리다.");
	}
	public String getShape() {
		return shape;
	}
	public abstract void showdrowing();
	
}

class triangle extends polygon{

	public triangle() {
		super("삼각형");
	}
	public void showdrowing() {
		System.out.println(getShape()+"은 정삼각형이다.");
	}
}
class square extends polygon{

	public square() {
		super("사각형");
	}
	public void showdrowing() {
		System.out.println(getShape()+"은 정사각형이다.");
	}
}
class pentagon extends polygon{

	public pentagon() {
		super("오각형");
	}
	public void showdrowing() {
		System.out.println(getShape()+"은 정오각형이다.");
	}
}
 */
       
  /*    
[1단계:개념] 3. 추상클래스와 인터페이스의 차이점을 개념과 함께 정리해보세요.
          # 추상 클래스
          	-  상속받은 실체 클래스가 해당 추상클래스의 메소드를 가져와 재정의하여 사용
          	- extend와 super()를사용
          # 인터페이스
           	- 개발코드가 객체에 종속되지않고, 교체가 가능하도록 해줌(다향성)
           	- interface class와 implements class를 사용하여 interface의 메소드를 사용
           	
[1단계:코드] 4. 인터페이스 PaintWay를 선언(추상메서드 paint() @@ 색칠을 하다) 상속받은 실제
      클래스(빨강색, 파랑색, 노랑색)을 처리하세요.
      		Color c01 = new Color();
		c01.setPaint(new Red());
		c01.drowcolor();
		c01.setPaint(new Blue());
		c01.drowcolor();
		c01.setPaint(new Yellow());
		c01.drowcolor();
  //===============================================================================    
   * class Color{
	private PaintWay paint;

	public void setPaint(PaintWay paint) {
		this.paint = paint;
	}
	public void drowcolor() {
		if(this.paint!=null) {
			this.paint.print();//실제 객체가 할당
			//하위 실제 객체가 overriding한 내용 처리
		} else {
			System.out.println("정해진 색이 없습니다.");
		}
	}
	
}


interface PaintWay{
	void print();
}

class Red implements PaintWay{
	public void print() {
		System.out.println("빨간색을 색칠하다.");
	}
}
class Blue implements PaintWay{
	public void print() {
		System.out.println("파란색을 색칠하다.");
	}
}
class Yellow implements PaintWay{
	public void print() {
		System.out.println("노란색을 색칠하다.");
	}
}


[1단계:개념] 5. 예외 처리의 기본 형식과 처리 순서를 기본 예제에 의해 기술하세요.
					try { //예외발생 가능 코드 입력
		System.out.println(1/0);
		} catch(ArithmeticException e){ // 오류 코드 e 입력
			System.out.println("예외발생"+e.getMessage());
		}finally { //예외 상관없이 처리 부분
			System.out.println("상관없이 진행");
		}System.out.println("10");
		System.out.println("11");
		System.out.println("12");
		
[1단계:확인] 6. args를 통해서 나올 수 있는 예외를 아래에 하나씩 처리하세요
      1) args값을 입력 하지 않았을 때. 
      try {
			System.out.println(args[1]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("예외발생:"+e.getMessage());
			
		}
      2) args의 값 중에 숫자형 문자를 입력하여야 하는데 문자 자체를 입력했을 때.
      		String A = "1o3";
			try {
				System.out.println(Integer.parseInt(A));//NumberFormatException 에러
			}catch(NumberFormatException e){
				System.out.println("예외발생:"+e.getMessage());
				
			}
      
[1단계:개념] 7. 예외 처리의 계층별 처리란 무엇인지 기술하세요.
다중의 예외 처리
  	1. 예외는 여러가지 예외를 
  	 	catch를 block으로 처리 할 수 있다.
  	2. 단, 계층적으로 하위 예외부터 처리하고, 상위예외를 처리한다.
  	String name=null;
		try {
			System.out.println(name.toString());
			System.out.println(args[1]);
			System.out.println(1/0);
		//다중 예외처리
		// 1. 상위 계층의 예외는 최종으로 처리한다.
		}catch(NullPointerException e) {
			System.out.println("예외1:"+e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외2:"+e.getMessage());
		}catch(Exception e) {
			System.out.println("예외3(상위):"+e.getMessage());
		}
 
[1단계:개념] 8. 예외의 위임처리하는 내용을 예제를 통해서 기술하세요.
1. 메서드 별 예외 처리를 해당메서드를 호출하는곳에서 처리할 수 있도록 위임 처리한다.
2. 한꺼번에 예외처리를 해야할 때 사용된다.
			static void call01() throws ClassNotFoundException {// public void 메서드명() throws 위임할 예외, 위임할 예외2{}
	Class.forName("aa.bb.cc");
	System.out.println("메서드1");
	}
	try {
			call01();
			//위임된 예외를 밖에서 한꺼번에 처리..
		} catch (ClassNotFoundException e) {
			System.out.println("예외 발생(컴파일):"+e.getMessage());
			}
			
			
[1단계:확인] 9.  call01(), call02()에 배열의 범위를 벗어났을 때, 예외를 위임하는 예제를 처리해보세요.
		 */
		/*
		static void call01() throws ArrayIndexOutOfBoundsException{
			int[] i = {1,2,3};
			System.out.println(i[9]); // ArrayIndexOutOfBoundsException 에러발생
			}
		static void call02() throws ArrayIndexOutOfBoundsException{
			int[] i = {1,2,3,4,5,6};
			System.out.println(i[7]); // ArrayIndexOutOfBoundsException 에러발생
		}
		
		public static void main(String[] args) {
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
			try {
				call01();
				call02();
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("예외:"+e.getMessage());
			}finally {
				
			}
			System.out.println("4");
			System.out.println("5");
			System.out.println("6");
			*/
	}

}

