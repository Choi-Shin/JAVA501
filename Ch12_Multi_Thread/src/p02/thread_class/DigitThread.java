package p02.thread_class;

public class DigitThread extends Thread {
	@Override
	public void run() {
		for (int i=0; i<10;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
