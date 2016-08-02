import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		int user, com;
		int diff;
		String result = null;
		String result2 = null;
		String result3 = null;
		int win = 0, lose = 0, save = 0;

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		// int i = 0;
		// while(i<10) {
		// System.out.println((int)(Math.random() *3));
		// i++;
		// }

		int temp = 0;
		while (temp != -1) {
			System.out.print("입력하세요. (0: 가위, 1: 바위, 2: 보) : ");
			user = scan.nextInt();
			com = rand.nextInt(3);

			diff = user - com;

			result = user == 0 ? "가위" : 
				user == 1 ? "바위" : 
				user == 2 ? "보" : "잘못입력";
			result2 = com == 0 ? "가위" : 
				com == 1 ? "바위" : 
				com == 2 ? "보" : "잘못입력";
			
			if (diff == 0) {
				result3 = "비김";
				save++;
			}
			else if (diff == 1 || diff == -2) {
				result3 = "이김";
				win++;
			}
			else if (diff == -1 || diff == 2) {
				result3 = "졌음";
				lose++;
			}
			
			System.out.println("당신은 " + result + " 컴퓨터는 " + result2 + " || " + result3 + " ||"); // result

			System.out.print("계속하시겠습니까?(Y:아무숫자, N:-1) ");
			temp = scan.nextInt();
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("종료되었습니다.");
		System.out.println(win + "승 " + save + "무 " + lose + "패 ");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

	}
}
