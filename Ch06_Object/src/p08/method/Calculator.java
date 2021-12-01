package p08.method;

public class Calculator {
 int a=10;
	//Method Overloading: 메소드명이 같고, 파리미터의 갯수,순서,타입이 각각 다른 것
	//void: 메소드 수행만 하고 결과값을 불러온 곳에 반환하지 않는다.
	void add() {
		System.out.println("add()");
	}
	void add(int a, int b) {
		System.out.println("add(int a, int b): "+(a+b));
		return;//리턴 생략 가능
	}
	int add(float a, int b) {
		System.out.println("add(float a, int b)");
		return (int) (a+b);//리턴 생략 가능
	}
}
