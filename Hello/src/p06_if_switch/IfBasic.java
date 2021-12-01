package p06_if_switch;

public class IfBasic {

	public static void main(String[] args) {
		
//		20 > 18 => 조건식, 조건식의 최종값은 boolean으로 표현됨 (true, false)
		if (20 > 18) {
//			조건식의 결과가 true인 경우만 실행
			System.out.println("20은 18보다 숫자가 크다.");
		}
		
		int x = 20;
		int y = 18;
		if (x > y) {
			System.out.println("20은 18보다 숫자가 크다.");
		}
		if (true) {
			System.out.println("이 if문은 무조건 true이다.");
		}
	}

}
