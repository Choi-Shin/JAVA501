package p11_class_T;

public class CarTwo {
//	field 선언
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	// default constuctor : class에서 다른 생성자가 만들어지면
	// 						java에서 default 생성자를 자동으로 만들어주지 않음
	public CarTwo() {
		System.out.println("default 생성자 CarTwo() 호출");
	}
	
	// 생성자(Constructor) : method의 일종, 
	// 다른 class에서 new로 인스턴스를 새로 만들 때 1번만 실행
	// CarTwo("빨간색", 330)
	// 생성자의 용도?? : class 초기화할 때 사용 (field값 초기화할 때 사용)
	CarTwo (String color, int maxSpeed) {
		System.out.println("생성자 color = " + color);
		System.out.println("생성자 maxSpeed = " + maxSpeed);
		this.color = color;	// CarTwo myCar1 = new CarTwo("빨간색", 330);
		this.maxSpeed = maxSpeed;
		// this : java에서 제공하는 변수 이름 (new로 생성된 해당 class 인스턴스)
		System.out.println("this 메모리 주소 = " + this);
	}

	CarTwo (String company, String model) {
		System.out.println("생성자 회사 = " + company);
		System.out.println("생성자 모델 = " + model);
		this.company = company;
		this.model = model;
	}

}




