package study04;

public class SharedArea {
	private int balance;
	Account a;
	Account b;

	public synchronized void setBalance (int balance) {
		this.balance = balance;
	}
}
