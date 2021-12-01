package p13_class_advanced;

// import : 다른 package의 있는 class를 내가 library로 사용할 것이라고 선언
import t01_import.hankook.SnowTire;
import t01_import.hankook.Tire;
import t01_import.hyundai.Engine;
import t01_import.kumho.BigWidthTire;

public class Car {
	// field
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	Tire tire3 = new Tire();
	t01_import.kumho.Tire tire4 = new t01_import.kumho.Tire();
}
