package javaexp.z01_homework;

import java.util.Scanner;

public class A08_0907_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Login lg = new Login();
System.out.println("로그인 결과:"+lg.login("himan","7777"));
System.out.println("로그인 결과:"+lg.login("himan2","7777"));
	}

}
class Login{
	String login(String id, String pass) {
		String result = "로그인 실패";
		if(id.equals("himan")&&pass.equals("7777")) {
			result="로그인 성공";
		}
		return result;
				
	}
}