package p13.access_modifier.ex2;
//303
import p13.access_modifier.ex1.ProtectedData;
//protected접근제한자: 패키지가 다르면 사용불가 => 상속개념에서는 가능
//                ex2                           ex1
public class Protected_Access2 extends ProtectedData{

	void printVar() {
		System.out.println("protectedVar: "+protectedVar);
	}
	
	public static void main(String[] args) {
		
       
       
		Protected_Access2 pa = new Protected_Access2();
       pa.printVar();
      
	}

}
