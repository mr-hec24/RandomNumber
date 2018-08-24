import java.util.Scanner;
public class IfElse
	{
		static Scanner userInput = new Scanner(System.in);
		static Scanner userInt = new Scanner(System.in);
		static String name;
		static int age;
		static int numberOfHandAppendages;
		static String planet;
		
		static String race;
		static String creature;
		static String generation;
		
		public static void main(String[]args)
		{
			greetings();
			waiting();
			conclusion();
		}
		
		public static void greetings()
		{
			System.out.println("In a galaxy far, far away");
			System.out.println(" ");
			System.out.println("Greetings, stranger!");
			System.out.println("What sounds should I make to recall your attention?");
			System.out.println("(Enter Your Name)");
			name = userInput.nextLine();
			System.out.println(name + " we need to determine what species you are. Please answer the following questions.");
			
			System.out.println("How old are you?");
			age = userInt.nextInt();
			
			System.out.println("How many arms or tentacles do you have?");
			numberOfHandAppendages = userInt.nextInt();
			
			System.out.println("Finally, from what planet in the Solar System do you come from?");
			planet = userInput.nextLine();
		}
		
		public static void waiting()
		{
			System.out.println("Alright. Now we are determining what alien species you are.");
			System.out.println("Please wait and listen to some music while we do some research.");
			System.out.println(" ");
			System.out.println("[Elevator Music Commences]");
			for (int i = 0; i < 5; i++ )
				{
				try
					{
						Thread.sleep(1000);
					} catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			calculations();
			System.out.println("[Elevator Music Abrubtly Stops]");
			System.out.println(" ");
			System.out.println("We have finally figured it out!");
		}
		
		public static void calculations()
		{
			if (planet.toLowerCase().equals("mercury"))
				{
					race = "Mercurnian";
				}
			else if (planet.toLowerCase().equals("venus"))
				{
					race = "Venusian";
				}
			else if (planet.toLowerCase().equals("earth"))
				{
					race = "Earthen";
				}
			else if (planet.toLowerCase().equals("mars"))
				{
					race = "Martian";
				}
			else if (planet.toLowerCase().equals("jupiter"))
				{
					race = "Jupitersian";
				}
			else if (planet.toLowerCase().equals("saturn"))
				{
					race = "Saturnian";
				}
			else if (planet.toLowerCase().equals("uranus"))
				{
					race = "Uranian";
				}
			else if (planet.toLowerCase().equals("neptune"))
				{
					race = "Neptunian";
				}
			else if (planet.toLowerCase().equals("pluto"))
				{
					race = "Plutonianese";
				}
			
			if (age < 0)
				{
					generation = "Non-Existant";
				}	
			else if (age < 2)
				{
					generation = "New born";
				}
			else if (age < 13)
				{
					generation = "Child";
				}
			else if (age < 18)
				{
					generation = "Teenage";
				}
			else if (age < 30)
				{
					generation = "Adult";
				}
			else if (age < 100)
				{
					generation = "Elder";
				}
			else if (age > 99)
				{
					generation = "Immortal";
				}
			
			if (numberOfHandAppendages == 0)
				{
					creature = "Worm";
				}
			else if (numberOfHandAppendages == 1)
				{
					creature = "Uni-Arm";
				}
			else if (numberOfHandAppendages == 2)
				{
					creature = "Humanoid";
				}
			else if (numberOfHandAppendages == 3)
				{
					creature = "Wyrdo";
				}
			else if (numberOfHandAppendages == 4)
				{
					creature = "Alien Beast";
				}
			else if (numberOfHandAppendages >= 5)
				{
					creature = "Tentacli";
				}
		}
	
		public static void conclusion()
		{
			System.out.println(" ");
			System.out.println("You are a " + race + " " + creature + " " + generation + "!");
			
		}
	}
