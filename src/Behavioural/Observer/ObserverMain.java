package Behavioural.Observer;

public class ObserverMain {

	public static void main(String[] aargs) {
		
		AverageScoreDisplay averageScore = new AverageScoreDisplay();
		
		CurrentScoreDisplay currentScore = new CurrentScoreDisplay();
		
		CricketData cricketData = new CricketData(averageScore, currentScore);
		
		cricketData.dataChanged();
	}
}
