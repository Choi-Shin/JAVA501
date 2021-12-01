package p02_data_type2;

public class FloatDoubleEx {

	public static void main(String[] args) {
		double var1 = 3.14;
//		Java에서는 실수 literal은 기본으로 double data type임
//		float var2 = 3.14;
		float var3 = 3.14f;	// 실수 literal을 float data type으로 만들라
		
		System.out.println("var1: " + var1);
		System.out.println("var3: " + var3);

		int var4 = 3000000;
		double var5 = 3e6;
		float var6 = 3e6f;
		double var7 = 2e-3;
		
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
	}

}
