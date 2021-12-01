package p05_operator2;

public class OperationPrecedence {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int c = 8;
		int d = 3;
		
		double result = 0.0;
		
//		연산 우선순위 (precedence)는 기본적으로 왼쪽에서 오른쪽 방향으로 감
//		우선순위가 높은 연산자를 먼저 처리하고, 동일 연산자는 왼쪽에 위치한 것이 우선순위 높음
//		1) b * c => 24, 2) a + d => 8, 3) 8 + 24 => 32, 4)result = 32
		result = a + d + (b * c);
		System.out.println("result = " + result);
		
//		연산 우선순위에 대한 실제 코딩 가이드
//		=> ()를 적극 활용하라.. => ()가 모든 연산자보다 우선순위가 제일 높음..
//		1) (d + b) = 6, 2) (a + 6) => 11, 3) 11 * c => 88
		result = (a + (d + b)) * c;
		System.out.println("result = " + result);
		

	}

}
