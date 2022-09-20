
public class CountOccurance {
	
	public static void main(String args[]) {
		
		int res=countChar("Have a nice evening!", 'e');
		System.out.println("No Of Occurances of e "+ res);
	}
	
	static int countChar(String str, char ch) {
		 int c=0;
		for(int i=0;i<str.length();i++) 
			if(str.charAt(i)=='e') 
				c++;
			
		return c;
		
	}

}
