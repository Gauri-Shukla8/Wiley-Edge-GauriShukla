
public class task1 {
	
	 void tableOfNumber(int n) {
		 System.out.println("Table of"+ n);
		for(int i=1;i<=10;i++) {	
			if(i==2) 
				continue;
			
			if(i==8)
				break;
			
		    System.out.println("n*"+i+"="+2*i);				
	}
	 }
	 
	 
    void digitsOfNumber(int n) {
    	 while(n>0) {
    		 System.out.println(n%10);
    		 n=n/10;
    	 }
    }
    
     int max(int a,int b) {
    	 
    	if(a>b) 
    		return a;   
    	else
    		return b;
    	}
  
       void weekday(int n) {
    	   
    	   
    	   switch(n){
    	   case 1:
    	   System.out.println("Monday");
    	   break;
    	   case 2:
    	   System.out.println("Tuesday");
    	   break;
    	   case 3:
    	   System.out.println("Wednesday");
    	   break;
    	   case 4:
    	   System.out.println("Thursday");
    	   break;
    	   case 5:
    	   System.out.println("Friday");
    	   break;
    	   case 6:
    	   System.out.println("Saturday");
    	   break;
    	    case 7:
    		   System.out.println("Sunday");
    	   default:
    	   System.out.println("wrong input");
    	  
    	   }
       }
       
       void printNumber(int n) {
    	    int c=0;
    	   do{
    		   System.out.println(++c);
    		   n++;
    	   }
    	   while(n<10);
       }
    
	public static void main(String [] args) {
		 task1 obj=new task1();
		 obj.tableOfNumber(2);	 
		 obj.digitsOfNumber(123);
		 obj.max(10, 50);
		 obj.weekday(4);
		 obj.printNumber(11);
		 	 
	}
}
