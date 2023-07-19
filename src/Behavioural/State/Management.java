package Behavioural.State;

public class Management implements ConnectionOrState{

	@Override
	public void open() {
		System.out.println("Open connection for Management");
	}

	@Override
	public void close() {
		System.out.println("Close Connection for Management");
	}

	@Override
	public void log() {
		System.out.println("Log Activites for Management");
	}

	@Override
	public void update() {
		System.out.println("Update the record in Management");
		
	}

}
