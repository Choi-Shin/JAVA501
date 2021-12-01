package p03.thread_interface;

public class MultiThreadEx2 {

	public static void main(String[] args) {
		
		SmallLetter s = new SmallLetter();
//		Thread t = new Thread();
		Thread t = new Thread(s);
		t.start();
		
		char[] ch = {'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ'};
		for(char c:ch) {
			System.out.println(c);
			try {
				t.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
