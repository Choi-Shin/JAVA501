package p04_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		int x = 5;
		
//		Logical Operator(논리 연산자) =>  || (or) ,  &&(and), !(not)
		
		System.out.println("x > 5 && x < 10 = " + (x > 5 && x < 10) );
		System.out.println("x < 5 || x < 4 = " + (x < 5 || x < 4) );
		System.out.println("!(x > 5 && x < 10) = " + !(x > 5 && x < 10) );
		
//		논리연산자는 boolean data type과 밀접한 관계 있음
		boolean isCheck;
		isCheck = (x > 5 && x < 10);
		System.out.println("isCheck = " + isCheck);
	}

}
