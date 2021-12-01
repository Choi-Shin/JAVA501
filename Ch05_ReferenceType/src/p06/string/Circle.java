package p06.string;

public class Circle {
	int radius;
     //생성자 : 객체 생성시 초기값 저장 용도
	//        클래스 이름 사용, return x, 반환형 타입 X
	public Circle(int radius) {
		//super();//부모의 기본생성자 호출
		this.radius = radius;
	}
	
	//원개발자가 만든 메소드를 우리식으로 재정의해서 사용
	//Parameter Polymorphism(파라미터의 다형성): 하나의 부모타입으로 여러 자식객체 사용 가능
	@Override
	public boolean equals(Object obj) {//obj: c2주소값이 들어있다
		if(obj instanceof Circle) {
			Circle c = (Circle) obj;//casting
			if(this.radius == c.radius)//c1.radius == c2.radius
				return true;	//같은객체	
		}
		return false;//다른객체
	}
}
