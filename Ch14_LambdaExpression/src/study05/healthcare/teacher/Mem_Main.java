package study05.healthcare.teacher;

import java.util.Scanner;

public class Mem_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원 수 입력: ");
		int num = sc.nextInt();
		Mem[] m = new Mem[num];
		while(true) {
			System.out.println("번호 입력하기 (1.정보입력, 2.정보 출력, 3.비만 정도 출력, 4.종료)");
			int select = sc.nextInt();
			if (select == 1) {
				for(int i=0; i<m.length; i++) {
					m[i] = new Mem();
					m[i].in();
				}
			} else if (select == 2) {
				for(int i=0; i<m.length; i++) {
					m[i].prn();
				}
			} else if (select == 3) {
				for(int i=0; i<m.length; i++) {
					m[i].jung();
					System.out.println("차이값은 " + m[i].c);
				}
			} else if (select == 4) {
				System.out.println("[종료]");
				break;
			}
		}
		sc.close();
	}

}
