package javaexp.z01_homework;

public class A01_0829 {

	public static void main(String[] args) {
	/*
	 1. �ڹ��� �����ϰ� ���� ����
	    ������: ����� �����ϴ� �� ����� �ٲٴ� ����
	    *�ڹ� �ҽ��ڵ�(.java)�� �ۼ��ϰ�, �����Ϸ�(javac.exe)�� ����
	    �ڹٹ���Ʈ�ڵ�(.class)�� �����Ѵ�.
	    ����, (java.exe)�� ���� ����� ������ �ߵǸ� ����ȴ�. 
	 */
	
	//2.�Ʒ� ���� ����
	// - ���ڿ� ���� ���
	 	String name1 = "�ȳ��ϼ���";
	 	System.out.println(name1);
	 	
	// - ����/�Ǽ� ����� �Ҵ�
	 	int num01 = 10;
	 	double num02 = 20.0;
	 	System.out.println(num01);
	 	System.out.println(num02);
	 	
	 	System.out.println("===================================================");
	//3. �������� �Ʒ��� ���� ���� �� ���
	 	// -�̸�,����,Ű ���� ����
	 	String name2 = "������";
	 	int age = 28;
	 	double old = 174.2;
	 	// - �����ϴ� ���Ǹ�, �߸ų⵵�� ���� ����
	 	String music = "'Tiny Riot'";
	 	int musicDropYear = 2022;
	 	int musicDropMonth = 9;
	 	int musicDropDay = 24;
	 	// ���� ����ݾ� ��ϰ� ���, �ջ�
	 	String thing1 = "���";
	 	String thing2 = "ĸ��Ŀ��";
	 	int cost1 = 4500;
	 	int cost2 = 700;
	 	
	 	//�ڱ�Ұ� ���
	 	System.out.println("�� �̸��� "+name2+"�Դϴ�");
	 	System.out.println("���̴� ����"+age+"���̰�,");
	 	System.out.println("Ű�� �� "+old+"cm�Դϴ�.");
	 	// ����,�߸� ���
	 	System.out.println("���� ���� ��� ������ 'Sam Ryder'�� "+music+"�̶�� �뷡�̸�,");
	 	System.out.println("�� �뷡��"+musicDropYear+"�� "+musicDropMonth+"�� "+musicDropDay+"�Ͽ� �߸ŵǾ����ϴ�.");
	 	// ���� ���� ��� �� ��� ���
	 	System.out.println("������ ���������� ���,"+thing1+"��"+thing2+"�� ���� ����ݸ� �ֽ��ϴ�.");
	 	System.out.println("���� "+cost1+"�� ĸ��Ŀ�Ǵ� ����"+cost2+"�� �Դϴ�.");
	 	System.out.println("���� 1�� �� ĸ��Ŀ�Ǵ� 4���� �����Ͽ�, ��"+(cost1+(cost2*4))+"���� ������ �־����ϴ�.");
	 	

	}

}
