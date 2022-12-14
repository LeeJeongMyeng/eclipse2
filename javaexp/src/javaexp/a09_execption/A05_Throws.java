package javaexp.a09_execption;

public class A05_Throws {
static void call01() throws ClassNotFoundException {
	// try{}catch{}finally{} 문으로 처리를 해야하는데
	// 이 메서드를 호출하는 곳에서 한꺼번에 예외를 처리 할 수 있도록 위임처리..
	Class.forName("aa.bb.cc");
	System.out.println("메서드1");
}
static void call02() throws ClassNotFoundException {
	Class.forName("bb.cc");
	System.out.println("메서드2");
	
}
static void call03() throws NullPointerException{
	String s =null;
	System.out.println(s.toString());
}
static void call04() throws NullPointerException{
	String n =null;
	System.out.println(n.toString());
}
	public static void main(String[] args) {
		//main()안에 다른 static 메서드로 선언된 것은
		// 객체 생성없이 바로 사용가능하다.
		try {
			call01();
			call01();
			call02();
			call02();
			
			//위임된 예외를 밖에서 한꺼번에 처리..
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
			System.out.println("예외 발생(컴파일):"+e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("예외 발생(실행):"+e.getMessage());
		} try {
			call03();
			call04();
		}catch(NullPointerException e) {
			System.out.println("예외 발생(실행):"+e.getMessage());
		}
		

	}

}
/*
 # 예외 위임 (throws)
 1.  메서드 별로 현재 예외 처리를 이 메서드를 호출하는 곳에서
 	처리하게끔 위임 시키는 것을 말한다.
 2. 예외를 각 메서드별로 처리하기 보다 호출되는 곳에서 한꺼번에 처리할 때, 활용된다.
 3. 위임 형식
 	public void 메서드명() throws 위임할 예외, 위임할 예외2{
 	
 	}
 4.
 
 */
