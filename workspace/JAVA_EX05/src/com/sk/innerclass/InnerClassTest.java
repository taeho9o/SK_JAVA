package com.sk.innerclass;

public class InnerClassTest {
	public static void main(String[] args) {
		A a = new A();
		//A.B a2 = new A.B();
	}
}

class A {
	int a = 10;
	//static class B {
	class B {
		int i;
		void test() {
			a = 20;
		}
	}
	
	void fun() {
		B b =new B();
		b.i = 10;
	}
}
