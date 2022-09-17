package javaexp.a09_execption;

public class A06_ThrowExp {
//ArithmeticException
	static void call01() throws ArithmeticException {
		System.out.println("메서드1");
		for(int cnt=10; cnt>=-10;cnt--) {
		System.out.println(1/(double)cnt);
		}
	}
	static void call02() throws ArithmeticException {
		System.out.println("메서드2");
		System.out.println(1/0);
	}
	public static void main(String[] args) {
		
		try {
			call01();
			call02();
		}catch(ArithmeticException e){
			System.out.println("예외 :"+e.getMessage());
		}
		try {
			
			call02();
		}catch(ArithmeticException e){
			System.out.println("예외 :"+e.getMessage());
		}

	}

}

