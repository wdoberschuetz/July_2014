import java.util.Scanner;

public class MathAverageB {

	public static void main(String[] args) {

		double sumOfGrades = 0;
		int countOfGrades = 0;
		double average = 0;
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter all the grades of a pupil, use the space between each of the grades: ");
		
		while(input.hasNextInt()){

			sumOfGrades += input.nextInt();
			countOfGrades++;
			
		}

		average = (sumOfGrades/countOfGrades);
		System.out.println("The average of class from maths was: " + average);
		
		input.close();
		
	}

}

//String[] splits = grade.split("\\s");
///for(String asset: splits){
//	System.out.println(asset);
//}
