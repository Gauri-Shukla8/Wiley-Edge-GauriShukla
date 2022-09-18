
public class Triangle {

	int height;
	int base;
	
   Triangle(int base){
	   this.base=base;
	   this.height=base*3;
   }
   
  
   
   public int getHeight() {
	return height;
}



public void setHeight(int height) {
	this.height = height;
}



public int getBase() {
	return base;
}



public void setBase(int base) {
	this.base = base;
}



double displayArea() {
	   return 0.5*base*height;
   }
   
}
