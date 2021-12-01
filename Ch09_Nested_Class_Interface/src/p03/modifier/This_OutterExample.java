package p03.modifier;

public class This_OutterExample {

	public static void main(String[] args) {
		This_Outter outter = new This_Outter();
		This_Outter.Nested nested = outter.new Nested();
		nested.print();
	}

}
