package september;

public class CalculateSalary {
	
	public static void main(String[] args) {
		
		HourlyWorker emp1 = new HourlyWorker("Dupa", 13, 2.55);
		System.out.println(
				"The name is: " + emp1.name + "\n" +
				"The age is: " + emp1.age + "\n" +
				"The hourly salary is: " + emp1.salary				
				);

	}

}
