package p01.interfaces;
//Interface : 일반 클래스 - 완전한 클래스, 설계도
//			  추상 클래스 - "미완성 설계도"
//			  인터페이스 - "밑그림만 그려져 있는 설계도", 추상화 정도가 심하다.

//Interface: 강제성,일관성 유지하기 위한 수단으로 사용
//         :다른 클래스를 작성할때 기본이 되는 틀을 제공하면서, 다른 클래스사이의
//            중간 매개 역활까지 담당하는 일종 추상 클래스
//         : 객체생성 ==> 구현한 클래스를 만들어서 객체생성
//         : 추상메소드 사용
//         : 다중 상속
public interface InterfaceEx1 {
    //1.상수: java7
	static final int a =10;
	             int b=20;
     //2.추상 메소드: body가 없는 메소드,"abstract"생략가능, java7
	abstract void add();
	
	//3. default method: Overriding 가능, java7이후 사용가능
	default void add2() {
		System.out.println("default add2()");
	}
	 
	//4.static method(): java7이후로 사용가능
	static void add3() {
		System.out.println("static add3()");
	}
}
