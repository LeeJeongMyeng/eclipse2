package javaexp.a01_begin;

public class A04_VarBasic {

	public static void main(String[] args) {
		// 숫자형 변수 선언
		
		int num01; // num01이란 변수에 정수를 할당 하겟다.
		num01 = 30; //데이터 30을 할당
		int num02 = 40; //num02를 40으로 할당
		String name= "홍길동"; //문자열 할당 ""사이에 할당값 넣을 것.
        System.out.println("이름:"+name);
        System.out.println("합산:"+(num01+num02));
        System.out.println("합산:"+num01+num02);
        //위 아래 ()유무에 따라 결과가 다름.
        
        //ex) 물건명(문자열), 가격(정수), 객수(정수)를 선언과 할당하고
//	해당 내용을 출력하세요
           String phone= "phone";
           int cost = 300000;
           int ea = 3;
           
           System.out.println("물건명:"+ phone);
           System.out.println("가격:"+ cost);
           System.out.println("갯수:"+ ea);
           System.out.println("계:"+(cost*ea));
           
 
        
        
        
	}

}
