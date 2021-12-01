package p08_while;

import java.io.IOException;

public class WhileKeyControlEx {

	public static void main(String[] args) throws IOException {
		boolean run = true;
		int speed  = 0;
		int keyCode = 0;
		
		while (run) {
//			키보드에서 enter key를 누르면, CR,LF 2개 키가 자동 발생됨
//			keyCode : 13(CR:Carriage Return), 10(LF:Line Feed)
			if ( keyCode != 13 && keyCode != 10) {
				System.out.println("--------------------");
				System.out.println("1.증속 | 2.감속 |3.중지");
				System.out.println("--------------------");
				System.out.print("선택: ");
			}
			
//			입력 key값이 buffer에 존재할 때만 실행
//			System.in.read(); => 키보드의 입력한 key값을 읽어옴, ASCII code값을 읽어옴
			keyCode = System.in.read();
//			System.out.println("keyCode = " + keyCode);
//			keyCode : 49 (숫자 1)
			if (keyCode == 49) {
				speed++;
				System.out.println("현재속도 = " + speed);
				
//			keyCode : 50 (숫자 2)
			} else if (keyCode == 50) {
				speed--;
				System.out.println("현재속도 = " + speed);
//			keyCode : 51 (숫자 3)
			} else if (keyCode == 51) {
				run = false;
			}
		}   //end of while
		
		System.out.println("프로그램 종료");

	}

}
