package p01.interfaces;

public class Interface_Main {
//null: 알수 없는 어떤 값(unknown),0도 아니고, 공백도 아닌
	public static void main(String[] args) {
		//1.객체생성
		Interface_Sub it = new Interface_Sub();
		System.out.println(it.a);
		it.add();
		it.add2();
		InterfaceEx1.add3();
		it.subtract();
		
		//2.인터페이스의 다형성I
		InterfaceEx1 ie=null;//메소드안에서 선언된 변수 :local 변수-반드시 초기화
		InterfaceEx1 ie2;//초기화X-출력시 에러 발생
		ie = new Interface_Sub();
		System.out.println(ie.a);
		ie.add();
		ie.add2();
		InterfaceEx1.add3();
		((Interface_Sub) ie).subtract();//Casting
		//System.out.println(ie2);
		
		//3.인터페이스의 다형성II
		ie = new Interface_Sub();
		Interface_Sub its = (Interface_Sub) ie;
		System.out.println(its.a);
		its.add();
		its.add2();
		InterfaceEx1.add3();
		its.subtract();
		
		//4.Anonymous(익명) 구현 객체
		 ie = new InterfaceEx1() {
			
			@Override
			public void add() {
				System.out.println("Anonymous(익명)구현 메소드");
				
			}
		};
		System.out.println(ie.a);
		ie.add();
		ie.add2();
		InterfaceEx1.add3();
		//((Interface_Sub) ie).subtract();
		
	}

}
