package p08.abstractclass;

//Abstract Class : 추상 메소드가 있는 클래스
//				   반드시 "abstract" 표시
//				   일반클래스 = 자동차 공장의 설계도
//				   추상클래스 = 자동차 공장의 미완성 설계도
//				   객체 생성 불가 => 자식 객체를 만들어서 사용
public abstract class MyClass {
	int num = 3;

	// Constructor Overloading
	public MyClass() {

	}

	public MyClass(int num) {
		this.num = num;
	}

	public void methodA() {
		System.out.println("methodA()");
	}

	// 추상 메소드: 선언문만 있는 미완성 메소드, body가 없는 것
	// 오버라이딩하여 사용.
	// 반드시 "abstract" 표시
	// 자식클래스를 통해서 반드시 상속해서 재정의 사용
	abstract void methodB();

}
