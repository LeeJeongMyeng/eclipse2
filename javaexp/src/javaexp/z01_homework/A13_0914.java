package javaexp.z01_homework;

import java.util.ArrayList;

public class A13_0914 {

	public static void main(String[] args) {
		/*
		 [1단계:개념] 1. (연습이 필요한 분)1:1관계 설정 연습 - 연필/종이, TV/리모콘, 어머니/자식, 스포츠팀/감독
[1단계:개념] 2. 데이터의 처리 단계별 내용을 예제와 함께 기술하세요. 기본유형 ~~~  1:다 객체형까지.. 
				1. bit 0과1
				2. byte : bit 8개가 모여 데이터의 기본 유형 시작 크기
				   char : 문자(문자열 아님) 단위
				2-1 기본데이터 유형
					int num = 10;
					char ch = 'A'; (문자 변수선언은 작은따옴표)
					그 외, 정수 실수 문자 boolean
				3. 배열
				int[] arry = {1,2,3,4};
				double[] arry2 = {1.1,2.2,3.3};
				char[] ch02 = {'A','B','홍'};
				String name = "홍길동";
				
				4. 객체형 데이터
				calss Human{
				String name;
				int age;
				}
				Human hm = new Human();
				
				5. 배열+객체형
				Human[] hm01 = {new Human(),new Human(),new Human()};
[1단계:개념] 3. 정적배열과 동적배열의 차이점을 예제를 통해서 설명하세요.
			#정적 배열 ==> 일반적인 배열이며 배열을 추가할수 없다.
				Student01[] stArray = {new Student01("이정명",90,80),
							new Student01("이지은",70,60),
							new Student01("찌니",50,40),};
			#동적 배열 ==> 일반적인 배열이며 배열을 추가할수 있으나,
						List, ArrayList선형 형식으로 선언되기에 구조가 조금더 복잡하다.
						ArrayList list =new ArrayList();
		list.add("사과");
		list.add("바나나");
		list.add("딸기");
		System.out.println("크기:"+list.size()); //배열의 크기 = 3이라고 나옴
		for(int idx=0;idx<list.size();idx++) {
			System.out.println(idx+":"+list.get(idx));
		} */
		
//[1단계:코드] 4. 구매한 물건(물건명,가격,갯수) 3개를 클래스를 선언하고 정적배열로 선언 할당 후, 배열을 통해서 출력하세요.
	/*	Thing[] thArray = {new Thing("사과",1,1000),
						   new Thing("바나나",2,2000),
				           new Thing("딸기",3,3000),};
			System.out.println("주소:"+thArray[0]);
			System.out.println("주소:"+thArray[1]);
			System.out.println("주소:"+thArray[2]);
		Thing th01 = thArray[0];
		Thing th02 = thArray[1];
		Thing th03 = thArray[2];
			System.out.println("물건: "+th01.getTname());
			System.out.println("갯수: "+th01.getTcount());
			System.out.println("가격: "+th01.getTcost());
// class선언================================================================	
			class Thing{
				private String tname;
				private int tcost;
				private int tcount;
				public Thing(String tname, int tcost, int tcount) {
					this.tname = tname;
					this.tcost = tcost;
					this.tcount = tcount;
				}
				public String getTname() {
					return tname;
				}
				public void setTname(String tname) {
					this.tname = tname;
				}
				public int getTcost() {
					return tcost;
				}
				public void setTcost(int tcost) {
					this.tcost = tcost;
				}
				public int getTcount() {
					return tcount;
				}
				public void setTcount(int tcount) {
					this.tcount = tcount;
				}

				} */
//[1단계:코드] 5. 팀(팀명,승,무,패) 3개의 클래스를 정적배열객체로 선언 for문을 통해 getXXX메서드로 출력하세요.
	/*	Team[] team = {new Team("삼성","승"),
				new Team("NC","무"),
				new Team("수원","패"),};	
		for(int idx=0;idx<team.length;idx++) {
			//System.out.print(idx+":"+team[idx]+":");
			Team tm01 = team[idx];
			System.out.println(tm01.getTeamname()+":"+tm01.getMatchResult());
			}
// class선언==================================================================		
		class Team{
			private String teamname;
			private String matchResult;
			public Team(String teamname, String matchResult) {
				this.teamname = teamname;
				this.matchResult = matchResult;
			}
			public String getTeamname() {
				return teamname;
			}
			public void setTeamname(String teamname) {
				this.teamname = teamname;
			}
			public String getMatchResult() {
				return matchResult;
			}
			public void setMatchResult(String matchResult) {
				this.matchResult = matchResult;
			}
			
		}*/
//[1단계:개념] 6. 동적배열처리하는 객체 ArrayList에서 사용하는 메서드의 기능을 기본예제를 통하여 설명하세요.
		/*
		ArrayList list =new ArrayList();// list라는 변수 이름의 ArrayList배열 생성
		list.add("사과");  // 배열 목록에 사과 바나나 딸기 3개 추가
		list.add("바나나");
		list.add("딸기");
		System.out.println("크기:"+list.size()); // 3개추가되엇으니 크기는 3
		// for문을 통해 list 순으로 출력
		for(int idx=0;idx<list.size();idx++) {
			System.out.println(idx+":"+list.get(idx));
		}*/
//[1단계:코드] 7. 읽어야할 도서명 5권을 ArrayList로 선언/추가하고 출력하세요.
	/*	ArrayList booklist =new ArrayList();// list라는 변수 이름의 ArrayList배열 생성
		booklist.add("book1");  // 배열 목록에 사과 바나나 딸기 3개 추가
		booklist.add("book2");
		booklist.add("book3");
		booklist.add("book4");
		booklist.add("book5");
		System.out.println("booklist크기:"+booklist.size()); // 3개추가되엇으니 크기는 3
		// for문을 통해 list 순으로 출력
		for(int idx=0;idx<booklist.size();idx++) {
			System.out.println(idx+1+"번 책의 이름:"+booklist.get(idx));
		}*/
		
//[1단계:개념] 8. 1:다관계와 1:1관계 처리 구조의 차이점을 기술하세요.
			/*
			 #1:1 관계
			 	1) 종속될 클래스와 포함할 클래스를 하나씩 만든다.
			 	2) 종속 클래스를 본 클래스(포함할 클래스)에 넣어(종속시켜), 본 클래스 객체 생성시 함께 호출한다.
			 	3) private ElementSch elementSch; 와같은 종속클래스를 선언 구조를 가진다.
			 #1:다 관계
			 	1) 하나의 클래스안에 여러개의 종속 클래스를 종속시켜 객체생성시  데이터 추가에 용이한 구조처리
			 	2) ArrayList<클래스명> 변수처리이름; 의 구조를 가지며,
			 		변수처리이름.add(new 클래스명(메서드1,2,3..); 의 형태로 main()안에서 객체 생성 후, 데이터 추가 할 수있는 
			 		방식이다.
		
/*[1단계:코드] 9. 아래의 1:다관계 동적처리 구조의 데이터를 처리하세요.
      1) 마트/구매물건 2) 도서관/빌린도서  3) 컴퓨터/구성하는부품
      # 처리순서
      1. 포함될 클래스
      	필드/get/set/출력메서드
      2. 포함할 클래스
      	필드(고유 속성, 포함될 클래스 ArrayList)
      	생성자(고유속성 초기화, ArrayList객체 생성)
      	메서드(단일 추가 메서드/ 다중 추가 메서드/전체 내용 출력내용 처리)
		 */
		Mart mt = new Mart("우리마트");
		mt.showAllBuyList(); //추가한 list가 없기에 구매목록이 없다고 표시
		mt.addbuylist(new Buylist("첵스",1));
		mt.addbuylist(new Buylist("콜라",2));
		mt.addbuylist(new Buylist("담배",3));
		mt.showAllBuyList();
		ArrayList<Buylist> buylist = new ArrayList<Buylist>();
		buylist.add(new Buylist("사이다",4));
		buylist.add(new Buylist("곱창",1));
		mt.buyAllList(buylist);
		mt.showAllBuyList();
// =============================================================================		
		Librury lb = new Librury("우리도서관");
		lb.showAllbookList(); //추가한 list가 없기에 구매목록이 없다고 표시
		lb.addbooklist(new Booklist("부자 되는 법을 가르쳐 드립니다"));
		lb.addbooklist(new Booklist("같이해요 코딩 공부"));
		lb.showAllbookList();
		ArrayList<Booklist> booklist = new ArrayList<Booklist>();
		booklist.add(new Booklist("해리포터 1부"));
		booklist.add(new Booklist("해리포터 2부"));
		booklist.add(new Booklist("해리포터 3부"));
		lb.bookAllList(booklist);
		lb.showAllbookList();
//=============================================================================		
		Computer cp = new Computer("내 소중한");
		cp.showAllPartsList(); //추가한 list가 없기에 구매목록이 없다고 표시
		cp.addpartslist(new Partslist("cpu"));
		cp.addpartslist(new Partslist("그래픽 카드"));
		cp.showAllPartsList();
		ArrayList<Partslist> Plist = new ArrayList<Partslist>();
		Plist.add(new Partslist("RAM"));
		Plist.add(new Partslist("메인보드"));
		cp.partsAllList(Plist);
		cp.showAllPartsList();
	}
}
class Mart{
	private String mname;
	private ArrayList<Buylist> buylist;
	public Mart(String mname) {
		this.mname = mname;
		this.buylist=new ArrayList<Buylist>();
	}
	public void addbuylist(Buylist Buy) { //addbuylist를 만들어서 목록 데이터함을 추가
		this.buylist.add(Buy); // // Buy에 추가할 구매물건을 입력함으로써 addbuylist에 목록 추가
		System.out.println("'"+Buy.getBname()+"'"+"를 구매목록에 추가합니다.");
		// getBname으로 return하여 추가되었다는 문구 표시
	}
	public void buyAllList(ArrayList<Buylist> buylist) {
		this.buylist.addAll(buylist);
		System.out.println(buylist.size()+"개가 구매목록에 있습니다.");
	}
	public void showAllBuyList() {
		System.out.println("#"+mname+"마트의 구매목록#");
		if(this.buylist.size()>0) { //buylist의 크기가 0보다 크다면,
			for(Buylist Buy:this.buylist) {
				System.out.print("구매 물건:"+Buy.getBname()+"==>");
				System.out.println("구매 갯수:"+Buy.getBcount());
			}
		} else {
			System.out.println("구매 목록이 없습니다.");
		}
		
	}
}

