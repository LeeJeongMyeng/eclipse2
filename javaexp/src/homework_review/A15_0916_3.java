package homework_review;

import java.util.ArrayList;

public class A15_0916_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Prod> buyList = new ArrayList<Prod>();
		buyList.add(new Prod("사과",3000,2));
		buyList.add(new Prod("바나나",3000,2));
		buyList.add(new Prod("딸기",3000,2));
		int sum=0;
		for(int idx=0; idx<buyList.size();idx++) {
			Prod p  = buyList.get(idx);
			System.out.println(p.getName());
			System.out.println(p.getPrice());
			System.out.println(p.getCnt());
			int tot = p.getPrice()*p.getCnt();
			sum+=tot;
			System.out.println(tot+"/n");
			
		} System.out.println("전체 총계:"+sum);
	}

}
class Prod{
	private String name;
	private int price;
	private int cnt;
	public Prod(String name, int price, int cnt) {
		this.name = name;
		this.price = price;
		this.cnt = cnt;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getCnt() {
		return cnt;
	}
	
}