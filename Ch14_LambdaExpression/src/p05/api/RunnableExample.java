package p05.api;

public class RunnableExample {

	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		};
		
		Thread t = new Thread(r);
		t.start();
	}

}
