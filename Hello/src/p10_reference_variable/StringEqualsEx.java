package p10_reference_variable;

public class StringEqualsEx {

	public static void main(String[] args) {
		String name1 = "신민철";
		// 참조데이터 타입의 초기화 값은 null이 존재
		// null 의미 : 변수에 주소값이 없다. (heap에 실제 데이터가 생성되어 있지 않음)
		String name2 = null;	
		String name3 = "신민철";
		int x = 10;
		int y = 10;
		int z = 15;
		int a= 0;	// 초기화
		
//		비교 연산자,  ==, !=, <, >, <=, >=
		if (x == y) {
			System.out.println("2개의 값이 동일합니다.");
		} else {
			System.out.println("2개의 값이 틀립니다.");
		}

		if (x == z) {
			System.out.println("2개의 값이 동일합니다.");
		} else {
			System.out.println("2개의 값이 틀립니다.");
		}
		
		System.out.println("a = " + a);

		System.out.println("name1 주소 = " + System.identityHashCode(name1));
		System.out.println("name2 주소 = " + System.identityHashCode(name2));
		System.out.println("name3 주소 = " + System.identityHashCode(name3));

//		System.out.println("name1 = " + name1.hashCode());
//		System.out.println("name2 = " + name2.hashCode());
//		System.out.println("name3 = " + name3.hashCode());
		
		name2 = name1;
		
		if (name1 == name2) {
			System.out.println("2개의 문자열의 주소가 동일합니다.");
		} else {
			System.out.println("2개의 문자열의 주소가 동일하지않습니다.");
		}
		
		name2 = null;
		if (name1 == name2) {
			System.out.println("name2가 null, 2개의 문자열의 주소가 동일합니다.");
		} else {
			System.out.println("name2가 null, 2개의 문자열의 주소가 동일하지않습니다.");
		}
		
		name1 = null;
		if (name1 == name2) {
			System.out.println("name1, name2가 null, 2개의 문자열의 주소가 동일합니다.");
		} else {
			System.out.println("name1, name2가 null, 2개의 문자열의 주소가 동일하지않습니다.");
		}

		
//		name1, name3가 동일한 것으로 나옴
		if (name1 == name3) {
			System.out.println("2개의 문자열의 주소가 동일합니다.");
		} else {
			System.out.println("2개의 문자열의 주소가 동일하지않습니다.");
		}
		
		// new : 새로운 데이터를 heap에 무조건 생성하라고 요청, 
		//       name4에는 새로 heap에 생성된 데이터를 가리키는 주소를 넣어달라
		String name4 = new String("신용권");
		String name5 = new String("신용권");
		if (name4 == name5) {
			System.out.println("2개의 문자열의 주소가 동일합니다.");
		} else {
			System.out.println("2개의 문자열의 주소가 동일하지않습니다.");
		}
		System.out.println("name4 주소 = " + System.identityHashCode(name4));
		System.out.println("name5 주소 = " + System.identityHashCode(name5));
		
//		String의 들어간 실제 데이터값이 동일한지 체크하는 방법
//		if (name4.equals(name5) == true) {
		if (name4.equals(name5)) {
			System.out.println("2개의 문자열 값이 동일함");
		}
		System.out.println("name5의 총 문자수 = " + name5.length());
		
		
		String name6 = null;
		
//		실행에러 발생 => 프로그램이 실행하는 동안에 발생하는 에러
//		System.out.println("name 6의 총 문자수 = " + name6.length());
	}

}














