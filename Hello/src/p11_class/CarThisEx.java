package p11_class;

public class CarThisEx {

	public static void main(String[] args) {
		CarThis car1 = new CarThis();
		System.out.println("car1.company : " + car1.company);
		System.out.println("주소 : " + car1);
		System.out.println();
		
		CarThis car2 = new CarThis("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);

		System.out.println("주소 : " + car2);
		System.out.println();
		
		CarThis car3 = new CarThis("자가용", "빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		CarThis car4 = new CarThis("택시", "검정", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		
		}

}
