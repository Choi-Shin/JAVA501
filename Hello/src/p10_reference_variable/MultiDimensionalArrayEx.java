package p10_reference_variable;

public class MultiDimensionalArrayEx {

	public static void main(String[] args) {
//		int[][] => 배열 원소의 값이 int인 2차원 배열
//		2차원 배열 : 배열의 원소가 1차원 배열로 구성
//		3차원 배열, 4차원 배열,, 10차원 배열,,, 
//		myNumbers[0] = {1,2,3,4}, myNumbers[1] = {5,6,7}
//		myNumbers[0].length == 4, myNumbers[1].length == 3
		int[][] myNumbers = { {1,2,3,4}, {5,6,7} };

		
		System.out.println("myNumbers.length = " + myNumbers.length);
		
		for (int i=0; i < myNumbers.length; i++) {
			System.out.println("myNumbers["+ i + "] 길이 = " 
									+ myNumbers[i].length);
			for (int j=0; j < myNumbers[i].length; j++) {
				System.out.println("myNumbers["+ i + "][" + j + "] = " 
							+ myNumbers[i][j]);
			}	
		}

		for (int j=0; j < myNumbers[0].length; j++) {
			System.out.println("myNumbers["+ 0 + "][" + j + "] = " 
						+ myNumbers[0][j]);
		}	
		for (int j=0; j < myNumbers[1].length; j++) {
			System.out.println("myNumbers["+ 1 + "][" + j + "] = " 
						+ myNumbers[1][j]);
		}
	}

}






