import java.util.ArrayList;
import java.util.Scanner;

public class RealPlayer extends Player
	{

	@Override
	
	public ArrayList<Space> inventory()
		{
			ArrayList<Space> currentInventory = new ArrayList<Space>();
			return currentInventory;
		}

	@Override
	public  String makeName()
		{
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			
			return "Hi there " + name + "! " + "Lets play!";
		}

	}
