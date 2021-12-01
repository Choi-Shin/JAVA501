package p01.unchecked_exception;

public class ArrayIndexOutOfBoundsExceptionEx {

//	public static void main(String[] args) {
//		String data1 = args[0];
//		String data2 = args[1];
//
//		System.out.println("args[0]: " + data1);
//		System.out.println("args[1]: " + data2);
//
//	}

//	Exception in thread"main"java.lang.ArrayIndexOutOfBoundsException:
//	Index 0 out of bounds for length 0
//	at p01.unchecked_exception.ArrayIndexOutOfBoundsExceptionEx.
//	main(ArrayIndexOutOfBoundsExceptionEx.java:6)
	
	public static void main(String[] args) {
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
	
			System.out.println("args[0]: " + data1);
			System.out.println("args[1]: " + data2);
		} else {
			System.out.println("[실행 방법]");
			System.out.println("java ArrayIndexOutOfBoundsExceptionEx");
			System.out.println("값1 값2");
		}
	}

}
