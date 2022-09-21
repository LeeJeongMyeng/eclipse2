package javaexp.z01_homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import homework_review.Card;
import homework_review.Civilian;
import homework_review.Player;

public class A18_0921 {
/*
 [1단계:개념] 1. Collections의 핵심 3가지 인터페이스와 특징을 기술하세요.
 				List - 순서를 유지하고 저장
		 	 		 - 중복 저장 가능
		 	 		 * 인덱스로 관리하며 중복해서 객체 저장가능하다.
		 	 		 *
		 	 	Set - 순서를 유지하지않고 저장
		 	 		- 객체 중복저장 안됨
		 	 		
		 	 	Map - 키(key)와 값(value)의 쌍으로 저장
		 	 			(키와 값은 모두 객체)
		 	 		- 키는 중복 저장되지 않지만, 값은 중복하여 저장 가능하다.
		 	 		
[1단계:개념] 2. List에서 지원하는 메서드의 기능을 예제를 통하여 설명하세요.
			boolean add()
		 	 		void add(int index, 추가객체)
		 	 		set(int index, 변경 객체)
		 	 		
		 	 		boolean contains(요소객체) : 요소객체 있는지 여부 확인
		 	 		get(int index);특정 위치에 있는 요소 객체 가져오기
		 	 		isEmpty() : 컬렉션이 비어있는지 확인
		 	 		int size():크기
		 	 		
		 	 		void clear():포함된 모든 객체를 삭제
		 	 		remove9int index) : 해당 위치의 객체를 삭제
		 	 		boolean remove(Object o): 주어진 객체를 삭제
		 	 		
		 	 		List<String> slist = new ArrayList<String>();
						slist.add("사슴");
						slist.add("맷돼지");
						slist.add("호랑이");
						System.out.println(slist);
						slist.add(0,"바나나"); //0번(첫번째)에 끼워넣고 기존 것들은 뒤로 밀려남
						slist.set(1,"키위"); //기존 값의 1번(두번째)에 덮어씌우기
						System.out.println(slist.contains("호랑이")); //저장된 객체중 호랑이가 있는지 T/F로 확인
		 	 		
[1단계:코드] 3. List<Player>를 통해 Player팀명,선수명,성적을 선언하고, 회원등록/수정/삭제 처리를 하세요.
				List<Player> PlayerList = new ArrayList<Player>();
		PlayerList.add(new Player("NC","이정명","S")); //등록
		PlayerList.add(new Player("한화","이지은","A"));//등록
		PlayerList.add(new Player("롯데","찌니","B")); //등록
		for(Player p:PlayerList) {
			System.out.print("팀명:"+p.getTeamName()+"\t");
			System.out.print("선수이름:"+p.getPlayer()+"\t");
			System.out.print("선수 성적:"+p.getPgrade()+"\n");
		}
		//수정..
		PlayerList.set(0,new Player("삼성","홍길동","S+"));
		for(Player p:PlayerList) {
			System.out.print("팀명:"+p.getTeamName()+"\t");
			System.out.print("선수이름:"+p.getPlayer()+"\t");
			System.out.print("선수 성적:"+p.getPgrade()+"\n");
		}
		//삭제..
		PlayerList.remove(1);
		for(Player p:PlayerList) {
			System.out.print("팀명:"+p.getTeamName()+"\t");
			System.out.print("선수이름:"+p.getPlayer()+"\t");
			System.out.print("선수 성적:"+p.getPgrade()+"\n");
		}
//====================================================================================
 * class Player{
	private String teamName;
	private String player;
	private String pgrade;
	public Player(String teamName, String player, String pgrade) {
		this.teamName = teamName;
		this.player = player;
		this.pgrade = pgrade;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	public String getPgrade() {
		return pgrade;
	}
	public void setPgrade(String pgrade) {
		this.pgrade = pgrade;
	}
}
[1단계:코드] 4. List<Card>를 통해 카드(모양,번호) 52장을 만들고, 임의의 카드 7장을 추출하여 출력하세요.
		List<Card> CardList = new ArrayList<Card>();
		
		for(int num01=2;num01<=10;num01++) { //숫자형 카드는 for문으로 등록
			CardList.add(new Card("◆",Integer.toString(num01))); //등록
			CardList.add(new Card("♠",Integer.toString(num01))); //등록
			CardList.add(new Card("♥",Integer.toString(num01))); //등록
			CardList.add(new Card("♣",Integer.toString(num01))); //등록
		}
		//영어 카드는 직접 등록
		CardList.add(new Card("◆","A"));
		CardList.add(new Card("◆","J"));
		CardList.add(new Card("◆","Q"));
		CardList.add(new Card("◆","K"));
		
		CardList.add(new Card("♠","A"));
		CardList.add(new Card("♠","J"));
		CardList.add(new Card("♠","Q"));
		CardList.add(new Card("♠","K"));
		
		CardList.add(new Card("♥","A"));
		CardList.add(new Card("♥","J"));
		CardList.add(new Card("♥","Q"));
		CardList.add(new Card("♥","K"));
		
		CardList.add(new Card("♣","A"));
		CardList.add(new Card("♣","J"));
		CardList.add(new Card("♣","Q"));
		CardList.add(new Card("♣","K"));
		System.out.println("총 카드 숫자:"+CardList.size());
		for(int num02=1;num02<=7;num02++) {
			Card A;
			Random ran = new Random();
			A = CardList.get(ran.nextInt(CardList.size()));
		 //  Card getranCard = CardList.get((int) Math.random());
			System.out.println(A.getCNum()+A.getCShape());
		}
//====================================================
		class Card{
	private String CShape;
	private String CNum;
	public Card(String cShape, String cNum) {
		CShape = cShape;
		CNum = cNum;
	}
	public String getCShape() {
		return CShape;
	}
	public void setCShape(String cShape) {
		CShape = cShape;
	}
	public String getCNum() {
		return CNum;
	}
	public void setCNum(String cNum) {
		CNum = cNum;
	}
}

[2단계:코드] 5. 위 3번 선수데이터를 임의로 5명 정도 등록하고, 선수의 이름과 성적으로 검색되는 로직를 처리하세요.
					
		List<Player> PlayerList = new ArrayList<Player>();
		PlayerList.add(new Player("NC","이정명","S")); //등록
		PlayerList.add(new Player("한화","이지은","A"));//등록
		PlayerList.add(new Player("LG","찌니","B")); //등록
		PlayerList.add(new Player("KIA","찌니","B")); //등록
		PlayerList.add(new Player("두산","찌니","B")); //등록
		for(Player p:PlayerList) {
			System.out.print("팀명:"+p.getTeamName()+"\t");
			System.out.print("선수이름:"+p.getPlayer()+"\t");
			System.out.print("선수 성적:"+p.getPgrade()+"\n");
		}
		System.out.println(PlayerList.contains("NC"));
		
		// 여기서 두가지로어떻게 검색하는가,,
		 
[1단계:코드] 6. 주머니속에 1000원 2장, 5000원 3장, 10000원 2장을 넣었을 때, Set객체로 처리하여 안에 있는
      금액의 합산을 출력하세요
      		Set<String> setMoney = new HashSet<String>();
		setMoney.add("1000");
		setMoney.add("1000");
		setMoney.add("5000");
		setMoney.add("5000");
		setMoney.add("5000");
		setMoney.add("10000");
		setMoney.add("10000");

		
		
		System.out.println("#저장된 set#");
		int tot=0;
		for(String MoneyList:setMoney) {
			int money = Integer.parseUnsignedInt(MoneyList);
			System.out.println(money+"원");
			tot+=money;
			}System.out.println(tot);
[1단계:개념] 7. Map의 기능메서드를 기본 예제와 함께 나열하세요.
		Map<String,String> map = new HashMap<String,String>();
		map.put("1000","홍길동"); //주어진 키,값 저장
		map.put("1000","김길동");
		map.put("1001","신길동");
		map.put("1002","박길동");
			System.out.println(map.containsKey("1000")); //키값있는지 확인
			System.out.println(map.size()); //저장된 크기 출력
		map.remove(2);// : 키로 해당 구성 데이터 삭제.
	//	map.clear(); //전체 삭제
			System.out.println(map.keySet());	//모든 키를 Set객체에 담아서 리턴
	
		//맵.keySet() : Map에서 key만 가져오는 메서드
		//Set<String> 키로 된 값
		Set<String> mapKey= map.keySet();
		for(String key:mapKey) {
			//map1.get(key) : 키를 통해 value값
			System.out.println(key+":"+map.get(key));
		}
[2단계:코드] 8. Map<String, Civilian> 형태로 주민번호와 주민(이름, 사는곳)을 설정하여 5명을 할당하고, 출력하세요
				Map<String, Civilian> Map = new HashMap<String,Civilian>();
		Map.put("950101-1xxxxxx",new Civilian("가길동","서울"));
		Map.put("960202-2xxxxxx",new Civilian("나길동","대전"));
		Map.put("970303-1xxxxxx",new Civilian("다길동","대구"));
		Map.put("980404-2xxxxxx",new Civilian("라길동","부산"));
		Map.put("990505-1xxxxxx",new Civilian("마길동","광주"));
		Set<String>Setno=Map.keySet();
		for(String No:Setno) {
			System.out.print("주민번호:"+No+"\t");
			Civilian st = Map.get(No);
			System.out.print("이름:"+st.getCname()+"\t  ");
			System.out.print("거주지:"+st.getCNum()+"\n");

		}
//=================================================================
 * class Civilian{
	private String Cname;
	private String CNum;
	public Civilian(String cname, String cNum) {
		Cname = cname;
		CNum = cNum;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public String getCNum() {
		return CNum;
	}
	public void setCNum(String cNum) {
		CNum = cNum;
	}
}

== 평가대비(자바) 객관식 문제 ==
1. Collections 유형이 아닌 것은 ? 
1) Map 2) List 3) Set 4) Long

답: 4번, Long유형은 없다.

2. List 기능 메서드 가운데, 전체 데이터의 삭제를 처리해주는 메서드는?
1) get() 2) remove() 3) clear() 4) removeAll()

답: 3번 1) 해당위치 요소객체가져오기 2) 해당위치에 데이터만 삭제  4) 요소와 일치하는 모든것을 삭제

3. 빈번한 객체 삭제와 삽입이 일어나는 곳에서는 좋은 성능 가진 List 하위 객체는?
1) ArrayList 2) Vector 3) LinkedList 4) HashMap

답: 3번 LinkedList
List<E> list = new LinkedList<E>();
		 2. 특징
		 	1) 인접 참조를 링크해서 체인처럼 관리
		 	2) 특정 인덱스에서 객체를 제거하거나 추가하게 되면
		 		바로 앞뒤 링크만 변경
		 	3) 빈번한 객체 삭제와 삽입이 일어나는 고셍서는
		 		ArrayList보다 좋은 성능

4. 아래의 메서드에서 Set이 지원하지 않는 메서드를 선택하세요.
1) add(E) 2) contains(E) 3) clear() 4) remove(index)

index가 아닌 object로 구분하여 삭제한다.
		 		 
5. 아래 기술된 내용 중, Map과 관련성이 먼 내용을 선택하세요.
1) 키(key)와 값(value)으로 구성된 Map.Entry 객체를 저장하는 구조
2) 순서를 유지하여 저장이 가능하다.
3) 키와 값은 모두 객체
4) 키는 중복될 수 없지만 값은 중복 저장 가능

답: 2번 순서유지 저장은 List이다.

정답 : 4,3,3,4,2

== 평가대비(알고리즘) 객관식 문제 ==
1. ArrayList<Integer>로 데이터를 1~100까지 임의로 할당 후, 가장 적은 데이터를 가져오는 로직 중,
   잘못된 line은 무엇인가?
   ArrayList<Integer> points = new ArrayList<Integer>();
1) points.add(new Integer(70));
2) points.add(90);
   points.add(new Integer("80"));
3) int minPoint = 100;
   for(int num01:points){
4)   if(minPoint < num01){
       minPoint=num01;
   }
   }
   System.out.println("최소값:"+minPoint);


정답 4
 */
}
