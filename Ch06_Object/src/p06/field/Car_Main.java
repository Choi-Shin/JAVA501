package p06.field;

public class Car_Main {

	public static void main(String[] args) {
		Car c1 = new Car(10);
		System.out.println(c1.a);
		System.out.println(Car.b);
		c1.add();
		
		Car c2 = new Car();
	}

}
