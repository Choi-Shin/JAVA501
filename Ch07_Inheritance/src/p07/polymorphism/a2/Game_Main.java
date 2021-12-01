package p07.polymorphism.a2;

public class Game_Main {

	public static void main(String[] args) {
		//1. polymorphism 전
		BaseBall b1 = new BaseBall();
		FootBall f1 = new FootBall();
		
		//2. polymorphism
		Game g1 = new BaseBall();
		g1.type();
		((BaseBall) g1).ball();//강제형변환(Casting)
		
		Game g2 = new FootBall();
		g2.type();
		((FootBall) g2).foot();
		
		//2. polymorphism
		Game g3 = new BaseBall();
		BaseBall b3 = (BaseBall) g3;
		
		b3.type();
		b3.ball();//강제형변환(Casting)
		
		Game g4 = new FootBall();
		FootBall f4 = (FootBall) g4;
		f4.type();
		f4.foot();
	}

}

