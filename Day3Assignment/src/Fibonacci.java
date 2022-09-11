
public class Fibonacci {
	 int f1,f2;
	 int num;
    Fibonacci(int num,int f1,int f2){
    	this.f1=f1;
    	this.f2=f2;
    	this.num=num; 	  
      }
    
     void printFibonacci() {
    	if(num==1)
    		System.out.println(f1);
    	if(num==2)
    		System.out.println(f2);
    	for(int i=3;i<=num;i++) {
    		int sum=f1+f2;
    	 System.out.println(sum);
    	   f1=f2;
    	   f2=sum;
    	   
       	}
    }
    	public static void main(String ards[]) {
    		Fibonacci fibonacci=new Fibonacci(10,0,1);
    		fibonacci.printFibonacci();
    		
    	}
    }

