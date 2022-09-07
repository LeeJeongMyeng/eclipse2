package javaexp.z01_homework;

import java.util.Scanner;

public class A07_0906 {

   public static void main(String[] args) {
      // a0905.a06_object 패키지 참고 할 것
      
      
//       [1단계:개념] 1. 문자열 객체 생성 형식 2가지를 기술하고, heap영역 사용의 차이점을 기술하세요.
      String id = "이정명";
      String id2 = "이정명";
      // "이정명"이라는 문자열에 포커스를 하고, heap영역에는 동일한 주소를 할당하고 id,id2에서 호출하여 사용한다.
   
      String id3 = new String("이정명");
      String id4 = new String("이정명");
      // new String이라는 선언에 대해 포커스
      // new라는 키워드를 사용하는 순간  heap 영역에는 서로 다른 주소를 할당한다.
      
       
       /*
[3단계:코드] 2. 문자열 배열로 5개의 회원아이디를 선언/할당 하고, Scanner를 통해서 등록된 아이디가 있는지 여부를 확인하는 프로그램을 처리하세요
              - 온라인에서 회원등록시, 동일한 회원 아이디 등록여부 check
              ex) 회원아이디입력:@@@ 
                  등록된 아이디가 있습니다..
                  등록 가능한 아이디입니다.
                  */
      /*
        Scanner scan01 = new Scanner(System.in);
        String ID01 = "aa0001";
        String ID02 = "bb0001";
        String ID03 = "cc0001";
        String ID04 = new String("dd0001");
        String ID05 = new String("ee0001");
   
        
        
       while(true) { 
    	   System.out.print("회원 아이디 입력 : ");
           String JoinID = scan01.nextLine();
        if(!JoinID.equals(ID01)&&!JoinID.equals(ID02)&&!JoinID.equals(ID03)&&!JoinID.equals(ID04)&&!JoinID.equals(ID05)) {
           System.out.println("입력하신 ID는 회원가입이 가능한 ID입니다.");
           break;
        } else {
           System.out.println("입력하신 ID는 중복이므로 가입이 불가합니다.");
        }
       }
    */
      String[] members ={"aa1111","bb2222","cc3333","dd4444","ee5555"};
      Scanner scan10 = new Scanner(System.in);
      
      while(true) {
    	  System.out.println("ID를 입력하세요");
    	  String Joinmember = scan10.nextLine();
    	  boolean hasId = false; //아이디가 없는것을 초기로 설정
    	  for(int idx=0;idx<members.length;idx++) {
    		  //배열을 체크해서 하나라도 있으면 hadId를 true로 처리
    		  if(Joinmember.equals(members[idx])) {
    			  hasId = true;
    		  }
    	 }
    	  if(!hasId) {
    		  System.out.println("입력한 아이디는 등록 가능합니다.");
    		  break;
    	  }else {
    		 System.out.println("해당 아이디는 중복입니다. 다시입력해주세요");
    	  }
      }
      
       
        /*
[1단계:개념] 3. 클래스와 객체의 개념와 차이점을 예제와 함께 기술하세요.
         // class는 설계도와 같이 구성요소들을 선언해 놓음
         // 객체는 선언해 놓은 class의 요소들을 가져와 적용시켜 만든 것.
          */
/* [1단계:개념] 4. 클래스의 구성요소를 각각의 기능과 내용을 예제를 통해서 기술하세요
            1. 필드: 객체의 데이터가 저장되는 곳   class ex01{ ==field==}
            2. 생성자 : 객체 생성시 초기화 역할 담당 
               1)      Computer02(){} //클래스는 여러 유형의 생성자를 선언할 수 있다. (같은 이름의 생성자라도, 순서 및 변수타입 등이 다르면 중복가능)
               2)      Computer02(String maker2, String cluck2, int price2){
                        
            3. 메소드 : 객체의 동작에 해당하는 실행 블록
                  this.maker = maker2;
                  this.cluck = cluck2;
                  this.price = price2;
            */
            
            
//[1단계:코드] 5. 좋아하는 운동선수의 이름과 성적을 처리할 수 있는 클래스를 선언하고, 
//               객체 3개를 생성하여 선수의 정보를 할당/출력(main()에서)하게 하세요.
        
      /*
        sports01 sp1 = new sports01();
        System.out.println("선수명 : "+sp1.name01+"\t 점수 : "+sp1.Rank01);
        
        sports01 sp2 = new sports01();
        sp2.name01 = "Park";
        sp2.Rank01 = "S++";
        System.out.println("선수명 : "+sp2.name01+"\t\t 점수 : "+sp2.Rank01);
        sports01 sp3 = new sports01("Kim","B-");
        System.out.println("선수명 : "+sp3.name01+"\t\t\t 점수 : "+sp3.Rank01);
        
        */
               
            
//[1단계:개념] 6. default 생성자란 무엇이며, 사라지는 시점은 언제인가 기술하세요.
         // 클래스를 만든이후 생성자 없어도 사용이 가능한 것이 자바컴파일러가 자동으로 삽입시켜주는것을 
         //디폴트 생성자라고한다.
         // 사라지는 시점은 잘 모르겠습니다..ㅜㅜ
          
      
//[1단계:코드] 7. 생성자를 여러 개 선언할 수 있는 규칙이 무엇이라 하고, 이것이 가능한 이유를 예제를 통해 기술하세요.
                 //  sports sp1 = new sports();
       /*
        System.out.println("선수명 : "+sp1.name01+"\t 점수 : "+sp1.Rank01);
        
        sports01 spprofile = new sports01();
        spprofile.name01 = "Park";
        spprofile.Rank01 = "S++";
        System.out.println("선수명 : "+spprofile.name01+"\t\t 점수 : "+spprofile.Rank01);
        sports01 spprofile02 = new sports01("Kim","B-");
        System.out.println("선수명 : "+spprofile02.name01+"\t\t\t 점수 : "+spprofile02.Rank01);
         // 생성자는 매개변수의 갯수, 타입, 순서가 다르면 여러 개 선언이 가능하다.
          */
          
//[1단계:코드] 8. 아래의 클래스를 생성자를 통해서 초기값을 할당하고 필드를 출력하세요(단계별로 선언, 초기값-->main할당-->1개 매개 생성자할당-->여러개 매개 생성자할당)
//                  1) 볼펜(제조사,심두께), 음식(종류,가격), 산(이름, 위치,해발고도)
       /*
         pen pn = new pen();
         System.out.println("볼펜 제조사 : "+pn.penmaker+"\t심두께"+pn.pensize);
         
         food fd = new food();
         fd.foodname = "라면";
         fd.foodcost = 1500;
         System.out.println("음식 종류 : "+fd.foodname+"\t 가격 : "+fd.foodcost);
         
         mountain mt = new mountain("백두산",2744);
         System.out.println(" 산 이름 : "+mt.mtname+"\t 위치 : "+mt.location+"\t 산 높이 : 약"+mt.mtheight);
               
       */

   }

}

class sports01 {
   String name01 = "Lione messi";
   String Rank01 ="S+";
   
sports01(){}
   sports01(String name2, String Rank2){
      this.name01 = name2;
      this.Rank01 = Rank2;
   }
}

class pen {
   String penmaker = "모나미";
   String  pensize ="0.5mm";
}
 
class food {
   String foodname = "";
   int foodcost = 0;
}

class mountain {
   String mtname = "한라산";
   String location = "북위 41° 59′ 35.3″ 동경 128° 04′ 36.5";
   
   int  mtheight = 10000;
   mountain(String mtname,int mtheight){
   }
}
