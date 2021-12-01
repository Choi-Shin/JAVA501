package p10_reference_variable;

public class ArrayNewInstanceEx {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87};

		int sum = 0;
		
		for (int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("총합 = " + sum);
		
//		int a;
//		a = 10;
		
		String name;
		name = "홍길동";
		System.out.println(name);
//		참조데이터타입인 변수값을 생성 방법 => new + 참조데이터타입(초기값)
		name = new String("홍길동1");
		System.out.println(name);
	}

}




