package p02.type;

public class BoxExample {

	public static void main(String[] args) {
		Box<String> b1 = new Box<String>();
		b1.setT("Hello");
		System.out.println(b1.getT());
		
		Box<Integer> b2 = new Box<Integer>();
		b2.setT(1);
		System.out.println(b2.getT());
		
		Box<Apple> a = new Box<Apple>();
		a.setT(new Apple());
		System.out.println(a.getT());
	}

}
