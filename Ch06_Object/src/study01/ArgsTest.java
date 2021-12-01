package study01;

public class ArgsTest {
	
	public static void main(String[] args) {
		Args arg = new Args();
		arg.x = 100; //140
		
		arg.add(arg.x);
		System.out.println("arg.x = " + arg.x); //100
		
		arg.add(arg);
		System.out.println("arg.x = " + arg.x); //140
		
		arg.addNew(arg);
		System.out.println("arg.x = " + arg.x);
		
		int[] arr = new int[1];
		arg.add(arr); 
		System.out.println("arr[0] = " + arr[0]);
		
		
	}

}
