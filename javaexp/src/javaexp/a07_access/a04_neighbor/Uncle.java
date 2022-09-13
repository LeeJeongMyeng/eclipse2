package javaexp.a07_access.a04_neighbor;

import javaexp.a07_access.a02_woodhome.WoodCutter;

public class Uncle {
	public void woodCutter() {
		WoodCutter wc = new WoodCutter();
//		System.out.println("private:"+wc.privSec);
//		System.out.println("default:"+wc.payOurHome);
//		System.out.println("protected:"wc.inheritMoney);
		System.out.println("public:"+wc.announce);
	}
}
