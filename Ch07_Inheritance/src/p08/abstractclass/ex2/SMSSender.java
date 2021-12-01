package p08.abstractclass.ex2;

public class SMSSender extends MessageSender {
	String returnPhoneNo;
	String message;

	public SMSSender(String title, String senderName, String returnPhoneNo, String message) {
		super(title, senderName);
		this.returnPhoneNo = returnPhoneNo;
		this.message = message;
	}

	@Override
	void sendMessage(String recipient) {
		System.out.println("--------------------------------\n" + "제목: " + title + "\n보내는 사람: " + senderName + " "
				+ "\n받는 전화번호: " + recipient + "\n회신 전화번호: " + returnPhoneNo + "\n내용: " + message);
	}

}
