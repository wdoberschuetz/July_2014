package september;

public class Manager extends Employee {

	public Manager(
			String name,
			int age,
			double salary
			)
	{
		super(name, age, salary);
		this.name = "Manager O";
		this.age = 15;
		this.salary = 14000;
	}
	
	public double calculateSalary(double numberOfHours){
		return numberOfHours*15;
	}
	
}
