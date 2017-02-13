import java.util.ArrayList;

public class Board
	{	
		static String[] names ={"regular","colorado 14ers"};
		static ArrayList<Space> layout = new ArrayList<Space>();
		public static ArrayList<Space> makeBoard1()
		{
			
			layout.add(new Space("GO",0,0));
			layout.add(new Space("Mediterranean Avenue",1,60));
			layout.add(new Space("Community Chest",2,0));
			layout.add(new Space("Baltic Avenue",3,60));
			layout.add(new Space("Income Tax",4,0));
			layout.add(new Space("Reading Railroad",5,200));
			layout.add(new Space("Oriental Avenue",6,100));
			layout.add(new Space("CHANCE",7,0));
			layout.add(new Space("Vermont Avenue",8,100));
			layout.add(new Space("Connecticut Avenue",9,100));
			layout.add(new Space("JAIL",10,0));
			layout.add(new Space("St. Charles Place",11,140));
			layout.add(new Space("Electric Company",12,150));
			layout.add(new Space("States Avenue",13,140));
			layout.add(new Space("Virginia Avenue",14,160));
			layout.add(new Space("Pennsylvania Railroad",15,200));
			layout.add(new Space("St. James Place",16,180));
			layout.add(new Space("Community Chest",17,0));
			layout.add(new Space("Tennessee Avenue",18,180));
			layout.add(new Space("New York Avenue",19,200));
			layout.add(new Space("FREE PARKING",20,0));
			layout.add(new Space("Kentucky Avenue",21,220));
			layout.add(new Space("CHANCE",22,0));
			layout.add(new Space("Indiana Avenue",23,220));
			layout.add(new Space("Illinois Avenue",24,220));
			layout.add(new Space("B.& O. Railroad",25,200));
			layout.add(new Space("Atlantic Avenue",26,260));
			layout.add(new Space("Ventnor Avenue",27,260));
			layout.add(new Space("Water Works",28,150));
			layout.add(new Space("Marvin Gardens",29,280));
			layout.add(new Space("GO TO JAIL",30,0));
			layout.add(new Space("Pacific Avenue",31,300));
			layout.add(new Space("North Carolina Avenue",32,300));
			layout.add(new Space("Community Chest",33,0));
			layout.add(new Space("Pennsylvannia Avenue",34,320));
			layout.add(new Space("Short Line",35,200));
			layout.add(new Space("CHANCE",36,0));
			layout.add(new Space("Park Place",37,350));
			layout.add(new Space("Luxary Tax",38,100));
			layout.add(new Space("BoardWalk",39,400));
		
			return layout;
		}
		public static ArrayList<Space> makeBoard2()
		{

			layout.add(new Space("Trailhead",0,0));
			layout.add(new Space("Mt. Sherman",1,60));
			layout.add(new Space("Trail Fortune",2,0));
			layout.add(new Space("Quandary Peak",3,60));
			layout.add(new Space("CO Fourteeners Intiative",4,0));
			layout.add(new Space("LittleBear-Blanca 14er Traverse",5,200));
			layout.add(new Space("Mt. Bierstadt",6,100));
			layout.add(new Space("Go for an Adventure",7,0));
			layout.add(new Space("Torreys Peak",8,100));
			layout.add(new Space("Grays Peak",9,100));
			layout.add(new Space("Basecamp / Hiking Through",10,0));
			layout.add(new Space("Mt. Yale",11,140));
			layout.add(new Space("Pikes Peak(14er Toll Road)",12,150));
			layout.add(new Space("Mt. Princeton",13,140));
			layout.add(new Space("Mt. Harvard",14,160));
			layout.add(new Space("Crestones 14er Traverse",15,200));
			layout.add(new Space("Humboldt Peak",16,180));
			layout.add(new Space("Trail Fortune",17,0));
			layout.add(new Space("Mt. Lindsey",18,180));
			layout.add(new Space("Kit Carson Peak",19,200));
			layout.add(new Space("Scenic Viewpoint",20,0));
			layout.add(new Space("Mt. Sneffels",21,220));
			layout.add(new Space("Go for an Adventure",22,0));
			layout.add(new Space("Uncompahgre Peak",23,220));
			layout.add(new Space("Mt. Eolus",24,220));
			layout.add(new Space("Wilson-El Diente 14er Traverse",25,200));
			layout.add(new Space("Mount of the Holy Cross",26,260));
			layout.add(new Space("Mt. massive",27,260));
			layout.add(new Space("Mt. Evans (14er Toll Road)",28,150));
			layout.add(new Space("Mt. Elbert ",29,280));
			layout.add(new Space("GO TO BaseCamp",30,0));
			layout.add(new Space("Castle Peak ",31,300));
			layout.add(new Space("Snowmass Mountain",32,300));
			layout.add(new Space("Trail Fortune",33,0));
			layout.add(new Space("Pyramid Peak",34,320));
			layout.add(new Space("Maroon Bells 14er Adventure",35,200));
			layout.add(new Space("Go for an Adventure",36,0));
			layout.add(new Space("Longs Peak",37,350));
			layout.add(new Space("Lost a BOOT",38,100));
			layout.add(new Space("Capitol Peak",39,400));
		
			return layout;
		}
		
	}
