package homework_review;

import java.util.ArrayList;

public class A19_0921_EXP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	ArrayList<Integer>로 데이터를 1~100까지 임의로 할당 후, 가장 적은 데이터를 가져오는 로직 중,
	//   잘못된 line은 무엇인가?
		   ArrayList<Integer> points = new ArrayList<Integer>();
		    points.add(new Integer(70));
		    points.add(90);
		      points.add(new Integer("80"));
		    int minPoint = 100; //배열에서 최소값을 도출할때는 나올 수 있는 최대값을
		   							//초기값으로 설정하고
		   	int maxPoint =0; //최대값을 도출할 때는 나올 수 있는 최소값을 설정..
		      for(int num01:points){
		      System.out.println("최소값: "+num01+":"+minPoint);
		      System.out.println("최대값: "+num01+":"+maxPoint);
		  
		      if(minPoint < num01){
		   //초기 최소값보다 적은 값이 나올때, 최소값으로 설정..
		          minPoint=num01;
		          
		          if(minPoint > num01){
		        	  //초기 최소값보다 적은 값이 나올때, 최소값으로 설정..
		        	  minPoint=num01;
		          }
		      }
		      }
		      System.out.println("최소값:"+minPoint);
		      System.out.println("최소값:"+maxPoint);
	}

}
