package homework_review;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;





public class Exp {
	public static void main(String[] args)  {
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
	
	}}
class Civilian{
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