

public  class Player
	{
		private String name;
		private int money;
		private int position;
		
		 
		public Player(String s, int i,int p)
		{
			setPosition(p);
			setName(s);
			setMoney(i);
		}
		
		 public int rollDice()
				{
					// TODO Auto-generated method stub
					int die = (int)(Math.random() *6)+1;
					return die;
				}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getMoney() {
			return money;
		}

		public void setMoney(int money) {
			this.money = money;
		}

		public int getPosition() {
			return position;
		}

		public void setPosition(int position) {
			this.position = position;
		}
		
	}
