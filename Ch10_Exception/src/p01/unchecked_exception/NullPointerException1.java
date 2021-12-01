package p01.unchecked_exception;

public class NullPointerException1 {

	public static void main(String[] args) {
		String data = null;
		try {
			System.out.println(data.toString());
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	Exception in thread "main" java.lang.NullPointerException: Cannot invoke 
//	"String.toString()" because "data" is null
//	at p01.unchecked_exception.NullPointerException.
//	main(NullPointerException.java:7)
}
