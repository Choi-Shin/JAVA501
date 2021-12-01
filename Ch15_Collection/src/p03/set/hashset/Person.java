package p03.set.hashset;

public class Person {
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;//casting
			return this.name.equals(p.name) && this.age == p.age;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return (name+age).hashCode();
	}
	
	@Override
	public String toString() {
		return "이름: " + name + "\n나이: " + age; 
	}
}

