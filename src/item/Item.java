package item;

public class Item{
	protected String id,name,desc;
	protected boolean placeible,dropable,tradeable,sellible;
	protected int stackSize,sellPrice;
	
	public Item(){
		id = "item"; //id must be all lowercase
		name = "Item"; //name the player sees
		desc = "An unconfigured item."; //lore text
		placeible = false; //can the item be placed in the world?
		dropable = true; //can the item be thrown away?
		tradeable = true; //can it be traded?
		sellible = true; //is it for sale?
		stackSize = 999; //how much of the item can be put in one slot.
		sellPrice = 5;
		//I really feel like there should be more stuff here but I guess thats it.....
	}

	public String getId(){return id;}
	public String getName(){return name;}
	public String getDesc(){return desc;}
	public boolean getPlaceible(){return placeible;}
	public boolean getDropable(){return dropable;}
	public boolean getTradeable(){return tradeable;}
	public boolean getSellible(){return sellible;}
	public int getStackSize(){return stackSize;}
}

