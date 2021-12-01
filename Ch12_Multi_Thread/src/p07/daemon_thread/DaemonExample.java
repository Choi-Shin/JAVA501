package p07.daemon_thread;

public class DaemonExample {

	public static void main(String[] args) {
		AutoSaveThread at = new AutoSaveThread();
		at.setDaemon(true);
		at.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println("메인 쓰레드 종료");
	}

}
