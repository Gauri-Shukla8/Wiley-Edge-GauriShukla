
public class StringImplementation {

	static void stringBufferdemo() {
		StringBuffer sb1=new StringBuffer("Hello ");
		StringBuffer sb2=new StringBuffer("Welcome");
		StringBuffer sb3=new StringBuffer("Spring");
		//append
		 System.out.println("----append-----");
         System.out.println(sb1.append("World"));
         
         //capacity
         System.out.println("----capacity-----");
         System.out.println(sb1.capacity());
         
         //insert
         System.out.println("----Insert-----");
         System.out.println(sb2.insert(0, "java "));
        System.out.println(sb2.insert(2, "java "));
        
        
        //reverse
        System.out.println("----Reverse-----");
        System.out.println("Before reverse-  "+sb3);
        System.out.println("After Reverse-  "+ sb3.reverse());
        
        //delete
        System.out.println("----Delete-----");
       
        System.out.println("Before deleting "+sb1);
        sb1.delete(1,4); // index 1 to 3 will be deleted
        System.out.println("Afere deleting "+sb1);
        
 	}
	
	
	public static void main(String[] args) {
		StringImplementation.stringBufferdemo();
	}
	
}
