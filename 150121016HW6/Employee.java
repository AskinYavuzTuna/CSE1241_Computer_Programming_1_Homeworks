//Aşkın Yavuz Tuna 150121016
public class Employee {
	int id;
	private String name;
	private String surname;
	private int workHour;
	private int speed;
	private Item[] items;
	private Payroll payroll;
	//this constructor produces employee object according to inputs which contain information about employee.
	public Employee (int id, String name, String surname, int workHour, int speed) {
		this.id=id;
		this.name=name;
		this.surname=surname;
		this.workHour=workHour;
		this.speed=speed;
	}
	/*this method calculates how many items this employee produce according to information about employee.
	Than, it creates appropriate number of items with randomly generated ids between 1-100 and put them into items array.
	After that it returns items array.*/
	public Item[] startShift() {
		int produced=this.speed * this.workHour;
		items=new Item[produced];
		for(int a=0;a<produced;a++) {
			items[a]=new Item((int)(Math.random()*100));
		}
		return items;	
	}
	//This method creates a Payroll object with employee’s work hour and the number of items which is created.Then, it returns payroll object.
	public Payroll endshift() {
		payroll=new Payroll(this.workHour,this.workHour*this.speed);
		return payroll;
	}
	//This method gives String according to information about employee.
	public String toString() {
		return ("This is the employee with id " + this.id + " speed " + this.speed + ". The work hour is " + this.workHour + " and the produced item count is " + this.items.length + ".");
	}
	//The codes which come after this line are getter and setter methods, I put all of them to make code available for various situation.
	public Item[] getItems() {
		return items;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getWorkHour() {
		return workHour;
	}
	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public Payroll getPayroll() {
		return payroll;
	}
	public void setPayroll(Payroll payroll) {
		this.payroll = payroll;
	}
	public void setItems(Item[] items) {
		this.items = items;
	}
	
}
