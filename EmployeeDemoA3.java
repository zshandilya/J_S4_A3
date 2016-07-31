
public class EmployeeDemoA3 {

	public static void main(String[] args) {

		EmployeeA3 emp1=new EmployeeA3("David Tyler", 24567);
		EmployeeA3 emp2=new EmployeeA3("Michael Korr", 24652);
		
		emp1.getage(31);
		emp1.getDesig("Software Dev Senior Analyst");
		emp1.displayEmp();
		
		System.out.println("");
		
		emp2.getage(25);
		emp2.getDesig("Technical Analysis Junior Associate");
		emp2.displayEmp();
	}

}
