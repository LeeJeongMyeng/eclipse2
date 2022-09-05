package javaexp.z01_homework;

import java.util.Scanner;

public class A05_0905 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * [1단계:개념] 1. stack영역과 heap영역의 차이점을 기술하세요. stack = 변수가 저장되는 영역 heap = 자바의 객체들이
		 * 저장되는 영역 주소로 할당이된다 아직 스택과 힙영역의 차이점은 이해가 잘가지않습니다..
		 */
//========================================================================================================================================

		// [1단계:코드] 2. 정수형 배열(arr05)로 물건의 가격을 3개 할당하고, 새로운 배열 변수(arr06)에 물건의 가격
		// 변수(arry05)
		// 를 할당하고 arr06에 중간데이터를 변경 후 두 변수를 비교시 동일한 데이터가 나오는 이유를 기술하세요.

		int arr05[] = { 500, 1000, 1500 };
		int arr06[] = arr05;

		System.out.println("arr05:arr06 =" + arr05 + ":" + arr06);
		// 출력결과: arr05:arr06 =[I@5f150435:[I@5f150435

		// int arr05[] = {500,1000,1500};
		// int arr06[] = {500,1000,1500};
		System.out.println("arr05:arr06 =" + arr05 + ":" + arr06);
		// 여기는 아직 이해가 잘안갑니다.

//==========================================================================================================================================

		// [1단계:개념] 3. 객체형 데이터를 선언하여 초기화(null)후, 구성요소를 호출할 때 나오는 에러와 원인을 예제를 통해서
		// 설명하세요

		class person {
			int num06;
		}
		person a1;
//	System.out.println(a1); 초기화 값이 없이게 사용불가 error
// 	a1 = null; //현재 num06 = null이라는 값이 저장되었으나 주소영역인 heap영역에 저장되지않았다.

		a1 = new person(); // person class에 대해 지정
		a1.num06 = 30; // person class의 num06을 30으로 변수 초기화
		System.out.println(a1.num06); // 호출

//==================================================================================================================================================

		// [1단계:개념] 4. 배열에서 사용하는 구성요소와 선언 및 할당 처리를 기본 예제와 함께 설명하세요.

		int[] num10 = { 10, 100, 1000 }; // num10이라는 3개의 칸이있는 배열에 10,100,1000을 순서대로 지정
		// int num10[] = 으로도 사용가능
		String[] num11 = new String[3]; // 해당 코드로 3개의 칸을가진 문자열 배열 추가
		num11[0] = "사자";
		num11[1] = "호랑이";
		num11[2] = "코끼리";
		for (int num12 = 0; num12 < num11.length; num12++) {
			System.out.println(num11[num12]);
		}

//====================================================================================================================================================		

		// [1단계:코드] 5. 유럽챔피언스리그 팀과 성적을 배열로 선언하고 출력하세요.
		String[] team = { "리버풀", "바르셀로나", "첼시" };
		String[] grade = { "1Rank", "2Rank", "3Rank" };
		for (int num13 = 0; num13 < team.length; num13++) {
			System.out.println(team[num13] + "의 성적권은 " + grade[num13]);
		}

		// ====================================================================================================================================================

		// [1단계:코드] 6. 학생3명의 이름과 국어 점수를 배열로 선언하고 Scanner로 입력한 후, 출력하세요.
		Scanner scan = new Scanner(System.in);

		String[] student = { "정명", "지은", "찌니" };
		int[] grade01 = { 50, 60, 70 };

		for (int num14 = 0; num14 < student.length; num14++) {
			System.out.println(student[num14] + "학생의 국어성적은 " + grade01[num14] + "점 입니다.");
		}

		// ====================================================================================================================================================
		// [3단계:코드] 7. 임시비번에 사용할 임의의 데이터를 입력후(갯수 입력 후 문자입력), 문자 5개로 구성된 임시 비밀번호를
		// 생성출력하세요.
		Scanner scan2 = new Scanner(System.in);
		System.out.println("필요한 임시 비밀번호 갯수 입력");
		int passwordCnt = Integer.parseInt(scan2.nextLine());
		String[] password = new String[passwordCnt];

		int random1[] = { 1, 2, 3, 4, 5 };
		String random2[] = { "가나", "나다", "다라", "라마", "마바" };
		int random3[] = { 6, 7, 8, 9, 0 };
		String random4[] = { "대한", "민국", "만세", "남한", "짱짱" };
		String random5[] = { "뷁", "궭", "붥", "홁", "옼" };

		for (int num16 = 0; num16 < password.length; num16++) {
			int randomcnt1 = (int) (Math.random() * random1.length);// 5
			int randomcnt2 = (int) (Math.random() * random2.length);// 5
			int randomcnt3 = (int) (Math.random() * random3.length);// 5
			int randomcnt4 = (int) (Math.random() * random4.length);// 5
			int randomcnt5 = (int) (Math.random() * random5.length);// 5
			System.out.println("No.1의 임시 비밀번호 : " 
			+ (random1[randomcnt1] 
			 + random2[randomcnt2] 
			 + random3[randomcnt3]
			 + random4[randomcnt4] 
			 + random5[randomcnt5]));
		}

	}

}
