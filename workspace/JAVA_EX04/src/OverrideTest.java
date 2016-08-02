
public class OverrideTest {
	public static void main(String[] args) {
		
		Config.print = 0;
		
		WordProcessor wp = new WordProcessor();
		wp.printDocument("Hello java");
	}
}

interface IPrint {
	public int print();
	public void printDocument();
	
}
class Config {
	public static int print = 0;
	
}

class WordProcessor {
	void printDocument(String message) {

		PrinterDriver driver = null;
		
		int code = 2;	//0 lz, 1 ink, 2 3d
		if(Config.print == 0) {
			driver = new LazerPrinter();
		}
		else if(Config.print == 1) {
			driver = new InkPrinter();
		}
		else if(Config.print == 2) {
			driver = new EDPrinter();
		}
		
		driver.print("date : 2016. 07. 27");
		driver.print(message);
		driver.print("page : 0");
		
	}
}

abstract class PrinterDriver {
	public PrinterDriver() {
		System.out.println("드라이버 생성");
	}
	
	abstract void print(String message);
}

class LazerPrinter extends PrinterDriver {
	public LazerPrinter() {
		System.out.println("LazerPrinter연결");
	}
	
	void print(String message) {
		System.out.println("LZ : " + message);
	}
}

class InkPrinter extends PrinterDriver {
	public InkPrinter() {
		System.out.println("InkPrinter연결");
	}
	
	void print(String message) {
		System.out.println("Int : " + message);
	}
}

class EDPrinter extends PrinterDriver {
	public EDPrinter() {
		System.out.println("3DPrinter연결");
	}
	
	void print(String message) {
		System.out.println("3D : " + message);
	}
}
