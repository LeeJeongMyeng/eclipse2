package javaexp.z01_homework;

import java.util.Scanner;

public class A04_0901_2 {

	public static void main(String[] args) {
		
		int num01 = (int)(Math.random()*3); //0,1,2
		Scanner sc01 = new Scanner(System.in);
		System.out.println("#컴퓨터와 함께하는 가위 바위 보#");
	    System.out.println("당신의 선택은?");
	    String mych = sc01.nextLine();
	    int myIdx = mych.equals("가위")?0:
	    				(mych.equals("바위")?1:2);
	    
	    
		

}
}
