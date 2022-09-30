package homework_review;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDate;
import java.util.Scanner;
public class Exp2 {

	public static void main(String[] args) {
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
		
		
	}

}
