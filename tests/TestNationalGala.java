package tests;


import java.util.Date;

import domainObjects.NationalGala;
import aoop2_project.Gala.TypeOfTiming;

public class TestNationalGala {

	@SuppressWarnings({ "deprecation", "static-access" })
	public static void main(String[] args) {

		
		// test the no-argument constructor
		NationalGala someGala = new NationalGala();
		System.out.println(someGala.toString());
		
		// test the full-argument constructor and toString()
		NationalGala traleeGala = new NationalGala(new Date(2014, 04, 05), "Kingdom Masters Gala", 
													"Tim OConnell", 667777777, 
													"timoconnell@traleesportscomplex.ie",
													"Tralee", 1, 25, TypeOfTiming.electronic, 7);
		System.out.println(traleeGala.toString());
		
		// test the setters and getters
		traleeGala.setGalaDate(new Date());
		System.out.println(traleeGala.getGalaDate());
		traleeGala.setGalaName("Limerick Open Long Course");
		System.out.println(traleeGala.getGalaName());
		traleeGala.setGalaOrganiserName("Marcus Austin");
		System.out.println(traleeGala.getGalaOrganiserName());
		traleeGala.setGalaOrganiserPhoneNumber(6677999999l);
		System.out.println(traleeGala.getGalaOrganiserPhoneNumber());
		traleeGala.setGalaOrganiserEmail("someone@gmail.com");
		System.out.println(traleeGala.getGalaOrganiserEmail());
		traleeGala.setPoolAddress("Limerick");
		System.out.println(traleeGala.getPoolAddress());
		traleeGala.setDurationInDays(2);
		System.out.println(traleeGala.getDurationInDays());
		traleeGala.setPoolLength(50);
		System.out.println(traleeGala.getPoolLength());
		traleeGala.setTypeOfTiming(TypeOfTiming.electronic);
		System.out.println(traleeGala.getTypeOfTiming());
		traleeGala.setPayment(8);
		System.out.println(traleeGala.getPayment());
		
		// test toString() again
		System.out.println(traleeGala.toString());
		
		
	}
}