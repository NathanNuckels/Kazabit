package player;
import java.util.ArrayList;

public class Player{

	//id: Player id. hType:English name.
	//name: custom name. desc: description
	protected String id,hType,name,desc;
	protected ArrayList<player.Property> properties;
	protected ArrayList<player.Ability> abilities;

	public Player(){
		id="player";
		hType="Default Player";
		name="";
		desc="A unconfigured isntance of layer.Player";
		properties = new ArrayList<player.Property>();
		abilities = new ArrayList<player.Ability>();
	}
}
