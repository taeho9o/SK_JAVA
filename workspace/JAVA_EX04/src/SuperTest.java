
public class SuperTest {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		Parent c2 = new Child();
	
		System.out.println("c2 " + c2.add(3, 5));
		//System.out.println("c2 " + c2.product(3, 5));
		//Child c4 = (Child) (new Parent()); //�ٿ� ĳ���õ� ����
											//java.lang.ClassCastException: Parent cannot be cast to Child
		//Child c3 = (Child) ((Parent) (new Child2()));
		
		System.out.println("p " + p.add(3, 5));
		System.out.println("c " + c.add(3, 5));
		
		Parent p2 = new Child();		//������ Ÿ�� = new ��Ÿ��
										//add��� �Լ��� ������ Ÿ�ӿ� �ִ��� Ȯ�� -> ��Ÿ�ӿ� ������
		//Child c2 = new Parent();		//�ڽ� Ŭ���� = new �θ� Ŭ���� (x)
		//c2.job = "programmer";		//�θ� Ŭ������ ���� job�� ����
		//c2.add(3, 5);
		System.out.println(p2.add(3, 5));	//�ڽĲ��� ȣ��
		
		
	}
}

class Parent extends Object {
	int a = 5;
	public Parent() {
		System.out.println("Create parent.");
	}
	
	public Parent(int a) {
		//System.out.println("Hello");
	}
	
	int add(int i, int j) {
		return i+j;
	}
}

class Child extends Parent {
	int a;
	public Child() {
		super();
		//super(5);	//�θ� ������ ȣ��=
		this.a = super.a;
		System.out.println("Create child.");
	}
	
	//@Override
	int product(int i, int j) {
		return i*j;
	}
	
	@Override
	int add(int i, int j) {
		return i*j;
	}
}

class Child2 extends Parent {
	
}
