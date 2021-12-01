package p05.polymorphism.promotion;

public class Fly_Main {

	public static void main(String[] args) {
		
		Fly_Impl fi = new Fly_Impl();
		fi.fly();
		fi.move();
		
		Flyable fy = new Fly_Impl();
		Vehicle2 v = (Vehicle2) fy; // Casting
		fy.fly();
		((Vehicle2) fy).move(); //Casting
		v.move();
		
	}

}
