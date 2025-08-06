//Aşkın Yavuz Tuna 150121016
public class Payroll {
	private int workHour;
	private int itemCount;
	//this constructor produces payroll object according to inputs.
	public Payroll(int workHour,int itemCount) {
		this.workHour=workHour;
		this.itemCount=itemCount;
	}
	//this method calculates salary according to work hour and item count.
	public int calculateSalary() {
		return (30 * this.workHour)+ (20 * this.itemCount);
	}
	//this method gives the String which consists of informations about object.
	public String toString() {
		return "The work hour is " + this.workHour +" and the produced item count is " + this.itemCount + ".";
	}
}
