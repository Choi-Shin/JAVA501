package study.set;

import java.util.Hashtable;
import java.util.Iterator;

public class HashTableTest {

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("driver", "orcle.jdbc.driver.OracleDriver");
		ht.put("url", "jdbc:oracle:thin:@localhost:1521:orcl");
		ht.put("username", "java");
		ht.put("password", "java");
		
		Iterator<String> it = ht.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = ht.get(key);
			System.out.println("key = " + key + ", value = " + value);
		}
		
	}

}
