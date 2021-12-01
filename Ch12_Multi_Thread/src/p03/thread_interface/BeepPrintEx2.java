package p03.thread_interface;

import java.awt.Toolkit;

public class BeepPrintEx2 {

	public static void main(String[] args) {
		// how 1
		BeepTask b = new BeepTask();
		Thread t = new Thread(b);
		t.start();
		// how 2
		Runnable r = new BeepTask();
		Thread t2 = new Thread(r);
		t2.start();

		// how 3
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				Toolkit t = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					t.beep();
					System.out.println("t3");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					}
				}
			}
		});
		t3.start();
		Thread t4 = new Thread(() -> {
			Toolkit t1 = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				t1.beep();
				System.out.println("t4");
				;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
		});
		t4.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("main");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}

	}

}
