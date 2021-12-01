package p05_operator2;

public class InfinityNaNEx {

	public static void main(String[] args) {
		double x = 5;
		double y = 0.0;
		
		double z1 = x / y; // infinite (무한대)
		double z2 = x % y; // NaN (Not a Number : 숫자가 아님)
		
		System.out.println("z1 is Infinite? = " + Double.isInfinite(z1));
		System.out.println("z1 is NaN? = " + Double.isNaN(z1));
		System.out.println("z1 is Infinite? = " + Double.isInfinite(z2));
		System.out.println("z1 is NaN? = " + Double.isNaN(z2));
		
		
		System.out.println(z1 + 2); // Infinity + 2 = Infinity
		System.out.println(z2 + 2); // NaN + 2 = NaN
		
		double x1 = 5;
		double y1 = 0.0;
		
		double z3;
		double z4;
		if (y != 0.0) {
			z3 = x1 / y1;
			z4 = x1 % y1;
		} else {
//			초기화 작업
			z3 = 0.0;
		    z4 = 0.0;
		}
		
		if ( Double.isInfinite(z3) || Double.isNaN(z3)) {
			System.out.println("값이 무한대이거나 NaN이어서 값을 산출 불가합니다.");
		} else {
			z3 += 2;
		}
		
		if ( Double.isInfinite(z4) || Double.isNaN(z4)) {
			System.out.println("값이 무한대이거나 NaN이어서 값을 산출 불가합니다.");
		} else {
			z4 += 2;
		}
		
	}

}
