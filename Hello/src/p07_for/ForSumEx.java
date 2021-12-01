package p07_for;

public class ForSumEx {

	public static void main(String[] args) {
		int sum = 0;
		int initValue = 1;
		int lastValue = 200;
		for(int i=initValue; i<=lastValue; i++) {
			sum += i; // sum = sum + i
//			System.out.println("temp sum = " + sum);
		}
		System.out.println(initValue + "~" + lastValue + "의 합 = " + sum);
	}

}
