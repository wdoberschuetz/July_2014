import java.util.InputMismatchException;
import java.util.Scanner;

public class MathAverage {

	public static void main(String[] args) {

		double sumOfGrades = 0;
		double grade = 0;
		int countOfGrades = 0;
		double average = 0;
		Scanner input = new Scanner(System.in);
		String decision = "y";
		
		do{
			try{
			System.out.println("Enter grade of a pupil: ");
			grade = input.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println("Please enter a number.");
				decision = "y";
			}

				if(grade >= 1 && grade <= 6){
				sumOfGrades = sumOfGrades + grade;
				countOfGrades++;
				grade = 0;
				}
				
				else{
					System.out.println("The number should be between 1 and 6.");
					decision = "y";
				}
			
			input.nextLine();	
			System.out.println("Would you like to continue? (y/n)");
			decision = input.next();
			
		}
		while(decision.equals("y"));

		average = (sumOfGrades/countOfGrades);
		System.out.println("The average of class from maths was: " + average);
		
	}

}
