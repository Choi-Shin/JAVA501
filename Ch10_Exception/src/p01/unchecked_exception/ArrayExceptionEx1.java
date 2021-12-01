package p01.unchecked_exception;
//Exception들이 여러개 있을 경우는 자식 Exception이 상단에 오고, 부모 Excetpion이 하단에 위치
public class ArrayExceptionEx1 {

	public static void main(String[] args) {
		int arr[]= {5,4,3,2,1,0};

		for(int i=0; i<10; i++) {//10회 실행
			try {
				int result = 100/arr[i];
				System.out.println(result);
			
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 첨자의 예외발생");
			} catch (ArithmeticException e) {
				System.out.println("연산의 예외발생:숫자를 0으로 나눌려고 할때 발생");
			} catch( Exception e) {
				System.out.println("일반적인 예외");
			}
			//System.out.println("Done");
		}
	}

}
