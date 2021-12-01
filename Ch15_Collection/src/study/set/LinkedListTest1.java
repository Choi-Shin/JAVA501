package study.set;

import java.util.LinkedList;

public class LinkedListTest1 {

	public static void main(String[] args) {
		LinkedList<String> lk = new LinkedList<>();
		lk.add("Santafe");
		lk.add("소나타");
		lk.add("K9");
		lk.add("Sorento");
		lk.add("아우디");
		lk.add("에쿠스");
		
		for (int i=0; i<lk.size(); i++) {
			System.out.println(lk.get(i));
		}
	}

}
