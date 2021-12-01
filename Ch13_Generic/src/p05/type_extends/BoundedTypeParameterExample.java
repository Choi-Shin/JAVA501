package p05.type_extends;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
		String result = Util.compare(10, 20);
		System.out.println(result);
		
		String result1 = Util.compare(4.5, 3);
		System.out.println(result1);
		
	}

}
