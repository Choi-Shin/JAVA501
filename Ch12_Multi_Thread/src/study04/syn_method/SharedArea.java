package study04.syn_method;

public class SharedArea {
	private int balance;
	Account a;
	Account b;
	
	synchronized void transfer(int amount) {
		a.withdraw(amount);
		b.deposit(amount);
		System.out.println(a.ownerName + " 계좌 : " + amount + "만원 인출, " 
		+ b.ownerName + " 계좌 : " + amount + "만원 입금");
	}
	
	synchronized int getTotal() {
		return a.balance + b.balance;
	}
}
