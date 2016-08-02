
public class CheckValue {
	int cnt = 0;
	int[] randValue = new int[6];
	int[] userValue = new int[6];
	MakeRandomValue RV = new MakeRandomValue();
	
	public CheckValue(int[] randValue, int[] userValue) {
		this.randValue = randValue;
		this.userValue = userValue;
	}
	
	public void setRandValue() {
		for (int i = 0; i < 6; i++) {
			RV.setRand();
			randValue[i] = RV.getRand();
			for (int j = 0; j < i; j++) {
				if (randValue[i] == randValue[j]) {
					i--;
				} // if loop
			} // j for loop
		} // i for loop
	}

	public String getRandValue() {
		String randValue = "";
		for(int i = 0; i<6; i++) {
			randValue += String.valueOf(this.randValue[i]) + " ";
		}
		return randValue;
	}
	
	public void setCheckLotto() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (userValue[i] == randValue[j]) {
					cnt++;
				}	//if loop
			}	//j for loop
		}	//i for loop
	}

	public int getCheckLotto() {
		return cnt;
	}
	
	public String getPrizeMoney() {
		int prize = (int) Math.pow(cnt, cnt)*45000;
		String sPrize = String.valueOf(prize);
//		if(sPrize.length() > 3) {
//			//sPrize = sPrize.substring(sPrize.length()-3, sPrize.length()) + ",000";
//			sPrize = sPrize.substring(0, sPrize.length()-3) + "," + sPrize.substring(sPrize.length()-3, sPrize.length()) ;
//		}
		int i = 3;
		while(sPrize.length() > i) {
			//sPrize = sPrize.substring(sPrize.length()-3, sPrize.length()) + ",000";
			sPrize = sPrize.substring(0, sPrize.length()-i) + "," + 
			sPrize.substring(sPrize.length()-i, sPrize.length()) ;
			i+=4;
		}
		return sPrize;
	}
}
