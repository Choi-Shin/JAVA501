package p01.basic;
//모든 클래스는 자연상속에 의해서 부여된 부모 클래스는 Object Class
public class Employee {
	// 1.변수
	String name;
	int salary;

	// 2.생성자
	//Constructor Overloading: 생성자 이름이 같고, 파라미터의 갯수나 순서의 타입 다른것
	public Employee() {

	}

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public Employee( int salary) {
		this.salary = salary;
	}
	public Employee(String name) {
		this.name = name;
	}
//	public Employee(String id, int age) {//불가
//		super();
//		this.name = name;
//		this.salary = salary;
//	}
	
	
	//3. 일반 메소드
	public String getEmployee() {
		return name+" "+salary;
	}
}
