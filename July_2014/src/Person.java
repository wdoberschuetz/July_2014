
public class Person {

	public String name;
	public String surname;
	public int age;
	public String status;
	public boolean isMale;
	
	
	public Person (){
		this.name = "Stephen";
		this.surname = "Hendry";
		this.age = 45;
		this.status = "married";
		this.isMale = true;
	}
	
	public Person(String name, String surname, int age, String status, boolean isMale){
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.status = status;
		this.isMale = isMale;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	

}
