package item;

public class ContainerSlot{
	protected item.Item type;
	protected int ammount;

	public ContainerSlot(item.Item i, int a){
		type=i;ammount=a;
	}
	public ContainerSlot(item.Item i){
		type=i;ammount=1;
	}
	public ContainerSlot(){
		type = new item.Empty();
		ammount=0;
	}

	public void add(int i) throws item.SlotException{
		if (checkStack(ammount+i)){
			ammount+=i;
		} else {
			throw new item.SlotException();
		}
	}

	public void take(int i) throws item.SlotException{
		if ((ammount-1)>=0){
			ammount-=i;
		} else {
			throw new item.SlotException();
		}
	}
	public void clear(){
		type = new item.Empty();
		ammount = 0;
	}
	private boolean checkStack(int i){
		return (i>type.getStackSize());
	}
}
