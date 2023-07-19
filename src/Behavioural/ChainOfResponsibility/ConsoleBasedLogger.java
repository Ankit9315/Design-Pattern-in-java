package Behavioural.ChainOfResponsibility;

public class ConsoleBasedLogger extends Logger{

	public ConsoleBasedLogger(int level) {
		this.level =level;
	}

	@Override
	public void displayLogInfo(String msg) {
		System.out.println("Console level "+msg);
		
	}

}
