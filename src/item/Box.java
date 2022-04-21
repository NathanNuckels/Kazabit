package item;

public class Box extends item.Item{
	protected item.Container c;

	public Box(){
		c = new item.Container(20);
		id = "box";
		name = "Box";
		desc = "An example item that holds 20 other items.";
		placeible = true;
		dropible = true;
		tradeable = true;
		sellible = true;
		stackSize = 1;
		sellPrice = 50;
	}

	public item.Container getContainer(){return c;}
}
