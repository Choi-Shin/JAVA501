package p04.class_local.variable;

public class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;
		
		// arg = 31; <= final 특성
		// localVar = 41; <= final 특성
		
		MyFunctionalInterface fi = ()-> {
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar + "\n");
		};
		fi.method();
	}
}
