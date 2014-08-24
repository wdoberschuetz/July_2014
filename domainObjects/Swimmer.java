package domainObjects;

import java.util.GregorianCalendar;

import enumerations.Gender;
import enumerations.Status;


public class Swimmer {

	private static int id = 0;
	private int swimmerID;
	private String forename;
	private String surname;
	private GregorianCalendar dateOfBirth;
	private int age;
	private Gender gender;
	private Status status;
	private int phoneNumber;
	private String email;
	private String medicalConditions;
	private String medication;
	private String nextOfKinName;
	private int nextOfKinPhoneNumber;
	private String swimClubName;
	private String level; // MD 24/08/2014 as in: Junior, Senior, Masters -> not needed yet?

	
	public Swimmer(String forename, String surname,
			GregorianCalendar dateOfBirth, int age, Gender gender,
			Status status, int phoneNumber, String email,
			String medicalConditions, String medication, String nextOfKinName,
			int nextOfKinPhoneNumber, String swimClubName, String level) {
		super();
		id++;
		this.swimmerID = id;
		this.forename = forename;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.gender = gender;
		this.status = status;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.medicalConditions = medicalConditions;
		this.medication = medication;
		this.nextOfKinName = nextOfKinName;
		this.nextOfKinPhoneNumber = nextOfKinPhoneNumber;
		this.swimClubName = swimClubName;
		this.level = level;
	}
	
	
	public int getSwimmerID() {
		return swimmerID;
	}
	public void setSwimmerID(int swimmerID) {
		this.swimmerID = swimmerID;
	}
	public String getForename() {
		return forename;
	}
	public void setForename(String forename) {
		this.forename = forename;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public GregorianCalendar getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(GregorianCalendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMedicalConditions() {
		return medicalConditions;
	}
	public void setMedicalConditions(String medicalConditions) {
		this.medicalConditions = medicalConditions;
	}
	public String getMedication() {
		return medication;
	}
	public void setMedication(String medication) {
		this.medication = medication;
	}
	public String getNextOfKinName() {
		return nextOfKinName;
	}
	public void setNextOfKinName(String nextOfKinName) {
		this.nextOfKinName = nextOfKinName;
	}
	public int getNextOfKinPhoneNumber() {
		return nextOfKinPhoneNumber;
	}
	public void setNextOfKinPhoneNumber(int nextOfKinPhoneNumber) {
		this.nextOfKinPhoneNumber = nextOfKinPhoneNumber;
	}
	public String getSwimClubName() {
		return swimClubName;
	}
	public void setSwimClubName(String swimClubName) {
		this.swimClubName = swimClubName;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
		
}