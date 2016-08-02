import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		int[] userValue = new int[6];
		int[] randValue = new int[6];
		
		CheckValue CV = null;
		MakeRandomValue RV = MakeRandomValue.getInstance();
		OutputMessage OM = new OutputMessage();
		Scanner scan = new Scanner(System.in);

		System.out.println(OM.getStartMessage());	//�޼��� ���
		
		for (int i = 0; i < 6; i++) {				//���� ���� �Է�
			userValue[i] = scan.nextInt();
		}

		for (int i = 0; i < 6; i++) {				//�ζ� ��ȣ ����
			RV.setRand();
			randValue[i] = RV.getRand();
		}

		CV = new CheckValue(randValue, userValue);
		CV.setRandValue();							//�ߺ� ����
		
		System.out.println(OM.getLottoMessage());	//�ζ� ��� �޼��� �ζ� ��ȣ��
		System.out.println(CV.getRandValue());		//�ζ� ��� �޼��� 0 0 0 0 0 0
		System.out.println();
		
		CV.setCheckLotto();							//��÷ ���
		System.out.print(CV.getCheckLotto());
		System.out.println(OM.getFinalMessage());	//��÷ ���
		
		System.out.println(CV.getPrizeMoney() + OM.getPrizeMessage());
	}
}
