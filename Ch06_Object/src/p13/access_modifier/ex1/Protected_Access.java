package p13.access_modifier.ex1;
//protected접근제한자: 같은 패키지에서는 제한없이 사용
public class Protected_Access {

	public static void main(String[] args) {
		
       ProtectedData pd = new ProtectedData();
       System.out.println(pd.protectedVar);
	}

	protected int c;

}
