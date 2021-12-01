package p05.api;

import java.util.function.IntSupplier;

public class SupplierExample {

	public static void main(String[] args) {
		IntSupplier is = ()-> {
			int num =  (int) (Math.random() * 6) + 1;
			return num;
		};
		
		int num = is.getAsInt();
		System.out.println("눈의 수: " + num);
	}

}
