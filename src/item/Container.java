package item;

public class Container{
	protected ArrayList<item.ContainerSlot> slots;

	public Container(){
		slots = new ArrayList<item.ContainerSlot>();
		for (int i=0;i<5;i++){
			slots.add(new item.ContainerSlot());
		}
	}

	public Contiainer(int x){
		slots = new ArrayList<item.ContainerSLot>();
		for (int i=0;i<x;i++){
			slots.add(new item.ContainerSlot());
		}
	}

	public vodi clear(){
		for (int i=0;i<slots.length();i++){
			slots.get(i).clear();
		}
	}
}
