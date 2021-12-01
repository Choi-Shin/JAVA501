package p07_for;

public class GuGuDan {

	public static void main(String[] args) {
		
//		for문은 시작값, 최종값을 알고 있을 때, 사용하면 편리
		for (int m=2; m<=9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n=1; n<=9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
			
		}
   
	}

}
