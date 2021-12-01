package p03.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx1 {

	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<>();
		hs.add("abc");
		hs.add("abc");
		hs.add(new Person("홍길동", 20));
		hs.add(new Person("홍길동", 20));
		System.out.println(hs.size());
		
		Iterator<Object> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
