package p01.generic_no;

public class Person {
	private String app;
	
	public Person() {
		this("Phone Class");
	}
	
	public Person(String app) {
		this.app = app;
	}
	
	@Override
	public String toString() {
		return app;
	}
	
}
