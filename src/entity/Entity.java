package entity;

public class Entity{
	protected String id,name,wiki;
	protected item.Container inventory;
	protected int health,maxHealth,attackMin,attackMax,levelMin,levelMax,level;
	protected boolean hostile,canAttack,isEvil;
	protected double expMin,expMax,exp;

	public Entity(){
		id = "entity"; //all lowercase internal name
		name = "Entity"; //name the player sees
		wiki = null; //a wiki article on it if there is one
		inventory = null; //its inventory if it has one;
		health = 5; //current health
		maxHealth = 5; //max health
		attackMin = 0; //attack damage is random between min and max
		attackMax = 5;
		levelMin = 1; //minimum level for it
		levelMax = 5; //max level
		//level = 2; //hardcoded level
		//this line generates a random level
		level = ThreadLoclaRandom.current().nextInt(levelMin,levelMax+1);
		hostile = false; //Hostile entitys attack the player once they enter the room
		canAttack = true; //Can it deal damage to the player?
		isEvil = false; //Killing a good entity gets you bad alignment, killing an evil entity gives you a good alignment. choose whisly.....
		//drops some ammount of xp between min and max.
		//to drop the same ammount every time, set min and max tu null and hardcode the exp varible
		expMin = 5.0;
		expMax = 15.0;
		//exp = 7.35; //exp must be a multiple of 1/20
		//this line might look like bs but it garentees a multiple of 1/20
		exp = (ThreadLocalRandom.current().nextInt(expMin*20,(expMax+1)*20))/20;
		
		//phew... thats a lot of numbers....
	}

	//getters and stuff
	

	public String getId(){return id}
	public String getName(){return name}
	public String getWiki(){return wiki}
	public item.Container getInventory(){return inventory}
	public int getHealth(){return health}
	public int getMaxhealth(){return maxHealth}
	public int getAttackmin(){return attackMin}
	public int getAttackmax(){return attackMax}
	public int getLevelmin(){return levelMin}
	public int getLevelmax(){return levelMax}
	public int getLevel(){return level}
	public boolean getHostile(){return hostile}
	public boolean getCanattack(){return canAttack}
	public boolean getIsevil(){return isEvil}
	public double getExpmin(){return expMin}
	public double getExpmax(){return expMax}
	public double getExp(){return exp}
}
