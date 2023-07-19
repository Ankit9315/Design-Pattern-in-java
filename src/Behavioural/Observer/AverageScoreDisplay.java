package Behavioural.Observer;

public class AverageScoreDisplay {

	private float runRate;
	private int predictedScore; 
	
	public void update(int run,int wicket,float overs) {
		
		this.runRate = run/overs;
		this.predictedScore = (int) (runRate*50);
		display();
	}
	
	public void display() {
		System.out.println("Average Score display Run Rate "+runRate +"/n PredictedScore "+predictedScore );
	}
}
