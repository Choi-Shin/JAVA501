package p11_class_T;

public class CarFour {
	// field
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// constructor
	public CarFour() {
		
	}

	public CarFour(String model) {
		// this(...); => 다른 생성자를 call(실행)
		this(model, "은색", 250);
//		this.model = model;
//		this.color = "은색";
//		this.maxSpeed = 250;
	}
	
	public CarFour(String model, String color) {
		this(model, color, 250);
	}
	
	public CarFour(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}




