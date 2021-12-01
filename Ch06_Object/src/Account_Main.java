
public class Account_Main {

	public static void main(String[] args) {
		
		//"1111","홍길동",3000
		
		//1.입력방법1: 변수
		Account a1 = new Account();
		a1.accountNo="1111";
		a1.ownerName="홍길동";
		a1.balance=3000;
		
		//2.입력방법2: 메소드
		Account a2 = new Account();
		a2.setAccountNo("1111");
		a2.setOwnerName("홍길동");
		a2.setBalance(3000);
		
		System.out.println(a2.getAccountNo());
		
		//3.입력방법3: 생성자
		Account a3 = new Account("1111","홍길동",3000);
		//입금: 2000
		a3.deposit(2000);
		//출금: 1000
		int amount;
		try {//3단계
			amount = a3.withdraw(2000);
			System.out.println("인출 금액: "+amount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		System.out.println("Done");
				
		
		
		
		

	}

}
