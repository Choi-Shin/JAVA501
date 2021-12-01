package study.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();

		if (hs.add("korea")) {
			System.out.println("첫번째 korea 추가 성공");
		} else if (!hs.add("korea")) {
			System.out.println("첫번째 korea 추가 실패");
		}
		if (hs.add("japan")) {
			System.out.println("japan 추가 성공");
		} else if (!hs.add("japan")) {
			System.out.println("japan 추가 실패");
		}
		if (hs.add("america")) {
			System.out.println("america 추가 성공");
		} else if (!hs.add("america")) {
			System.out.println("america 추가 실패");
		}
		if (hs.add("britain")) {
			System.out.println("britain 추가 성공");
		} else if (!hs.add("britain")) {
			System.out.println("britain 추가 실패");
		}
		if (hs.add("korea")) {
			System.out.println("두번째 korea 추가 성공");
		} else if (!hs.add("korea")) {
			System.out.println("두번째 korea 추가 실패");
		}
		
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
