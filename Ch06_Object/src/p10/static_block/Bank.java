package p10.static_block;

public class Bank {
	
	String name;
	private static Bank b = new Bank("신한은행");
	//private: 클래스 안에서만 사용하는 접근제어자
	private Bank(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static Bank getB() {
		return b;//주소값
	}
	
	
}
