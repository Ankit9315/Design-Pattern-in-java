package Behavioural.State;

public interface ConnectionOrState {

	public void open();
	public void close();
	public void log();
	public void update();
}
