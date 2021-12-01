package p08_while;

public class WhilePrintTen {

	public static void main(String[] args) {
		int i = 3;
		
//		i<=10 : 조건식 (조건식 결과가 true인 경우만 while문 안의 명령어 실행)
//		while문은 최종값을 알지 못하는 경우에도 사용 가능
		while (i<=20) {
			System.out.println(i);
			i++;
		}

	}

}
