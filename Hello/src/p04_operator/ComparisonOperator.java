package p04_operator;

public class ComparisonOperator {

	public static void main(String[] args) {
		int x = 5;
		int y = 3;
		
//		Comparison operator : 비교연산자 ( ==, != >, <, >=, <=)
		
		boolean isEqual;	// 비교연산자는 boolean data type과 밀접한 관계 있음
		isEqual = (x == y);
		System.out.println("x is equal to y = " + isEqual);
		
//		A == B   => A equal to B
		System.out.println("x == y " + (x == y) );

//		A != B   => A not equal to B
		System.out.println("x != y " + (x != y) );
//		A > B   => A greater than B
		System.out.println("x > y " + (x > y) );
//		A < B   => A less than B
		System.out.println("x < y " + (x < y) );
//		A >= B   => A greater than or equal to B
		System.out.println("x >= y " + (x >= y) );
//		A <= B   => A less than or equal to B
		System.out.println("x <= y " + (x <= y) );
	}

}
