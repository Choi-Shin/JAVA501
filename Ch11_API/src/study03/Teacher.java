package study03;

import java.util.Scanner;

public class Teacher {
	Scanner sc;
	Student st;

	public Teacher() {
		sc = new Scanner(System.in);
		st = new Student();
	}
	
	public void inPut() {
		System.out.println("학생 이름 입력 : ");
		st.setName(sc.next());
		System.out.println(st.name + "의 국어 점수");
		st.setKor(sc.nextInt());
		System.out.println(st.name + "의 영어 점수");
		st.setEng(sc.nextInt());
		System.out.println(st.name + "의 수학 점수");
		st.setMath(sc.nextInt());
		System.out.println("======입력 완료======");
	}
	
	public void sum() {
		int sum = (st.kor+st.eng+st.math);
		System.out.println(st.name+ "의 총점: " + sum);
	}
	
	public void avg() {
		int avg = (st.kor+st.eng+st.math)/3;
		System.out.println(st.name+ "의 평균: " + avg);
	}

}
