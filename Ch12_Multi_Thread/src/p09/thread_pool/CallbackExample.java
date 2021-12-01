package p09.thread_pool;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallbackExample {
	private ExecutorService es;

	public CallbackExample() {
		es = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
	}

	private CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>() {

		@Override
		public void failed(Throwable exc, Void attachment) {
			System.out.println("failed() 실행: " + exc.toString());
		}

		@Override
		public void completed(Integer result, Void attachment) {
			System.out.println("completed() 실행: " + result);
		}
	};
	
	public void doWork(final String x, final String y) {
		Runnable task = new Runnable() {
			@Override
			public void run() {
				try {
					int intX = Integer.parseInt(x);
					int intY = Integer.parseInt(y);
					int result = intX + intY;
					callback.completed(result, null);
				} catch (NumberFormatException e) {
					callback.failed(e, null);
				}
			}
		};
		es.submit(task);
	}
	
	public void finish() {
		es.shutdown();
	}
	public static void main(String[] args) {
		CallbackExample ex = new CallbackExample();
		ex.doWork("3", "3");
		ex.doWork("3", "삼");
		ex.finish();
	}

}
