package p05.polymorphism.promotion;

interface A{}

class B implements A{}
class C implements A{}
class D extends B{}
class E extends C{}

public class PromotionEx{
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		System.out.println('a');
		//다형성: 자동 형변환(Promotion)
//		A a1 = b;
//		A a2 = c;
//		A a3 = d;
//		A a4 = e;
		
		A a1 = b;
		  a1 = c;
		  a1 = d;
		  a1 = e;
		
		//C c2 = d;불가
	}
}