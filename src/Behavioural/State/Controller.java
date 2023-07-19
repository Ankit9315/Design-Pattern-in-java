package Behavioural.State;

public class Controller {

	public static Accounting account;
	public static Sales sale;
	public static Management manage;
	public static ConnectionOrState connection;
	public Controller() {
		account = new Accounting();
		sale = new Sales();
		manage = new Management();
	}
	
	public void setAccountingConnection() {
		connection = account;
	}
	
    public void setSalesConnection() {
		connection = sale;
	}

    public void setManagementConnection() {
    	connection = manage;
    }
    
	public void open() {
		connection.open();
	}
	
	public void close() {
		connection.close();
	}
	
	public void log() {
		connection.log();
	}
	
	public void update() {
		connection.update();
	}
}
