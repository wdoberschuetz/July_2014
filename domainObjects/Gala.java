package domainObjects;


import java.util.Date;

public abstract class Gala {

	// data members
	private static int id = 0;
	private int galaId;
	private Date galaDate;
	private String galaCity; 
	private String galaName; 
	private int payment;

	// no-argument constructor
	@SuppressWarnings("static-access")
	public Gala() {
		
		id++;
		setGalaId(id);
		setGalaDate(new Date());
		setGalaName("unknown");
		setPayment(0);
	}
	
	// full-argument constructor	
	public Gala(Date galaDate, String galaName, int payment) {
		
		id++;
		setGalaId(id);
		setGalaDate(galaDate);
		setGalaName(galaName);
		setPayment(payment);
	}

	// id
	public int getGalaId() {
		return galaId;
	}
	public void setGalaId(int galaId) {
		this.galaId = galaId;
	}

	// date
	public Date getGalaDate() {
		return galaDate;
	}
	public void setGalaDate(Date galaDate) {
		this.galaDate = galaDate;
	}

	// city
	public String getGalaCity() {
		return galaCity;
	}
	public void setGalaCity(String galaCity) {
		this.galaCity = galaCity;
	}

	// name of the gala
	public String getGalaName() {
		return galaName;
	}
	public void setGalaName(String galaName) {
		this.galaName = galaName;
	}

	// payment for one event in the gala
	public void setPayment(int payment) {
		this.payment = payment;
	}
	public int getPayment() {
		return payment;
	}

	// the toString() method
	@Override
	public String toString() {
		return "The ID of the gala is: " + getGalaId() 
				+ ",\nthe date of the gala is: " + getGalaDate()
				+ ",\nthe name of the gala is: " + getGalaName()
				+ ",\npayment for one event is: " + getPayment() + " euro.";
	}
	
	/*
	 * @param minutes minutes in the entry time
	 * @param seconds seconds in the entry time
	 * @param splitSeconds split seconds in the entry time
	 * @return time entry time
	 * */
	public int convertTime(int minutes, int seconds, int splitSeconds){
		return minutes*60 + seconds + splitSeconds/100;
	}
	
	
}