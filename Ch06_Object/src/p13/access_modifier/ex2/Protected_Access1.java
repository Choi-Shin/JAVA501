package p13.access_modifier.ex2;

import p13.access_modifier.ex1.ProtectedData;

public class Protected_Access1 {

	public static void main(String[] args) {
		
       ProtectedData pd = new ProtectedData();
       //패키지가 다른면 사용불가 => 상속개념에서는 가능
       //System.out.println(pd.protectedVar);
	}

	protected int c;

}
