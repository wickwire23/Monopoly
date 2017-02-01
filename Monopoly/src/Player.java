import java.util.ArrayList;

public abstract class Player
	{
		
		public abstract ArrayList<Space> inventory();
		public abstract String makeName();
		public static int rollDice()
		{
			int die = (int)(Math.random() *6)+1;
			return die;
		}
		
	
	}
