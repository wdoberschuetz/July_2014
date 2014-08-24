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
	
	
	
	public Gala(String id, String name, Date date, String city,
			boolean isNational, int payment, String organisersName) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.city = city;
		this.isNational = isNational;
		this.payment = payment;
		this.organisersName = organisersName;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isNational() {
		return isNational;
	}
	public void setNational(boolean isNational) {
		this.isNational = isNational;
	}
	public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	public String getOrganisersName() {
		return organisersName;
	}
	public void setOrganisersName(String organisersName) {
		this.organisersName = organisersName;
	}

	public int convertTime(int minutes, int seconds, int splitSeconds){
		return minutes*60 + seconds + splitSeconds/100;
	}
}