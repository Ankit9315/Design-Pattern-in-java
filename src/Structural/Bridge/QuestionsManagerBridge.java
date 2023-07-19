package Structural.Bridge;

public class QuestionsManagerBridge {

	Questions q ;
	String catalog;
	
	public QuestionsManagerBridge(String catalog) {
		this.catalog = catalog;
	}
	
	public void next() {
		q.nextQuestion();
	}
	
	public void newOne(String question) {
		q.newQuestion(question);
	}
	
	public void current() {
		q.currentQuestion();
	}
	
	public void previous() {
		q.previousQuestion();
	}
	
	public void displayAll() {
		System.out.println("Question Paper "+catalog);
		q.displayQuestions();
	}
	
	public void delete(String question) {
		q.deleteQuestion(question);
	}
}
