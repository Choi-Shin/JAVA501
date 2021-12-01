package p08.method;

public class Calculator_Main {

	public static void main(String[] args) {
		//형제 관계는 객체생성 불가 =>상속관계면 가능
		//Calculator_Main cm = new Calculator();
		
		//자기 자신의 객체 생성은 가능
		Calculator c = new Calculator();
		c.add();
		c.add(10, 20);
		int result = c.add(10.5f, 20);
		System.out.println(result);

	}

}
