package p08.abstractclass.ex2;

public class EmailSender extends MessageSender {
	String senderAddr;
	String emailBody;

	
	public EmailSender(String title, String senderName, String senderAddr, String emailBody) {
		super(title,senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}


	@Override
	void sendMessage(String recipient) {
		System.out.println("--------------------------------\n" + "제목: " + title + "\n보내는 사람: " + senderName + " "
				+ senderAddr + "\n받는 사람: " + recipient + "\n내용: " + emailBody);
	}



}
