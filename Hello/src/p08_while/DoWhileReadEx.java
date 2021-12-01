package p08_while;

import java.util.Scanner;

public class DoWhileReadEx {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("시스템을 종료하려면 q를 입력하세요.");
		
//		Scanner : 특정 data type (?), scanner = 변수
		Scanner scanner = new Scanner(System.in);
		String inputString = null;
		
		do {
//			nextLine은 키보드에서 1 line (enter를 치기 전에 전체 1줄 문자열을 읽어옴)
			inputString = scanner.nextLine();
			System.out.println(inputString);
//			inputString.equals("q") => inputString == "q"
		} while ( !inputString.equals("q") );
		
		System.out.println();
		System.out.println("프로그램 종료");
		scanner.close();
	}

}
