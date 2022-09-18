
public class Employee {
	
	 int empId; 
	 String empName, empDept;
	 double empBasicSalary, empGrossSalary ;
	
	
	Employee(int empId,String empName,String empDept, double empBasicSalary){
		
		this.empId=empId;
		this.empName=empName;
		this.empDept=empDept;
		this.empBasicSalary=empBasicSalary;
		double HRA=(12*empBasicSalary)/100;
		double DA=(8*empBasicSalary)/100;
		this.empGrossSalary=empBasicSalary+HRA+DA;
		
	}

	static void sortEmployees(Employee employee[]) {
		int size=employee.length;
		System.out.println("Before Sorting");
		for(int i=0;i<size;i++)
			System.out.println("Employee Name " +employee[i].empName+" Employee Salary "+employee[i].empGrossSalary);
		
		
	//	System.out.println(size);
	
		for(int i=0;i<size;i++)
		{
			for(int j=1;j<size-i;j++) {
				
				if(employee[j].empGrossSalary<employee[j-1].empGrossSalary) {
					Employee temp=employee[j-1];
					employee[j-1]=employee[j];
					employee[j]=temp;
				}
			}
		}
		System.out.println("After Sorting");
		for(int i=0;i<size;i++)
			System.out.println("Employee Name " +employee[i].empName+" Employee Salary "+employee[i].empGrossSalary);
	}
	


}
