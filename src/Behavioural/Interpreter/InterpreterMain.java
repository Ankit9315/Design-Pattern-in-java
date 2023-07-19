package Behavioural.Interpreter;

public class InterpreterMain {

	public static void main(String[] aargs) {
		
		Expression person1 = new TerminalExpression("Nagsen");
		Expression person2 = new TerminalExpression("Ankit");
		Expression isSingle = new OrExpression(person1, person2);
		
		Expression person3 = new TerminalExpression("Vijay");
		Expression person4 = new TerminalExpression("Das");
		Expression isCommitted = new AndExpression(person3, person4);
		
		System.out.println(isSingle.interpreter("Nagsen"));
		System.out.println(isSingle.interpreter("Vijay"));
		System.out.println(isCommitted.interpreter("Vijay, Das"));
	}
}