class Buylist{
	private String bname;
	private int bcount;
	public Buylist(String bname, int bcount) {
		this.bname = bname;
		this.bcount = bcount;
	}
	public void buyInfo() {
		System.out.println(this.bname+"\t");
		System.out.println(this.bcount+"\n");
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
}
class Librury{
	private String lname;
	private ArrayList<Booklist> booklist;
	
	public Librury(String lname) {
		this.lname = lname;
		this.booklist=new ArrayList<Booklist>();
	}
	
	public void addbooklist(Booklist book) { 
		this.booklist.add(book); 
		System.out.println("'"+book.getBookname()+"'"+"를 대여목록에 추가합니다.");
		}
	
	public void bookAllList(ArrayList<Booklist> booklist) {
		this.booklist.addAll(booklist);
		System.out.println(booklist.size()+"개가 대여목록에 있습니다.");
	}
	
	public void showAllbookList() {
		System.out.println("#"+lname+"도서관의 대여목록#");
		if(this.booklist.size()>0) { 
			for(Booklist book:this.booklist) {
				System.out.println("대여할 책:"+book.getBookname());
			}
		} else {
			System.out.println("대여 목록이 없습니다.");
		}
		
	}
}
class Booklist{
	private String Bookname;

	public Booklist(String bookname) {
		Bookname = bookname;
	}

