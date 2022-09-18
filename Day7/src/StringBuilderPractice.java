
public class StringBuilderPractice {

	static void stringBuilderdemo() {
		
   StringBuilder sb1 = new StringBuilder("Welcome to Wiley ");
   System.out.println("Input: " + sb1);

   // Appending the boolean value
   sb1.append(true);
   System.out.println("Output: " + sb1);
   
   System.out.println("---------------------");
   
   // create a StringBuilder object
   StringBuilder str = new StringBuilder();
   // add the String to StringBuilder Object
   str.append("Gauri Shukla");
   // get char at position 1
   char ch = str.charAt(1);
   // print the result
   System.out.println("StringBuilder Object"+ " contains = " + str);
   System.out.println("Character at Position 1"+ " in StringBuilder = " + ch);
   
   
   System.out.println("---------------------");
   System.out.println("String contains = " + str);
   
   // get index of string For
   int index = str.indexOf("Shukla");
   // print results
   System.out.println("index of string 'Shukla' = "
                      + index);
	}
	public static void main(String args[]) {
		StringBuilderPractice.stringBuilderdemo();
	}
}
