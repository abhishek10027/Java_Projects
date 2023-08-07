package JavaProgram.Projects;

/*
 *  This is Number guessing game program where it will generate a number and ask to user for number. 
 *  If user guess the correct number within 3 trails then it will return "Congratulations!" as output,
 *  Otherwise it will return Game Over.
 */

import java.util.*;
public class NumberGuessingGame {
	
	public static void  guessnumber() {
		int i,guess;
		Scanner sc=new Scanner(System.in);
		
		// it will generate random number
		int number=1+(int)(50*Math.random());
		
		// number of trails 
		int trails=3;
		
		System.out.println("Enter your Guess number in bitween 1 to 50 within 3 guess");
		
		for(i=0;i<trails;i++) {
			
			System.out.println("\nEnter your Guess number here:- ");
			
			guess=sc.nextInt();
			
			if(guess==number) {
				System.out.println("Congratulations! "+" You guessed the correct number");
				break;
			}
			else if(guess>number&&i!=trails-1) {
				System.out.println("The number is less than "+guess);
			}
			else if(guess<number&&i!=trails-1) {
				System.out.println("The number is greater than "+guess);
			}
		}
			if(i==trails){
				System.out.println("Game is over!");
				System.out.println("The number was :- "+number);
			}
		
}

	public static void main(String[] args) {
		
		guessnumber();
		

	}

}
