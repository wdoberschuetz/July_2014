package tests;


import java.util.Date;

import domainObjects.InternationalGala;
import aoop2_project.Gala.TypeOfTiming;

public class TestEuropeanChampionships {

	@SuppressWarnings({ "static-access", "deprecation" })
	public static void main(String[] args) {
		
		// test the no-argument constructor
		InternationalGala someGala = new InternationalGala();
		System.out.println(someGala.toString());
				
		// test the full-argument constructor and toString()
		InternationalGala europeanChampionships = new InternationalGala(new Date(2013, 9, 5), 
															"European Masters Swimming Chmapionships", 
															"Eindhoven Swimming Club", 667777777, 
															"info@fina2013.ho",
															"Eindhoven", 14, 50, TypeOfTiming.electronic, 15, "Holland");
		System.out.println(europeanChampionships.toString());
				
				
		// test the setters and getters
		europeanChampionships.setGalaDate(new Date());
		System.out.println(europeanChampionships.getGalaDate());
		europeanChampionships.setGalaName("Tuscany Championships");
		System.out.println(europeanChampionships.getGalaName());
		europeanChampionships.setGalaOrganiserName("Joseph Tribianni");
		System.out.println(europeanChampionships.getGalaOrganiserName());
		europeanChampionships.setGalaOrganiserPhoneNumber(66292929l);
		System.out.println(europeanChampionships.getGalaOrganiserPhoneNumber());
		europeanChampionships.setGalaOrganiserEmail("tuscany@gmail.com");
		System.out.println(europeanChampionships.getGalaOrganiserEmail());
		europeanChampionships.setPoolAddress("Limerick");
		System.out.println(europeanChampionships.getPoolAddress());
		europeanChampionships.setDurationInDays(18);
		System.out.println(europeanChampionships.getDurationInDays());
		europeanChampionships.setPoolLength(50);
		System.out.println(europeanChampionships.getPoolLength());
		europeanChampionships.setTypeOfTiming(TypeOfTiming.manual);
		System.out.println(europeanChampionships.getTypeOfTiming());
		europeanChampionships.setPayment(8);
		System.out.println(europeanChampionships.getPayment());
				
		// test toString() again
		System.out.println(europeanChampionships.toString());
		

	}

}