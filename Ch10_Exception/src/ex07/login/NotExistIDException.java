package ex07.login;

public class NotExistIDException extends Exception {
	public NotExistIDException() {
	}
	public NotExistIDException(String message) {
		super(message);
	}
}
