package ex04.nested_class;

public class NestedClassExample {

	public static void main(String[] args) {
		Car c = new Car();
		Car.Tire tire = c.new Tire();
		
		Car.Engine engine = new Car.Engine();
	}

}
