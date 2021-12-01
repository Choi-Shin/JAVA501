package p12_class_method;

public class Car {
	// field
	int gas;
	
	// constructor (default)
	
	// method
	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			// return 명령어를 만나면, 다음 소스코드를 실행안하고 메소드를 종료
			return false;
		} 
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while (true) {
			if (gas>0) {
				System.out.println("달립니다.(gas잔량: " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량: " + gas + ")");
//				return; => void용 return명령어
				return;
			}
		}
	}
}






