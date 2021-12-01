package p11_class_T;

public class FieldInitValueEx {

	public static void main(String[] args) {
		// instance 생성
		// class에서 field만 선언하면, 인스턴스생성할 때 java가 자동으로 field값들을
		// 초기화 시켜줌
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("bytefield = " + fiv.b);
		System.out.println("shortfield = " + fiv.s);
		System.out.println("intfield = " + fiv.i);
		System.out.println("longfield = " + fiv.l);
		System.out.println("booleanfield = " + fiv.bl);
		System.out.println("charfield = " + fiv.c);
		System.out.println("floatfield = " + fiv.f);
		System.out.println("doublefield = " + fiv.d);
		System.out.println("arrfield = " + fiv.arrField);
		System.out.println("Stringfield = " + fiv.str);
	}

}
