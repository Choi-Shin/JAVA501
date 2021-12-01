package p01.basic;

public class Student {

	int age2 = 10;
	String name2 = "홍길동2";
	
	static int age3 = 10;
	static String name3 = "홍길동2";
	
	//시작점
	public static void main(String[] args) {
//		20;
//		홍길동;
		int age = 20;
		String name = "홍길동";
		System.out.println(age);
		System.out.println(name);
		
		
		System.out.println(Student.age3);
		System.out.println(name3);
		
		Student s = new Student();
		int ss = s.age2;
		System.out.println(ss);
		System.out.println(s.name2);
		
		s.add(10, 10.0);
		
		System.out.println(s.add2(20, 20.5));
	}
	
	void add(int a, double b) {
		System.out.println(a+b);
	}
	
	double add2(int a, double b) {
		
		return a+b;
	}

}
