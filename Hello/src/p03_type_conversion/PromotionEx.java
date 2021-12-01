package p03_type_conversion;

public class PromotionEx {

	public static void main(String[] args) {
//		int i1 = 300;
//		byte b1 = i1; // 에러원인 : 큰 방에서 작은 방의 변수로 값을 넣으면 에러 발생
//		float f1 = 3.14f;
		
//		Promotion : 작은 크기의 data type을 큰 크기의 data type의 변수로 값을 넣을때는
//				부적으로 작은 크기의 data type을 큰 크기로 자동 변환시켜줌(자동 컨버젼)

		byte byteValue = 10;
		int intValue = byteValue;	// 작은 방에서 큰방의 변수로 값을 넣을 때는 정상
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 = " + intValue);
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
		
	}

}

