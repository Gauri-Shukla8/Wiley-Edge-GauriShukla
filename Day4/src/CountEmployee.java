public class CountEmployee {
	
	int empId;
	String empName;
	
	static int empCounter;
	
	public CountEmployee(int empId, String empName) {
		this.empId=empId;
		this.empName=empName;
		empCounter++;
	}

	public static int getEmployeeCounter() {
		return empCounter;
	}
	
	public static void main(String[] args) {
		CountEmployee employee1=new CountEmployee(101,"abc");
		CountEmployee employee2=new CountEmployee(102,"abc");
		CountEmployee employee3=new CountEmployee(102,"xyz");
		System.out.println("Number of employee :"+ CountEmployee.getEmployeeCounter());
	}
}
