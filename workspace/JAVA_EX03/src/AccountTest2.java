/*
 * 2016. 07. 26
 * Day 3
 */

/* 
 *▶static
 *필드, 메소드
 *객체 생성해서 사용하지 않음
 *(클래스).(멤버명)
 */

public class AccountTest2 {
	public static void main(String[] args) {
		System.out.println(Account2.cnt);
		
		Account2 user1 = new Account2();
		Account2 uesr2 = new Account2();
		
		System.out.println(Account2.cnt);
		System.out.println();
	
		
//		SingleTon st1 = new SingleTon();		//생성자 public -> private new 사용 x
//		SingleTon st2 = new SingleTon();
//		System.out.println(st1 + "\n" +st2);  //다른 두 객체

		System.out.println("SingleTon : " + SingleTon.cnt1);
		
		SingleTon st3 = SingleTon.getInstance();
		SingleTon st4 = SingleTon.getInstance();
		
		st3.setName("taeho");
		System.out.println(st3.getName());
		st4.setName("jinhyuk");
		System.out.println(st4.getName());
		
		System.out.println("SingleTon : " + SingleTon.cnt1);
		System.out.println();
		System.out.println(st3 + "\n" +st4);  //다른 두 객체
	}
}

class Account2 {
	static int cnt;
	
	//static{ } 실행시 수행
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