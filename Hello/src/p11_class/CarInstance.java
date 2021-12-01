package p11_class;

public class CarInstance {
	String model;
	int speed;
	
	CarInstance (String model) {
		this.model = model;
	}
	
	void setSpeed (int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=0; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + 
					"가 달립니다.(시속:" + this.speed + "km/h)" );
		}
	}
}
