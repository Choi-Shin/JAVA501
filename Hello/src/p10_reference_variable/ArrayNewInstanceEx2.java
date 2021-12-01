package p10_reference_variable;

public class ArrayNewInstanceEx2 {

	public static void main(String[] args) {
//		new int[3] => 데이터 타입이 int인 원소 3개를 0으로 초기화하여 생성
		int[] arr1 = new int[3];
//		int[] arr1 = {0, 0, 0};
		
		for (int i=0; i<arr1.length; i++) {
			System.out.println("arr1[" + i + "] = " + arr1[i]);
		}

		double[] arr2 = new double[3];
		for (int i=0; i<arr2.length; i++) {
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}

		String[] arr3 = new String[3];
		for (int i=0; i<arr3.length; i++) {
			System.out.println("arr3[" + i + "] = " + arr3[i]);
		}
	}

}
