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
			System.out.print("�Է��ϼ���. (0: ����, 1: ����, 2: ��) : ");
			user = scan.nextInt();
			com = rand.nextInt(3);

			diff = user - com;

			result = user == 0 ? "����" : 
				user == 1 ? "����" : 
				user == 2 ? "��" : "�߸��Է�";
			result2 = com == 0 ? "����" : 
				com == 1 ? "����" : 
				com == 2 ? "��" : "�߸��Է�";
			
			if (diff == 0) {
				result3 = "���";
				save++;
			}
			else if (diff == 1 || diff == -2) {
				result3 = "�̱�";
				win++;
			}
			else if (diff == -1 || diff == 2) {
				result3 = "����";
				lose++;
			}
			
			System.out.println("����� " + result + " ��ǻ�ʹ� " + result2 + " || " + result3 + " ||"); // result

			System.out.print("����Ͻðڽ��ϱ�?(Y:�ƹ�����, N:-1) ");
			temp = scan.nextInt();
		}
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		System.out.println("����Ǿ����ϴ�.");
		System.out.println(win + "�� " + save + "�� " + lose + "�� ");
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

	}
}
