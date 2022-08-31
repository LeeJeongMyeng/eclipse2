package javaexp.a01_begin;

import java.util.Scanner;

public class A12_InputScanner {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("사과를 몇개 구매하셨나요?");
			int apple = sc.nextInt();
			System.out.print("그렇다면 바나나는 몇개 구매하셨나요?");
			int banana = sc.nextInt();
			int  total = apple+banana;
			System.out.println("구매한 과일의 총 개수는"+total+"개입니다.");
		}
	}

}
