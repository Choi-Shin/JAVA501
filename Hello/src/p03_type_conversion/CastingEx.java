package p03_type_conversion;

public class CastingEx {

	public static void main(String[] args) {
		int intValue = 44032;
//		(char) => 방의크기를 char data type의 방의 크기로 강제 조정하라는 의미
//		이것을 casting이라 함 (큰 크기의 방을 가진 변수를 작은 크기의 방을 가지라고 강제 변환)
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}

}
