package ex01_control;

public class No05 {

	public static void main(String[] args) {
		int x, y;
		for (x=1; x<=10; x++) {
			int X = 4 * x;
			for(y=1; y<=10; y++) {
				int Y = 5 * y;
				if ( X + Y == 60) {
					System.out.println("(" + x + ", " + y + ")");
				} else {
					continue;
				}
			}
		}

	}

}
