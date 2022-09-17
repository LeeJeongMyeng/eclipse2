package javaexp.a09_execption;

public class A02_ExceptionExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		try {
		System.out.println("1");
		System.out.println("2");
		System.out.println(args[1]);
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("예외발생"+e.getMessage());
		}finally {
			System.out.println("3");
			System.out.println("4");
			System.out.println("5");
			System.out.println("6");
		}
		*/
		try {
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println(1/0);
		} catch(ArithmeticException e){
			System.out.println("예외발생"+e.getMessage());
		}finally {
			System.out.println("상관없이 진행");
		}System.out.println("10");
		System.out.println("11");
		System.out.println("12");
		
		
		
	}

}
