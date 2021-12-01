package p05.thread_state;

public class ThreadStateExample {

	public static void main(String[] args) {
		StatePrintThread statePrintThread =
				new StatePrintThread(new TargetThread());
		statePrintThread.start();
	}

}
