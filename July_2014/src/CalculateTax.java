
public class CalculateTax {

	static double taxSingle = 0.88;
	static double taxMarried = 0.84;
	static double taxDivorced = 0.80;
	
	public static double taxSinglePerson(double salary){
		return salary*taxSingle;
	}
	
	public static double taxMarriedPerson(double salary){
		return salary*taxMarried;
	}

	public static double taxDivorcedPerson(double salary){
		return salary*taxDivorced;
	}
	
}
