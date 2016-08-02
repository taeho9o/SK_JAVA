/*
 *  2016. 07. 26
 *  Day 3
 */
public class AccountTest {
	public static void main(String[] args) {
		// hong has 1000 in the sinhan, 11111
		// lee has 100 in the gookmin, 22222
		// withdraw task
		// hong -> lee 500, fees 100

		// Account user1 = new Account();
		// user1.user = "hong";
		// user1.balance = 1000;
		// user1.number = "11111";
		// user1.bank = "sinhan";
		// Account user2 = new Account();
		// user2.user = "lee";
		// user2.balance = 100;
		// user2.number = "22222";
		// user2.bank = "gookmin";s
		Account user1 = new Account("hong", "sinhan", "11111", 1000);
		Account user2 = new Account("lee", "gookmin", "22222", 100);
		Account user3 = new Account("lim", "woori", "33333"); // �����ε�

		// user1.transfer(user2, 1000, user1.bank.equals(user2.bank) ? 0 : 100);
		// user1.transfer(user2, 500, 100);
		
		user1.transfer(user2, 1000);
		System.out.println(user1.getMessage()); // ��ü ���� ���� ���

		System.out.println(user1.getInformBal()); // �ܾ���ȸ
		System.out.println(user2.getInformBal()); // �ܾ���ȸ
	}
}

class Account {
	String user;
	String bank;
	String number;
	int balance; // not local value, but located in the heap.
					// So don't have to initialize
	String message;

	public Account(String user, String bank, String number, int balance) {
		this.user = user;
		this.bank = bank;
		this.number = number;
		this.balance = balance;
	}

	// �����ε� - �Լ��� ������(������)
	public Account(String user, String bank, String number) {
		// this.user = user;
		// this.bank = bank;
		// this.number = number;
		// this.balance = 0;
		this(user, bank, number, 0);
		// new Account(user, bank, number, 0);
		// ��ü�� ���Ӱ� ����� ��
	}

	// if sender
	public boolean transfer(Account to, int money) {
		int fees = bank.equals(to.bank) ? 0 : 100;

		if (getWithdraw(money + fees)) {
			to.setDeposit(money);
			// balance -= (money + fees);
			// to.balance += money;
			message = "��ü ����!";
			return true;
		} else { // �ܾ׺���
			message = "�ܾ׺����մϴ�.";
			return false;
		}
	} // end of transfer()

	public String getInformBal() {
		return user + "(" + bank + ") : " + balance;
	}

	// public void getInformBal() {
	// System.out.println(user + "(" + bank + ") : " + balance);
	// }

	public String getMessage() {
		return message;
	}

	public void setDeposit(int money) {
		balance += money;
	}

	public boolean getWithdraw(int money) {
		if (balance >= money) {
			balance -= money;
			return true;
		} else {
			return false;
		}

	}
}