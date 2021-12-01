package p07.polymorphism.parameter;

public class DriverExample {

	public static void main(String[] args) {
		
		
		Bus b = new Bus();
		Taxi t = new Taxi();
        Driver d = new Driver();
        //메소드의 다형성
        d.drive(b);
        d.drive(t);
        
        
        Vehicle v1 = new Bus();
        Bus b2 = (Bus) v1;
	}

}
