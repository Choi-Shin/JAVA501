package p03.modifier;

public class This_Outter {
	String field = "Outter-field";
	
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-field");
		}
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(This_Outter.this.field);
			This_Outter.this.method();
		}
	}
}
