package p01.scanner;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		
		System.out.println("*를 출력할 라인수를 입력하세요?");
		//입력 클래스
		Scanner sc = new Scanner(System.in);//키보드
		String number = sc.nextLine();//하나의 라인내용을 입력받아 문자열 저장
		System.out.println(number+10);//"410"
		int number2 = Integer.parseInt(number);//문자열 =>숫자, 형변환
		System.out.println(number2+10);
		
		for(int i=0; i<number2; i++) {//0~3
			for(int j=0; j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		sc.close();
		//결과
//		*
//	    **
//	    ***
//	    ****

	}

}
