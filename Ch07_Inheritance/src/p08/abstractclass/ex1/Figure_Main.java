package p08.abstractclass.ex1;

public class Figure_Main {

	public static void main(String[] args) {
		//1. 자식 객체 생성
		Tetra t1 = new Tetra();
		t1.area(4, 5);
		Triangle t2 = new Triangle();
		t2.area(12, 5);
		//2. Polymorphism
		Figure t3 = new Tetra();
		t3.area(4, 5);
		Figure t4 = new Triangle();
		t4.area(12, 5);
		//3. Polymorphism2
		Figure t5 = new Tetra();
		t5.area(4, 5);
		t5 = new Triangle();
		t5.area(12, 5);
	}
}