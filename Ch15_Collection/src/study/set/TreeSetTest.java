package study.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		
		if (ts.add("korea")) {
			System.out.println("첫번째 korea 추가 성공");
		} else if (!ts.add("korea")) {
			System.out.println("첫번째 korea 추가 실패");
		}
		if (ts.add("japan")) {
			System.out.println("japan 추가 성공");
		} else if (!ts.add("japan")) {
			System.out.println("japan 추가 실패");
		}
		if (ts.add("america")) {
			System.out.println("america 추가 성공");
		} else if (!ts.add("america")) {
			System.out.println("america 추가 실패");
		}
		if (ts.add("britain")) {
			System.out.println("britain 추가 성공");
		} else if (!ts.add("britain")) {
			System.out.println("britain 추가 실패");
		}
		if (ts.add("korea")) {
			System.out.println("두번째 korea 추가 성공");
		} else if (!ts.add("korea")) {
			System.out.println("두번째 korea 추가 실패");
		}
		Iterator<String> it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
