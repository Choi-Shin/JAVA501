package p04_operator;

public class OperatorBasic {

	public static void main(String[] args) {
		int x = 13;
		int y = 5;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
//		정수형 연산중 나누기 연산자는 정확한 값을 구할 수 없고, 몫만 계산 가능
//		나누기 연산자를 통해 정확한 나누기 값을 구하기 위해서는 
//		피연산자의 데이터 타입을 double로 변환해야지만 정확한 값을 구할 수 있음
		System.out.println(x/y);	// 나누기 연산자 / => 몫을 계산
		System.out.println(x%y);	// % 연산자 => 나누기의 나머지를 계산
		System.out.println(++x);	// ++ => increment operator
		System.out.println(--y);	// -- => decrement operator

		System.out.println("double 나누기 연산1 = " + x/(double)y);
		System.out.println("double 나누기 연산2 = " + (double)x/y);
		
		
		int sum1 = 100 + 50;
		int sum2 = sum1 + 250;
		int sum3 = sum2 + sum2;
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
	}

}






