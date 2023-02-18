package footballTestPlayer;

public class FootballPlayerTest {

	public static void main(String[] args) {
		FootballPlayer alex =new FootballPlayer();
		alex.no=10;
		alex.name="Alex souza";
		alex.minutes=0;
		alex.inPlay=true;
		alex.numberOfGoals=0;
		
		
		alex.play(90);
		alex.score();
		System.out.println("number of goals Alex scored:"+alex.numberOfGoals);
		System.out.println("Alex played toyally "+alex.minutes);
		
		alex.play(60);
		alex.score();
		
		System.out.println("number of goals Alex scored:"+alex.numberOfGoals);
		System.out.println("Alex played toyally "+alex.minutes);
		
		System.out.println("**************************");
	
		FootballPlayer oguzhan =new FootballPlayer();
		oguzhan.no=10;
		oguzhan.name="Oguzhan";
		oguzhan.minutes=0;
		oguzhan.inPlay=true;
		oguzhan.numberOfGoals=0;
		
		oguzhan.play(90);
		oguzhan.score();
		System.out.println("number of goals Alex scored:"+oguzhan.numberOfGoals);
		System.out.println("Alex played toyally "+oguzhan.minutes);

	}

}
