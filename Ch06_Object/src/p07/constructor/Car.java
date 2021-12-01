package p07.constructor;

public class Car {
   
	int num ;
	String name; 
	String color;
	//기본 생성자: 파라미터가 없음
	//Costructor Overloading: 파라미터의 갯수, 순서, 타입이 각각 다른것
	public Car() {
		System.out.println("기본생성자");
	}
	public Car(int num, String name) {
		this.num = num;
		this.name = name;
		
	}
	
	
	//일반 메소드
	public void car() {
		
	}
	//this:현재 클래스
	//this():현재클래스의 기본생성자 호출
	//this(num,name)://현재 클래스의 파라미터가 있는 생성자 호출
	public Car(int num, String name, String color) {
		this(num,name);//현재 클래스에 다른 생성자 호출
		this.color = color;
	}
	
	
	
	
	
	
	
	
	//재정의 : Object class =>  Car 고쳐서 사용
	@Override
	public String toString() {
		
		return super.toString();
	}
	
	@Override
	public boolean equals(Object obj) {//파리미터의 다형성
		
		return super.equals(obj);
	}
}
