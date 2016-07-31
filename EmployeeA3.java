
public class EmployeeA3 {
	
	String name;
	int age;
	String desig;
	int EmpID;
	
	public EmployeeA3(String name, int id) {
		this.name=name;
		this.EmpID=id;
	}
	
	public void getDesig(String desig) {
		this.desig=desig;
	}
	
	public void getage(int x) {
		this.age=x;
	}
	
	public void displayEmp() {
		System.out.println("Name: "+name);
		System.out.println("Employee ID: "+EmpID);
		System.out.println("Designation: "+desig);
		System.out.println("Age: "+age);
	}

}
