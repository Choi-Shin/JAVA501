package p08.abstractclass;

public class MyClass_Child extends MyClass {
	//추상 메소드를 재정의 - 강제성, 일관성
	@Override
	void methodB() {
		System.out.println("methodB()-Overriding");
	}
	void print() {
		System.out.println(num);
	}
}
