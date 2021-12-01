package p07.userdefine;

public class Invalid_Main {

	public static void main(String[] args) {
		try {
			int result = subtract(15, 10);
			System.out.println(result);
		} catch (InvalidInputException e) {
			System.out.println(e.getMessage());
		}//3단계
	}
	
	static int subtract(int a, int b) throws InvalidInputException { //2단계
		if (a < b) {
			throw new InvalidInputException(); //1단계 
		}
		return a-b;
	}
}
