package p02_data_type2;

public class ByteEx {

	public static void main(String[] args) {
		byte var1 = -128; 
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		// byte의 양의 정수값의 최대값인 127를 넘으면 compile error 발생
//		byte var6 = 128;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
		byte var6 = 125;
		for (int i=0; i<5; i++) {
			var6++; // var6 = var6 + 1;
			System.out.println("var6 =" + var6);
		}
		
		
	}

}











