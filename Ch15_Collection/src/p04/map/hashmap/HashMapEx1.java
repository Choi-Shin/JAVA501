package p04.map.hashmap;

import java.util.HashMap;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap<String, Integer> h1 = new HashMap<>();
		h1.put("홍길동1",20);
		h1.put("홍길동2", new Integer(30));
		h1.put("홍길동3", 40);
		
		Integer value = h1.get("홍길동3");
		System.out.println(value);
		
//		HashMap<>
		HashMap<Name, Integer> h2 = new HashMap<>();
		h2.put(new Name ("길동1", "홍"),20);
		h2.put(new Name ("길동2", "홍"),30);
		h2.put(new Name ("길동3", "홍"),40);
		
		Integer value1 = h2.get(new Name("길동3", "홍"));
		System.out.println(value1);
	}

}
