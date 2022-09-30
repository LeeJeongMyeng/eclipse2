package homework_review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class A19_0921_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] shapes = {"♠","♥","◆","♣"}; //모양등록
	ArrayList<String>nums = new ArrayList<String>();//카드 넘버등록
	nums.add("A");
	for(int cnt=2; cnt<=10; cnt++) //2~9까지등록
	nums.add(""+cnt); //숫자형을 문자형으로 등록하게끔 함 (자동형변환)
// nums.add(Integer.valueOf(cnt).toString());
	nums.add("J"); nums.add("Q"); nums.add("K");
	
	
	List<Card> cardList = new ArrayList<Card>(); //등록한 카드를 전체로 등록할 리스트작성
	for(String shape:shapes) { //shape를 4개 등록하면서
		for(String num:nums) { //동시에 A~K까지 등시에 등록
			cardList.add(new Card(shape,num));
		}
	}
	
	
int cnt=1;
	for(Card c:cardList) {
		System.out.println(cnt+++":"+c.getShape()+c.getNum());
		}
	//7개 랜덤 카드 추출
	List<Card> team01 = new ArrayList<Card>();
	List<Card> team02 = new ArrayList<Card>();
	Random r = new Random();
	for(cnt=1;cnt<=7;cnt++) {
		int rIdx= r.nextInt(52);
		team01.add(cardList.get(rIdx));
	}
	for(cnt=1;cnt<=7;cnt++) {
		int rIdx= r.nextInt(52);
		team02.add(cardList.get(rIdx));
	}
	System.out.println("#1번째 팀 카드#");
	for(Card d:team01) System.out.print(d.getShape()+d.getNum());
	System.out.println();
	System.out.println("#2번째 팀 카드#");
	for(Card d:team02) System.out.print(d.getShape()+d.getNum());
	System.out.println();
	
	//로직에 의해 중복을 배제1..
	//기능 객체에 의해 섞어주는 처리.
	Collections.shuffle(cardList); //0~52카드의 순서를 석어줌
	System.out.println("#1번팀");
	for(int idx=0;idx<7;idx++) {  //섞은 카드들을 7번까지 출력
		Card d= cardList.get(idx);
		System.out.print(d.getShape()+d.getNum()+" ");
	}
	System.out.println();
	System.out.println("#2번팀");
	for(int idx=7;idx<14;idx++) { //섞은 카드를 7~14번까지 출력(앞의 7장이 뽑혔기에 중복제거)
		Card d= cardList.get(idx);
		System.out.print(d.getShape()+d.getNum()+" ");
	}
	
	
	}
}
class Card{
	private String Shape;
	private String num;
	public Card(String shape, String num) {
		Shape = shape;
		this.num = num;
	}
	public String getShape() {
		return Shape;
	}
	public void setShape(String shape) {
		Shape = shape;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}



}