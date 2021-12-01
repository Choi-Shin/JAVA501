package study01;

public class Args {
	int x; //100
	
	//Method Overloading
	void add(int x) { //숫자
		x = x + 50; //150
	}
	
	void add(Args arg) { //주소
		arg.x = arg.x + 40;
	}
	
	void add(int[] arr) { //배열(주소값)
		arr[0]++;
//		System.out.println(arr[0]++);
	}
	
	//Another Method
	void addNew(Args arg) { //주소
		arg = new Args();
	}
	
}
