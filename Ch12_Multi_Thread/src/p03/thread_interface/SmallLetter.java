package p03.thread_interface;

public class SmallLetter implements Runnable {

	@Override
	public void run() {
		for(char c = 'a'; c<='z'; c++) {
			System.out.println(c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			
		}
	}

}
