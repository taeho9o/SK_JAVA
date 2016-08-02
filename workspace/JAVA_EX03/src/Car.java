/*
 * 2016. 07. 26
 * Day 3
 * java c
 */
public class Car {
	public static void main(String[] args) {
		Tire t;
		t = new Tire();
		Tire t2 = new Tire();
		
		// java.lang.NullPointerException
		Tire t3 = null;
		
		// The local variable t3 may not have been initialized
		// Tire t3;
		System.out.println(t3.toString());
	}
}

class Tire {

}