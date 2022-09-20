
public class Anagramstrings {

	public static void main(String [] args) {
	
		
		if(isAnagram("happy", "yhapp")) 
			System.out.println("Strings are Anagram");
		else
			System.out.println("Strings are not Anagram");

			
			
			
		
	}
	    public static boolean isAnagram(String s, String t) {
	        int n1=s.length();
	        int n2=t.length();
	        if(n1!=n2)
	            return false;
	        
	        int count[]=new int[26];
	        for(int i=0;i<n1;i++)
	        {
	            count[s.charAt(i)-'a']++;
	        }
	             for(int i=0;i<n1;i++)
	        {
	            count[t.charAt(i)-'a']--;
	                 if(count[t.charAt(i)-'a']<0)
	                     return false;
	        }
	        return true;
	        
	    }
	}

