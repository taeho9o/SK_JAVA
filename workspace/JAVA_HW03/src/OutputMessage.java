
public class OutputMessage {
	String startMessage;
	String userMessage;
	String lottoMessage;
	String finalMessage;
	String prizeMessage;
	
	public String getStartMessage() {
		startMessage = "�ζ� ���迡 ���� ���� ȯ���մϴ�.\n6�� ���ڸ� �Է��ϼ���.";
		return startMessage;
	}
	
	public String getLottoMessage() {
		lottoMessage = "\n�ζ� ��ȣ : ";
		return lottoMessage;
	}
	
	public String getFinalMessage() {
		finalMessage = "�� ������ϴ�.";
		return finalMessage;
	}
	
	public String getPrizeMessage() {
		prizeMessage = "���� ��÷�Ǽ̽��ϴ�.\n���ϵ帳�ϴ�!";
		return prizeMessage;
	}
	
}
