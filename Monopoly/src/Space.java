
public class Space
	{
		private String name;
		private int location;
		private int price;
		public Space(String a, int n, int i)
		{
			name=a;
			location=n;
			price=i;
		}
		public String getName()
			{
					return name;
			}
		public void setName(String name)
			{
					this.name = name;
			}
	
		public int getLocation()
			{
					return location;
			}
		public void setLocation(int location)
			{
					this.location = location;
			}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
	}
