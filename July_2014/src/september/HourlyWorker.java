package september;

public class HourlyWorker extends Employee{

	public HourlyWorker(
		String name,
		int age,
		double salary
			)
	{
		super(name, age, salary);
		this.name = name;
		this.age = age;
		this.salary = 8.15;
	}
	
	public double calculateSalary(double numberOfHours){
		return numberOfHours*10;
	}
	
}
