package p08.abstractclass.ex1;

public class Tetra extends Figure {

	@Override
	void area(int a, int b) {
		System.out.println("사각형 넓이 : " + (a*b));
	}
}
