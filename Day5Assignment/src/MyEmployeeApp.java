
public class MyEmployeeApp {
	
public static void main(String [] args) {
		
		Employee employee[]=new Employee[5];
		employee[0]=new Employee(100,"Gauri","IT",8900);
		employee[1]=new Employee(2,"Saloni","IT",9200);
		employee[2]=new Employee(3,"Kajal","IT",5900);
		employee[3]=new Employee(40,"Harshita","IT",700);
		employee[4]=new Employee(5,"Isha","IT",6900);
		
		
		Employee.sortEmployees(employee);
		
		
	}
}
