package Behavioural.Mediator;

public class User2 extends Participant{
	
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
	public User2(ApnaChatRoom chat) {
		this.chat = chat;
	}
}
