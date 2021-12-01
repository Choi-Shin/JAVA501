package p10_reference_variable;

public class ArrayBasicEx {

	public static void main(String[] args) {
//		{73, 85, 92, 99} => 배열 초기값
//		배열 data type : int[] => int는 배열 원소의 데이터 타입을 말함, [] : Array
//		변수명 : scores (값은 heap memory의 주소값을 갖고 있음)
		int[] scores = {73, 85, 92, 99, 81, 65};
		int[] scores1 = {73, 85, 92, 99};
//		int s1 = 73;
//		int s2 = 85;
//		int s3 = 92;
		
		scores[0] = 85;
//		scores[index] => index는 0부터 시작, 마지막 index = 전체 데이터 갯수 - 1
		System.out.println("scores[0] = " + scores[0]);
		System.out.println("scores[1] = " + scores[1]);
		System.out.println("scores[2] = " + scores[2]);
		System.out.println("scores[3] = " + scores[3]);
		System.out.println("scores[4] = " + scores[4]);

		if (scores == scores1) {
			System.out.println("2개의 배열의 주소가 동일합니다.");
		} else {
			System.out.println("2개의 배열의 주소가 동일하지않습니다.");
		}
		System.out.println("scores 주소 = " + System.identityHashCode(scores));
		System.out.println("scores1 주소 = " + System.identityHashCode(scores1));

		int sum = 0;
		System.out.println("scores.length : " + scores.length);
		for (int i=0; i<scores.length;i++) {
			sum += scores[i];
		}
//		sum = s1 + s2 + s3 .... ; => 코딩량이 늘어나고, 에러발생 확률 높아짐..
		System.out.println("총합 : " + sum);
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}

}









