package p07.polymorphism.a1;
//다형성: 여러개의 개별적인 클래스를 하나의 부모 클래스 객체로 통합관리해서 효율성을 높인것
//      여러개의 클래스를 하나로 묶어서 관리
//      반드시 상속관계에서 가능
//      큰타입(부모타입) = 작은타입(자식타입)
// instanceOf 연산자: 형변환 가능여부를 알게 해주는 연산자  
public class PolyEx1 {

	public static void main(String[] args) {
		 //1.기본형 타입
		 byte a=10;
		 short b = 20;
		 int c = 330;
		 long d= 4000;
		 
		 //PolyMorphism(다형성)
		 long e1 = a;//Promotion(자동형변환)-306
		 long e2 = b;
		 long e3 = c;
		 
		 int f = (int) e3;//Casting(강제형변환)-324
		
		 //2. 참조형 타입- 상속이 전제

	}

}
