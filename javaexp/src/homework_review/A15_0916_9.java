package homework_review;

public class A15_0916_9 {
	static void call01() throws ArrayIndexOutOfBoundsException{
		int[] arry = new int[3];
		System.out.println(arry[3]); // 0,1,2
	}
	static void call02() throws ArrayIndexOutOfBoundsException{
		int[] arry = new int[3];
		System.out.println(arry[4]); // 0,1,2
	}
	public static void main(String[] args) {
		try {
		call01();
		call02();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 벗어남:");
			System.out.println(e.getMessage());
		}
	}

}
