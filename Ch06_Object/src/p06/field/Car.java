package p06.field;

public class Car {
	
   //1.field(전역변수);객체의 데이터가 저장되는 곳
	int a;
	static double b=2L;
	String str;
	//2.생성자:객체생성시 초기값 저장 용도
	public Car(int a) {
		super();//부모의 기본 생성자 호출
		this.a = a;
	}
	public Car() {
		
	}
	
	//3.메소드:객체의 동작에 해당하는 실행 블록
	void add(){
		String str;
		System.out.println(a+b);
		float f=0;
		System.out.println(f);
	}
	
	//초기화 블럭:최초 실행
	{
		System.out.println("2.인스턴스 초기화 블럭:객체생성시마다 먼저 실행");
	}
	


	static {
		System.out.println("1.static 초기화 블럭:프로그램 실행 가장 먼저 한번만 수행");
	}
	
	
	
}
