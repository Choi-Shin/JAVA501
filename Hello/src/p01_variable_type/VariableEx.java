package p01_variable_type;

public class VariableEx {

	public static void main(String[] args) {
		/* 변수명(variable name : name, myNum, myNum1, myNum2, 
		 *                      myFloatNum, myLetter, myBool
		 * 변수명 : 값이 변하는 데이터를 관리하는 변수, 기계어로 된 메모리와 연결되어 있음.
		 * 
		 * String, int, float, char, boolean => 
		 * => 방의 크기를 나타내는 키워드 => Data Type*/
		
		String name = "John";
		name = "Bob";
        // println => print + line
		System.out.println(name);
		
		int myNum = 15;
		System.out.println(myNum);
		
		int myNum1;
		myNum1 = 20;
		System.out.println(myNum1);
		
		int myNum2 = 30;
		myNum2 = 45;
		System.out.println(myNum2);
		
		float myFloatNum = 5.09f;
		System.out.println(myFloatNum);
		
		char myLetter = 'D';
		System.out.println(myLetter);
		
		boolean myBool = true;
		System.out.println(myBool);
		
	}

}
