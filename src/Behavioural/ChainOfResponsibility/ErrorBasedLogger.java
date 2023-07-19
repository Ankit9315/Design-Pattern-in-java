package Behavioural.ChainOfResponsibility;

public class ErrorBasedLogger extends Logger{

	public ErrorBasedLogger(int level) {
		this.level =level;
	}

	@Override
	public void displayLogInfo(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Error level "+msg);
	}

}
