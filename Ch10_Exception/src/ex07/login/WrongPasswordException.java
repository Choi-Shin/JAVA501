package ex07.login;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {
		
	}
	public WrongPasswordException(String message) {
		super(message);
	}
}
