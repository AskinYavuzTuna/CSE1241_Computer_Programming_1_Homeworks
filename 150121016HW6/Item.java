//Aşkın Yavuz Tuna 150121016
public class Item {
	private int id;
	public static int numberOfItems=0;
	//This code produces item object and add one to the NumberOfItems which keeps the number of items.
	public Item(int id) {
		this.id = id;
		numberOfItems+=1;
	}
	//The codes which come after this line are getter and setter methods.
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static int getNumberOfItems() {
		return numberOfItems;
	}
	public static void setNumberOfItems(int numberOfItems) {
		Item.numberOfItems = numberOfItems;
	}
}
