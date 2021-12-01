package p03.thread_interface;

public class CalcThread extends Thread{
	public CalcThread(String name) {
		setName(name); //Thread Name
	}
	
	@Override
	public void run() {
		for(int i=0; i<200000000; i++) {
			
		}
		System.out.println(getName());
	}
	
}
