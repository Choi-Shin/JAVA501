package p03.basic;

public class Main_Functional {

	public static void main(String[] args) {
		Impl_Interface ii = new Impl_Interface();
		ii.method1();
		
		//Anonymous Implements Object
		FunctionalInterface fi = new FunctionalInterface() {
			
			@Override
			public void method1() {
				System.out.println("익명구현객체");
			}

		};
		fi.method1();
		
		//Lambda Expression 추상 메소드가 하나일 때만 사용 가능
		FunctionalInterface fi2 = () -> 
				System.out.println("익명구현객체");
		fi2.method1();
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Runnable object-Thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		
		Runnable r1 = () ->
				System.out.println("Runnable object-Thread");
			
		Thread t1 = new Thread(r1);
		t1.start();
		
	}

}
