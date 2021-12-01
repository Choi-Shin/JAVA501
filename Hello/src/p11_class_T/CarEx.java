package p11_class_T;

public class CarEx {

	public static void main(String[] args) {
//		int a;
//		
//		System.out.println(a);	// error 발생
		
		// 인스턴스 생성
		Car myCar = new Car();
		System.out.println("myCar = " + myCar);
		
		// myCar 인스턴스의 field값 읽기
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
//		Car class에서 speed는 변수만 선언했는데, 인스턴스 생성하면 java가 알아서
//		speed 변수값을 0으로 초기화 시켜줌
		System.out.println("현재속도 : " + myCar.speed);
		
		// myCar 인스턴스의 field값 변경
		myCar.speed = 60;
		System.out.println("수정된 현재속도 : " + myCar.speed);
		myCar.color = "노란색";
		System.out.println("수정된 색깔 : " + myCar.color);
	}

}






