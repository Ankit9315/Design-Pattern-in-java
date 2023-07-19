package Behavioural.Template;

public class Chess extends Game{

	@Override
	public void intialize() {
		System.out.println("Chess in initial state");
	}

	@Override
	public void start() {
		System.out.println("chess game start");
	}

	@Override
	public void end() {
		System.out.println("Chess game end");
	}

}
