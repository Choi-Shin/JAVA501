package study04;

public class MultiThreadEx05 {

	public static void main(String[] args) {
		SharedArea sa = new SharedArea();
		sa.a = new Account("1111", "이수일", 20000000);
		sa.b = new Account("2222", "심순애", 10000000);
		
		TransferThread t = new TransferThread(sa);
		t.start();
		
		PrintThread p = new PrintThread(sa);
		p.start();
	}

}
