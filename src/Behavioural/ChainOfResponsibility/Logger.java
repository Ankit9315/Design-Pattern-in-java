package Behavioural.ChainOfResponsibility;

public abstract class Logger {

	public static int outputInfo = 1;
	public static int errorInfo = 2;
	public static int debugInfo = 3;
	
	int level;
	Logger nextLevelLogger;
	
	public void setNextLevelLogger(Logger nextLevelLogger) {
		this.nextLevelLogger = nextLevelLogger;
	}
	
	public void logMessage(int level , String msg) {
		if(this.level <= level) {
			displayLogInfo(msg);
		}
		if(nextLevelLogger != null) {
			nextLevelLogger.logMessage(level, msg);
		}
	}
	
	public abstract void displayLogInfo(String msg);
}
