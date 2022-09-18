
public class Demo {

	public static void main(String [] args) throws CloneNotSupportedException {
		
		
		Bookshop bookshop=new Bookshop();
		bookshop.setShopName("Novelty");
		bookshop.loadData();
		
		System.out.println(bookshop);
		
	/*	Bookshop bookshop1=new Bookshop();
		bookshop1.setShopName("Universal");
		bookshop1.loadData();
		System.out.println(bookshop1); */
		
		Bookshop bookshop1 =(Bookshop)bookshop.clone();
		bookshop.getBooks().remove(2);
		bookshop1.setShopName("Universal");
		
		System.out.println(bookshop1);
		
	}
}
