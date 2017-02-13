import java.util.ArrayList;
import java.util.Scanner;

public class MonopolyRunner
	{
		static int die1;
		static int die2;
		static ArrayList<Player> player = new ArrayList<Player>();
		static ArrayList<Space> inventory = new ArrayList<Space>();
		static boolean gameContinues=true;
		public static void main(String[] args)
			{
				System.out.println("Which board would you like to play?");
				for (String g:Board.names ) {
					System.out.println(g);
					}
				Scanner sc3 = new Scanner(System.in);
				String boardChoice =sc3.nextLine();
				switch(boardChoice)
				{
				case "regular":
					Board.makeBoard1();
					break;
				case "colorado 14ers":
					Board.makeBoard2();
					break;
				}
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
			Scanner sc2 = new Scanner(System.in);
			String name = sc2.nextLine();
			player.add(new Player(name, 1500, 0));
			
			System.out.println("Lets Begin");
		}
		public static void rollDice()
		{
			// TODO Auto-generated method stub
			 die1 = (int)(Math.random() *6)+1;
			 die2 = (int)(Math.random() *6)+1;
			 if(die1+die2+player.get(0).getPosition()>39)
			 {
				 player.get(0).setPosition(player.get(0).getPosition()-40);
				 
			 }
		}
		public static void movePlayer()
		{
			
			System.out.println();
			Scanner sc = new Scanner(System.in);
			String password = sc.nextLine();
			if(password.equals("jailtime"))
			{
				System.out.println("He/She moved to " + Board.layout.get(30).getName());
				System.out.println("Instead of going to jail... Im just going to rob you blind. Have a great day");
				inventory.removeAll(inventory);
				System.out.println();
				player.get(0).setPosition(30);
			}
			else
			{
				
			System.out.println(player.get(0).getName() + " rolled a " + die1+ " and a " + die2);
			System.out.println("He moved to " + Board.layout.get(die1+die2+player.get(0).getPosition()).getName());
			switch(Board.layout.get(die1+die2+player.get(0).getPosition()).getLocation())
			{
			case 0:
				System.out.println("Please collect 200 dollars.");
				player.get(0).setMoney(player.get(0).getMoney()+200);
				break;
			case 1:
			case 3:
			case 5:
			case 6:
			case 8:
			case 9:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 18:
			case 19:
			case 21:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 31:
			case 32:
			case 34:
			case 35:
			case 37:
			case 39:
				System.out.println("Would you like to buy it?");
				System.out.println("yes==1 & no ==2");
				Scanner sc1 = new Scanner(System.in);
				if(sc1.nextInt()==1)
				{
				inventory.add(new Space(Board.layout.get(die1+die2+player.get(0).getPosition()).getName(), Board.layout.get(die1+die2+player.get(0).getPosition()).getLocation(), Board.layout.get(die1+die2+player.get(0).getPosition()).getPrice()));
				player.get(0).setMoney(player.get(0).getMoney()-Board.layout.get(die1+die2+player.get(0).getPosition()).getPrice());
				gameContinues=true;
				}
				else
				{
					System.out.println();
				}
				break;
			case 2:
			case 17:
			case 33:
				System.out.println("*Draw Card*");
				System.out.println();
				break;
			case 7:
			case 22:
			case 36:
				break;
			case 20:
				System.out.println("You are free");
				System.out.println();
				break;
			case 30:
				System.out.println("Instead of going to jail... Im just going to rob you blind. Have a great day");
				inventory.removeAll(inventory);
				System.out.println();
				break;
			case 38:
				System.out.println("Tax Time");
				player.get(0).setMoney(player.get(0).getMoney()-100);
				System.out.println();
				break;
			case 4:
				System.out.println("Tax Time");
				player.get(0).setMoney(player.get(0).getMoney()-200);
				System.out.println();
				break;
			}
			
			player.get(0).setPosition(die1+die2+player.get(0).getPosition());
			}
		}
		public static void displayInventory()
		{
			System.out.println("YOUR MONEY ===== " +player.get(0).getMoney());
			System.out.println("You Own " );
			for (Space g: inventory) {
				System.out.println(g.getName());
				}
			System.out.println();
		}
//		public static void secretInput()
//		{
//			Scanner sc = new Scanner(System.in);
//			if(sc.equals("jailtime"))
//			{
//				
//			}
//		}
	}
