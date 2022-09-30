package homework_review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A19_0921_5 {

	public static void main(String[] args) {
//5. 위 3번 선수데이터를 임의로 5명 정도 등록하고, 선수의 이름과 성적으로 검색되는 로직를 처리하세요.
		/*
		   1. 선수등록 PlayerList.add(new Player());
		   2. Scanner 생성 nextLine()
		   		이름: ==>schName
		   		성적: ==> schRecord 형변환처리 Double.parseDouble()
		   		둘중에 하나만 맞으면 검색(or)
		    3.
		    		List<Player> schRList = new ArrayList<Player>();
		    		for(Player p : PlayerList){
		    		if(p.getName().equals(schName)){ 정확하게 검사할때
		 				}
		 			if(p.getNme().indexOf(schName)!=-1
		 				||schRecord==p.getRecord()){ //해당 keyword가 있으면 검색
		 					schRList.add(p);
		 				}
		 				}
		   4. 검색 결과 출력
		   		if(schRList.size()>0{
		   		for(Playerp:schRList){
		   		p.getTname(),p.getName(), p.getRecord()
		 		 }}else{
		 		 검색된 결과 없습니다.
		 		 }
		 		 
		 */
		
		List<Player> PlayerList = new ArrayList<Player>();
	      PlayerList.add(new Player("NC","이정명","S")); //등록
	      PlayerList.add(new Player("한화","이지은","A"));//등록
	      PlayerList.add(new Player("LG","찌니","B")); //등록
	      PlayerList.add(new Player("KIA","벨르","C")); //등록
	      PlayerList.add(new Player("두산","룰루","D")); //등록
	      System.out.println(PlayerList.size());
	      for(Player p:PlayerList) {
	         System.out.print("팀명:"+p.getTeamName()+"\t");
	         System.out.print("선수이름:"+p.getPlayer()+"\t");
	         System.out.print("선수 성적:"+p.getPgrade()+"\n");
	      }
	      
	      
	      Scanner sc = new Scanner(System.in,"EUC-KR");
	      System.out.print("검색할 이름:");
	      String schName = sc.nextLine();
	      System.out.print("검색할 성적:");
	      String schgrade = sc.nextLine();
	      List<Player> schRList = new ArrayList<Player>();
	      for(Player p : PlayerList){
	         // indexOf() : 해당 문자가 포함되어 있으면 해당 index위치를 티런
	         // equals() : 해당 문자열이 정확하게 있으면.. 
	         if(p.getPlayer().indexOf(schName)!=-1
	            ||p.getPgrade().indexOf(schgrade)!=-1){ //해당 keyword가 있으면 검색
	               schRList.add(p);
	            }
	         }
	      
	      
	      System.out.println("====검색 결과====");
	      if(schRList.size()>0) {
	         for(Player p :schRList) {
	            System.out.println(p.getTeamName()+"\t"+p.getPlayer()+"\t"+p.getPgrade());
	         }
	      }else {
	         System.out.println("없습니다.");
	      }
		
		
	}
}
class Player{
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