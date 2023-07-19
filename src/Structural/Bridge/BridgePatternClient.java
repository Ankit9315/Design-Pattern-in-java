package Structural.Bridge;

public class BridgePatternClient {

	public static void main(String aargs[]) {
		QuestionFormat questionFormat = new QuestionFormat("Java Programming Questions");
		
		questionFormat.q = new JavaQuestions();
		questionFormat.delete("What is a java?");
		questionFormat.current();
		questionFormat.newOne("Why we use java and its advantages over other languages ?");
		
		questionFormat.displayAll();
		
	}
}
