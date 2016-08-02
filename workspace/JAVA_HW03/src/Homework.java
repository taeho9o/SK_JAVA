import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		int[] userValue = new int[6];
		int[] randValue = new int[6];
		
		CheckValue CV = null;
		MakeRandomValue RV = MakeRandomValue.getInstance();
		OutputMessage OM = new OutputMessage();
		Scanner scan = new Scanner(System.in);

		System.out.println(OM.getStartMessage());	//메세지 출력
		
		for (int i = 0; i < 6; i++) {				//유저 숫자 입력
			userValue[i] = scan.nextInt();
		}

		for (int i = 0; i < 6; i++) {				//로또 번호 생성
			RV.setRand();
			randValue[i] = RV.getRand();
		}

		CV = new CheckValue(randValue, userValue);
		CV.setRandValue();							//중복 제거
		
		System.out.println(OM.getLottoMessage());	//로또 결과 메세지 로또 번호는
		System.out.println(CV.getRandValue());		//로또 결과 메세지 0 0 0 0 0 0
		System.out.println();
		
		CV.setCheckLotto();							//당첨 결과
		System.out.print(CV.getCheckLotto());
		System.out.println(OM.getFinalMessage());	//당첨 결과
		
		System.out.println(CV.getPrizeMoney() + OM.getPrizeMessage());
	}
}
