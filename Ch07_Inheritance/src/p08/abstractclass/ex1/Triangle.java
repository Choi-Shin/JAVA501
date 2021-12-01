package p08.abstractclass.ex1;

public class Triangle extends Figure {

	@Override
	void area(int a, int b) {
		System.out.println("삼각형 넓이 : " + ((a * b) / 2));
	}

}
