package p06.array;

public class Dog {

	String name;//풍산개,진도개,워리
	String kind;//풍산  ,진도 ,블독

	//파라미터가 있는 생성자- 객체 생성시 초기값 저장 용도
	public Dog(String name, String kind) {
		///super();
		this.name = name;
		this.kind = kind;
	}
	//재정의 Object클래스 메소드(toString)를 나의 형식으로 출력
	@Override
	public String toString() {
		
		return name+"은 "+kind+"입니다.";
	}
}
