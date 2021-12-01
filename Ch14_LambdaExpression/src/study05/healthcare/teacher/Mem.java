package study05.healthcare.teacher;

import java.util.Scanner;

public class Mem {
	String name;
	int ki;
	int we;
	int age;
	int tel;
	int c;
	Scanner sc = new Scanner(System.in);
	public void prn() {
		System.out.println("[회원 정보 출력]");
		System.out.println("이름: " + name);
		System.out.println(name + "님의 키? " + ki);
		System.out.println(name + "님의 몸무게? " + we);
		System.out.println(name + "님의 나이? " + age);
		System.out.println(name + "님의 전화번호? " + tel);
		System.out.println("=================");
	}
	public void in() {
		System.out.println("[회원 정보 입력]");
		System.out.println("이름: ");
		name = sc.next();
		System.out.println(name + "님의 키? ");
		ki = sc.nextInt();
		System.out.println(name + "님의 몸무게? ");
		we = sc.nextInt();
		System.out.println(name + "님의 나이? ");
		age = sc.nextInt();
		System.out.println(name + "님의 전화번호? ");	
		tel = sc.nextInt();
		System.out.println("=================");
	}
	public int jung() {
		double b = (ki-100)*0.9;
		if (we > b) {
			System.out.println("과체중 입니다.");
			c = (int)(we-b);
		} else if (we < b) {
			System.out.println("저체중 입니다.");
			c = (int) (b - we);
		} else {
			System.out.println("표준체중 입니다.");
		}
		return c;
	}
}
