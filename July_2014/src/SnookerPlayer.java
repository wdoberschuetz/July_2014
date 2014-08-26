
public class SnookerPlayer extends Person {

	int highestBreak;
	int turnedPro;
	int worldTitles;
	
	public SnookerPlayer(){
		
		super();
		this.highestBreak = 147;
		this.turnedPro = 1986;
		this.worldTitles = 7;
		
	}
	
	public SnookerPlayer(String name, String surname, int age, String status, boolean isMale, int highestBreak, int turnedPro, int worldTitles){
		
		super(name, surname, age, status, isMale);
		this.highestBreak = highestBreak;
		this.turnedPro = turnedPro;
		this.worldTitles = worldTitles;
		
		System.out.printf("The data is: " + name + " "+ surname + " " + age + status + isMale + highestBreak + turnedPro + worldTitles);
		
	}
	
}
