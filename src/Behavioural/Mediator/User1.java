package Behavioural.Mediator;

public class User1 extends Participant{

	private String name;
	private ApnaChatRoom chat;
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void sendMessage(String message) {
		chat.showmessage(message, this);
		
	}
	public User1(ApnaChatRoom chat) {
		this.chat = chat;
	}
	
	
}
