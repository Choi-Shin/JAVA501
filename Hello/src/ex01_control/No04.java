package ex01_control;

public class No04 {
	public static void main(String[] args) {
		int sum = 0;
		while (true) {
			int dice1 = (int) (Math.random()*6)+1;
			int dice2 = (int) (Math.random()*6)+1;
			sum = dice1 + dice2;
			if (sum == 5) {
				System.out.println("("+dice1+ ", " + dice2+")");
				break;
			} else {
				System.out.println("("+dice1+ ", " + dice2+")");
			}
		}

	}
}
