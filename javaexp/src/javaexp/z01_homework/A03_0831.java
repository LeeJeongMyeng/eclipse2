package javaexp.z01_homework;

import java.util.Scanner;

public class A03_0831 {

	public static void main(String[] args) {
		
		//2022-08-31
		//[1단계:개념] 1. Scanner객체의 사용방법을 예제를 통하여 기술하세요.
		
		 Scanner scan1 = new Scanner(System.in); 
		 System.out.println("당신은 누구인가요");
		 String name = scan1.nextLine();
		 System.out.println(name+"님 반갑습니다.");
		 
			
		//[1단계:코드] 2. Scanner객체를 활용하여 타율계산방법을 확인(검색)하고, 
		            	//선수명과 함께 입력데이터를 입력 받아 해당 타자의 타율을 출력하세요.
					Scanner scan2 = new Scanner(System.in);
					System.out.println("안타 몇번인가요");
				double anta = scan2.nextDouble();
					 Scanner scan3 = new Scanner(System.in);
					System.out.println("타수는 몇번인가요");
					double tasu = scan3.nextDouble();
					double  total1 = anta/tasu;
				 System.out.println("당신의 타율은 "+total1+"% 입니다.");
					
					
					
		            		
		//[1단계:개념] 3. 숫자형 문자열의 숫자 변환 형식을 예제를 통하여 기술하세요.
				  String num01 = "25.5";
				  double num02 = Double.parseDouble(num01);
				  System.out.println(num02);
				  
		
		//[1단계:코드] 4. args로 물건1 가격1 갯수1 물건2 가격2 갯수2로 입력받아 계산서를 출력하세요.
				  String thing1 = args[0];
				  int cost1 = Integer.parseInt(args[1]);
				  int count1 = Integer.parseInt(args[2]);
				  String thing2 = args[3];
				  int cost2 = Integer.parseInt(args[4]);
				  int count2 = Integer.parseInt(args[5]);
				  int total2 = cost1*count1;
				  int total3 = cost2*count2;
				  System.out.println(thing1+"의 가격은 "+cost1+"원 및 개수는 "+count1+"개이므로 총가격은"+total2+"원입니다.");
				  System.out.println(thing2+"의 가격은 "+cost2+"원 및 개수는 "+count2+"개이므로 총가격은"+total3+"원입니다.");
		
		 
		//[1단계:개념] 5. 연산자와 피연산자, 연산식의 개념을 예제와 함께 기술하세요.
		              //연산자는 사칙연산(+-/ * =) 등
		              // 피 연산자는 연산의 대상이 되는 데이터 변수,숫자 등
				  int num10 = 25;
				  int num11 = 3;
				  int total4 = num10*num11; // *가 연산자 num10,11이 피연산자
				  System.out.println(num10<=num11); // <=연산자  num10,11피연산자
				  System.out.println(total4==75); //=연산자 total4,23피연산자
		               
		//[2단계:코드] 6. 방어율 계산 방법을 찾아보고, 해당 항목을 입력받아 방어율을 출력하세요.
				             //방어율 = (총 자책점*9) / 총 던진 이닝수
				  double num12 = 55.0;
				  double ening1= 160.2;
				  double defense = (num12*9)/ening1;
				  System.out.println(defense);
		
		//[1단계:개념] 7. 연산자의 종류를 기본 예제와 함께 기술해보세요
						// 1.산술 연산자 = +- *,/,%
						// 2. 부호 = !=
						// 3. 문자열 + 문자열을 이어주는 역할
						// 4. 대입연산자 
						 int num13 = 25;
						int num14 = num13+1;
						System.out.println(num14);
						
						//5.증감 대입 연산자
						  int num15 = 2;
						  System.out.println(++num15);
						  System.out.println(--num15);
						  System.out.println(num15+=2);
						  System.out.println(num15-=3);
						  System.out.println(num15*=100);
						  System.out.println(num15/=20);
						
						  //6. 비교연산자 boolean
						  //	< > == != <= >=
						  int num16 = 27;
						  int num17 = 28;
						  System.out.println(num16<num17);
						  System.out.println(num16>num17);
						  System.out.println(num16<=num17);
						  System.out.println(num16<=num17);
						  System.out.println(num16==num17);
						  System.out.println(num16!=num17);
						  
						  // 7.논리연산자
                           // 비교연산자가 두개일때 사용
						  int num18 = 30;
						  System.out.println(num18>= 20 && num18<=40);
						  //두개다 true여야 true
						  System.out.println(num18>= 31 || num18>=29);
						  //하나라도 true면  true
						  
						  
						  
						 
	//	[2단계:코드] 8. 아래와 같은 일일 가계부를 처리할려고 한다. 초기 잔액 10000
		             // Scanner를 통해 입력에 필요한 연산식을 만들고 아래 형식으로 출력하세요
		    // 날짜   내용   입금액    출금액     잔액
		     // 8/31  용돈   30000    0        40000
		     // 9/1   식사       0    5000     35000
						  
						  Scanner num19 = new Scanner(System.in);
						  System.out.println("몇월입니까?");
						  int num20 = num19.nextInt();
						  
						  Scanner num21 = new Scanner(System.in);
						  System.out.println("몇일입니까?");
						  int num22 = num21.nextInt();
						  
						  Scanner num23 = new Scanner(System.in);
						  System.out.println("뭡니까");
						  String num24 = num23.nextLine();
						  
						  Scanner num25 = new Scanner(System.in);
						  System.out.println("얼마있습니까?");
						  int num26 = num25.nextInt();
						  
						  Scanner num27 = new Scanner(System.in);
						  System.out.println("얼마입니까?");
						  int num28 = num27 .nextInt();
						  
						  int total10 = num26-num28;
						
	
						  Scanner num29 = new Scanner(System.in);
						  System.out.println("몇월입니까?");
						  int num30 = num29.nextInt();
						  
						  Scanner num31 = new Scanner(System.in);
						  System.out.println("몇일입니까?");
						  int num32 = num31.nextInt();
						  
						  Scanner num33 = new Scanner(System.in);
						  System.out.println("뭡니까");
						  String num34 = num33.nextLine();
						  
						  Scanner num35 = new Scanner(System.in);
						  System.out.println("얼마있습니까?");
						  int num36 = num35.nextInt();
						  
						  Scanner num37 = new Scanner(System.in);
						  System.out.println("얼마입니까?");
						  int num38 = num37 .nextInt();
						  
						  int total11 = num26-num38;
						  
						  System.out.println("날짜\t내용\t입금액\t출금액\t잔액");
						  System.out.println(num20+"/"+num22+"\t"+num24+"\t"+num26+"\t\t\t"+num28+"\t"+total10);
						  System.out.println(num30+"/"+num32+"\t"+num34+"\t"+num36+"\t\t\t"+num38+"\t"+total11);
						
						  
		      /*
		[2단계:코드] 9.구매하는 김밥의 갯수를 선언하고, 1씩 증가하여 김밥의 단가(2500) 아래와
		 					같이 출력
		      김밥 1개 구매  2500 
		      김밥 2개 구매  5000
		      김밥 3개 구매  10000
		      */
		      int gimbab = 1;
		      System.out.println((gimbab++)*2500);
		      System.out.println((gimbab++)*2500);
		      System.out.println((gimbab++)*2500);
		    /*  
		[1단계:개념] 10. 비교연산자의 종류를 예시와 함께 기술하세요.
		*/
		      
	}

}
