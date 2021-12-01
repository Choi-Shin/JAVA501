package p06.array;

import java.util.Scanner;

public class Student_Main {

	public static void main(String[] args) {
		
      //학생수를 입력받기 :3
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//배열의 생성하고 크기 정하기
		Student[] st = new Student[num];//3
	

		//학생정보 입력
		System.out.println("학생 정보 입력(저장)");
		System.out.println("---------------");
		
		
		
		for(int i=0; i<st.length; i++) {//i=0,1,2
			
			st[i] = new Student();
			System.out.println("이름: ");
			String name = sc.next();
			st[i].setName(name);
			
			System.out.println("나이: ");
			int age = sc.nextInt();
			st[i].setAge(age);;
			
			System.out.println("연락처: ");
			String phone = sc.next();
			st[i].setPhoneNumber(phone);
			
			System.out.println("주특기: ");
			String skill = sc.next();
			st[i].setSpecialSkill(skill);
			
			System.out.println("사는곳: ");
			String address = sc.next();
			st[i].setAddress(address);
		
//			st[1] = new Student();
//			st[2] = new Student();
		}
		
		//메소드를 통한 내용 모두 출력
		System.out.println("****학생 정보 출력*****");
		for(int i=0; i<st.length; i++) {
			st[i].print();
			
//			st[0].print();
//			st[1].print();
//			st[2].print();
		}
		sc.close();
	}

}
