package p07.polymorphism;
//308

class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

//파일이름 되기 위한 조건 : "public" or "main()
public class Promotion {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//상속관계에서만 다형성 적용
		//Promotion
		//부모클래스 변수 = 자식클래스타입;//자동형변환(Promotion)
		A a1 = (A)b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		//형제 관계인 경우 다형성 불가
		//B b3 = e;
		//C c2 = d;
	}
}
