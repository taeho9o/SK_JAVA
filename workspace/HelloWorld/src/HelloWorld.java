import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Random;


public class HelloWorld {
	public static void main(String[] args) {
		String name = null;
		String gender = null;
		String jo = null;
		
		String memberInfo;
		int integerJo;
		
		Scanner scan = new Scanner(System.in);
		StringTokenizer st = null;
		
		Member mem = new Member();
		Random rand = new Random();
		
		memberInfo = scan.nextLine();


		mem.memInfo(memberInfo);
		
		int newJo = mem.randJo();
		System.out.println(newJo+"로 가시오!");
	
	}
}
