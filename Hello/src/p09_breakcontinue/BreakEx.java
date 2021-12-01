package p09_breakcontinue;

public class BreakEx {

	public static void main(String[] args) {
		
		while (true) {
			int num = (int) (Math.random()*6) + 1;
			System.out.println(num);
			if (num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		
//		break는 for문, while, do-while에서 사용하고, 
//		break 명령어를 실행하면, for문이나, while, do-while문 loop에서 빠져나오게 만듬		
	}

}
