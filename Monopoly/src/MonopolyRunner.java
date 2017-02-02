import java.util.Scanner;

public class MonopolyRunner
	{

		public static void main(String[] args)
			{
				greetUser();
				boolean gameContinues;
				while(gameContinues==true)
					{
					
					}
			}
		public static void greetUser()
		{
			System.out.println("Its time to hire me for the Job!");
			System.out.println("What's your name future Coworker?");
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			RealPlayer newbie = new RealPlayer(name, 1500);
		}
		
	}
