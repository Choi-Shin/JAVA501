package test_20211005;

class Shape{
	void draw() {
		System.out.println("그린다");
	}
}

class Triangle extends Shape{
	@Override
	void draw() {
		System.out.println("삼각형을 그린다");
	}
}
class Rectangle extends Shape{
	@Override
	void draw() {
		System.out.println("사각형을 그린다");
	}
}
class Circle extends Shape{
	@Override
	void draw() {
		System.out.println("원을 그린다");
	}
}

public class Shape_Main {

	public static void main(String[] args) {
		//배열의 다형성
		Shape[] sh = new Shape[3];
		sh[0] = new Triangle();
		sh[1] = new Rectangle();
		sh[2] = new Circle();
		
		for(Shape s : sh) {
			s.draw();
		}
	}

}
