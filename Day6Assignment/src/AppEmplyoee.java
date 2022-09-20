
public class AppEmplyoee {

	public static void main(String [] args) {
	
	EmplyoeeAddress emp1=new EmplyoeeAddress(1,"ashaiana colony","street1","Lucknow",EmpAddressType.TemporaryAddress);
	EmplyoeeAddress emp2=new EmplyoeeAddress(2,"","church street","Bangalore",EmpAddressType.PermenantAddress);

	EmplyoeeAddress []empAdd=new EmplyoeeAddress[] {emp1,emp2};
	
	for(EmplyoeeAddress emp:empAdd) {
		System.out.println(emp.getFlatName());
	}
	Emplyoee ed=new Emplyoee(101,"Gauri",empAdd);
	EmplyoeeAddress [] result=ed.getAmpadd();
	for(EmplyoeeAddress empAddress:result)
	{
		System.out.println("The address is given as : ");
		System.out.println(empAddress.toString());
	}
}
}
