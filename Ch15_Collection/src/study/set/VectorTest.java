package study.set;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<String> vt = new Vector<String>();
		vt.add("서울");
		vt.add("춘천");
		vt.add("광주");
		vt.add("대구");
		vt.add("부산");
		System.out.println("vt.get(0) = " + vt.get(0));
		System.out.println("vt.get(1) = " + vt.get(1));
		System.out.println("vt.get(2) = " + vt.get(2));
		System.out.println("vt.get(3) = " + vt.get(3));
		System.out.println("vt.get(4) = " + vt.get(4));
		System.out.println();
		
		Iterator<String> it = vt.iterator();
		System.out.println("Iterator로 요소 출력");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		System.out.println("Vector객체의 요소들을 Enumeration이용하여 출력");
		Enumeration<String> en = vt.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement()); 
		}
		
		
	}

}
