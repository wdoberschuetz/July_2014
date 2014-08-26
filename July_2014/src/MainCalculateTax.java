import java.util.Scanner;

public class MainCalculateTax {

	public static void main(String[] args) {
		
		double salary = 0;
		String decision = "0";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("State your yearly salary: ");
		salary = input.nextDouble();
		
		
		
		do{
			
			System.out.println("What's your civil status?\nSingle - s.\nMarried - m.\nDivorced = d.");
			decision = input.next();
			
			if(decision.equals("s")){
				//CalculateTax singleTax = new CalculateTax();
				System.out.println("Your salary after taxes is: " + CalculateTax.taxSinglePerson(salary));
				
			}
			else if (decision.equals("m")){
				//CalculateTax marriedTax = new CalculateTax();
				System.out.println("Your salary after taxes is: " + CalculateTax.taxMarriedPerson(salary));
			}
			else if (decision.equals("d")){
				//CalculateTax divorcedTax = new CalculateTax();
				System.out.println("Your salary after taxes is: " + CalculateTax.taxDivorcedPerson(salary));
			}
		}
		while(!decision.equals("s") && !decision.equals("d") && !decision.equals("m"));
		
	}
	
}
