package p11_class_T;

public class CarTwoEx {

	public static void main(String[] args) {
		CarTwo myCar = new CarTwo("빨간색", 330);
		System.out.println("myCar 메모리 주소 = " + myCar);
		myCar.color = "회색";

		System.out.println("색깔 = " + myCar.color);
		System.out.println("최대속도 = " + myCar.maxSpeed);
		
		CarTwo myCar1 = new CarTwo("노란색", 380);
		System.out.println("myCar1 메모리 주소 = " + myCar1);

		System.out.println("myCar1 색깔 = " + myCar1.color);
		System.out.println("myCar1 최대속도 = " + myCar1.maxSpeed);
		// heap memory에는 CarTwo class의 인스턴스가 2개 만들어짐 (myCar, myCar1)
		
		CarTwo myCar2 = new CarTwo();
		
		CarTwo myCar3 = new CarTwo("현대", "소나타");
		System.out.println("myCar3 회사 = " + myCar3.company);
		System.out.println("myCar3 모델 = " + myCar3.model);
		
	}

}
