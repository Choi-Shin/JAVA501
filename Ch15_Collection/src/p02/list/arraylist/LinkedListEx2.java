package p02.list.arraylist;

import java.util.LinkedList;

public class LinkedListEx2 {

	public static void main(String[] args) {
		LinkedList<String> q = new LinkedList<String>();
		q.offer("토끼");
		q.offer("사슴");
		q.offer("호랑이");
		
		while(!q.isEmpty()) {
//			String str = q.peek();
			String str2 = q.poll();
			System.out.println(str2);
		}
	}

}
