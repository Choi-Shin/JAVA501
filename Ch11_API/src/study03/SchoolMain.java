package study03;

import java.util.Scanner;

public class SchoolMain {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		Scanner sc = new Scanner(System.in);
		int select;
		while(true) {
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 총점 출력");
			System.out.println("3. 학생 평균 출력");
			System.out.println("4. 프로그램 종료");
			select = sc.nextInt();
			if (select == 1) {
				t.inPut();
			} else if  (select == 2) {
				t.sum();
			} else if (select == 3) {
				t.avg();
			} else if (select == 4) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		
	}

}
