//Create the Employee class, which should contain the attributes empId, 
//empName. Along with that, it should also contain empAddresses, which is 
//array of address. This should consist of temporary address and permanent
//address. 
//Write a program to instantiate the employee object and display all the 
//attributes of the same.
//Attributes of address class: flatNumber, flatName, roadName, cityName.
public class Emplyoee {

	private int empId;
	private String empName;
	private EmplyoeeAddress empadd[]=new EmplyoeeAddress[5];
	public Emplyoee(int empId, String empName, EmplyoeeAddress[] empadd) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empadd = empadd;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public EmplyoeeAddress[] getAmpadd() {
		return empadd;
	}
	public void setAmpadd(EmplyoeeAddress[] empadd) {
		this.empadd = empadd;
	}
	
	
	
}