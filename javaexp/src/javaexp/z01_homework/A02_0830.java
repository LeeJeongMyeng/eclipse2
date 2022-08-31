package javaexp.z01_homework;

public class A02_0830 {

	public static void main(String[] args) {
//      2022-08-30
//      [1단계:개념] 1. 기본 출력형식과 특수문자에 대하여 예제를 통해 기술하세요
		//메서드
		System.out.println("하이"); //줄바꿈 포함
		System.out.print("하이"); //줄바꿈 포함x
		//출력처리 내용
		System.out.println("하\t이"); // 탭간격 처리
		System.out.println("하\n이"); // 불바꿈 처리
		System.out.println(" \"안녕\""); 
		// ""를 문자열 처리할때 "앞에 \를 붙힌다.
		
//      [1단계:개념] 2. 변수명의 선언 규칙을 예제를 통하여 기술하세요.
		//int num01; (o) int 10num; (x)
		// 변수명에 _,$ 를 제외한 특수문자는 허용되지않는다
	    // int $num19; (o)
		
		// 대소 문자는 구분하여 다른 변수명으로 인식한다.
		// int num19;  int nuM19; 는 다른것
		
		//명령어 (내장 keyword)는 변수명으로 사용하지 못하지만
		//뒤에 숫자를 붙히면 사용가능
		// int if; (x)  int if19; (o)
		
		//합성어는 대분자로 구분하여 사용한다.
		// String setName;
		
		
//      [1단계:코드] 3. 21억, 15억 데이터를 int에 할당하고,
		                  //합산결과를 변수를 선언하여 할당 출력하세요
		int num01 = 2100000000;
		int num02 = 1500000000;
		int num03 = num01+num02;
		long num04 = (long)num01+(long)num02;
		System.out.println(num04);
		
		
		
//      [1단계:개념] 4. 150라는 데이터는 기본데이터유형 중에 어디에 할당이
							//가능한가를 기술하고 그 이유에 대하여 설명하세요
		// byte형에만 들어가지않는다. (150은 byte의범위인 1byte를 초과함)
		// byte는 -128~127까지만 들어감
	// byte num05 = 150; //에러남
	short num06 = 150;
	int num07 = 150;
	long num08 = 150;
	
	//System.out.println(num05);
	System.out.println(num06);
	System.out.println(num07);
	System.out.println(num08);
	
//      [2단계:코드] 5. 알파벳의 코드값 범위와 문자 0부터 9까지 범위의
							//코드값 범위를 확인하고 출력하세요.
	int num09 = '0';
	int num10 = '9';
	System.out.println(num09); // 48
	System.out.println(num10); //57
	
	int num11 = 'A';
	int num12 = 'Z';
	int num13 = 'a';
	int num14 = 'z';
	System.out.println(num11); //65
	System.out.println(num12); //90
	System.out.println(num13); //97
	System.out.println(num14); //122
	
//      [1단계:개념] 6. 형변환 두가지 유형을 예제를 통해서 기술하고 설명하세요..
	// 1. 자동형변환 promotion 작은데이터유형의 데잍터를 큰유형에 할당할때.
	//                                 주로 발생, 별다른 처리없이 데이터를 할당하여 변경
	int num15 = 10;
	double num16 = num15;
	System.out.println(num16);
	// 2. 강제형변환 casting
	
//      [1단계:코드] 7. 500cc의 오렌지쥬스를 3잔에 나누어 할당할려고 한다. 
						   //소숫점 이하가 처리된 경우와
//                      소숫점 이하가 처리되지 않는 경우를 나누어 코딩하세요
	 int num17 = 500;
	 int num18 = 3;
	 System.out.println(num17/num18);
	 System.out.println((double)num17/num18);
	 
	 

	}

}
