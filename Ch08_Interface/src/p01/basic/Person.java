package p01.basic;

public class Person {

	String name;
	int age;
	
    //this:현재클래스
	//this():현재 클래스의 기본생성자 호출
	//super:부모클래스
	//super():
	
	public Person() {
		System.out.println("기본생성자 호출");
	}
	
	public Person(String name, int age) {
		super();//부모의 기본생성자 호출: Object
		this.name = name;
		this.age = age;
	}
    //getter(): 저장된 내용을 가져오기(read)
	public String getName() {
		return name;
	}
    //setter(): 저장하기(write)
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
