package javaexp.a09_execption;

public class A03_CompileException {

	public static void main(String[] args) {
		
		try {
			// 컴파일 예외처리
			// 에러가 나면 시스템에 치명적인 영향
			// 반드시 처리후 컴파일 해야지 처리되게끔 구현..
			Class.forName("aa.bb");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// e.getMessage()에러의 메시지를 처리
			System.out.println("에러내용"+e.getMessage());
		//	e.printStackTrace(); : 에러경로 처리
		}

	}

}
