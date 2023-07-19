package Behavioural.Observer;



public class CricketData {

	private int run,wicket;
	private float overs;
	
	AverageScoreDisplay averageScore;
	CurrentScoreDisplay currentScore;
	
	public CricketData(AverageScoreDisplay averageScore, CurrentScoreDisplay currentScore) {
		super();
		this.averageScore = averageScore;
		this.currentScore = currentScore;
	}
	
	public int getLatestRun() {
		return 90;
	}
	
    public int getLatestWicket() {
		return 3;
	}
    
    public float getLatestOvers() {
    	return 21;
    }
    
    public void dataChanged() {
    	run = getLatestRun();
    	wicket = getLatestWicket();
    	overs = getLatestOvers();
    	
    	currentScore.update(run, wicket, overs);
    	averageScore.update(run, wicket, overs);
    	
    }
}
