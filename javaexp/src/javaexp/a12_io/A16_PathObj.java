package javaexp.a12_io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class A16_PathObj {

	public static void main(String[] args) {
		/*
		 * # Path 1.파일을 보다 효과적으로 복사,삭제 처리해주는 객체
		 */
		String fname = "C:\\a01_javaexp\\eclipse2\\javaexp\\src\\javaexp\\a12_io\\Z03_Test.txt";
		Path filePath = Paths.get(fname);
		File f = filePath.toFile();
		System.out.println(f.getName()); // 파일명
		System.out.println(f.getPath()); // 파일 주소
		System.out.println(f.exists()); // 파일 존재여부
		System.out.println(f.length()); // 파일의 길이

		String file01 = "C:\\a01_javaexp\\eclipse2\\javaexp\\src\\javaexp\\a12_io\\Z04_newFile.txt";
		File f01 = new File(file01);
		// 혹은 File f01 = new File (주소명,"원파는 파일이름 직접 입력");
		//
		System.out.println(f01.exists());
		try {
			if (!f01.exists())
				f01.createNewFile();
			
			Path filePath2 = Paths.get(file01);
			
			
			//혹은 Path filePath2 = Paths.get(Path변수명+\\+파일명 직접입력);
			System.out.println(filePath2.getFileName()); // 파일명
			System.out.println(filePath2.getParent()); // 파일 주소
			System.out.println(filePath2.getNameCount()); // 파일 존재여부
			File f2 = filePath2.toFile();
			System.out.println("#다시 파일 객체로 변경#");
			System.out.println(f2.getName()); // 파일의 길이
			
			//파일 삭제 처리
			Files.delete(filePath2);
			System.out.println(filePath2.getFileName()+"삭제처리 완료");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
		
	

	}

}
