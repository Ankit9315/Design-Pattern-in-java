package Behavioural.Observer;

public class CurrentScoreDisplay {

	private int run,wicket;
	private float overs;
	
	public void update(int run , int wicket , float overs) {
		this.run = run;
		this.wicket = wicket;
		this.overs = overs;
		display();
	}

	private void display() {
		
		System.out.println("Cuurent Score is "+run + "/"+wicket+" in "+overs+" overs");
	}
}
