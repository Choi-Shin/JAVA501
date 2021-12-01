package p07.polymorphism.a1;

public class InstanceOfEx1 {

	public static void main(String[] args) {
		InstanceOfEx1 st = new InstanceOfEx1();
		int result  = st.add(5, 6);
		System.out.println(result);
		
		//다형성의  형변환 가능 여부 연산자
		System.out.println(st instanceof InstanceOfEx1);

	}

	int add(int a, int b) {
		
		return a+b;
	}
	
	public InstanceOfEx1() {
		
	}
}
