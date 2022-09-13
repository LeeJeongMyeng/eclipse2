package javaexp.z01_homeworkstudents;
import javaexp.z01_homeworkfiends.Friends1;
import javaexp.z01_homeworkfiends.Friends2;
public class Students1 {

	public static void main(String[] args) {
		
		Friends1 fs01= new Friends1("이정명");
		fs01.getname();
		
		Friends2 fs02= new Friends2();
//		System.out.println("private:"+fs02.name2); private라 호출 불가
//		System.out.println("private:"+fs02.name3); //다른패키지라 소속 불가
	}

}
