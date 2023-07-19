package Behavioural.Template;

public class TemplatePatternDemo {

	public static void main(String[] aargs) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		Game chess = new Chess();
		chess.play();
		
		Game sorrer = new Scorer();
		sorrer.play();
	}
}
