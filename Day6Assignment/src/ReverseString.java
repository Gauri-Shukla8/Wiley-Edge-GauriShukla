
public class ReverseString {
	
	public static void main(String args[]) {
		String str="hello";
		System.out.println("Original String :"+ str);
		System.out.println("Reversed String :"+reverse(str));
		
	}

	static String reverse(String str){
		int n=str.length();
		String s="";
		for(int i=n-1;i>=0;i--) {
			s=s+str.charAt(i);
		}
		return s;
	}
		
	}

