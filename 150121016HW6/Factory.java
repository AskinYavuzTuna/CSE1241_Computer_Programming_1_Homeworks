//Aşkın Yavuz Tuna 150121016
//!!! In these class when I need I control the array is null or not to avoid error about something.length when something array is null.
public class Factory {
	private String name;
	private Employee[] employees;
	private Storage storage;
	private Payroll[] payrolls;
	private double itemPrice;
	//This constructor produces factory with certain information which will be entered by user.
	public Factory(String name,int capacity,double itemPrice){
		this.name=name;
		this.storage=new Storage(capacity);
		this.itemPrice=itemPrice;
	}
	//this method gets the revenue.
	public double getRevenue() {
		return Item.numberOfItems*itemPrice;
	}
	//this method gets Paid Salaries.
	public double getPaidSalaries() {
		/////////////////////////return storage.getitemsLength()*;
		if(payrolls==null)
			return 0;
		else {
			int totalSalary=0;
			for(int a=0;a<payrolls.length;a++) {
				if(this.payrolls[a]==null) {
					totalSalary+=0;
				}
				else
				totalSalary += payrolls[a].calculateSalary();
			}
			return totalSalary;
		}
	}
	//this method adds employee to factory.
	public void addEmployee(Employee employee) {
		if(employees==null) {
			Employee[] tempEmployees=new Employee[1];
			tempEmployees[0]=employee;
			employees=tempEmployees;
		}
		else {
			Employee[] tempEmployees=new Employee[employees.length+1];
			for(int t=0;t<employees.length;t++) {
				tempEmployees[t]=employees[t];
			}
			tempEmployees[employees.length]=employee;
			employees=tempEmployees;
		}
		employee.startShift();
		Item[] tempItems=employee.getItems();
		if (tempItems==null) {
			
		}
		else {
			for(int b=0;b<tempItems.length;b++) {
				storage.addItem(tempItems[b]);
			}
		}
	}
	//this method adds employee from the factory.
	public Employee removeEmployee(int id) {
		if(employees==null) {
			System.out.println("There are no employees!");
			return null;
		}
		else {
			Employee person;
			boolean exist=false;
			int location=0;
			Employee personClone;
			for(int i=0;i<employees.length;i++) {
				if(employees[i].id==id) {
					exist=true;
					person=employees[i];
					location=i;
					addPayroll(person.endshift());
				}
			}
			if(employees==null) {
				personClone=employees[location];
			}
			else {
				personClone=null;
			}
			
			if(exist) {
				for(int k=location;k<employees.length-1;k++) {
					employees[k]=employees[k+1];
					location=k;
				}
				//personClone=employees[location];
				Employee[] employeesReducer=new Employee[employees.length-1];
				for(int y=0;y<employees.length-1;y++) {
					employeesReducer[y]=employees[y];
				}
				employees=employeesReducer;
				
				return personClone;
			}
			else
				System.out.println("Employee does not exist!");
			return null;
			
		}
		
	}
	//This method adds the payroll.
	private void addPayroll(Payroll payroll) {
		if(payrolls==null) {
			Payroll[] tempPayrollsArray=new Payroll[1];
			tempPayrollsArray[0]=payroll;
			payrolls=tempPayrollsArray;
		}
		else {
			Payroll[] tempPayrollsArray=new Payroll[payrolls.length+1];
			for(int m=0;m<payrolls.length;m++) {
				tempPayrollsArray[m]=payrolls[m];
			}
			tempPayrollsArray[payrolls.length]=payroll;
			payrolls=tempPayrollsArray;
		}
		
	}

}
