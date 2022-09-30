package javaexp.z01_homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import java.util.Scanner;

public class A20_0923 {

	public static void main(String[] args) {
		/*
[1단계:코드] 1. File객체를 통해 현재 경로 기준으로 room1~3만들고, Person1.txt~Person10.txt를 생성하세요.
		String path = "C:\\a01_javaexp\\eclipse2\\javaexp\\src\\javaexp\\z01_homework";
		try {
		// 파일(디렉토리 생성)	
				for(int cnt=1; cnt<=3;cnt++) {
				String subpath = path+"\\z0"+cnt+"_room";
				File path01 = new File( path+"\\z0"+cnt+"_room");
				if(!path01.exists()) path01.mkdir();
		//파일 생성..		
				for(int no=1; no<=10; no++) {
					File f02 = new File(subpath, "person"+no+".txt");
					if(!f02.exists()) f02.createNewFile();
				}
			}
		}catch(IOException e) {
			
		}
			
[1단계:개념] 2. OutputStream 객체란 무엇인가? 기능메서드와 함께 설명하세요.
	1. 바이트기반 출력 스트림의 최상위 클래스로 추상 클래스이다.
		기본형식 ==>OutputStream os = System.out;
		<OutputStream의 하위 객체들>
		FileOutputStream
		PrintStream
		BufferedOutputStream
		DataOutputStream
	//<기능 메서드>
		write(int b) 출력 스트림으로 1바이트를 보낸다.
		write(byte[]b) 출력 스트림으로 매개값으로 주어진 바이트 배열b의 모든 바이트를 보낸다.
		write(byte[]b, int off, int len)
		flush(): 버퍼에 잔류하는 모든 바이트를 출력한다.
		close() : 사용한 시스템을 반납하고, 출력 스트림을 닫는다.
		
[1단계:코드] 3. 기본 OutputStream객체를 생성해서 System.out을 할당하여, byte, byte[]로 데이터를 출력하세요.
		OutputStream Exp03 = System.out;
		try {
			Exp03.write(65);//code로 'A'출력
			System.out.println();
			byte[] b = {66,67,68,69,70}; //Code로 'BCDEF'출력
			Exp03.write(b); //바이트 배열b출력
			
			Exp03.flush();  //버퍼에 잔류하는 모든 바이트를 출력한다.
			Exp03.close();  //사용한 시스템을 반납하고, 출력 스트림을 닫는다.
		} catch (IOException e) {
			e.printStackTrace();
		} 
[1단계:코드] 4. 기본 Writer객체 활용하여 char[], String을 write()로 출력하세요.
					Writer out = new OutputStreamWriter(System.out);
		String file01 = "C:\\a01_javaexp\\eclipse2\\javaexp\\src\\javaexp\\z01_homework\\z01_room\\person1.txt";
		
		try {
			Writer writer = new FileWriter(file01);
			char[] chwrite = {'예','제','입','니','다','!'};
			writer.write(chwrite);
			writer.write("\n");
			writer.write("예제입니다!!!");
			writer.flush();
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
[1단계:코드] 5. Reader객체를 통해서 입력된 데이터를 FileWriter를 활용하여 파일에 내용을 기록하세요
      ex) 회원정보(아이디/패스워드/이름/포인트) 탭간격처리.
      			Reader reader05 = new InputStreamReader(System.in); //2바이트 문자처리
		BufferedReader bfr05 =new BufferedReader(reader05);
		String file06 = "C:\\a01_javaexp\\eclipse2\\javaexp\\src\\javaexp\\z01_homework\\z01_room\\person1.txt";
		//char[] chArr = new char[5];
		
		try {
	// 입력...
			System.out.print("아이디를 입력하세요:");
		//	reader05.read(chArr);
			String inputLineId = bfr05.readLine();
			String setId =new String(inputLineId);
	
			System.out.print("비밀번호를 입력하세요:");
			String inputLinePass = bfr05.readLine();
			String setPass =new String(inputLineId);

			System.out.print("이름을 입력하세요:");
			String inputLineName = bfr05.readLine();
			String setName =new String(inputLineName);
						
			System.out.print("포인트을 입력하세요:");
			String inputLinePoint = bfr05.readLine();
			String setPoint =new String(inputLinePoint);
			
			
			System.out.println("==입력된 정보==");
			System.out.println("ID:"+setId+"\t"+"Password:"+setPass+"\t"+"이름:"+setName+"\t"+"포인트:"+setPoint);
			
	//출력...
			Writer writer06 = new FileWriter(file06);
			writer06.write("ID:"+setId+"\t"+"Password:"+setPass+"\t"+"이름:"+setName+"\t"+"포인트:"+setPoint);
			writer06.flush();
		//reader05.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
[2단계:코드] 6. Path 객체를 활용하여 새파일 등록/파일내용 기록/파일 삭제를 처리하세요.
		String path06 = "C:\\a01_javaexp\\eclipse2\\javaexp\\src\\javaexp\\z01_homework\\z01_room";
		String fName06 = "Person11_Exp06";
		File makeFile06 = new File(path06,fName06);
		
			try {
				//파일 생성
				if (!makeFile06.exists()) makeFile06.createNewFile(); 
				//생성된 파일에 문구 입력..
				//File ==> FileWriter =>PrintWriter
				FileWriter writer06 = new FileWriter(makeFile06);
				PrintWriter out = new PrintWriter(writer06);
						out.print("문자열을 파일에 입력처리 합니다.);
						out.close();
						fw.close();
				// 파일 삭제처리 ( 파일close(); 이후 진행해야함.
				Path delFile = path.get(path06+"\\"+fName06);
				Files.delete(delFile);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
[1단계:코드] 7. Files와 Path를 활용하여 경로2개를 만들고, 경로1의 파일을 5개 임의로 만들어, 경로2에 1~5번이 numbering된 파일을 만드세요.
							String path07 = "C:\\a01_javaexp\\eclipse2\\javaexp\\src\\javaexp\\z01_homework";
		String roomname71 = "room1";
		String roomname72 = "room2";
		File makeroom71 = new File(path07,roomname71);
		File makeroom72 = new File(path07,roomname72);
		 
			try {
				// 디렉토리 생성
				if (!makeroom71.exists()) makeroom71.mkdir();
				if (!makeroom72.exists()) makeroom72.mkdir();
				//for문을 통해 room1디렉토리에 5개파일 생성
				for(int cnt=1;cnt<=5;cnt++) {
					File makeFile07 = new File(makeroom71,"exp07_0"+cnt);
					if (!makeFile07.exists()) makeFile07.createNewFile();
				}
				//복사 처리
				for(int cnt=1;cnt<=5;cnt++){
					
				String orgFile07 = path07 +"\\"+roomname71+"\\exp07_0"+cnt; //기존파일 존재 주소
				String targetFile07 = path07 +"\\"+roomname72+"\\Copy_exp07_0"+cnt; //기존파일 존재 주소
				
				Path oriPth07 = Paths.get(orgFile07); //파일의 주소 변수할당
				Path copPath07 = Paths.get(targetFile07); // 카피할 주소의 변수 할당
				Files.copy(oriPth07, copPath07,StandardCopyOption.REPLACE_EXISTING);	
				}

			} catch (IOException e) {
				e.printStackTrace();
			}System.out.println("복사 완료.");
[2단계:코드] 8. 일기장 시스템 만들기. Scanner를 이용해서 오늘날짜를 입력하면 @@@@년@@월@@일.txt 파일이 생성되고
      날짜를 포함하여 오늘의 일기를 기록하고 Q!를 입력시 입력이 종료되면 해당 파일에 기록이 되게 처리하세요.
      
 LocalDate now = LocalDate.now();
		Scanner sc = new Scanner(System.in);
		System.out.println("오늘 날짜의 다이어리를 생성하려면. Y 혹은 y를 입력해주세요");
		System.out.println("원치 않으신다면. N 혹은 n을 입력해주세요");
		String insc = sc.nextLine();
		if (insc.equals("Y") || insc.equals("y")) {
			String srDATE = now.toString();
			System.out.println("오늘 날짜는" + srDATE + "입니다.");
			String path08 = "C:\\a01_javaexp\\eclipse2\\javaexp\\src\\javaexp\\z01_homework";
			String filename08 = now.toString() + "diary";
			try {
				File makeFile08 = new File(path08, filename08);
				if (!makeFile08.exists())
					makeFile08.createNewFile();

				Writer writer08 = new FileWriter(makeFile08);
				System.out.println("일기가 만들어 졌습니다.");
				System.out.println("작성하시겠습니까??  입력을 원하시면 아무키를 눌러주세요");
				System.out.println("입력을 원치 않으시면 N 혹은 n를 입력해주세요");
				String insc2 = sc.nextLine();
				System.out.println("일기내용입력해주세요");
				System.out.println("작성 종료를 원하시면 Q! 혹은 q! 를 입력해주세요");
				while (true) {// 무한루프

					System.out.print("내용:");
					String insc4 = sc.nextLine();
					if (insc4.equals("Q!") || insc4.equals("q!")) {
						System.out.println("일기 작성 종료..");
						break;
					} else {

						writer08.write(insc4 + "\n");
						writer08.flush();
					}
				}
				writer08.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (insc.equals("N") || insc.equals("n")) {
			System.out.println("오늘은 일기를 작성하지 않습니다.");
		} else {
			System.out.println("선택지가 아닙니다. 다시 시작해주세요");
		}
      
      
      
== 평가대비(자바) 객관식 문제 ==
1. 바이트 기반 출력 스트림의 최상위 클래스로 추상 클래스는 무엇인가?
1) InputStream 2) OutputStream 3) Reader 4) Writer
정답:2 1) 입력 클래스 3,4)는 최상위 클래스가아님

2. 바이트 기반 출력 스트림의 최상위 클래스로 추상 클래스는 무엇인가?
1) InputStream 2) OutputStream 3) Reader 4) Writer
정답:2 1) 입력 클래스 3,4)는 최상위 클래스가아님
		 */

	}

}
