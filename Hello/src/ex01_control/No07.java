package ex01_control;

import java.util.Scanner;

public class No07 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			
			int choose = scanner.nextInt();
//			System.out.println(choose);
			if (choose == 1) {
				System.out.print("예금액>");
				int in = scanner.nextInt();				
				balance += in;
			} else if (choose == 2) {
				System.out.print("출금액>");
				int out = scanner.nextInt(); 
				balance -= out;
			} else if (choose == 3) {
				System.out.println("잔고>" + balance); 
			} else if (choose == 4) {
				run = false;
				scanner.close();
			}	
			
		}
		System.out.println("프로그램 종료");
	}

}
