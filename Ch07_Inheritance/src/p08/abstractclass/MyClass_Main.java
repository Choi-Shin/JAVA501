package p08.abstractclass;

public class MyClass_Main {

	public static void main(String[] args) {
		//1. 자식 클래스 객체 생성
		MyClass_Child mc1 = new MyClass_Child();
		System.out.println(mc1.num);
		mc1.methodA();
		mc1.methodB();
		mc1.print();
		
		//2. Polymorphism 1
		MyClass mc3 = new MyClass_Child();
		System.out.println(mc3.num);
		mc3.methodA();
		mc3.methodB();
		((MyClass_Child) mc3).print();
		
		//3. Polymorphism 2 - Anonymous
		MyClass mc2 = new MyClass() {
			@Override
			void methodB() {
				System.out.println("methodB()-Anonymous");
			}
		};
		System.out.println(mc2.num);
		mc2.methodA();
		mc2.methodB();
//		((MyClass_Child) mc2).print(); 불가
	}

}
