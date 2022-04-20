package room;

public class Room{
	protected Room north,south,east,west;
	protected String name,desc;
	protected ArrayList<item.Item> items;
	protected ArrayList<String> itemDesc;
	
	public Room{
		north = null; //room to the north
		south = null; //room to the south
		east = null; //room to the east
		west = null; //room to the west
		// room name
		name = "Undefined room";
		// text for when the user rune 'look'
		desc = "The programers of this MUD are dumb if you see this";
		items = new ArrayList<item.Items>();
		itemDesc = new ArrayList<Stirng>();

		//Creates demo item
		items.add(new item.Item());
		//added to 'look'
		//eg 'an items[x] itemDesc[x]'
		//wich is 'an Item is on the floor'
		itemDesc.add("is on the floor");
	}
}
