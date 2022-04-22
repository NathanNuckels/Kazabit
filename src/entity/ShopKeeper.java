package entity;

public class ShopKeeper extends entity.Entity{
	protected boolean canSell,canBuy;
	
	public ShopKeeper(item.Container i){
		super();
		id = "shopkeeper";
		name = "Shop Keeper";
		inventory = i;
		canAttack = false;
		canBeAttacked = false;
		canSell = true; //If they can sell items to the players
		canBuy = true; //if the player can sell items to them
	}

	//buying and selling are handled by item.ContainerSlot.add/take()

	//getInventory is already defined by Entity
	public boolean getCanSell(){return canSell;}
	public boolean getCanBuy(){return canBuy;}
}
