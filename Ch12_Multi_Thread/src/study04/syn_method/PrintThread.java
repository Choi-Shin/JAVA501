package study04.syn_method;

public class PrintThread extends Thread {
	SharedArea sharedArea;
	public PrintThread(SharedArea area) {
		sharedArea = area;
	}
	
	@Override
	public void run() {
		for(int cnt=0; cnt<3; cnt++) {
			int sum = sharedArea.getTotal();
			System.out.println("계좌잔액 합계: " + sum);
		}
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
