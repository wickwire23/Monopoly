import java.util.ArrayList;
import java.util.Scanner;

public class MonopolyRunner
	{
		static int die;
		static ArrayList<Player> player = new ArrayList<Player>();
		static ArrayList<Space> inventory = new ArrayList<Space>();
		static boolean gameContinues=true;
		public static void main(String[] args)
			{
				Board.makeBoard();
				greetUser();
			
				while(gameContinues==true)
					{
					rollDice();
					movePlayer();
					displayInventory();
					
					}
			}
		public static void greetUser()
		{
			System.out.println("Its time to hire me for the Job!");
			System.out.println("What's your name future Coworker?");
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			player.add(new Player(name, 1500, 0));
		}
		public static void rollDice()
		{
			// TODO Auto-generated method stub
			 die = (int)(Math.random() *6)+1;
			
			 System.out.println(player.get(0).getName() + " rolled a " + die);
			 if(die+player.get(0).getPosition()>39)
			 {
				 player.get(0).setPosition(player.get(0).getPosition()-40);
				 
			 }
		}
		public static void movePlayer()
		{
			System.out.println("He moved to " + Board.layout.get(die+player.get(0).getPosition()).getName());
			System.out.println("Would you like to buy it?");
			System.out.println("yes==1 & no ==2");
			Scanner sc = new Scanner(System.in);
			if(sc.nextInt()==1)
			{
			inventory.add(new Space(Board.layout.get(die+player.get(0).getPosition()).getName(), Board.layout.get(die+player.get(0).getPosition()).getLocation(), Board.layout.get(die+player.get(0).getPosition()).getPrice()));
			player.get(0).setMoney(player.get(0).getMoney()-Board.layout.get(die+player.get(0).getPosition()).getPrice());
			gameContinues=true;
			}
			else
			{
				System.out.println();
			}
			player.get(0).setPosition(die+player.get(0).getPosition());
		}
		public static void displayInventory()
		{
			System.out.println("YOUR MONEY ===== " +player.get(0).getMoney());
			System.out.println("You Own " );
			for (Space g: inventory) {
				System.out.println(g.getName());
				}
		}
	}
