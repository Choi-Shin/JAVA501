package p06_if_switch;

public class IfElse {

	public static void main(String[] args) {
		int time = 16;
		
		if (time < 10) {
			System.out.println("Good morning");
		} else if (time < 18) {
			System.out.println("Good day");
		} else {
			System.out.println("Good evening");
		}
	}
}
