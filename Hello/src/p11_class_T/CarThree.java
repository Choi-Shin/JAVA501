package p11_class_T;

public class CarThree {
	// field
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	public CarThree() {
		
	}

	public CarThree(String model) {
		this.model = model;
	}

	public CarThree(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

//	Java가 생성자를 구분하는데는 한계가 있음 : 
//	Java가 생성자를 구분하는 방법 : 매개변수의 갯수, data type으로만 구분 가능
//	public CarThree(String color) {
//		this.color = color;
//	}

	public CarThree(String model, String color) {
		this.model = model;
		this.color = color;
	}

	public CarThree(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}





