package ex;

public class Chatting {
	void startChat(String chatId) {
		String nickName = null;
		//nickName = chatId;  -->> 이부분이 오류
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "dd";
					String message = "[" + nickName + "] " + inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
	
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}
}
