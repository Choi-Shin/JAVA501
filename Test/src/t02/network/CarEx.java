package t02.network;

// class Car 인스턴스 변수명（생성자로 초기화) : 
//차량번호, 입고시간, 출고시간
//method : prn() 차량번호, 입고시간, 출고시간,
//주차요금(=(출고시간- 입고시간)*단가(시간당 2,000원))
//실행 클래스 CarEx 임의 3대 차량을 생성하고 메서드 prn()을 
//이용하는 출력하는 프로그램을 완성하시오.
class Car {
	String carNum;
	int inTime, outTime, fee;
	final int pricePerTime = 2000;
	
	public Car(String num, int in, int out) {
		this.carNum = num;
		this.inTime = in;
		this.outTime = out;
	}
	public void prn() {
		fee = (outTime-inTime)*pricePerTime;
		System.out.println("--주차요금 정산--");
		System.out.println("차량번호: " + carNum);
		System.out.println("입고시간: " + inTime);
		System.out.println("출고시간: " + outTime);
		System.out.println("주차요금: " + fee+ "원");
	}
}

public class CarEx {
	public static void main(String[] args) {
		
		Car c1 = new Car("가1111", 2, 5);
		Car c2 = new Car("나2222", 9, 14);
		Car c3 = new Car("다3333", 5, 8);
		c1.prn();
		c2.prn();
		c3.prn();
	}
	
}
