package p08.thread_group;

import java.util.Map;
import java.util.Set;

import p07.daemon_thread.AutoSaveThread;

public class ThreadInfoExample {

	public static void main(String[] args) {
		AutoSaveThread ast = new AutoSaveThread();
		ast.setName("AutoSaveThread");
		ast.setDaemon(true);
		ast.start();
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		for(Thread t : threads) {
			System.out.println("Name: " + t.getName() + ((t.isDaemon())?"데몬": "(주)"));
			System.out.println("\t" + "소속그룹: " + t.getThreadGroup().getName());
			System.out.println();
		}
	}

}
