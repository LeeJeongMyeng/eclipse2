package javaexp.a07_access.a03_sonhome;

import javaexp.a07_access.a02_woodhome.WoodCutter;

public class Son1 extends WoodCutter {
	public void callWoodCutter() {
//		private 접근안됨
//		System.out.println("private:"+privSec);
		//X같은 패키지가 아니기에 접근이안됨
//		System.out.println("default:"+payOurHome);
		// 다른패키지일지라도 PROTECTED라고 붙은 접근제어자의 변수는 접근이 가능하다.
		
		System.out.println("protected:"+inheritMoney);
		System.out.println("public:"+announce);
	}

}
