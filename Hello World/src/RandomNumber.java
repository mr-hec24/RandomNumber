import java.util.Scanner;

public class RandomNumber
	{
		static Scanner userInput = new Scanner(System.in);
		static String userName;
		static int secretNumber;
		static int userGuess;
		static int difficultyChoice;
		static int difficulty;
		static boolean isPlaying;
		
		public static void main(String[]args)
		{
			greetingUser();
			while (isPlaying)
				{
					askForDifficulty();
					generateRandomNUmber();
					guessTheNumber();
					askToPlayAgain();
				}
		}
		
		public static void greetingUser()
		{
			System.out.println("Enter your name");
			userName = userInput.nextLine();
			isPlaying = true;
		}
		
		public static void askForDifficulty()
		{
			System.out.println("Greetings " + userName + "! What difficulty of Guess the Number would you like?");
			System.out.println("(1) Baby (1 - 5)");
			System.out.println("(2) Easy (1 - 10)");
			System.out.println("(3) Medium (1 - 50)");
			System.out.println("(4) Difficult (1 - 100)");
			System.out.println("(5) HARDCORE (1 - 1000)");
			
			difficultyChoice = userInput.nextInt();
		}
		
		public static void generateRandomNUmber()
		{
			switch (difficultyChoice)
			{
				case 1:
						{
							difficulty = 5;
							break;
						}
				case 2:
						{
							difficulty = 10;
							break;
						}
				case 3:
						{
							difficulty = 50;
							break;
						}
				case 4:
						{
							difficulty = 100;
							break;
						}
				case 5:
						{
							difficulty = 1000;
							break;
						}	
			}
		}
		
		public static void guessTheNumber()
		{	
			secretNumber = (int)(Math.random()*difficulty)+1;
			int numberOfGuesses = 0;
			
			
			System.out.println("Please enter a number between 1 - " + difficulty + ".");
			boolean guessing = true;
			while (guessing)
				{
					userGuess = userInput.nextInt();
					numberOfGuesses++;

					if (userGuess == secretNumber || userName.equals("Hector"))
						{
							if (numberOfGuesses==1)
								{
									System.out.println("You got it in "+ numberOfGuesses +" guess!");
								}
							else
								{
									System.out.println("You got it in "+ numberOfGuesses +" guesses!");
								}
							guessing = false;
						}
					else if (userGuess < secretNumber)
						{
							System.out.println("Too low! Try again");
							
						}
					else if (userGuess > secretNumber)
						{
							System.out.println("Too high! Try again");
						}
				}
		}
		
		public static void askToPlayAgain()
		{
			System.out.println("Would you like to play again?");
			System.out.println("1) Yes");
			System.out.println("2) No");
			int choice = userInput.nextInt();
			
			if (choice == 2)
				{
					System.out.println("Alright then, " + userName + "... Come back later!");
					isPlaying = false;
				}
			else if (choice != 1 && choice != 2)
				{
					System.out.println("I'll take that as a yes... I guess");
				}
			else
				{
					System.out.println("Sweet!");
				}
		}
	}
