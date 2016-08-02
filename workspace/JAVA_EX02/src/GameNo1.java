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

		System.out.print("입력하세요. (0: 가위, 1: 바위, 2: 보) : ");
		user = scan.nextLine();
		com = String.valueOf(rand.nextInt(3));

		//->
		temp = user + com;
		System.out.println(temp);

		if (temp.equals("00"))
			result = "비김";
		if (temp.equals("01"))
			result = "졌음";
		if (temp.equals("02"))
			result = "이겼음";
		if (temp.equals("10"))
			result = "이겼음";
		if (temp.equals("11"))
			result = "비겼음";
		if (temp.equals("12"))
			result = "졌음";
		if (temp.equals("20"))
			result = "졌음";
		if (temp.equals("21"))
			result = "이겼음";
		if (temp.equals("22"))
			result = "비겼음";
		System.out.println("결과1 : " + result); // result
		//<-
		
		//->
		intUser = Integer.parseInt(user);
		intCom = Integer.parseInt(com);
		int diff = intUser - intCom;

		if (diff == 0)
			result = "비김";
		else if (diff == 1 || diff == -2)
			result = "이김";
		else if (diff == -1 || diff == 2)
			result = "졌음";
		System.out.println("결과2 : " + result); // result
		//<-
		
		//->
		diff = (diff + 3) % 3;
		result = diff == 0 ? "비김" : diff == 1 ? "이김" : diff == 2 ? "졌음" : "잘못입력";
		System.out.println("결과3 : " + result); // result
		//<-
		
		//->
		int arr[][] = { { 0, -1, 1 }, { 1, 0, -1 }, { -1, 1, 0 } };
		result = arr[intUser][intCom] == 0 ? "비김" : arr[intUser][intCom] == 1 ? "이김" : arr[intUser][intCom] == -1 ? "졌음" : "잘못입력";
		System.out.println("결과4 : " + result); // result
		//<-
		
		////다시 보자
		//->
		diff = intUser - intCom;
		int arr2[] = {1, 2, 0, 1, 2};
		//diff = -2 -1 0 1 2
		//resu =  w  l s w l
		//di+2 =  0  1 2 3 4
		result = arr2[diff + 2] == 0 ? "비김" : arr2[diff + 2] == 1 ? "이김" : arr2[diff + 2] == 2 ? "졌음" : "잘못입력";
		System.out.println("결과5 : " + result); // result
		//<-
	}

}
