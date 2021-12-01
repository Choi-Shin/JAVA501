package study.set;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		Properties p = new Properties();
		p.put("name", "홍길동");
		p.put("addr", "역삼동");
		p.put("age", "10");
		p.put("nation", "대한민국");
		
		Enumeration<?> pe = p.propertyNames();
		while (pe.hasMoreElements()) {
			String name = (String) pe.nextElement();
			System.out.println("name= " + name + ", value= " + p.getProperty(name));
		}

	}

}
