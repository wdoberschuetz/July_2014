package domainObjects;
import java.util.Date;

public abstract class Gala {

	private String id;
	private String name;
	private Date date;
	private String city;
	private boolean isNational;
	private int payment;
	private String organisersName;
	
	
	
	public int convertTime(int minutes, int seconds, int splitSeconds){
		return minutes*60 + seconds + splitSeconds/100;
	}
}