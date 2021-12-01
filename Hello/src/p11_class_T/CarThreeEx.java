package p11_class_T;

public class CarThreeEx {

	public static void main(String[] args) {
		CarThree car1 = new CarThree();
		System.out.println("car1.company = " + car1.company);
		System.out.println();

		CarThree car2 = new CarThree("자가용");
		System.out.println("car2.company = " + car2.company);
		System.out.println("car2.model = " + car2.model);
		System.out.println();

		CarThree car3 = new CarThree("자가용", "빨강");
		System.out.println("car3.company = " + car3.company);
		System.out.println("car3.model = " + car3.model);
		System.out.println("car3.color = " + car3.color);
		System.out.println();
		
		CarThree car4 = new CarThree("자가용", "빨강", 200);
		System.out.println("car4.company = " + car4.company);
		System.out.println("car4.model = " + car4.model);
		System.out.println("car4.color = " + car4.color);
		System.out.println("car4.maxSpeed = " + car4.maxSpeed);
		System.out.println();
	}

}
