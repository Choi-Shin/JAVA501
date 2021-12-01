package study04.syn_method;

public class Account {
	String accounNo;
	String ownerName;
	int balance;
	public Account() {
	}
	public Account(String accounNo, String ownerName, int balance) {
		this.accounNo = accounNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	int withdraw (int amount) {
		if(balance < amount) {
			return 0;
		} else {
			balance -= amount;
			return amount;
		}
	}
	
}
