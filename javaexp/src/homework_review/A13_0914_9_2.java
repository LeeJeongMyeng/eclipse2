package homework_review;

import java.util.ArrayList;

public class A13_0914_9_2 {

	public static void main(String[] args) {
		Library lb= new Library("안녕도서관");
		lb.showLentList();
		lb.addLendList(new LBook("이정명","책1","22.09.15"));
		lb.addLendList(new LBook("이지은","책2","22.09.14"));
		lb.addLendList(new LBook("찌니","책3","22.09.13"));
		lb.showLentList();

	}

}
class Library{
	private String lname;
	private ArrayList<LBook> lblist;
	public Library(String lname) {
		this.lname = lname;
		this.lblist= new ArrayList<LBook>();
	}
	public void addLendList(LBook book) {
		this.lblist.add(book);
		System.out.println(book.getLendId()+"님이 "+book.getTitle()+"을 대여했습니다.");
	}
	public void showLentList() {
		System.out.println(lname+"에서 대여한 책 내역");
		if(lblist.size()>0) {
			System.out.println("번호\t대출자\t도서명\t반납일");
		for(int idx = 0; idx<lblist.size();idx++) {
			LBook kb = lblist.get(idx);
			kb.lendInfo(idx+1); //번호 리스트
		}
		System.out.println("총 "+lblist.size()+"권 대출되었습니다.");
		}else {
			System.out.println("대여 목록이 비었습니다.");
		}
	}
}
class LBook{
	private String lendId;
	private String title;
	private String endDate;
	public LBook(String lendId, String title, String endDate) {
		this.lendId = lendId;
		this.title = title;
		this.endDate = endDate;
	}
	public void lendInfo(int no) {
		System.out.println(no+"\t");
		System.out.println(lendId+"\t");
		System.out.println(title+"\t");
		System.out.println(endDate+"\n");
	}
	public String getLendId() {
		return lendId;
	}
	public void setLendId(String lendId) {
		this.lendId = lendId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
}