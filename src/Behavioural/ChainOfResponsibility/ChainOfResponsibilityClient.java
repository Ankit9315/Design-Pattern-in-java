package Behavioural.ChainOfResponsibility;

public class ChainOfResponsibilityClient {

	public static Logger doChaining() {
		
		Logger consoleLogger = new ConsoleBasedLogger(Logger.outputInfo);
		
		Logger errorLogger = new ErrorBasedLogger(Logger.errorInfo);
		consoleLogger.setNextLevelLogger(errorLogger);
		
		Logger debugLogger = new DebugBasedLogger(Logger.debugInfo);
		errorLogger.setNextLevelLogger(debugLogger);
		
		return consoleLogger;
	}
	
	public static void main(String [] aargs) {
		
		Logger chainLogger = doChaining();
		
		chainLogger.logMessage(Logger.outputInfo, "Enter the sequence of values");
		chainLogger.logMessage(Logger.errorInfo, "Error occured");
		chainLogger.logMessage(Logger.debugInfo, "debug completed error solved");
	}
}
