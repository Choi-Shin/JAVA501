package p01.generic_no;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

public class Generic_NoEx1 {

	public static void main(String[] args) {
		
		int[] arr = {100,200,300,400};
		
		ArrayList<Object> a1 = new ArrayList<Object>();
		a1.add(new String ("홍길동"));
		a1.add(new Integer(1));
		a1.add(new Double (12.55));
		a1.add(new Boolean (true));
		a1.add(new Character ('a'));
		a1.add(new Float (12.55f));
		
		Object str1 = a1.get(0);
		System.out.println(str1);
		
		String str2 = (String) a1.get(0);
		System.out.println(str2);
		
		Object str3 = a1.get(1);
		System.out.println((int)str3);
		
		System.out.println(a1);
		
		for(int i=0; i<a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		for(Object a : a1) {
			System.out.println(a);
		}
		
		Iterator<Object> it = a1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		Iterator<Object> it2 = a1.iterator();
		for (boolean a = it2.hasNext(); a == false;) {
			System.out.println(it2.next());
		}
		
		for(Iterator<Object> it3 = a1.iterator();it3.hasNext();) {
			Object name = it3.next();
			System.out.println(name);
		}
		
		ArrayList<Object> a2 = new ArrayList<>();
		a2.add(new Person());
		a2.add(new Person("New Phone"));
		
		Person p1 = (Person) a2.get(0);
		Person p2 = (Person) a2.get(1);
		
		for(Object p : a2) {
			System.out.println(p);
		}
		System.out.println("Phone1: " + p1);
		System.out.println("Phone2: " + p2);
	}

}
