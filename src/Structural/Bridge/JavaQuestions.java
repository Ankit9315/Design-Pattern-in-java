package Structural.Bridge;

import java.util.List;
import java.util.ArrayList;

public class JavaQuestions implements Questions{

	List<String> questions = new ArrayList<>();
	
	int current = 0;
	
	public JavaQuestions() {
		questions.add("What is a java?");
		questions.add("Difference Between jdk, jvm and jre?");
		questions.add("What is class? ");  
	    questions.add("What is interface? ");  
	    questions.add("What is abstraction? ");  
	    questions.add("How multiple polymorphism is achieved in java? ");  
	    questions.add("How many types of exception  handling are there in java? ");  
	    questions.add("Define the keyword final for  variable, method, and class in java? ");  
	    questions.add("What is abstract class? ");  
	    questions.add("What is multi-threading? "); 
	}
			
	@Override
	public void nextQuestion() {
		
		if(current < questions.size()) {
			current++;
			System.out.println(questions.get(current));
		}
	}

	@Override
	public void newQuestion(String question) {
		questions.add(question);
	}

	@Override
	public void currentQuestion() {
		System.out.println(questions.get(current));
	}

	@Override
	public void previousQuestion() {
		if(current > 0) {
			current--;
			System.out.println(questions.get(current));
		}
	}

	@Override
	public void displayQuestions() {
		for(int i=0; i < questions.size() ; i++) {
			System.out.println(questions.get(i));
		}
	}

	@Override
	public void deleteQuestion(String question) {
		questions.remove(question);
	}

}
