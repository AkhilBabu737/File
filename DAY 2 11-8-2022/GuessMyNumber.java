import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
	public static void main(String args [])
	{
		Scanner input=new Scanner(System.in);
		Random r=new Random();
		
		int userGuess;
		int randomNumber;
		randomNumber=(int)r.nextInt(11);
		
		do
		{
			System.out.println("Guess the number :");
			userGuess = input.nextInt();
			
			if(randomNumber > userGuess)
				System.out.println("Higher");
			
			else if(randomNumber < userGuess)
				System.out.println("Lower");
			else
				System.out.println("Correct");
		}
		while(randomNumber != userGuess);
		
	}

}
