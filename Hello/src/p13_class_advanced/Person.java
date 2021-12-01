package p13_class_advanced;

public class Person {
	// final이 있는 field 변수는 초기화가 되어 있지 않으면 에러 발생
	// final : 변수를 선언할 때 초기값은 가질 수 있으나, 값을 변경하고 싶지 않을 경우에 사용
	// final 변수 초기화 방법 : 1) 변수 선언하면서 초기화, 2) 생성자에서 초기화
	final String nation = "Korea";
	final String ssn;
	String name;

	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
