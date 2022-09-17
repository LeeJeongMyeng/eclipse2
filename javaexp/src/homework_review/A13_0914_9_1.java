package homework_review;

import java.util.ArrayList;

public class A13_0914_9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mart m = new Mart("행복마트");
		m.calcu();
		m.addBuyList(new Buylist("사과",2,2000));
		m.addBuyList(new Buylist("바나나",1,3000));
		m.addBuyList(new Buylist("딸기",3,1000));
		m.calcu();
	}

}
class Mart{
	private String mname;
	private ArrayList<Buylist> blist;
	public Mart(String mname) {
		this.mname = mname;
		this.blist = new ArrayList<Buylist>();
	}
	public void addBuyList(Buylist buylist) {
		this.blist.add(buylist);
		System.out.println(buylist.getBname()+" "+buylist.getBcount()+"개를 구매목록에 담았습니다.");
	}
	public void calcu() {
		System.out.println(mname+"마트에서 구매 및 계산서");
		if(blist.size()>0) {
			int cnt = 0;
			int tot =0 ;
			System.out.println("no\t물건명\t가격\t갯수\t계");
			for(Buylist buy:blist) {
				System.out.println(++cnt+"\t");
				tot+=buy.buyInfo();
			}
			System.out.println("총계:"+tot);
		}else {
			System.out.println("구매목록 없음");
		}
	}
}
class Buylist{
	private String bname;
	private int bcount;
	private int bprice;
	public Buylist(String bname, int bcount, int bprice) {
		this.bname = bname;
		this.bcount = bcount;
		this.bprice = bprice;
	}
	public int buyInfo() {
		System.out.println(this.bname+"\t");
		System.out.println(this.bcount+"\t");
		System.out.println(this.bprice+"\t");
		System.out.println(this.bprice*this.bcount+"\n");
		return this.bprice*this.bcount;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getBcount() {
		return bcount;
	}
	public void setBcount(int bcount) {
		this.bcount = bcount;
	}
	public int getBprice() {
		return bprice;
	}
	public void setBprice(int bprice) {
		this.bprice = bprice;
	}
}