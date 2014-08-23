package domainObjects;


import java.util.GregorianCalendar;


public class Swimmer {

	// data members
	private static int id = 0;
	private int swimmerID;
	private String forename;
	private String surname;
	private GregorianCalendar dateOfBirth;
	private int age;
	private Gender Gender;
	enum Gender {female, male};
	private static Status Status;
	enum Status {active, inactive};
	private int phoneNumber;
	private String email;
	private String medicalConditions;
	private String medication;
	private String nextOfKinName;
	private int nextOfKinPhoneNumber;
	private String swimClubName;
	private String level;
	
	// 0-argument constructor
	@SuppressWarnings("static-access")
	public Swimmer(){
		
		id++;
		setSwimmerID(id);
		setForename("unknown");
		setSurname("unknown");
		setDateOfBirth(new GregorianCalendar());
		setAge();
		setGender(Gender.male);
		setPhoneNumber(00000000);
		setEmail("unknown");
		setMedicalConditions("unknown");
		setMedication("unknown");
		setNextOfKinName("unknown");
		setNextOfKinPhoneNumber(00000000);
		setSwimClubName("unknown");
		Swimmer.setStatus(Status.inactive);
		setLevel("unknown");
	}
		
	// full-argument constructor
	public Swimmer(String forename, String surname,
			GregorianCalendar dateOfBirth, Gender gender, int phoneNumber, String email,
			String medicalConditions, String medication,
			String nextOfKinName, int nextOfKinPhoneNumber,
			String swimClubName, Status status, String level) {
		
		id++;
		setSwimmerID(id);
		setForename(forename);
		setSurname(surname);
		setDateOfBirth(dateOfBirth);
		setAge();
		setGender(gender);
		setPhoneNumber(phoneNumber);
		setEmail(email);
		setMedicalConditions(medicalConditions);
		setMedication(medication);
		setNextOfKinName(nextOfKinName);
		setNextOfKinPhoneNumber(nextOfKinPhoneNumber);
		setSwimClubName(swimClubName);
		Swimmer.setStatus(status);
		setLevel(level);
	}

	//getters and setters for id
	public int getSwimmerID() {
		return swimmerID;
	}
	public void setSwimmerID(int swimmerID) {
		this.swimmerID = swimmerID;
	}
	
	// setters and getters for medication
	public String getMedication() {
		return medication;
	}
	public void setMedication(String medication) {
		this.medication = medication;
	}

	// setters and getters for the name of the next of kin
	public String getNextOfKinName() {
		return nextOfKinName;
	}
	public void setNextOfKinName(String nextOfKinName) {
		this.nextOfKinName = nextOfKinName;
	}
	
	// setters and getters for the phone number of the next of kin
	public int getNextOfKinPhoneNumber() {
		return nextOfKinPhoneNumber;
	}
	public void setNextOfKinPhoneNumber(int nextOfKinPhoneNumber) {
		this.nextOfKinPhoneNumber = nextOfKinPhoneNumber;
	}

	// setters and getters for medical conditions
	public String getMedicalConditions(){
		return medicalConditions;
	}	
	public void setMedicalConditions(String medicalConditions) {
		this.medicalConditions = medicalConditions;		
	}

	// setters and getters for email
	public void setEmail(String email) {
		this.email = email;		
	}
	public String getEmail(){
		return email;
	}

	// setters and getters for phone number
	public int getPhoneNumber(){
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	//getters and setters for forename
	public String getForename() {
		return forename;
	}
	public void setForename(String forename) {
		this.forename = forename;
	}

	//getters and setters for surname
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	// setters and getters for date of birth
	public GregorianCalendar getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(GregorianCalendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	// setters and getters for swimmer's age
	public int getAge() {
		return age;
	}
	@SuppressWarnings("deprecation")
	public void setAge() {
		// calculates today's date
		GregorianCalendar todaysDate = new GregorianCalendar();
		// calculate the current year
		int currentYear = todaysDate.getTime().getYear();
		// get swimmer's date of birth's year
		int swimmersYearOfBirth = getDateOfBirth().getTime().getYear();
		// calculate swimmer's age
		int swimmerAge = currentYear - swimmersYearOfBirth;
		this.age = swimmerAge;
	}
	
	//getters and setters for gender
	public Gender getGender(){
		return Gender;
	}
	public void setGender(Gender gender){
		Gender = gender;
	}

	// setter and getter for swim club
	public String getSwimClubName() {
		return swimClubName;
	}
	public void setSwimClubName(String swimClubName) {
		this.swimClubName = swimClubName;
	}

	//getter and setter for status
	public static Status getStatus() {
		return Status;
	}
	public static void setStatus(Status status) {
		Status = status;
	}
	
	//getter and setter for level
	public String getLevel(){
		return level;
	}
	public void setLevel(String level){
		this.level = level;
	}

	// toString()
	@Override
	public String toString() {
		return "Swimmer's id number is: " + getSwimmerID()
				+ ",\nswimmer's forename is: " + getForename()
				+ ",\nswimmer's surname is: " + getSurname()
				+ ",\nswimmer's date of birth is: " + getDateOfBirth().getTime()
				+ ",\nswimmer's age is: " + getAge()
				+ ",\nswimmer's phone number is: " + getPhoneNumber()
				+ ",\nswimmer's email is: " + getEmail()
				+ ",\nswimmer's medical conditions are: " + getMedicalConditions()
				+ ",\nswimmer takes the following medication: " + getMedication()
				+ ",\nswimmer's next of kin's name is: " + getNextOfKinName()
				+ ",\nand their contact number is: " + getNextOfKinPhoneNumber()
				+ ",\nswimmer swims for the following club: " + getSwimClubName() + ".";
	}		

}