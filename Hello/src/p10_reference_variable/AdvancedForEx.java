package p10_reference_variable;

public class AdvancedForEx {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};

		int sum = 0;
		for (int i = 0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("점수 합계 = " + sum);

		sum = 0;
//		향상된 for문, score => 배열 원소
		for (int score : scores) {
			System.out.println("score = " + score);
			sum += score;
		}
		System.out.println("2nd 점수 합계 = " + sum);
	}

}




