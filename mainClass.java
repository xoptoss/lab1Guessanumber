package mainPackage;


import java.util.Scanner;

public class mainClass {
	public static void main(String[] args) {

		String input;
		boolean guessRight;
		int number,guess=1;


		RandomNumber r = new RandomNumber();
		r.GetANumber();

		guessRight = false;
		System.out.println("Im thinking of a number between 1-10, you have 3 chances to guess it! What number am I thinking of?");	
		Scanner tKeyboard = new Scanner(System.in);

		do
		{
			number=tKeyboard.nextInt();
			if (number == r.answer)
			{
				guessRight = true;     
				System.out.println("Good Job, you guessed it!");
				break;
			}
			else
			{
				if(number>r.answer && guess<3)
				{
					System.out.printf("You guessed too high, you haveguessed %stime(s)!\n",guess);
				}
				else if(number<r.answer && guess<3)
				{
					System.out.printf("you guessed too low, you have guessed %s time(s) !\n",guess);
				}
				else
				{
					System.out.println("Your out of guesses.. The number was "+r.answer+". Game Over!");
				}

				guess++;
			}
		}while(guessRight=false || guess<4);


	}

}
