package Behavioural.Interpreter;

public class AndExpression implements Expression{

	Expression exp1;
	Expression exp2;
	
	public AndExpression(Expression exp1, Expression exp2) {
		this.exp1 = exp1;
		this.exp2 = exp2;
	}

	@Override
	public boolean interpreter(String con) {
		return exp1.interpreter(con) && exp2.interpreter(con);
	}

}
