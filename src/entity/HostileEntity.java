package entity;

public class HostileEntity extends entity.Entity{
	public HostileEntity(){
		id = "hostile-entity";
		name = "Hostile Entity";
		hostile=true;
		canAttack=true;
		isEvil=true;
	}
}
