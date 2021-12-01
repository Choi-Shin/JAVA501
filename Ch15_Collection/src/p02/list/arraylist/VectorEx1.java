package p02.list.arraylist;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		Vector<EmpInfo> v1 = new Vector<EmpInfo>();
		v1.add(new EmpInfo("홍길동1", "010", "서울"));
		v1.add(new EmpInfo("홍길동2", "011", "부산"));
		
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		for(EmpInfo e : v1) {
			String ename = e.name;
			String etel = e.tel;
			String eaddress = e.address;
			System.out.println(ename + " : " + etel + " : " + eaddress);
		}
		
		//v1 데이터 출력
		Enumeration<EmpInfo> en = v1.elements();
		while (en.hasMoreElements()) {
			EmpInfo ei = en.nextElement();
			String ename = ei.name;
			String etel = ei.tel;
			String eaddress = ei.address;
			System.out.println(ename + " : " + etel + " : " + eaddress);
		}
	}

}
