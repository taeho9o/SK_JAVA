
public class SuperTest {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		Parent c2 = new Child();
	
		System.out.println("c2 " + c2.add(3, 5));
		//System.out.println("c2 " + c2.product(3, 5));
		//Child c4 = (Child) (new Parent()); //다운 캐스팅도 가능
											//java.lang.ClassCastException: Parent cannot be cast to Child
		//Child c3 = (Child) ((Parent) (new Child2()));
		
		System.out.println("p " + p.add(3, 5));
		System.out.println("c " + c.add(3, 5));
		
		Parent p2 = new Child();		//컴파일 타임 = new 런타임
										//add라는 함수가 컴파일 타임에 있는지 확인 -> 런타임에 따른다
		//Child c2 = new Parent();		//자식 클래스 = new 부모 클래스 (x)
		//c2.job = "programmer";		//부모 클래스에 변수 job이 없음
		//c2.add(3, 5);
		System.out.println(p2.add(3, 5));	//자식꺼를 호출
		
		
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
		//super(5);	//부모 생성자 호출=
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
