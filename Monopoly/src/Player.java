import java.util.ArrayList;

public abstract class Player
	{
		private String name;
		private String money;
		 abstract ArrayList<Space> inventory();
		 abstract String makeName();
		 
		 public int rollDice()
				{
					// TODO Auto-generated method stub
					int die = (int)(Math.random() *6)+1;
					return die;
				}
		
	}
