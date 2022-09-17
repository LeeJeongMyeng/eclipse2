package homework_review;

import java.util.ArrayList;

public class A13_0914_9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer01 com = new Computer01("데스크탑","조립컴퓨터");
		com.setPlist(new Parts("CPU","인텔","I7"));
		com.setPlist(new Parts("RAM","하이닉스","16G"));
		com.setPlist(new Parts("SSD","삼성","1TB"));
		com.showPartsList();
	}

}
class Computer01{
	private String kind; // 종류
	private String comp; // 제조사
	private ArrayList<Parts> plist;
	public Computer01(String kind, String comp) {
		this.kind = kind;
		this.comp = comp;
		this.plist = new ArrayList<Parts>();
		
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	public ArrayList<Parts> getPlist() {
		return plist;
	}
	public void setPlist(Parts p) {
		this.plist.add(p);
		System.out.println(p.getPname()+"부품 추가");
	}
	public void showPartsList() {
		System.out.println("#컴퓨터 사양#");
		System.out.println("종류: "+kind);
		System.out.println("제조사: "+comp);
		if(plist.size()==0) {
			System.out.println("부품이 없습니다.");
		}else {
			System.out.println("포함된 부품 리스트");
			for(Parts p: plist) {
				System.out.println(p);
			}
		}
	}
}
class Parts{
private String pname;
private String company;
private String perform;
public Parts(String pname, String company, String perform) {
	this.pname = pname;
	this.company = company;
	this.perform = perform;
}
@Override
public String toString() {
	return "Parts [pname=" + pname + ", company=" + company + ", perform=" + perform + "]";
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getPerform() {
	return perform;
}
public void setPerform(String perform) {
	this.perform = perform;
}

}