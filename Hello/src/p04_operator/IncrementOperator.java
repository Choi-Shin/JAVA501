package p04_operator;

public class IncrementOperator {

	public static void main(String[] args) {
		int i = 5;
		
//		++ => increment operator
//		1) c = a++  => c = a; a = a + 1; 
//		2) c = ++a  => a = a + 1; c = a;
		
		i++;	// i = i + 1;
		System.out.println("i = " + i);

		i = 5;
		++i;	// i = i + 1;
		System.out.println("i = " + i);
		
		i = 10;
		int c;
		c = i++;	// c = i; i = i + 1;
		System.out.println("c = " + c);
		System.out.println("i = " + i);
		
		i = 10;
		c = ++i; 	// i = i + 1; c = i;
		System.out.println("c = " + c);
		System.out.println("i = " + i);
		
		int a = 10;
		int b = 10;
		System.out.println("a = " + a++);
		System.out.println("b = " + ++b);
	}

}
