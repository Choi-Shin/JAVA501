package ex06.compile;

public class Chatting {
	void startChat(String chatId) {
		String nickName = null; // 
		nickName = chatId;
		Chat chat = new Chat() {
			@Override
			public void start() {
				while (true) {
					String inputData = "�븞�뀞�븯�꽭�슂";
										   // 硫붿냼�뱶�쓽 濡쒖뺄 蹂��닔瑜� 
										   // �씡紐� 媛앹껜 �궡�뿉�꽌 �궗�슜�븷 �닔 �뾾�떎.
//					String message = "[" + nickName + "]" + inputData;
//					sendMessage(message);
				}
			}
		};
	}
	
	class Chat {
		void start() {}
		void sendMessage(String message) {
			System.out.println(message);
		}
	}
}
