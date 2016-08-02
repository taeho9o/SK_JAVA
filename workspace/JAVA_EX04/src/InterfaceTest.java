
public class InterfaceTest {
	public static void main(String[] args) {
		ICalc c = new Calc();
		c.add2(5, 7);
		IPrinterDriver pd = new DotPrinter();
		pd.print("IPrinterDriver");
		DotPrinter dp = new DotPrinter();
		dp.print("DotPrinter");
		Computer cp = new Computer();
		cp.print("Computer");
		ComMultiPrinter cmp = new ComMultiPrinter();
		cmp.print("ComMultiPrinter");
	}
}

interface ICalc {
	public int add2(int i, int j);
}

class Calc implements ICalc {
	public int add2(int i, int j){
		return i + j;
	}
}

interface IPrinterDriver {
	public void print(String message);
}

interface IFaxDriver {
	public void fax(String message, String photo);
}

class DotPrinter implements IPrinterDriver {
	public void print(String message) {
		System.out.println("DotPrinter");
		
	}
}

class Computer {
	public Computer() {
		System.out.println("Computer");
	}
	
	public void print(String message) {
		System.out.println("ComMessage");
	}
}

class ComMultiPrinter extends Computer implements IPrinterDriver, IFaxDriver {

	@Override
	public void fax(String message, String photo) {
		// TODO Auto-generated method stub
		System.out.println(photo + " " + message);
	}

	@Override
	public void print(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
	}
	
}

class BotPrinter implements IPrinterDriver {
	@Override
	public void print(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
	}
}

abstract class I2Calc {
	abstract void print();
}