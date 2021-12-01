package study.set;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedTestQueue {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		q.offer("강남구");
		q.offer("노원구");
		q.offer("은평구");
		q.offer("도봉구");
		q.offer("서초구");
		
		System.out.println(q.size());
		
		for (int i=0; i<q.size(); i++) {
			System.out.println(q.poll());
		}
//		while(!q.isEmpty()) {
//			System.out.println(q.poll());
//		}
	}

}
