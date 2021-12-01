package p05.polymorphism.array;

public class Car {
	// Array polymorphism
	Tire[] tires = { new HankookTire(), new HankookTire(), new HankookTire(), new HankookTire() };

	void run() {
		for (Tire t : tires)
			t.roll();

	}
}
