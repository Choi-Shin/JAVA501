package p09.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExample {

	public static void main(String[] args) throws Exception {
		ExecutorService es = Executors.newFixedThreadPool(2);

		for (int i = 0; i < 10; i++) {
			Runnable r = new Runnable() {

				@Override
				public void run() {
					ThreadPoolExecutor tpe = (ThreadPoolExecutor) es;
					int poolSize = tpe.getPoolSize();
					String threadName = 
							Thread.currentThread().getName();
					System.out.println("[총 스레드 개수: " 
							+ poolSize + "] 작업 스레드 이름: " 
							+ threadName);

					int value = Integer.parseInt("삼");
				}
			};
//			es.execute(r);
			es.submit(r);
			
			Thread.sleep(10);
		}
		es.shutdown();
	}
}
