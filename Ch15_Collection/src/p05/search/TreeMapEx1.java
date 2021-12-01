package p05.search;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> t = new TreeMap<Integer, String>();
		t.put(87, "홍길동1");
		t.put(98, "홍길동2");
		t.put(75, "홍길동3");
		t.put(95, "홍길동4");
		t.put(80, "홍길동5");

		System.out.println(t);

		NavigableMap<Integer, String> dn = t.descendingMap();
		Set<Map.Entry<Integer, String>> ds = dn.entrySet();
		for (Map.Entry<Integer, String> entry : ds) {
			System.out.print(entry.getKey()+ ": " + entry.getValue() + " ");;
		}
	}

}
