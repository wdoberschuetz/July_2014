import java.util.Scanner;


public class MainAreYouOldOrNot {

	public static void main(String[] args) {
		
		int yearBorn = 0;
		int yearNow = 0;
		int answer = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("State the year of your birth: ");
		yearBorn = input.nextInt();
		
		System.out.println("State the current year: ");
		yearNow = input.nextInt();

		AreYouOldOrNot age = new AreYouOldOrNot();
		answer = AreYouOldOrNot.calculateAge(yearBorn, yearNow);
		System.out.println("You're " + answer);
		
	}

}
