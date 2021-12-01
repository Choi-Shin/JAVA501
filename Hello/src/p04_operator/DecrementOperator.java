package p04_operator;

public class DecrementOperator {

	public static void main(String[] args) {
		int i = 5;
		
		if (true) {
//			Java가 부모 block( { } )에서 선언된 변수명과 자식 block에서 선언된
//			변수명이 똑같으면 에러를 발생  =>
//			int i = 10;
		}
		
//		-- => decrement operator
//		1) c = a--  => c = a; a = a - 1; 
//		2) c = --a  => a = a - 1; c = a;
		
		i--;	// i = i - 1;
		System.out.println("i = " + i);

		i = 5;
		--i;	// i = i - 1;
		System.out.println("i = " + i);
		
		i = 5;
		int c;
		c = i--;	// c = i; i = i - 1;
		System.out.println("c = " + c);
		System.out.println("i = " + i);
		
		c = 5;
		c = --i; 	// i = i - 1; c = i;
		System.out.println("c = " + c);
		System.out.println("i = " + i);
		
		int a = 10;
		int b = 10;
		System.out.println("a = " + a--);
		System.out.println("b = " + --b);
	}

}
