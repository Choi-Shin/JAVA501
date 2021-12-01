package p06_if_switch;

public class SwitchEx {

	public static void main(String[] args) {
		
		int num = (int) (Math.random()*6) + 1;
		System.out.println("num = " + num);
		
//		switch(조건식) => 조건식이 boolean data type이 아님, 정수형 data type, String
		switch (num) {
//		case 1 => num == 1
			case 1:
				System.out.println("주사위 1번이 나왔습니다.");
//				break의 역할 : 해당 case문을 빠져나오는 역할을 하는 명령어
//				break;
			case 2:
				System.out.println("주사위 2번이 나왔습니다.");
//				break;
			case 3:
				System.out.println("주사위 3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("주사위 4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("주사위 5번이 나왔습니다.");
				break;
//				default => else
			default:
				System.out.println("주사위 6번이 나왔습니다.");
				break;
		}

	}

}
