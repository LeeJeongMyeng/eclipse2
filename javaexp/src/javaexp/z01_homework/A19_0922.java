package javaexp.z01_homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class A19_0922 {

	public static void main(String[] args) {
		/*
		 2022-09-22
[1단계:개념] 1. Stream이 무엇인지 기술하고, 자바의 대표적인 입출력 객체를 선언하세요.
		? : 키보드와 같은것으로 입력(Input)을하고,프로그램을 통해 모니터와같은 것으로 출력(output)을 하는 데이터 입출력행위
				System.in ==> console창을 통해 입력
				System.out.println() ==> console창을 통해 출력
				주로 콘솔창이나 파일을 통해 입력된 데이터,
				네트워크를 통해서 전송해오는 데이터를 읽고 쓸 때, 중간 객체로 
				이동하거나 전송 할때, 활용된다.
				
				
[1단계:코드] 2. InputStream을 이용하여, 70점 이상인지 여부를 확인하여 출력하세요.(byte ==> char ==> String ==> int 변환 필요) 

		public class Exp {
	public static void main(String[] args)  {
		InputStream epx = System.in;
		byte[] gradeArr = new byte[2];
		System.out.print("점수입력: ");
		try {
			epx.read(gradeArr);
			String inputGrade = new String(gradeArr); 			//byte[]==>char[] ==>String
			int intGrade = Integer.parseInt(inputGrade); 		// String => int 변환
			System.out.println(intGrade); //변환 잘되었는지 확인
			
			System.out.println("입력한 점수:"+intGrade);
			if(intGrade>=70) { 									//70점보다 높을 경우 합격
				System.out.println("합격입니다..");
			}else {
				System.out.println("불합격입니다..");
			}
			epx.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
						
[1단계:개념] 3. byte 기반 stream과  문자기반 stream의 내용과 차이점을 기술하세요.
		바이트기반 ==> InputStream,OutputStream 형식
				- 1byte입출력 가능한 스트림
				- byte로 구성된 그림,동영상,음악파일 처리 적합 스트림
		문자 기반 ==> Reader,Writer 형식
				- 2byte입출력으로 언어로 구성된 파일 처리 적합 스트림
		
[1단계:코드] 4. read(byte[])를 활용하여 웹기반 자바프로그램은 무엇인가?라은 질문에 jsp이면 정답 그렇지 않으면 오답으로 처리하세요.
								InputStream epx2 = System.in;
		byte[] Answer = new byte[3];
		System.out.print("자바프로그램은 무엇인가? ==> ");
		try {
			epx2.read(Answer);
			String inputAns = new String(Answer); //byte[]==>char[] ==>String
			
			System.out.println(inputAns); //변환 잘되었는지 확인
			
			System.out.println("입력한 답:"+inputAns);
			if(inputAns.equals("jsp")) { //70점보다 높을 경우 합격
				System.out.println("정답입니다.");
			}else {
				System.out.println("오답입니다..");
			}
			epx2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
[1단계:코드] 5. InputStreamReader를 이용하여 물건명, 가격, 갯수를 입력받고, 총계까지 출력하세요.
					Reader rd02 = new InputStreamReader(System.in);
		BufferedReader buy =new BufferedReader(rd02);
		try {
			//입력창
			System.out.println("구매물건(영어): ");
			String name = buy.readLine();
			System.out.println("구매갯수 입력: ");
			String count = buy.readLine();
			System.out.println("가격: ");
			String price = buy.readLine();
			
			//총계할 수 있도록 int타입으로 변환
			int incount = Integer.parseInt(count);
			int inprice = Integer.parseInt(price);
			
			//출력
			System.out.println("구매 물건: "+name);
			System.out.println("구매 개수: "+incount);
			System.out.println("개당 가격: "+inprice);
			System.out.println();
			System.out.println("물건 총계: "+(incount*inprice));
			
			rd02.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
[1단계:개념] 6. File객체/물리적파일의 생성방법을 기술하세요.
		#파일 생성시
			String 변수명1 = "생성하고자하는 파일위치\\파일명.확장자(java혹은 taxt 등)
			File 변수명2 = new File(변수명1)
			try {
					if(!변수명2.exists()) 변수명2.createNewFile(); //exists()로 파일 존재 유뮤 확인 후, 없다면(!) createNewFile()을 통해 생성
			}catch(IOException e) {
				e.printStackTrace();
			}
		#디렉토리 생성시 
			String 변수명3 = "생성하고자하는 파일위치\\파일명.확장자(java혹은 taxt 등)
			File 변수명3 = new File(변수명1) //디렉토리또한 파일종류이기에 파일로 명령함
			try {
					if(!변수명2.exists()) 변수명2.mkdir(); //exists()로 파일 존재 유뮤 확인 후, 없다면(!), mkdir() 을 통해 디렉토리 만듦.
			}catch(IOException e) {
				e.printStackTrace();
			}
[1단계:코드] 7. homework 패키지 하위에 z01_home,z02_home폴드를 만들고 그 하위에 각각 menual1.txt~menual10.txt 파일을 생성하세요
						String hfile01 = "C:\\a01_javaexp\\eclipse2\\javaexp\\src\\javaexp\\z01_homework\\z01_home";
		String hfile02 = "C:\\a01_javaexp\\eclipse2\\javaexp\\src\\javaexp\\z01_homework\\z02_home";
		File p1 = new File(hfile01);
		File p2 = new File(hfile02);
		
			if(!p1.exists()) p1.mkdir();//디렉토리 경로 설정
			if(!p2.exists()) p2.mkdir();//디렉토리 경로 설정
			
		// 해당 문구에서 try catch문을썼을 때 catch(IOException e){ e.printStackTrace();} 가 오류나는지 모르겠음..
//============================================================================================================		
		String[] fileList = new String[10];
		for(int cnt=0;cnt<=9;cnt++) {
			
		fileList[cnt] = "\"C:\\\\a01_javaexp\\\\eclipse2\\\\javaexp\\\\src\\\\javaexp\\\\z01_homework\\\\z01_home\\\\menual"
						+(cnt+1)+".txt\"";
		String A = fileList[cnt];
		System.out.println(A); //잘 출력되는지 확인함
		
		File file = new File(A);
		try {
			if(!file.exists()) file.createNewFile();
		
	}catch(IOException e) {
		e.printStackTrace();
	}
		} 
		
		//여기서 피드백 받아야함
		 
== 평가대비(자바) 객관식 문제 ==
1.  바이트 단위 입출력을 위한 최상위 입력 스트림 클래스는?
1) File 2) OutputStream 3) InputStream 4) Reader

답: 3번, 바이트= InputStream 문자=Reader

2.  아래 내용 중에 한글을 입력 처리해주는 Stream은 무엇인가?
1) InputStream 2) OutputStream 3) Writer 4) Reader
답: 4번  1) 바이트(1byte)단위 입력 2) 바이트단위 출력 3) 문자단위 출력 4)문자단위 입력

3. Reader객체의 하위 객체가 아닌 것은 무엇인가?
1) FileReader 2) BufferedReader 3) InputStreamReader 4) InputStream

답: 4번 1)2)3)번이 하위 객체이다.

4. 디렉토리에 포함되 파일 및 서브디렉토리 목록 배열로 리턴 File객체 하위의 기능메서드는?
1) list() 2) listFiles() 3) canRead() 4) getParentFile()

답:1번
1) 목록 배열 리턴
2) 목록 전체를 file배열로 리턴
3) 읽을 수 있는지 여부
4) 부모디렉토리를 file객체로 생성 후 리턴

정답 : 3 4 4 1

		 */
	}

}
