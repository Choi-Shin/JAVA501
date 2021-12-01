package study05.healthcare;

import java.util.Scanner;

public class Mem_Main {
	public static void main(String[] args) {
		Mem m = new Mem();
		Scanner sc = new Scanner(System.in);
		m.memCnt();
		int num = sc.nextInt();
		Mem[] m1 = new Mem[num];
		while (true) {
			m.menu();
			int select = sc.nextInt();
			if (select == 1) {
				for (int i = 0; i < num; i++) {
					m1[i] = new Mem();
					m1[i].in();
				}
			} else if (select == 2) {
				for (int i = 0; i < num; i++) {
					m1[i].prn();
				}
			} else if (select == 3) {
				for (int i = 0; i < num; i++) {
					m1[i].measure();
				}
			} else {
				System.out.println("[종료]");
				break;
			}
		}

	}
}
