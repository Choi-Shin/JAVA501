package p09_breakcontinue;

public class ContinueEx {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i=1; i<=10; i++) {
//			i%2 == 0 => i가 짝수일 때 나머지가 0
			if (i%2 == 1) {
				continue;
			}
			System.out.println(i);
			sum += i;
			}
		System.out.println(sum); // 홀수의 합
//		Continue : for, while, do-while에서 사용
//		           예를 들면 for문인 경우, continue를 실행하면, 
//		           continue의 for문 안에 있는 문장들을 skip하고, for문의 다음 loop를 실행
	}

}
