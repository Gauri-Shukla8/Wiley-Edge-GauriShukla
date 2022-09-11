
public class Date {
	
	int dd,mm,yy;
	Date(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
    Boolean checkDate() {
    	
    	if(yy==00)
    		return false;
    	
    	if(mm>12 || mm<1)
    		return false;
    	else
    	{
    	
    		if(mm==2 && yy%4 ==0 && yy%400==0)
    			if(dd>0 && dd<=29)
    				return true;
    		if(mm==2 )
    			if(dd>0 && dd<=28)
    				return true;
    		if(mm==1 || mm==3 || mm==5 ||mm==7 || mm==8 || mm==10 || mm==10 || mm==12)
    			if(dd>0 && dd<=31)
    				return true;
    		if(mm==4 || mm==6 || mm==9 ||mm==11) 
    			if(dd>0 && dd<=30)
    				return true;
    			
    			return false;	
    	}
    }
    
    void displayDate(Boolean check) {
    	if(check)
    	System.out.println(dd+"/"+mm+"/"+yy);
    	else
    		System.out.println("Please Enter a valid date");
    		
    }

}
