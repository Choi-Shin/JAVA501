package ex.util;

public class Util {
	public static<K, V> Integer getValue(Pair p, K k) {
		if (k == p.getKey()) {
			int a = (int) p.getValue();
			return a;
		} else {
			return null;
		}
	}
}