	public String getBookname() {
		return Bookname;
	}

	public void setBookname(String bookname) {
		Bookname = bookname;
	}
	
}
class Computer{
	private String Cname;
	private ArrayList<Partslist> Plist;
	public Computer(String cname) {
		Cname = cname;
		this.Plist=new ArrayList<Partslist>();
	}
	public void addpartslist(Partslist parts) { 
		this.Plist.add(parts); 
		System.out.println("'"+parts.getPartsname()+"'"+"는 부품 중 하나입니다..");
		
	}
	public void partsAllList(ArrayList<Partslist> Plist) {
		this.Plist.addAll(Plist);
		System.out.println(Plist.size()+"개 추가로 부품 목록에 들어왔습니다.");
	}
	public void showAllPartsList() {
		System.out.println("==="+Cname+"컴퓨터의 부품 총 목록===");
		if(this.Plist.size()>0) {
			for(Partslist Part:this.Plist) {
				System.out.println("부품 이름:"+Part.getPartsname());

			}
		} else {
			System.out.println("부품이 없습니다.");
		}
		
	}
}
class Partslist{
	private String Partsname;

	public Partslist(String Partsname) {
		this.Partsname = Partsname;
	}

	public String getPartsname() {
		return Partsname;
	}

	public void setPartsname(String partsname) {
		Partsname = partsname;
	}


}
