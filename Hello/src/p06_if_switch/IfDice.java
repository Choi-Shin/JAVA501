package p06_if_switch;

public class IfDice {

	public static void main(String[] args) {
//		Math.random()의 실행결과값 : 0.0 ~ 0.9999999 사이의 난수(random number)값을 발생 
//		                         double data type		
//		Math.random()*6 => 0.0 ~ 5.999999999
//		(int)(Math.random()*6) => 0,1,2,3,4,5
		int num = (int) (Math.random()*6) + 1; 
//		1,2,3,4,5,6 중에 1개값 나옴
//		System.out.println(num);
		
		if (num == 1) {
			System.out.println("주사위 1번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println("주사위 2번이 나왔습니다.");
		} else if (num == 3) {
			System.out.println("주사위 3번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println("주사위 4번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println("주사위 5번이 나왔습니다.");
		} else {
			System.out.println("주사위 6번이 나왔습니다.");
		}
		
//		int lotto = (int) (Math.random()*45) + 1;
		for (int i = 0; i < 6;i++) {
			int lotto = (int) (Math.random()*45) + 1;
			System.out.println(lotto);
		}
	}
}
