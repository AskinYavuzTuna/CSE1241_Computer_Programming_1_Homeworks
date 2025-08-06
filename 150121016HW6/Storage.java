//Aşkın Yavuz Tuna 150121016
public class Storage {
	private int capacity;
	private Item[] items;
	//This constructor produces Storage which has given capacity.
	public Storage(int capacity) {
		this.capacity=capacity;
	}
	//this method adds item to storage.
	public void addItem(Item item) {
		if(items==null){
			Item[] temp = new Item [1];
			temp[0]=item;
			items=temp;
		}
		else {
			Item[] temp = new Item [this.items.length + 1];
			temp[this.items.length]=item;
			items=temp;
		}
	}
	//The codes which come after this line are getter and setter methods.
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Item[] getItems() {
		return items;
	}
	public void setItems(Item[] items) {
		this.items = items;
	}
}

