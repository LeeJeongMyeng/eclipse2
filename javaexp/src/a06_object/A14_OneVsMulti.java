package a06_object;

import java.util.ArrayList;

public class A14_OneVsMulti {

	public static void main(String[] args) {
		
		ShoppingMall sm = new ShoppingMall("롯데마트");
		sm.showAllList();
		sm.regdateMember(new Member("himan","홍길동",1000));
		sm.regdateMember(new Member("higirl","홍리나",3000));
		sm.showAllList();
		ArrayList<Member> list = new ArrayList<Member>();
		list.add(new Member("goodMan","이철수",10000));
		list.add(new Member("badgirl","김현지",15000));
		sm.regMemberAll(list);
		sm.showAllList();


	}
	
}
class ShoppingMall{
	private String name;
	private ArrayList<Member> mlist;
	public ShoppingMall(String name) {
		this.name = name;
		//ArrayList객체 생성
		this.mlist = new ArrayList<Member>();
	}
	//멥버를 하나씩 추가하는 메소드
public void regdateMember(Member m) {
	this.mlist.add(m);
	System.out.println(m.getId()+"회원 추가되었습니다");
}
public void regMemberAll(ArrayList<Member> list) {
//	this.mlist=list; 전체데이터 덮어씌우기
	this.mlist.addAll(list); // 기존 list에서 추가
	System.out.println(list.size()+"명 회원 추가");
}
public void showAllList() {
	System.out.println("# "+this.name+"쇼핑몰 회원#");
	if(this.mlist.size()>0) {
		for(Member m:this.mlist) {
			System.out.println(m.getId()+"\t");
			System.out.println(m.getName()+"\t");
			System.out.println(m.getPoint()+"\n");
		}
	}else {
		System.out.println("회원등록 준비중");
	}
}
}
class Member{
	private String id;
	private String name;
	private int point;
	public Member(String id, String name, int point) {
		this.id = id;
		this.name = name;
		this.point = point;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
}
/*
 # 1대 다 관계 객체 활용
 1. 하나의 객체안에 여러개의 객체들을 사용할 수 있는 형태의
 	데이터 구조 처리를 말한다.
 
 2. 실무적인 예
 	1) 쇼핑몰에서 여러회원의 관리
 	2) 쇼핑몰에서 여러물건 판매
 	3) 마트안에서 여러개 물건 판매
 	4) 컴퓨터 안에서 여러개 부품
 	5) 하나의 클래스(1/1반) 안에서 여러명의 학생
 
 3. 처리 순서
 	1) 다중의 포함될 객체의 단일 유형의 클래스 선언.
 	 ex) 여러회원 ==> 단일 회원 클래스 정의
 	2) 포함할 클래스 선언
 		1) 필드 - 고유 필드
 			ex) 쇼핑몰의 이름, 
 		2) 필드 - 동적배열 형태의 클래스 선언
 			ArrayList<Member> mlist
 		3) 생성 - 고유필드 초기화, 동적배열 형태 초기화
 			ex) this.name = name;
 				this.mlist= new ArrayList<Member>();
 		4) 추가등록 메소드
 			- 하나씩 추가
 					public void regMember(Member mem){
 				ex) this.mlist.add(mem);
 						}
 			- 다중 추가
 				public void regMemberALL(ArrayList<Member>mlist){
 				this.mlis.addAll=mlist;
 				}
 				ex)ArrayList<Member> addM= new ArrayList<Member>();
 				addM.add(new Member("ohMan","신현식",20000));
 				addM.add(new Member("ohgirl","이정명",30000));
 				addM.add(new Member("goodperson","이지은",40000));
 				sh.regMemberAll(addM);
 		5) 정보출력 메서드
 			- 기본 정보 출력 : 쇼핑몰 이름 : @@@
 			-ArrayList 출력
 				if(list.size()>0{
 					sysou("등록된 회읜원 @@@명이고, 리스트 정보는
 					for(Member m:mlist){
 					m.getName() m.getId() m.getPoint()
 					}
 				}else{
 					sysout("등록된 회원이 없습니다.)
 				}
 */
