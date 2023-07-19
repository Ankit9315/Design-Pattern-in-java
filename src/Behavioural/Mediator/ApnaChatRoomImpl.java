package Behavioural.Mediator;

public class ApnaChatRoomImpl implements ApnaChatRoom{

	@Override
	public void showmessage(String message, Participant p) {
		// TODO Auto-generated method stub
		System.out.println(p.getName() + " gets the message : "+message);
	}

}
