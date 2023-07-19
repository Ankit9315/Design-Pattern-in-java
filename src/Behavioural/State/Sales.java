package Behavioural.State;

public class Sales implements ConnectionOrState{

	@Override
	public void open() {
		System.out.println("Open connection for sales");
	}

	@Override
	public void close() {
		System.out.println("Close Connection for Sales");
	}

	@Override
	public void log() {
		System.out.println("Log Activites for Sales");
	}

	@Override
	public void update() {
		System.out.println("Update the record in Sales");
		
	}

}
