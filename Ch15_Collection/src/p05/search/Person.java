package p05.search;

//Comparable : 일반적인 sort
//Comparator : 특수한 sort
public class Person implements Comparable<Person> {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		if (this.age < o.age) {
			return -1;
		} else if (this.age == o.age) {
			return 0;
		} else {
			return 1;
		}
	}

}
