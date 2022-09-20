
public class ArrayLastFirst {

	
	public static void main(String args[]) {
		
		int a[]= {1,2,3,45,54,2,23,1};
		if(check(a))
		System.out.println("First and last element of an array are equal");
		else
		System.out.println("First and last element of an array are not equal");

	}
	static Boolean check(int a[]) {
		if(a[0]==a[a.length-1])
			return true;
		else
			return false;
					
	}
}
