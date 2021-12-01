package ex.container2;

public class ContainerExample {

	public static void main(String[] args) {
		Container<String, String> c1 = new Container<String, String>();
		c1.set("홍길동", "도적");
		String name1 = c1.getKey();
		String job = c1.getValue();
		System.out.println(name1 + ":" + job);
		
		Container<String, Integer> c2 = new Container<String, Integer>();
		c2.set("홍길동", 35);
		String name2 = c2.getKey();
		int age = Integer.parseInt(c2.toString());
		System.out.println(name2 + ":" + age);
	}

}
