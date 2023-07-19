package Structural.Bridge;

public class QuestionFormat extends QuestionsManagerBridge{

	public QuestionFormat(String catalog) {
		super(catalog);
	}

	public void displayAll() {
		
		System.out.println("---------------------------------------------------");
		super.displayAll();
		System.out.println("---------------------------------------------------");
	}
}
