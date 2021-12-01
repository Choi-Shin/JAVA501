package study04;

public class PrintThread extends Thread {
	SharedArea sharedArea;
	public PrintThread(SharedArea area) {
		sharedArea = area;
	}
	
	@Override
	public void run() {
		for(int cnt=0; cnt<3; cnt++) {
			synchronized (sharedArea) {
				int sum = sharedArea.a.balance + sharedArea.b.balance;
				System.out.println("계좌 잔액 합계: " + sum);
			}
		}
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
