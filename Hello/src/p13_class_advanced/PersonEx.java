package p13_class_advanced;

public class PersonEx {
	// field
	int age=25;	// instance field
	static int num=10;	// static field
	
	// constructor

	// main : static method
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "계백");

		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		// final로 선언된 변수값을 수정 불가
//		p1.nation = "usa";
//		p1.ssn = "222222-2222222";
		p1.name = "홍길동";
		
		// static method인 main에서는 instance method 사용 불가
//		System.out.println("age = " + age);
		// 인스턴스 필드, 메소드를 사용할 경우에는 먼저 인스턴스를 생성해야만 함
		PersonEx p = new PersonEx();
		System.out.println("age = " + p.age);
		
		System.out.println("num = " + num);
	}

}







