package p01.unchecked_exception;

public class NumFormatExceptionEx {

	public static void main(String[] args) {
//		String data1 = "100";
//		String data2 = "a100";
//		
//		int value1 = Integer.parseInt(data1);
//		int value2 = Integer.parseInt(data2);
//		
//		int result = value1 + value2;
//		System.out.println(data1 + " + " + data2 + " = " + result);
//		
//		Exception in thread "main" java.lang.NumberFormatException: For input string: "a100"
//			at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//			at java.base/java.lang.Integer.parseInt(Integer.java:660)
//			at java.base/java.lang.Integer.parseInt(Integer.java:778)
//			at p01.unchecked_exception.NumFormatExceptionEx.main(NumFormatExceptionEx.java:10)
		
		try {
			String data1 = "100";
			String data2 = "a100";
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		} catch (java.lang.NumberFormatException e) {
			System.out.println("숫자형식 예외발생!");
		}
	}

}
