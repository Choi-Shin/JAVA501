package p03.type_parameter;

public class ProductExample {

	public static void main(String[] args) {
		Product<TV, String> p1 =new Product<TV, String>();
		p1.setKind(new TV("삼성 TV"));
		p1.setModel("smartTV");
		System.out.println(p1.getKind());
		System.out.println(p1.getModel());
	}

}
