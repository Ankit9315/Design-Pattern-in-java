package Behavioural.State;

public class Accounting implements ConnectionOrState{

	@Override
	public void open() {
		System.out.println("Open connection for Accounting");
	}

	@Override
	public void close() {
		System.out.println("Close Connection for Accounting");
	}

	@Override
	public void log() {
		System.out.println("Log Activites for Accounting");
	}

	@Override
	public void update() {
		System.out.println("Update the record in Accounting");
		
	}

}
