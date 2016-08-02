
public class InterTest {
	public static void main(String[] args) {
		IA a = new A();
		//A b = new A();
		System.out.println(a.add(3, 5));
		//System.out.println(a.product(3, 5));		
		//interface에 선언이 안돼있어서 class A에 있어도 사용할 수 없다
		
		//System.out.println(a.product(3, 5));
		//System.out.println(b.product(3, 5));
		
		//Father f = new Father();		//abstract는 new로 객체를 생성할 수 없음
		Father g = new Son();
	}
}

interface IA {		//선언만 있어야한다.
	public int add(int i, int j);
	//public int product(int i, int j);
//	public static int product(int i, int j) {
//		return i * j * 100;
//	}
	//public int product(int i, int j);
}

class A implements IA{
	public int add(int i, int j) {
		return i + j;
	}
	
	public int product(int i, int j) {
		return i * j;
	}
}

abstract class Father {
	public void getAge(int age) {};
	public void getSon() {};
	public void getMoney() { }
}

class Son extends Father {

	@Override
	public void getAge(int age) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getSon() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void getMoney() {
		
	}
	
}
