package p01.interfaces;
//CPU-RAM-SSD
public class Person_Main {

	
	int a = 10;
	static double b = 0;
    //반환타입 void: 메소드 실행만하고, 결과는 없다.
	void subtract(int k, int s) {//k=10,s=5
		System.out.println(k-s);
	}
	static void subtract2(int k, int s) {//k=15,s=10
		System.out.println(k-s);
	}
	 
	public static void main(String[] args) {
		Person p = new Person();
		int result = 10;
		System.out.println(10);
		System.out.println(p.c);//0
		int ad =  p.add(3, 4);
		System.out.println(ad);
		System.out.println(Person.d);
		System.out.println(p.d);
		int ad2 = Person.add2(3, 4);
		System.out.println(ad2);
		
		Person_Main pm = new Person_Main();
		System.out.println(pm.a);
		
		//int pm1 = pm.subtract(10, 5);
		pm.subtract(10, 5);
		
		Person_Main.subtract2(15, 10);
	}

}
