package p03_type_conversion;

public class OperationPromotionEx {

	public static void main(String[] args) {
//		byte b1 = 10;
//		byte b2 = 20;
//		자바는 기본적으로 정수형 산술연산 (+, -, *, /)할 때, integer 타입으로 계산
//		b1, b2을 (int)로 자동형변환
//		byte b3 = (byte) (b1 + b2);
//		int i1 = b1 + b2;
		
		char c1 = 'A';
		char c2 = 1;
//		char c3 = (char) (c1 + c2);
		int i2 = c1 + c2;
		System.out.println("유니코드 = " + i2);
		System.out.println("출력문자 = " + (char) i2);
		
		int i3 = 10;
//		정수형에서 /(나누기) 연산할 때 소숫점을 짤라내 없애 버림
		int i4 = i3 / 4;
		System.out.println(i4);
		
		int i5 = 10;
//		i5 => double로 먼저 변환 (10.0)
//		int i6 = (int) (i5 / 4.0);
		
//		i5 / 4 => 연산결과 2 인데, d1으로 옮기면서 2.0
		double d1 = i5 / 4;
		System.out.println(d1);
//		실수형 산술연산(+, -, *, /)은 기본적으로 double형으로 변환하여 계산
//		=> i5 => 방 8개 바이트로 변환하는데, 값은 10.0으로 변환시키고, 
//		10.0 / 4.0 => 2.5
		double d2 = i5 / 4.0;
		System.out.println(d2);
		
//		long l1 = 10;
//		정수형 산술연산은 자바에서 int로 변환하는 것이 기본인데,
//		산술연산할 때, 피연산자 중에 1개가 long data type이라면, 
//		나머지 피연산자(l1, 20)도 long data type으로 자동 형변환하여 산술연산을 함 
//		int v7 = (int) (l1 + 20);

//		CPU 산술연산은 기본적으로 4bytes(int, float), 8bytes(long, double)를 지원
//		2*3 = 2 + 2 + 2, 2-3 = 2 + (-3),  CPU가 덧셈연산위주로 HW구현되어 있음
	}

}












