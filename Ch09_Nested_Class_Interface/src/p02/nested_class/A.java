package p02.nested_class;
// Outer Class
class A {
//	Inner Class
	
	public A() {
		System.out.println("A()湲곕낯�깮�꽦�옄");
	}
	
	//Instance Inner Class
	class B {
		public B() {
			System.out.println("B()湲곕낯�깮�꽦�옄");
		}
		
		int field1;
//		static int field2;
		
		void method1() {};
//		static void method2() {};
	}
	//Static Inner Class
	static class C {
		public C() {
			System.out.println("C()湲곕낯�깮�꽦�옄");
		}
		int field1;
		static int field2;
		
		void method1() {};
		static void method2() {};
	}
	
	void method() {
		// Local Inner Class
		class D {
			public D() {
				System.out.println("D()湲곕낯�깮�꽦�옄");
			}
			
			int field1;
//			static int field2;
			
			void method1() {};
//			static void method2() {};
		}
		D d = new D();
		System.out.println(d.field1);
//		System.out.println(D.field2);
		d.method1();
//		D.method2();
	}

}

class External {
	// 以묒꺽 �겢�옒�뒪媛� �븘�떂
}
