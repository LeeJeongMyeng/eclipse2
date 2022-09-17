package homework_review;

import java.util.ArrayList;

public class A14_0915_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 5. 상위클래스 ComPart 컴퓨터 부품, partFunction()부품의 기능,  
//		하위클래스 Cpu, Ram, Ssd를 선언하여 오버라이딩을 처리하여 구현하세요.
		Computer02 com = new Computer02("맥프로");
		com.setPatrs(new Cpu());
		com.setPatrs(new Ram());
		com.setPatrs(new Ram());
		com.setPatrs(new Ssd());
		com.setPatrs(new Ssd());
		com.showPartList();
	}

}
class Computer02{
	private String kind;
	private ArrayList<ComPart> parts;
	public Computer02(String kind) {
		this.kind = kind;
		this.parts = new ArrayList<ComPart>();
	}
	public void setPatrs(ComPart patrs) {
		// 1.다형성 : 상위 = 하위
		//  ComPart part1 = new Cpu();
		//  ComPart part2 = new Ram();
		//  ComPart part3 = new Ssd();
		// 2. ArrayList 데이터 할당
		//  ArrayList<Cpu> list = new ArrayList<Cpu>();
		//  list.add(new Cpu());
		//  ArrayList<ComPart> list2 = new ArrayList<ComPart>();
		// list2.add(new Cpu());
		// list2.add(new Ram());
		// list2.add(new Ssd());
		this.parts.add(patrs);
	}
	public void showPartList() {
		System.out.println("컴퓨터 종류:"+kind);
		// 추상클래스 객체를 자체로 생성하지 못할 뿐
		// 종속된 하위 클래스를 할당해서 사용하는 것은 가능하다.
		for(ComPart cp:this.parts) {
			//각 객체에서 재정의된 내용을 호출..
			cp.partFunction();
		}
	}
}

abstract class ComPart{
	private String kind;

	public ComPart(String kind) {
		this.kind = kind;
	}
	//공통 메서드
	public String getkind() {
		return this.kind
				;
	}
	// 하위클래스에서 다양하게 처리할 메서드
	public abstract void partFunction();
}

class Cpu extends ComPart{
	public Cpu() {
		super("Cpu");	
	}
	public void partFunction() {
		System.out.println(getkind()+" 컴퓨터의 핵심 중앙처리장치");
	}
}

class Ram extends ComPart{
	public Ram() {
		super("Ram");	
	}
	public void partFunction() {
		System.out.println(getkind()+" 휘발성 메모리를 처리한다.");
	}
}
class Ssd extends ComPart{
	public Ssd() {
		super("Ssd");	
	}
	public void partFunction() {
		System.out.println(getkind()+" 정보 저장장치이다.");
	}
}