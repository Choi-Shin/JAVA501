package study01;

public class VariableKind {
	//인스턴스 변수
	int memVar;
	//static 변수
	static int staticVar;
	
	public static void main(String[] args) {
		//로컬 변수
		int localVar = 0;
		
		VariableKind vk1 = new VariableKind();
		
		System.out.println("vk1.memVar = " + vk1.memVar);
//		System.out.println("vk1.staticVar = " + vk1.staticVar);
		System.out.println("VariableKind.staticVar = "+VariableKind.staticVar);
		System.out.println("staticVar(공유변수) = " + VariableKind.staticVar);
		System.out.println("staticVar(공유변수) = " + staticVar);
		
		VariableKind vk2 = new VariableKind();
//		System.out.println("vk2.staticVar(공유변수) = " + vk2.staticVar);
		System.out.println("staticVar(공유변수) = " + VariableKind.staticVar);
		System.out.println("localVar = " + localVar);
		
	}
}
