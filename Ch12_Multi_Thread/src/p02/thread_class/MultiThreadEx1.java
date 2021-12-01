package p02.thread_class;

public class MultiThreadEx1 {

	public static void main(String[] args) {
		Thread t = new DigitThread();
		t.start();
		
		for(char c ='A'; c<='Z'; c++) {
			System.out.println(c);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
