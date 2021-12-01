package study04;

public class TransferThread extends Thread {
	SharedArea sharedArea;
	public TransferThread(SharedArea area) {
		sharedArea = area;
	}
	@Override
	public void run() {
		for(int cnt=0; cnt<12; cnt++) {
			synchronized (sharedArea) {
				sharedArea.a.withdraw(1000000);
				sharedArea.b.deposit(1000000);
				System.out.println(sharedArea.a.ownerName + " 계좌 : 100만원 인출, "
						+ sharedArea.b.ownerName + " 계좌 : 100만원 입금");
			}
		}
	}

}
