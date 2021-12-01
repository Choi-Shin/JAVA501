package p08.abstractclass.ex2;

public abstract class MessageSender {
	String title;
	String senderName;
	
	abstract void sendMessage(String recipient);

	public MessageSender(String title, String senderName) {
		this.title = title;
		this.senderName = senderName;
	}
	
	
}
