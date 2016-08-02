

public class MakeRandomValue {
	int randValue;
	private static MakeRandomValue rValue = new MakeRandomValue();
	
	public static MakeRandomValue getInstance() {
		return rValue;
	}
	
	public MakeRandomValue() {
	}
	
	public void setRand() {
		randValue = (int) ((Math.random() * 10) + 1);
	}
	
	public int getRand() {
		return randValue;
	}

}

