package study05.healthcare;
import java.util.ArrayList;
import java.util.Scanner;

public class Mem {
	public Mem() {
	}
	String name;
	int tall;
	int we;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTall() {
		return tall;
	}
	public void setTall(int tall) {
		this.tall = tall;
	}
	public int getWe() {
		return we;
	}
	public void setWe(int we) {
		this.we = we;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	int age;
	int tel;
	int c;
	
	
	public void memCnt() {
		System.out.println("회원 수를 입력하세요.");
	}
	public void menu() {
		System.out.println("번호를 입력하세요 (1.정보 입력, 2. 정보출력, 3.비만도 출력, 4.종료");
	}
	
	public void in() {
		Scanner sc = new Scanner(System.in);
		System.out.println("[회원 정보 입력]");
		System.out.println("이름: ");
		setName(sc.next());
		System.out.println(name + "님의 키: ");
		setTall(sc.nextInt());
		System.out.println(name + "님의 몸무게: ");
		setWe(sc.nextInt());
		System.out.println(name + "님의 나이: ");
		setAge(sc.nextInt());
		System.out.println(name + "님의 전화번호 뒷자리: ");
		setTel(sc.nextInt());
	}
	public void prn() {
		System.out.println("[회원 정보 출력]");
		System.out.println("이름: " + name);
		System.out.println(name + "님의 키: " + tall);
		System.out.println(name + "님의 몸무게: " + we);
		System.out.println(name + "님의 나이: " + age);
		System.out.println(name + "님의 전화번호 뒷자리: " + tel);
	}
	
	public void measure() {
		float d = (tall - 100) * 0.9f;
		c = Math.round(d);
		String s;
		System.out.println("[회원 비만도 출력]");
		if (c < we) {
			s = "과체중";
			this.c = we - c;
		} else if (c > we) {
			s = "저체중";
			this.c = c - we;
		} else {
			s = "표준체중";
			this.c = 0;
		}
		System.out.println(s + " 입니다.");
		System.out.println("차이값은 " + c);
		System.out.println("===============");
	}
}
