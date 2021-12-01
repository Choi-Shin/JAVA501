package p02.nested_class;

public class AMain {

	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		
		//B Class
		System.out.println(b.field1);
//		System.out.println(A.B.field2);
		b.method1();
//		A.B.method2();
		
		//C Class
		A.C c = new A.C();
		System.out.println(c.field1);
		System.out.println(A.C.field2);
		c.method1();
		A.C.method2();
		
		a.method();
	}

}
