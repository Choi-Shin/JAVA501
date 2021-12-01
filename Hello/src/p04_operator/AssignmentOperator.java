package p04_operator;

public class AssignmentOperator {

	public static void main(String[] args) {
		int x = 10;
		
		x += 5;		// x = x + 5; => 15
		System.out.println("x = " + x);

		int a = 10;
		a -= 3;		// a = a - 3; => 7
		System.out.println("a = " + a);

		int b = 10;
		b *= 3;		// b = b * 3; => 30
		System.out.println("b = " + b);
		
		int c = 10;
		c /= 3;		// c = c / 3; => 3
		System.out.println("c = " + c);
		
		int d = 10;
		d %= 3;		// d = d % 3; => 1
		System.out.println("d = " + d);
	}

}




