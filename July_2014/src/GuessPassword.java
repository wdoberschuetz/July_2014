import java.util.Scanner;

//2) uzytkownik zgaduje haslo. ma 3 szanse. odpowiednie komunikaty.

public class GuessPassword {

	public static void main(String[] args) {

		private static final int COUNT_TRIES = 3;
		
		Scanner input = new Scanner(System.in);
		int count = 0; 
		String password = "pass";
		String guess = "guess";
		
		System.out.println("Enter your password");
		password = input.next();
		
		System.out.println("Your password is: " + password);
		
		//if(count < COUNT_TRIES || password != guess){
		
			do{
			System.out.println("Guess the password you entered: ");
			guess = input.next();
			
				if (guess.equals(password)){
					System.out.println("Congrats. You guessed the password you just entered.");
					break;
				}
			
			count++;
			System.out.println("I'm sorry. Access denied.");
			}
			while(password != guess && count < COUNT_TRIES);
			
			}
		
	}