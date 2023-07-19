package Behavioural.ChainOfResponsibility;

public class DebugBasedLogger extends Logger{

	public DebugBasedLogger(int level) {
		this.level =level;
	}

	@Override
	public void displayLogInfo(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Debug level " + msg);
		
	}

}
