package p07_for;

public class ForPrintTen {

	public static void main(String[] args) {
		
//		int i=1 => i가 1부터 시작하라
//		i<15 => i<15 의 조건식(boolean)이 true인 경우만 for문 안의 문장을 실행
//		i = i + 2 => for문을 반복 실행할 때 next값을 지정
		for (int i=1; i<15; i = i + 2) {
			System.out.println("i = " + i);
		}

	}

}
