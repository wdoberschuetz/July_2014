package tests;


import java.util.GregorianCalendar;

import domainObjects.Swimmer;
import aoop2_project.Swimmer.Gender;
import aoop2_project.Swimmer.Status;

public class TestSwimmer {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Swimmer swimmer1 = new Swimmer();
		System.out.println(swimmer1.toString());
	
		Swimmer swimmer = new Swimmer("Michael", "Phelps", new GregorianCalendar(1985, 05, 30), Gender.male, 7897672, 
										"michaelphelps@gmail.com", "none", "none", "Deborah Phelps",
										56282828, "Baltimore Swimming Club", Status.active, "Masters");
		// note: the value for MONTH is 0-based!!
		// so born in June corresponds to 05
		System.out.println(swimmer.getDateOfBirth().getTime());
		System.out.println(swimmer.toString());
		
		swimmer.setForename("Jessica");
		System.out.println(swimmer.getForename());
		swimmer.setSurname("Hardy");
		System.out.println(swimmer.getSurname());
		swimmer.setDateOfBirth(new GregorianCalendar(1991, 02, 20));
		// note: the value for MONTH is 0-based!!
		System.out.println(swimmer.getDateOfBirth().getTime());
		swimmer.setAge();
		System.out.println(swimmer.getAge());
		swimmer.setGender(Gender.female);
		swimmer.setPhoneNumber(45671999);
		System.out.println(swimmer.getPhoneNumber());
		swimmer.setEmail("jessica.hardy@gmail.com");
		System.out.println(swimmer.getEmail());
		swimmer.setMedicalConditions("asthma");
		System.out.println(swimmer.getMedicalConditions());
		swimmer.setMedication("inhaler");
		System.out.println(swimmer.getMedication());
		swimmer.setNextOfKinName("Dominik Meichtry");
		System.out.println(swimmer.getNextOfKinName());
		swimmer.setNextOfKinPhoneNumber(45670009);
		System.out.println(swimmer.getNextOfKinPhoneNumber());
		swimmer.setSwimClubName("Trojan Swim Club");
		System.out.println(swimmer.getSwimClubName());
		swimmer.setStatus(Status.active);
		System.out.println(swimmer.getStatus());
		swimmer.setLevel("Professional athlete");
		System.out.println(swimmer.getLevel());
		


	}

}
