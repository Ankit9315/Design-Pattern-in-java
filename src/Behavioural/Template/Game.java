package Behavioural.Template;

public abstract class Game {

	public abstract void intialize();
	public abstract void start();
	public abstract void end();
	public final void play() {
		
		intialize();
		
		start();
		
		end();
	};
}
