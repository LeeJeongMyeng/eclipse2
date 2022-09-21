package javaexp.homeworkExp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//import homework_review.UnsupportedEncodingException;

public class A18_0920 {

	public static void main(String[] args) {
		/*
[1단계:개념] 1. String 문자열 byte데이터부터 만들어지는 과정을 기술해보자.
byte[] bytes = {1,2,3,4,5,6};
// 코드값배열<==>문자열
 	String str10 = "하이! 맨!";
 	
 	//문자열을code값으로 가져오는방법
 	byte[] arr10 = str10.getBytes();
 	//코드값 배열을 문자열로 처리
 	String str11 = new String(arr10); 
 	
 	sysou((int)'a',"!");
 	 
[1단계:코드] 2. 한글 무지개 색상 첫자를 코드값을 확인하여 임의의 색상 5가지를 문자열로 만들어 출력하세요.
/*
  #처리 순서
  1. 색상 문자열 선언
  2. getBytes byte배열로 확인
  		새로생성할 임의 색상 배열선언. 
  3. for 5호출 및 랜덤  호출
  	  임의 색상 코드값 배열에 할당.
  4. String(newByte) 할당 후 출력.
 */
		// 원노트 0920숙제 페이지 참고해서 공부
		
		String rbColor = "빨주노초파남보";
		byte [] rbCodes = rbColor.getBytes();
		// 배열로 위 색상의 한글코드값을 저장.
		byte [] ranCode = new byte[5];
		for(int cnt=1;cnt<=5;cnt++) {
			int randomColorIdx = (int)(Math.random()*rbCodes.length);
			byte codeVal = rbCodes[randomColorIdx];
			System.out.println(cnt+"번째: "+(char)codeVal);
			ranCode[cnt-1] = codeVal;
			}
		String ranColor = new String(ranCode);
		System.out.println("임의의 5가지 생상:"+ranColor);
		
		/*
[1단계:코드] 3. Hello! 자바!를 한글 encoding방식 euc-kr와 utf-8로 설정하여 문자열로 출력하세요.
			import java.io.UnsupportedEncodingException;
			public static void main(String[] args) throws UnsupportedEncodingException {
		String hello="안녕하세요";
		System.out.println(hello.getBytes("euc-kr"));
		System.out.println(hello.getBytes("utf-8")); }
			
			
[1단계:개념] 4. 오늘 진행한 문자열 관련 기능메서드의 기능을 기본예제와 함께 정리하세요.
					1. replace("찾는 문자열","변경할 문자열")
					String Exp04="안녕하세요";
					String newExp04 = Exp04.replace("하세요", "하십니까");
					
					2. substring("추출할시작위치(0~), 추출할 마지막 위치(1~))
		 					지정한 위치 범위의 문자를 추출
					String Exp04="안녕하세요";
					String getExp04 = civilNum.substring(0,2);
					system.out.println(getExp04);
					
					3. split("구분자") : 특정문자열을 구분자에 의해 구문하여 구분된 데이터를 배열로 처리한다.
					String[] Exp05="사과&바나나&딸기".split("&");
					System.out.println(fruits[0]); //사과 출력됨

[1단계:코드] 5. switch case문을 활용하여 주문할 메뉴 짜장면, 짬뽕, 탕수육 입니다. indexOf를 사용하여 해당 메뉴가 있으면, @@번 메뉴 주문하였습니다.
             없으면 없는 메뉴입니다로 표시하세요.
             		Scanner sc02 = new Scanner(System.in);
	
		
		String[] arr = {"짜장면","짬뽕","탕수육"};
		String menuName = "";
		
		System.out.println("메뉴 입력하세요");
		System.out.println("1번 메뉴: 짜장면 \t2번 메뉴:짬뽕\t3번 메뉴:탕수육");	

		String menu1 = sc02.nextLine();
		String getmenu = menu1;
		System.out.println(getmenu);
		
		switch (getmenu) {
        case "jja": 
        int menuNum01 = Arrays.asList(arr).indexOf("짜장면");
        System.out.println((menuNum01+1)+"번 메뉴 주분완료되었습니다.");
                 break;
        case "Jjam":  
        	int menuNum02 = Arrays.asList(arr).indexOf("짬뽕");
            System.out.println((menuNum02+1)+"번 메뉴 주분완료되었습니다.");
                 break;
        case "Tang":  
        	int menuNum03 = Arrays.asList(arr).indexOf("탕수육");
            System.out.println((menuNum03+1)+"번 메뉴 주분완료되었습니다.");
                 break;
       default : menuName="해당 메뉴는 존재하지 않습니다.";
		}
             
[1단계:코드] 6. 다음과 같은 고등학교 학번을 아래 형식을 기준으로 입력받아 @@고등학교 @@학년 @@반 @@@로 출력하세요
              형식  "세화030523홍길동" ==> 세화고등학교 03학년 05반 23번 홍길동
              String str01= "세화030523홍길동";
		String school = str01.substring(0,2);
		String grade = str01.substring(2,4);
		String stuClass = str01.substring(4,6);
		String stuNum = str01.substring(6,8);
		String stuName = str01.substring(8,11);
		
		System.out.println(school+"고등학교 "+grade+"학년 "+stuClass+"반 "+stuNum+"번   이름:"+stuName);
		
[1단계:코드] 7. 사과&3000&2-딸기&12000&3-오렌지&3000&3를 split을 이용해서 단위별로 출력(이중 for문 활용)하세요
	
		String[] fruits="사과&3000&2-딸기&12000&3-오렌지&3000&3".split("-");
		System.out.println("#과일#");
		for(String fruit:fruits) {
			System.out.println(fruit);
			for(int cnt=0; cnt<3;cnt++) {
			// for(String fruit2:fruit) 도 사용가능
				String[] cnt1 = fruit.split("&");
				System.out.println(cnt1[cnt]);
			}
		}
[1단계:개념] 8. StringTokenizer의 기능 메서드를 기술하세요
			#StringTokenizeer("문자열","구분자") 객체활용
			 1. 기능메서드
			  countTOKENS():구분자를 통해 나온 데이터의 건수
			  nextToken() : 구분자를 통해서 나온 각 데이터 하나씩, 
			  				호출시 마다 하나씩 데이터를 가져온다.
			  hasMoreTokens():해당 데이터가 있을때, true
			  
[1단계:개념] 9. StringBuffer를 문자열 추가시, 사용하는 이유와 주요 기능 메서드를 기술하세요.
			//	String의 변수 사용시 크기가 고정이되어 수정이 불가능할 때에,Stringbuffer를 씀으로써 내용을 변경하기 위함
			 1) append(...) //문자열 붙히기
		  	2) insert(int offset,...) //문자열 추가하기
		  	3) delete(int start,int end) :범위를 정해서 삭제
		  	4) deleteCharAt(int index) : 특정한 위치 문자 삭제
		  	5) replace(int start, int end, String str) : 특정한 문자 위치를 대체
		  	6) reverse() : 문자열을 뒤집어 사용
		  	7) setCharAt(int ixdex, char ch) : 특정한 위치의 문자를 대체
		/*  	
[1단계:코드] 10. StringBuffer로 두 팀의 임의의 주사위 던지기 10회 내용과 결과를 저장하고, 마지막에 출력하세요.
              no  홍  청  결과
              1   3   4  청승
              2   4   4  무
		1) StringBuffer sbf초기선언
		2) 반복문 for 1~10
		3) 홍팀과 청팀 점수 임의(1~6)
			int red = (int)(Math.random()*6+1);
			int blue = (int)(Math.random()*6+1);
			String rs = red>blue?"홍승":(blue>red?"청승":"무승부");
			sbf.append(cnt+"\t"+red+"\t"+blue+"\t"+rs+"\n");
			
		4) 반복문 후, 출력
			sbf.toString();
			*/
		String tlt="no\t홍\t청\t결과\n";
		StringBuffer sbf = new StringBuffer(tlt);
		for(int cnt=1;cnt<=10;cnt++) {
			int red = (int)(Math.random()*6+1);
			int blue = (int)(Math.random()*6+1);
			String rs = red>blue?"홍승":(blue>red?"청승":"무승부");
			sbf.append(cnt+"\t"+red+"\t"+blue+"\t"+rs+"\n");
		} 
		System.out.println(sbf.toString());
/*
[1단계:개념] 11. Wrapper클래스란 무엇인가? 유형과 형식을 기술하세요
				기본 유형의 데이터를 Wrapper객체로 변환처리하여 포장(boxing)하며 사용시 Unboxing으로 추출
				-byte,char,chort,int,long,float,double,boolean 유형이있으며
				- boxing시 첫문자를 대문자로 하여 사용하지만 (byte==>Byte 등..)
				- 다음 두가지만 긴 문자형식으로 사용한다(char==>Character/ int==>Integer)
				
				// 유형
				 *Integer obj1 = Integer.valueOf(1000);
				 *char c01 ='A';
					Character obj06 = new Character(c01);
				* ArrayList<Integer> iList = new ArrayList<Integer>();
				* iList.add(new Integer(25)); //박싱
				* iList.add(50); //오토박싱
				Integer obj04 =1000; //오토박싱
			
[1단계:개념] 12. boxing과 auto boxing, unboxing, auto unboxing의 개념을 예제를 통해서 기술하세요
					Byte num01 = Byte.valueOf("25"); //박싱
					byte num04 = num01.byteValue(); //언방식
					
					Integer num02 = 30; //오토박싱
					int num03 = num02; //오토 언박싱
					
					

[1단계:코드] 13. Scanner nextLine()으로 문자열로 두개의 수를 입력 받아서 Boxing으로 Wrapper객체를 만든 후, 다시 Unboxing으로 합산된 결과를 출력하세요.
	
	Scanner sc1 = new Scanner(System.in);
	System.out.println("첫번째 입력을 해주세요");
	String num05 = sc1.nextLine();
	System.out.println("첫번째 입력값: "+num05);
	System.out.println("두번째 입력을 해주세요");
	String num06 = sc1.nextLine();
	System.out.println("두번째 입력값: "+num06);
	//선생님이 하신것
	 Integer setnum05 = Integer.valueOf(num05);
	 Integer setnum06 = Integer.valueOf(num06);
	 int getnum05 = setnum05;
	 int getnum06 = setnum06;
	 
	 
	Integer setnum05 = Integer.parseInt(num05);
	Integer setnum06 = Integer.parseInt(num06);
	
	int getnum05 = setnum05.intValue();
	int getnum06 = setnum06.intValue();
	System.out.println("#결과# :  "+(getnum05+getnum06));
[1단계:코드] 14. ArrayList로 임의의 수학점수(0~100) 정수형데이터 반복문에 의해 5개 데이터를 나오게 한후, autoBoxing에 의해 할당처리하세요.
		
		//기본 정수 ==> autoBoxing에 의해서 Wrapper할당.
		Integer numObj = (int)(Math.random()*101);
		System.out.println("Auto Bxoing:"+numObj;
		ArrayList<Integer> iList = new ArrayList<Integer>();
		//Integer형태의 객체가 ArrayList로 만들어진 구조
		//iList.add(new Integer((int)(Math.random()*101));
		 * 
		 * 
		for(int cnt=1; cnt<=5;cnt++){
		 iList.add((int)(Math.random()*101));
		 System.out.print.ln(iList);
		 }
		
		
		
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		ArrayList<Integer> randomList = new ArrayList<>();
		for(int cnt=1;cnt<=100;cnt++) {
			arrayList.add(cnt);
			
		}
		int[] arrayTest = new int[5];
		for(int cnt1=0;cnt1<=4;cnt1++) {
			
			arrayTest[cnt1] = (int)(Math.random()*arrayList.size());
			System.out.println(arrayTest[cnt1]);
			randomList.add(Integer.valueOf(arrayTest[cnt1]));
		
		}
		
		int getrandomNum01 = arrayTest[0];
		int getrandomNum02 = arrayTest[1];
		int getrandomNum03 = arrayTest[2];
		int getrandomNum04 = arrayTest[3];
		int getrandomNum05 = arrayTest[4];
		System.out.println("====언방싱=======");
		System.out.println(getrandomNum01);
		System.out.println(getrandomNum02);
		System.out.println(getrandomNum03);
		System.out.println(getrandomNum04);
		System.out.println(getrandomNum05);
[1단계:코드] 15. Random 클래스를 이용해서 3과목의 점수를 임의로 출력하세요.
				Random r1 = new Random();
		Random r2 = new Random();
		Random r3 = new Random();
		System.out.println("1과목:"+r1.nextInt(100));
		System.out.println("2과목:"+r2.nextInt(100));
		System.out.println("3과목:"+r3.nextInt(100));

== 평가대비(자바) 객관식 문제 ==
1. 문자열의 생성자 매개변수로 올 수 없는 데이터 유형은 ?
1) byte[] 2) char[] 3) short[] 4) int[]


2. 문자열안에 특정 문자열을 찾을 때, 사용하는 메서드는?
1) charAt() 2) indexOf() 3) length() 4) substring()


3. StringTokenizer에서 사용되는 주요메서드가 아닌 것은?
1) length() 2) countTokens() 3) nextToken() 4) hasMoreTokens()


4. 다음 중 StringBuffer에서 특정한 위치의 문자열을 대체하는 메서드는?
1) append() 2) replace() 3) setCharAt() 4) insert()


5. 다음 중 Wrapper클래스의 선언이 적절하지 않는 것은?
1) Double 2) Boolean 3) Char 4) Integer


정답 : 3,2,1,2,3

== 평가대비(알고리즘) 객관식 문제 ==
1. 문자열을 검색할 때, 검색하는 형식이 틀린 것은
    1) 
        boolean hasData=false;
        for(String mem : members){
            if(mem.indexOf(schStr) !=-1){
                hasData=true;
            }
        }
    2) 
        boolean hasData=false;
        for(String mem : members){
            if(mem.equals(schStr)){
                hasData=true;
            }
        }
    3) 
        for(String mem : members){
            String result="";
            if(mem.indexOf(schStr) !=-1){
                result="검색됨";
            }
        }
    4)  String result="";
        for(String mem : members){
            if(mem.equals(schStr) ){
                result="검색됨";
            }
        }

정답 : 3
		 */

	}

}
