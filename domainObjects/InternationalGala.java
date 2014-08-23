package domainObjects;


import java.util.Arrays;
import java.util.Date;



public class InternationalGala extends Gala {

	private String galaCountry;
	private String galaOrganiserName;
	private long galaOrganiserPhoneNumber;
	private String galaOrganiserEmail;
	private String poolAddress;
	private int durationInDays;
	private int poolLength;
	private static TypeOfTiming TypeOfTiming;
	enum TypeOfTiming {manual, electronic}
	
	
	// InternationalGala constructor
	public InternationalGala(Date galaDate, String galaName, int payment, String city, String galaCountry, 
			String galaOrganiserName, long galaOrganiserPhoneNumber,
			String galaOrganiserEmail, String poolAddress, int durationInDays,
			int poolLength, TypeOfTiming typeOfTiming) {
		super(galaDate, galaName, payment);
		setGalaCity(city);
		setGalaCountry(galaCountry);
		setGalaOrganiserName(galaOrganiserName);
		setGalaOrganiserPhoneNumber(galaOrganiserPhoneNumber);
		setGalaOrganiserEmail(galaOrganiserEmail);
		setPoolAddress(poolAddress);
		setDurationInDays(durationInDays);
		setPoolLength(poolLength);
		setTypeOfTiming(TypeOfTiming);
	}
	
	
	public String getGalaCountry() {
		return galaCountry;
	}
	public void setGalaCountry(String galaCountry) {
		this.galaCountry = galaCountry;
	}
	
	
	public String getGalaOrganiserName() {
		return galaOrganiserName;
	}
	public void setGalaOrganiserName(String galaOrganiserName) {
		this.galaOrganiserName = galaOrganiserName;
	}
	
	
	public long getGalaOrganiserPhoneNumber() {
		return galaOrganiserPhoneNumber;
	}
	public void setGalaOrganiserPhoneNumber(long galaOrganiserPhoneNumber) {
		this.galaOrganiserPhoneNumber = galaOrganiserPhoneNumber;
	}
	
	public String getGalaOrganiserEmail() {
		return galaOrganiserEmail;
	}
	public void setGalaOrganiserEmail(String galaOrganiserEmail) {
		this.galaOrganiserEmail = galaOrganiserEmail;
	}
	
	public String getPoolAddress() {
		return poolAddress;
	}
	public void setPoolAddress(String poolAddress) {
		this.poolAddress = poolAddress;
	}
	
	public int getDurationInDays() {
		return durationInDays;
	}
	public void setDurationInDays(int durationInDays) {
		this.durationInDays = durationInDays;
	}
	
	public int getPoolLength() {
		return poolLength;
	}
	public void setPoolLength(int poolLength) {
		this.poolLength = poolLength;
	}
	
	public static TypeOfTiming getTypeOfTiming() {
		return TypeOfTiming;
	}
	public static void setTypeOfTiming(TypeOfTiming typeOfTiming) {
		TypeOfTiming = typeOfTiming;
	}



	// the toString() method
		@Override
		public String toString() {
			return "The ID of the gala is: " + getGalaId() 
					+ ",\nthe date of the gala is: " + getGalaDate()
					+ ",\nthe name of the gala is: " + getGalaName()
					+ ",\npayment for one event is: " + getPayment() + " euro."
					+ ",\ncity of the gala is: " + getGalaCity()
					+ ",\ncountry of the gala is: " + getGalaCountry()
					+ ",\nthe name of the organiser of the gala is: " + getGalaOrganiserName()
					+ ",\nthe phone number of the gala organiser: " + getGalaOrganiserPhoneNumber()
					+ ",\nthe email of the gala organiser: " + getGalaOrganiserPhoneNumber()
					+ ",\nthe address of the pool is: " + getGalaOrganiserEmail()
					+ ",\nduration in dys of the gala is: " + getDurationInDays()
					+ ",\nlength of the pool is: " + getPoolLength()
					+ ",\ntype of timing they use is: " + getTypeOfTiming();
				
				
		}
	
	

}