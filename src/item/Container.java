package item;
import java.util.ArrayList;
public class Container{
	protected ArrayList<item.ContainerSlot> slots;

	public Container(){
		slots = new ArrayList<item.ContainerSlot>();
		for (int i=0;i<5;i++){
			slots.add(new item.ContainerSlot());
		}
	}

	public Container(int x){
		slots = new ArrayList<item.ContainerSlot>();
		for (int i=0;i<x;i++){
			slots.add(new item.ContainerSlot());
		}
	}

	public void clear(){
		for (int i=0;i<slots.size();i++){
			slots.get(i).clear();
		}
	}
	public getSlot(int i){return slots.get(i);}
}
