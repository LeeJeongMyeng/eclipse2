package javaexp.z01_homework;

import java.util.Scanner;

import a0905.a05_restore.A01_Man;

public class A09_0908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 [1단계:개념] 1. 메서드의 기본 구성요소들의 특징을 기본예제를 통해 기술하세요.
 #메소드 선언
		1. 기본 유형
			리턴타입 메소드명(매개변수1,2,...){
			프로세스 처리
			return 실제리턴 데이터;
			}
		 int plus(int num01,int num02) {
		 int sum =num01+num02;
		 return sum;
		 }
		 String getGeet(){
		 return"안녕하세요";
		 }
		 1)리턴타입 : 해당 메서드 호출시 나오는 데이터의 유형 선언
		 	  		리턴하지않을때에는 메소드명 앞에 void를 붙힌다.
		 2)매개변수 :여러개의 데이터를 단일 또는 다중으로 입력처리 할 수 있다.
		 		(overload) 매개변수의 순서 종류 갯수가 다른경우 이름을 중복하여 사용이 가능하다.
		 		 
[1단계:개념] 2. 생성자의 메서드를 통한 필드값 저장의 차이점을 예제를 통해서 기술하세요.
		class Person{
	String name; //선언
	int age;	//선언
	void Setname(String name){ //void를 씀으로써 return값을 쓰지않고 
		this.name=name;			// String매개변수 하나를 저장
		}
	
	void SetAge(int age){		//void를 씀으로써 return값을 쓰지않고 
		this.age=age;			// int매개변수 하나를 저장
	}
	
	void setData() {			//매개변수 없음.
		name = "없음";			//선언 데이터값 초기화
		age= 0;					//선언 데이터값 초기화
	}
 // ==해당 문제를 제대로 이해한게 맞는지 잘 모르겠습니다.==

[1단계:코드] 3. Counter 클래스를 만들고, 생성자를 통해 시작, 마지막변수를 입력하고,
  			메서드를 통해서 해담 범위 내용 출력하고, 누적합을 리턴 처리하게 하세요.
  			Counter c1 = new Counter();
			c1.setcnt(1,10);
		
			class Counter {
			int start;
			int end;
			int total;
	
			void setcnt(int start, int end) {
				System.out.println("범위 :"+start+"~"+end);
				while(true) {
				if(start!=end+1) {
				System.out.println("현재 값 : "+start);
				total+=start;
				System.out.println("현까까지 누적 값 : "+total);
				start++;
				} else {
					break;
				}
			
				}
			}
			}
[1단계:코드] 4. Car 클래스의 필드 차종,색상,현재속도를 선언하고, 이 중 생성자를 통한 초기값 설정과 메서드를 통한 설정을 분리하여
             생성자, 메서드(속도증가,속도감소,현재속도확인)를 구현하여 처리하세요.
             Car c1 = new Car();
		c1.setcar();
		c1.cartype="아반떼";
		c1.color="흰색";
		c1.speed="110km";
		c1.setcar();
		Car c2 = new Car("람보르기니","노란색","300km");
		c2.setcar();
		
		class Car{
	String cartype;
	String color;
	String speed;
	Car(){
		this.cartype="포르쉐";
		this.color = "Red";
		this.speed= "200Km";
	}
	void setcar() {
		System.out.println("차종: "+cartype+" 차량색깔: "+color+" 현재 속도: "+speed);
	}
	Car(String cartype,String color,String speed) {
		this.cartype=cartype;
		this.color=color;
		this.speed=speed;
		
	}
	 

}
		
[1단계:코드] 5. 1차원 배열로 회원의 이름 5명을 선언하고 할당 출력하세요
              2차원 배열로 위 회원이름에 추가하여 나이와 사는 곳을 만들어 할당하고 출력하세요
              String[] name = {"이정명","이지은","찌니","벨르","룰루"};
				System.out.println(name[0]);
				System.out.println(name[1]);
				System.out.println(name[2]);
				System.out.println(name[3]);
				System.out.println(name[4]);
              
              String[][] name2 = {{"이정명","28살","창원"},{"이지은","29살","공주"},
				{"찌니","1살","서울"},{"벨르","2살","수원"},{"룰루","3살","인천"}};
		for(int idx=0;idx<name2.length;idx++) {
			System.out.println(idx+1+"번 소개====");
			for(int idx2=0;idx2<name2[idx2].length;idx2++) {
				System.out.println(name2[idx][idx2]);
			}
		}
              
[1단계:개념] 6. 패키지란 무엇이면, 외부패키지의 클래스를 객체로 사용할 때 전제조건과 방법 2가지를 기술하세요.
 		//패키지 : 1)클래스를 기능별로 묶어 그룹이름을 붙힘
 		 * 		 2)클래스 이름의 일부이다.
		 	        - 클래스를 유일하게 만들어주는 식별자이다.
		 			
		 	package javaexp.a07_access.A01_Basic
		 	3) 클래스명이 같아도 패키지명이 다르면 다른 클래스로 취급한다.
 		 // 조건 : public이 붙어있는 패키지여야한다.
 		    방법 : 1) javaexp.a07_access.A01_Basic 
 		          -전체 클래스 이름 : 상위패키지.하위패키지.클래스
 		          2) A01_Basic b01=new A01_Basic();
 		          	-이때 해당 패키지를 사용하기 위해 import를 넣어줘야한다.
 		          	 (ctrl+shift+o : import단축키)
 
 */
		
		
			 		      
		        } 
		}
	


