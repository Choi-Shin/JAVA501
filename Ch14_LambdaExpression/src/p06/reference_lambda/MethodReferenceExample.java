package p06.reference_lambda;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {

	public static void main(String[] args) {
		IntBinaryOperator op;
		op = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println("결과1: " + op.applyAsInt(1, 2));
		
		op = Calculator :: staticMethod;
		System.out.println("결과2: " + op.applyAsInt(3, 4));
		
		Calculator cal = new Calculator();
		op = (x, y) -> cal.instanceMethod(x, y);
		System.out.println("결과3: " + op.applyAsInt(5, 6));
		
		op = cal :: instanceMethod;
		System.out.println("결과4: " + op.applyAsInt(7, 8));
	}

}
