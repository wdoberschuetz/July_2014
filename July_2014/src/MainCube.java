import java.util.Scanner;

public class MainCube {

	public static void main(String[] args) {

		double edge = 0.0d;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the lenght of an edge");
		edge = input.nextDouble();
		UnderCube myCube = new UnderCube();
		
		double answer = myCube.CalculateCubeVolume(edge);
		
		System.out.println("The volume of the cube is: " + answer);

		input.close();
	}

}
