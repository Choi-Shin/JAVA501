package p02.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		String str[] = { "홍길동1", "홍길동2", "홍길동3" };
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("홍길동1");
		a1.add("홍길동2");
		a1.add("홍길동3");
		
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		for (String a : a1) {
			System.out.println(a);
		}
		Iterator<String> it = a1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); 
		}
		
		List<String> a2 = Arrays.asList(str);
		System.out.println(a2);
		for (String s : a2) {
			System.out.println(s);
		}
	}
}
