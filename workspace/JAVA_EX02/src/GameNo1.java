import java.util.Random;
import java.util.Scanner;

public class GameNo1 {
	public static void main(String[] args) {
		String user, com;
		String temp;
		String result = null;
		int intUser, intCom;

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		System.out.print("�Է��ϼ���. (0: ����, 1: ����, 2: ��) : ");
		user = scan.nextLine();
		com = String.valueOf(rand.nextInt(3));

		//->
		temp = user + com;
		System.out.println(temp);

		if (temp.equals("00"))
			result = "���";
		if (temp.equals("01"))
			result = "����";
		if (temp.equals("02"))
			result = "�̰���";
		if (temp.equals("10"))
			result = "�̰���";
		if (temp.equals("11"))
			result = "�����";
		if (temp.equals("12"))
			result = "����";
		if (temp.equals("20"))
			result = "����";
		if (temp.equals("21"))
			result = "�̰���";
		if (temp.equals("22"))
			result = "�����";
		System.out.println("���1 : " + result); // result
		//<-
		
		//->
		intUser = Integer.parseInt(user);
		intCom = Integer.parseInt(com);
		int diff = intUser - intCom;

		if (diff == 0)
			result = "���";
		else if (diff == 1 || diff == -2)
			result = "�̱�";
		else if (diff == -1 || diff == 2)
			result = "����";
		System.out.println("���2 : " + result); // result
		//<-
		
		//->
		diff = (diff + 3) % 3;
		result = diff == 0 ? "���" : diff == 1 ? "�̱�" : diff == 2 ? "����" : "�߸��Է�";
		System.out.println("���3 : " + result); // result
		//<-
		
		//->
		int arr[][] = { { 0, -1, 1 }, { 1, 0, -1 }, { -1, 1, 0 } };
		result = arr[intUser][intCom] == 0 ? "���" : arr[intUser][intCom] == 1 ? "�̱�" : arr[intUser][intCom] == -1 ? "����" : "�߸��Է�";
		System.out.println("���4 : " + result); // result
		//<-
		
		////�ٽ� ����
		//->
		diff = intUser - intCom;
		int arr2[] = {1, 2, 0, 1, 2};
		//diff = -2 -1 0 1 2
		//resu =  w  l s w l
		//di+2 =  0  1 2 3 4
		result = arr2[diff + 2] == 0 ? "���" : arr2[diff + 2] == 1 ? "�̱�" : arr2[diff + 2] == 2 ? "����" : "�߸��Է�";
		System.out.println("���5 : " + result); // result
		//<-
	}

}
