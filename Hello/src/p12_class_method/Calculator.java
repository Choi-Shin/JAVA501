package p12_class_method;

public class Calculator {
	// field
	
	// Constructor (default)
	
	
	// return type : 
	//	- void (메소드에서 실행한 후 return되는 값이 없음)
	//	- int (메소드에서 실행한 후 return되는 값이 integer data type의 값)
	
	// method 이름, 매개변수 : 개발자의 자유
	
	// method 선언
	// return type : void, method이름: powerOn, 매개변수 : 없음
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	// return type : int, method이름: plus, 매개변수 : int x, int y
	int plus(int x, int y) {
		int result = x + y;
		return result;	// return type이 존재하면 메소드에 return명령어 존재해야함
	}
	
	// return type : double, method이름: divide, 매개변수 : int x, int y
	double divide(int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}







