/*
 * 2016. 07. 26
 * Day 3
 */

/* 
 *��static
 *�ʵ�, �޼ҵ�
 *��ü �����ؼ� ������� ����
 *(Ŭ����).(�����)
 */

public class AccountTest2 {
	public static void main(String[] args) {
		System.out.println(Account2.cnt);
		
		Account2 user1 = new Account2();
		Account2 uesr2 = new Account2();
		
		System.out.println(Account2.cnt);
		System.out.println();
	
		
//		SingleTon st1 = new SingleTon();		//������ public -> private new ��� x
//		SingleTon st2 = new SingleTon();
//		System.out.println(st1 + "\n" +st2);  //�ٸ� �� ��ü

		System.out.println("SingleTon : " + SingleTon.cnt1);
		
		SingleTon st3 = SingleTon.getInstance();
		SingleTon st4 = SingleTon.getInstance();
		
		st3.setName("taeho");
		System.out.println(st3.getName());
		st4.setName("jinhyuk");
		System.out.println(st4.getName());
		
		System.out.println("SingleTon : " + SingleTon.cnt1);
		System.out.println();
		System.out.println(st3 + "\n" +st4);  //�ٸ� �� ��ü
	}
}

class Account2 {
	static int cnt;
	
	//static{ } ����� ����
	static {
		cnt = 100;
		System.out.println("loading Account2");
	}
	
	public Account2() {
		cnt++;
	}
}

class SingleTon {
	private static SingleTon singleTon = new SingleTon();
	static int cnt1;
	String name;
	
	private SingleTon() {
		cnt1++;
	}
	
	public static SingleTon getInstance() {
		return singleTon;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}