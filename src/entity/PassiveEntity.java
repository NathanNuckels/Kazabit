package entity;

public class PassiveEntity extends entity.Entity{
	public PassiveEntity(){
		super();
		id = "passive-entity";
		name = "Passive Entity";
		canAttack = false;
	}
}
