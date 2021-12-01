package p01.unchecked_exception;
// 426
public class NumberFormatException1 {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1+value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		} catch (java.lang.NumberFormatException e) {
			System.out.println("숫자형 문자열 입력이 요구됨");
		}
		
		// 인수 배열로 받아서 출력
		
		try {
			int val1 = Integer.parseInt(args[0]);
			int val2 = Integer.parseInt(args[1]);
			
			int result1 = val1+val2;
			System.out.println(args[0] + " + " + args[1] + " = " + result1);
		} catch (java.lang.NumberFormatException e) {
			System.out.println("숫자형 문자열 입력이 요구됨");
		}

	}

}
