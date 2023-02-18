package footballTestPlayer;

public class FootballPlayer {

	int no;
	String name;
	 int minutes;
	 boolean inPlay;
	int numberOfGoals;
	
	public void play(int minutesToPlay) {
		minutes=minutes+minutesToPlay;
		
	}

	public void score() {
		
	numberOfGoals=numberOfGoals+1;	
	}

}
