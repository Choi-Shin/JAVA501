package p11_class_T;

public class Car {
//	field 선언
	String company = "기아자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	// default constructor : 코딩않하고 없으면, java가 자동으로 만들어 줌
	public Car() {
		System.out.println("생성자 Car를 call합니다.");
	}

}
