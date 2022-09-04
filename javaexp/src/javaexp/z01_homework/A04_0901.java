package javaexp.z01_homework;

import java.util.Scanner;

public class A04_0901 {

	public static void main(String[] args) {
		
		//0901과제
//		[1단계:개념] 1. 증감연산식의 앞에 ++, 뒤에 ++의 차이점을 예제를 통하여 기술하세요.
				//앞은 바로 증가되어 처리 뒤는 마지막에 증가처리하여 다음 호출시 나타나짐
		
				/* int cnt =1;
				 System.out.println(++cnt); //2출력
				 int cnt1 = 2;
				 System.out.println(cnt1++); //1출력
				 System.out.println(cnt1); //2출력
*/			 
//		[1단계:개념] 2. Math.random()을 통해 임의의 정수를 처리하는 공식을 예제를 통해 기술하세요.
				 //0.0 <= Math.random() <1.0
				 //정수의 범위를 임의로 처리하는 공식
				 //(int)(Math.random()*경우의수 + 시작수)
				 
//		[1단계:코드] 3. 임의의 점수(0~100)처리하고 아래와 같이 비교 
// 							연산식을 이용하여 boolean(true/false) 처리하세요
		/*
				 int pt = (int)(Math.random()*100);
//		   1) 점수를 지정하여 A학점(90이상 경우) 여부를 출력하세요
				 System.out.println("점수 : "+(pt));
				 System.out.println("A학점여부 : "+(pt>=90));				 
//		   2) 점수를 지정하여 60점 미만인 경우 과락이면, 과락여부를 출력
				 System.out.println("과락여부 : "+(pt<90));
			*/	 
				 
//		[1단계:개념] 4. 단항연산자, 이항연산자, 삼항 연산자의 차이점을 개념과 예제를 통해 기술하세요.
				//단항연산자 : +25, -25, -num01
				// 				 ++cnt, cnt--, cnt+=2
				//이항연산자: 25+3, num01 +num02 ..
				//삼항연산자 : 조건?true일때:false일때
				// 					point>=60?"합격":"불합격"
				 
//		[2단계:코드] 5. 삼항연산자를 이용하여 놀이공원에 입장료가 50000원 일 때, 
//							나이가 6미만이거나 65세 이상일 때는 무료,
//		      			  14~17일 때는 청소년 요금으로 20%할인이 된다.
//  						 나이에 따라 무료여부와, 청소년요금제 여부를 처리하고, 총비용을 출력하세요
		/*		 int pay = 50000;
				 int age = (int)(Math.random()*80+1);
				 System.out.println("나이: "+age);
				 System.out.println(age<6 || age>=65?"무료":"유로");
				 System.out.println(age>=14&&age<=17?"청소년 요금":"일반요금");
				 
				double discount = age<6 || age>=65?1.0:(age>=14&&age<=17?0.2:0.0);
				System.out.println("할인율: "+(int)(discount*100)+"%");
				//pay=pay-(int)(pay*discount);
				pay-=(int)(pay*discount);
				System.out.println("총비용:"+pay);
			*/	 
				 
//		[1단계:개념] 6. main()에서 데이터의 기본 흐름 방향을 기술하고, 조건문이 처리되는 형식에 따른
//		            플로우를 설명하세요.
		// 기본플로우 위에서 아래로, 왼쪽에서 오른쪽으로 흐름처리가 된다.
		//  단, 대입 연산자일 경우에는 data가 오른쪽에서 왼쪽으로 대입이 된다.
		// 조건문인 경우에는 해당 조건이 true인 경우에 플로우가 진행처리된다.
		// 반복문인 경우에는 반복 조건이 true인 경우에만 반복을 수행
				
//		[1단계:코드] 7. 컴퓨터로 하여금 구슬을 1~7개를 임의로 쥐게 하고, 내가 Scanner를 통해 홀/짝을 입력하여,
//		      맞으면 승, 틀리면 패로 처리하세요.
		/*
				int bool = (int)(Math.random()*7+1);
				Scanner sc = new Scanner(System.in);
				System.out.println("# 홀짝게임 #");
				System.out.print("홀짝을 선택해주세요");
				String Mychoice = sc.nextLine();
				System.out.println("컴퓨터의 개수:"+bool);
				String comch = "홀"; //컴퓨터의 값을 초기로 홀
				if(bool%2==0) comch = "짝";
				//삼항연산자로 풀이
			//	String comch2 = bool%2==0?"짝":"홀";
				if(Mychoice.equals(comch)) {
					System.out.println("승리");
				}else {System.out.println("패배");
				}
				
				
//				[3단계:코드] 8. 두명의 친구(이름입력)가 주사위 2개로 게임을 진행하였다. 결과를 표시하세요 
				
				Scanner sc02 = new Scanner(System.in);
				System.out.println("# 주사위 게임 #");
				System.out.println("# 1번 주자 입력 #");
				String name01 = sc02.nextLine();	
				System.out.println("# 2번 주자 입력 #");
				String name02 = sc02.nextLine();
				int name01Dice = (int)(Math.random()*6+1);
				int name02Dice = (int)(Math.random()*6+1);
				System.out.println(name01+"의 주사위 개수는 "+ name01Dice+"개");
				System.out.println(name02+"의 주사위 개수는 "+ name02Dice+"개");
				String result = name01Dice>name02Dice?name01+"승":
					(name01Dice<name02Dice?name02+"승":"무승부");
				System.out.println("결과: "+result);
				*/
//				[1단계:코드] 9. 컴퓨터가 가위, 바위, 보를 내게 하고, 내가 가위 바위 보를 Scanner을 냈을 때, 승/무/패가
//				      되게 조건 처리하세요.
			
				
				}
				
				
				}
	

