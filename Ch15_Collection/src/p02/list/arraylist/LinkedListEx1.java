package p02.list.arraylist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx1 {

	public static void main(String[] args) {
		LinkedList<String> la = new LinkedList<String>();
		la.add("a");
		la.add("b");
		la.add("c");
		la.add("d");
		la.add(2, "k");
		la.set(0, "S");
		la.remove(1);
		la.remove("c");
		for (int i = 0; i < la.size(); i++) {
			System.out.println(la.get(i));
		}

		Iterator<String> it = la.iterator();

		for (int i = 0; i < la.size(); i++) {

		}

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
