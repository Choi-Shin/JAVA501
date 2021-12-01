package p01.generic_no;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic_YesEx1 {

	public static void main(String[] args) {
		//Generic 사용 전
		ArrayList a1 = new ArrayList();
		a1.add("홍길동");
		a1.add(1);
		a1.add(12.55);
		a1.add(true);
		a1.add('a');
		a1.add(12.55f);
		
		Object str1 = a1.get(0);
		System.out.println(str1);
		
		String str2 = (String) a1.get(0);
		System.out.println(str2);
		
		Object str3 = a1.get(1);
		System.out.println((int)str3);
		
		//Generic 사용 후
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("홍길동1");
		a2.add("홍길동2");
		a2.add("홍길동3");
		for (String a : a2) {
			System.out.println(a);
		}
		ArrayList<Integer> a3 = new ArrayList<>();
		a3.add(1);
		a3.add(2);
		a3.add(3);
		for (Integer a : a3) {
			System.out.println(a);
		}
		
		//3. 우리가 만든 클래스: Person
		ArrayList<Person> p1 = new ArrayList<Person>();
		p1.add(new Person());
		p1.add(new Person("New Phone"));
		
		for(Person p : p1) {
			System.out.println("Phone: " + p);
		}
		System.out.println("Phone1 : " + p1.get(0));
		System.out.println("Phone2 : " + p1.get(1));
		
	}

}
