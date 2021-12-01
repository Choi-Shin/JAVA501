package p11_class;

public class CarThis {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	CarThis(){
		System.out.println("this 메모리 주소 : " + this);
		
	}
	
	CarThis(String model) {
		this(model, "은색", 250);
	}
	
	CarThis(String model, String color) {
		this(model, color, 250);
	}
	
	CarThis(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
