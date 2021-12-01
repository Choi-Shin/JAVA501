package p08.abstractclass.ex2;

public class SenderMain {

	public static void main(String[] args) {
		EmailSender obj1 = new EmailSender("생일을 축하합니다.", "고객센터",
				"admin@gmarket.co.kr", "10%할인쿠폰이 발행되었습니다.");
		
		SMSSender obj2 = new SMSSender("생일을 축하 합니다.", "고객센터", "02-999-9999",
				"10%할인 쿠폰이 발행 되었습니다.");
		
		SMSSender obj3 = new SMSSender("생일을 축하 합니다.", "고객센터", "admin@gmarket.co.kr",
				"10%할인 쿠폰이 발행 되었습니다.");
		
		obj1.sendMessage("hatman@daum.net");
		obj1.sendMessage("stickman@nave.co.kr");
		obj2.sendMessage("010-4434-1111");
	}

}
