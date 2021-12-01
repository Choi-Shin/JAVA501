package p07.userdefine;

public class InvalidInputException extends Exception {
	//super: 부모 클래스
	//super(): 부모의 기본생성자 호출
	public InvalidInputException () {
		super("잘못된 명령입니다.");
	}
	
}
