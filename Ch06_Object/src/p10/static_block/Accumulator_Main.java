package p10.static_block;

public class Accumulator_Main {

	public static void main(String[] args) {
		String str1 = "홍길동";//객체생성
		String str2 = "홍길동";//str1주소값을 가짐
		String str3 = new String("홍길동");//무조건 객체생성
		String str4 = new String("홍길동");//무조건 객체생성
		
		Accumulator a1 = new Accumulator();
		Accumulator a2 = new Accumulator();
		a1.accumulate(10);
		a2.accumulate(20);
		System.out.println(a1.total);//10
		System.out.println(Accumulator.grandTotal);//10
		
		System.out.println(a2.total);//20
		System.out.println(Accumulator.grandTotal);//30
		
		int result = Accumulator.getGrandTotal();
		System.out.println(result);

	}

}
