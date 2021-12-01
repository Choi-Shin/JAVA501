package p07.polymorphism;

public class ChildExample {

	public static void main(String[] args) {
		//1.자식클래스 객체생성
		Child c = new Child();
		c.method1();
		c.method2();
		c.method3();
		
		//2.polymorphism I
		Parent p1 = c;
		p1.method1();//자동형변환(Promotion)
		p1.method1();//자동형변환(Promotion)
		((Child) p1).method3();//Casting(강제형변환)
		
		//2.polymorphism II - 추천
		Parent p2 = c;
		//자식클래스변수 =(자식클래스)부모클래스타입;
		Child c2 = (Child) p2;//Casting(강제형변환)
		c2.method1();//자동형변환(Promotion)
		c2.method1();//자동형변환(Promotion)
		c2.method3();//Casting(강제형변환)

	}

}
