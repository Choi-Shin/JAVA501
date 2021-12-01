package ex.movie_thread_daemon;

public class ThreadExample {

	public static void main(String[] args) {
		Thread thread = new MovieThread();
		thread.setDaemon(true);
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		thread.interrupt();
		System.out.println("메인 스레드와 데몬 스레드를 종료합니다.");
	}

}
