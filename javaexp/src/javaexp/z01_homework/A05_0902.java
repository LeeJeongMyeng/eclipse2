package javaexp.z01_homework;

import java.util.Scanner;

public class A05_0902 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 //[1단계:개념] 1. switch case에 break문의 특징을 기술하세요.
             //해당 case가 실행되고나서 break를 만나면 switch조건문을 종료하고 결과값을 출력한다.
           
//[1단계:코드] 2. switch case문을 이용하여 1980~2010년생 생년입력받아 띠를 출력하세요
		Scanner sc02 = new Scanner(System.in);
		System.out.print("생년을 입력하세요");
		int num03 = sc02.nextInt();
		switch (num03) {
		case 1980: case 1992: case 2004:
			System.out.println("원숭이띠");
			break;
		case 1981: case 1993:case 2005:
			System.out.println("닭띠");
			break;
		case 1982: case 1994:case 2006:
			System.out.println("개띠");
			break;
		case 1983: case 1995:case 2007:
			System.out.println("돼지띠");
			break;
		case 1984: case 1996:case 2008:
			System.out.println("쥐띠");
			break;
		case 1985:case 1997:	case 2009:
			System.out.println("소띠");
			break;
		case 1986:case 1998:
			System.out.println("호랑이띠");
			break;
		case 1987:case 1999:
			System.out.println("토끼띠");
			break;
		case 1988:case 2000:
			System.out.println("용띠");
			break;
		case 1989:	case 2001:
			System.out.println("뱀띠");
			break;
		case 1990:case 2002:
			System.out.println("말띠");
			break;
		case 1991:	case 2003:
			System.out.println("양띠");
			break;
		 default : System.out.println("잘못입력하셨습니다:");
         break;
		}
		
		

//[1단계:개념] 3. for문의 기본 구성요소를 기본 예제를 통하여 특징을 기술하세요.
		
		int num01 = 1;
		int num02 = 10;
    for(num01=1; num01<=10; num01++) {
    	// num01은 1부터 시작하여  10보다 같거나 작으면 반복문 실행하며  1씩커진다
    	System.out.println(num01*num02);
    	// num01은 num02와 곱한것을 출력
    }
		         
//[1단계:코드] 4. for(기본) - 200에서 3씩 차감하여 100까지 차감된 데이터를 출력하세요
    
    int num031 = 0;
    for(num031=200; num031>=100; num031-=3) {
    	System.out.print("\t"+num031);
  
    }
    
//[1단계:코드] 5. for(지역/전역) - 곰돌이가 하루 빵을 2개씩 증가해서 먹어
    //(첫째날 2개, 둘째날 4개, 셋째날 6개 ...) 총 10일 동안 먹은 빵의 갯수를
    //누적하여 아래와 같이 출력하세요
            //   # 출력 형식
		
    int bread = 2;
    int day=0;
    int total=0;
    for(day = 2; day<=10; day++) {
    	int totbread = bread*day;
    	total+=totbread;
    	 //   1일차 2개 2개
        //   2일차 4개 6개
        //   3일차 6개 12개
    	System.out.println(day+"일째\t"+totbread+"개\t"+"오늘까지해서 총 "+total+"개");
    }
    	

               
// [1단계:코드] 6. for을 이용하여 3,6,9게임을 출력하세요(20까지)- 3의 배수가
//               아닌 3의 이란 말이 포함될 때.
		
		int googoo = 0;
		int cnt = 0;
		for(cnt=1; cnt<=20; cnt++) {
			if(cnt%10==3) {
				System.out.println("짝!");
			}else if(cnt%10==6) {
				System.out.println("짝!");
			}else if(cnt%10==9) {
				System.out.println("짝!");
			}else {
				System.out.println(cnt);
			}
		}
		
//[1단계:개념] 7. 반복문에서 break와 continue의 차이점을 기본 예제를 통하여 기술하세요
		
		for(int cnt1=1; cnt1<=10; cnt1++) {
			if(cnt1==5) break;
			System.out.print(cnt1+",");
		}
		//break는 조건이 ture가 되면 반복문이 종료
		for(int cnt1=1; cnt1<=10; cnt1++) {
			if(cnt1==5) continue;
			System.out.print(cnt1+",");
			}
		//continue는 조건이 ture가 되면 해당 조건만빼고 반복문 실행된다.
		
// [1단계:개념] 5. while문의 기본 형식을 예제를 통해 설명하세요.
		
		int num04 = 0;
		while(num04<=10) {
			System.out.println(num04++);
		}
		
		// while(조건){}  조건안의 내용이 true이면 중괄호안의 내용을 반복한다.
		// false가 되면 종료.

//[3단계:코드] 6. while문을 이용해서 학생의 점수를 등록하고 총점과 평균을 
		//               출력하되, 등록을 종료시 -1를 입력해서 처리하세요.
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println("sdsdsd");
		
		int name12 = scan.nextInt();
		
	
	
	}
}
 
 



