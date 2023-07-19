package Behavioural.Template;

public class Scorer extends Game{

	@Override
	public void intialize() {
		System.out.println("Scorer in initial state");
	}

	@Override
	public void start() {
		System.out.println("Scorer game start");
	}

	@Override
	public void end() {
		System.out.println("Scorer game end");
	}

}
