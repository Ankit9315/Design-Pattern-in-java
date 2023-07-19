package Behavioural.Interpreter;

public class TerminalExpression implements Expression{

	String data;
	
	public TerminalExpression(String data) {
		this.data = data;
	}
	
	@Override
	public boolean interpreter(String con) {
		// TODO Auto-generated method stub
		if(con.contains(data)) {
			return true;
		}
		return false;
	}

}
