
public class OutputMessage {
	String startMessage;
	String userMessage;
	String lottoMessage;
	String finalMessage;
	String prizeMessage;
	
	public String getStartMessage() {
		startMessage = "로또 세계에 오신 것을 환영합니다.\n6개 숫자를 입력하세요.";
		return startMessage;
	}
	
	public String getLottoMessage() {
		lottoMessage = "\n로또 번호 : ";
		return lottoMessage;
	}
	
	public String getFinalMessage() {
		finalMessage = "개 맞췄습니다.";
		return finalMessage;
	}
	
	public String getPrizeMessage() {
		prizeMessage = "원에 당첨되셨습니다.\n축하드립니다!";
		return prizeMessage;
	}
	
}
