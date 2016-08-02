package com.sk.interfaceex;

public class CarTest {
	public static void main(String[] args) {
		HankookTire ht1 = new HankookTire();
		HankookTire ht2 = new HankookTire();
		HankookTire ht3 = new HankookTire();
		KumhoTire kh = new KumhoTire();

		Car c = new Car(ht1, ht2, ht3, kh);
		Car2 c1 = new Car2(ht1, ht2, ht3, kh);
		c.run();
		c1.run();
	}
}

interface Tire {
	public void roll();
	public default void blink() {
		System.out.println("blink");
	}
}

interface Tire2 {
	public void roll();
	public void blink();
}

interface Tire3 extends Tire {
	public void blink();
}

class HankookTire implements Tire {

	@Override
	public void roll() {
		System.out.println("한국타이어 제품");
	}
}

class KumhoTire implements Tire {

	@Override
	public void roll() {
		System.out.println("금호타이어 제품");
	}
}

class Car {
	Tire frontLeft;
	Tire frontRight;
	Tire backLeft;
	Tire backRight;

	Car(Tire fl, Tire fr, Tire bl, Tire br) {
		// frontLeft = new HankookTire(); //타이어의 선택을 할 수 없다.
		frontLeft = fl;
		frontRight = fr;
		backLeft = bl;
		backRight = br;
	}

	public void run() {
		frontLeft.roll();
		frontRight.roll();
		backLeft.roll();
		backRight.roll();
	}
}

class Car2 {
	Tire tires[] = new Tire[6];

	Car2(Tire fl, Tire fr, Tire bl, Tire br) {
		// frontLeft = new HankookTire(); //타이어의 선택을 할 수 없다.
		tires[0] = fl;
		tires[1] = fr;
		tires[2] = bl;
		tires[3] = br;
	}

	public void run() {
		for (int i = 0; i < tires.length; i++) {
			if (tires[i] != null) {
				tires[i].roll();
				tires[i].blink();
			}
		}
	}
}