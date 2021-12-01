package p01.basic;
//저장&콘솔출력 연습
public class Person_Main {

	public static void main(String[] args) {
		
		//1.변수저장&출력 : 홍길동1, 10
		Person p1 = new Person();
		p1.name = "홍길동1";
		p1.age = 10;
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		//2.생성자 저장및 출력: 홍길동2, 20
		Person p2 = new Person("홍길동2", 20);
		System.out.println(p2.name);
		System.out.println(p2.age);
		
		//3.메소드를 통한 저장과 출력: 홍길동3, 30
		Person p3 = new Person();
		p3.setName("홍길동1"); 
		p3.setAge(10);
		System.out.println(p3.getName());
		System.out.println(p3.getAge());
		
		Student.main(args);//메인 메스도 호출
	}

}
