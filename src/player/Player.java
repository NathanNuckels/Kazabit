package player;
import java.util.ArrayList;

public class Player{

	//id: Player id. hType:English name.
	//name: custom name. desc: description
	protected String id,hType,name,desc;

	public Player(){
		id="player";
		hType="Default Player";
		name="";
		desc="A unconfigured isntance of layer.Player";
	}

	public String getId(){return id;}
	public String getType(){return hType;}
	public String getName(){return name;}
	public String getDesc(){return desc;}
}
