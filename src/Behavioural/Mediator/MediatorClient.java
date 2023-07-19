package Behavioural.Mediator;

public class MediatorClient {

	public static void main(String[] aargs) {
		
		ApnaChatRoom chat = new ApnaChatRoomImpl();
		
		User1 user1 = new User1(chat);
		user1.setName("Ankit");
		user1.sendMessage("Hi Aswini");
		
		User2 user2 = new User2(chat);
		user2.setName("Nagsen");
		user2.sendMessage("Hello Ankit");
	}
}
