
public class Employee implements Cloneable {

	private int empId;
	private String empName;
	
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		
		return  this.empId+"  "+this.empName;
	}


	


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.empId*10;
	}
	
	

	
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e=(Employee)obj;
		if(this.empId==e.empId)
		{
			return true;
		}
		return false;
	}
	

/*	@Override
	protected Object clone()  {
		// TODO Auto-generated method stub
		return super.clone();
	}
	*/



	public static void main(String[] args)  {
		//String representation of an Object;
		Employee e1=new Employee(101,"Jhon Doe");
		Employee e2=new Employee(101,"Jhon Doe");
		System.out.println(e1);
		System.out.println(e2);
		
		
	// integer representation of an Object
		System.out.println("Hascode of e1 "+ e1.hashCode());	
		
	    if(e1.equals(e2))
	    	System.out.println("e1 and e2 are equal");
	    else
	    	System.out.println("e1 and e2 are not equal");
	  //clone
	    /*Employee b=(Employee)e1.clone();
	    if(b==e1)
	    System.out.println("both are equal");
	    else
	    System.out.println("both are not equal");
	    	
	    	*/
	    
	}

	
	
	
	
	  
	
	

	






}
