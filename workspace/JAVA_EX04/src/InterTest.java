
public class InterTest {
	public static void main(String[] args) {
		IA a = new A();
		//A b = new A();
		System.out.println(a.add(3, 5));
		//System.out.println(a.product(3, 5));		
		//interface�� ������ �ȵ��־ class A�� �־ ����� �� ����
		
		//System.out.println(a.product(3, 5));
		//System.out.println(b.product(3, 5));
		
		//Father f = new Father();		//abstract�� new�� ��ü�� ������ �� ����
		Father g = new Son();
	}
}

interface IA {		//���� �־���Ѵ�.
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
