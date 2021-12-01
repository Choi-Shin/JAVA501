package ex.container2;

public class Container<K, V> {
	private K key;
	private V value;

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public void set(String string, String string2) {
		this.key = (K) string;
		this.value = (V) string2;
	}

	public void set(String string, int i) {
		this.key = (K) string;
		this.value = (V) Integer.toString(i);
	}
	
	@Override
	public String toString() {
		return (String) this.value;
	}
}
