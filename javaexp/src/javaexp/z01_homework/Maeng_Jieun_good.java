package javaexp.z01_homework;

import java.util.Scanner;

public class Maeng_Jieun_good {

	public static void main(String[] args) {
		// [3단계:코드] 6. while문을 이용해서 학생의 점수를 등록하고 총점과 평균을
		// 출력하되, 등록을 종료시 -1를 입력해서 처리하세요.

		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		int num;
		String[] subject = new String[3];
		subject[0] = "국어";
		subject[1] = "영어";
		subject[2] = "수학";

		//while (true) { // true를 써서 무한반복 => if,else 참조
			for (num = 0; num < subject.length; num++) { //

				System.out.print(subject[num] + " 점수입력");
				int score = scanner.nextInt();
				if (score != 0) {
					sum += score; // score이 0이 아니면, sum에 더한다
				} else {
					if (score == 0) {
						sum = 0;
						System.out.println("재입력");
					   num=-1;
					} else {
						break;
						
					}
					
				}
				
			}
			System.out.println("합계: " + sum);

	//	}

	}
}
