package p06.state_control.yield;

public class JoinExample {

	public static void main(String[] args) {
		SumThread st = new SumThread();
		st.start();
		
		try {
			st.join();
			System.out.println("메인 쓰레드가 일시 정지 상태 입니다.");
		} catch (InterruptedException e) {
			
		}
		
		System.out.println("1~100 합: " + st.getSum());
	}

}
