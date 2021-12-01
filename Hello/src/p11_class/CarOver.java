package p11_class;

public class CarOver {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	CarOver() {	
	}
	
	CarOver(String model) {
		this.model = model;
	}
	
	CarOver(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	CarOver(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
