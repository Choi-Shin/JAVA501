package p07.string;

public class StringSubStringExample {

	public static void main(String[] args) {
		String ssn = new String("880815-1234567");
		String str = ssn.substring(0, 6);//0~5
		System.out.println(str);
		String str2 = ssn.substring(7);//0~5
		System.out.println(str2);
		char c2 = ssn.charAt(7);//0~5
		System.out.println(c2);
		
		
		System.out.println("-------------");
		//문자열("10") => 숫자 : Integer class
		int result1 = Integer.parseInt("10");
		System.out.println(result1);
		
		Integer int2 = new Integer("10");
		int result2 = int2.intValue();
		System.out.println(result2);
		
		//숫자(100) => 문자열("100"): String class
		
		String str3 =  String.valueOf(100);
		System.out.println(str3);
		
		int r = Integer.SIZE;
		System.out.println(r);
		
	}

}
