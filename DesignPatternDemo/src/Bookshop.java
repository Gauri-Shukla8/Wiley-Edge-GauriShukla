import java.util.ArrayList;
import java.util.List;

public class Bookshop implements Cloneable {
	
	 private String shopName;
	private List<Book> books=new ArrayList<>();
	 
	 
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
   public void loadData() {
	   for(int i=1;i<=5;i++) {
		   Book book=new Book();
		   book.setbId(i);
		   book.setbName("Book"+i);
		   getBooks().add(book);
	   }
   }
	@Override
	public String toString() {
		return "Bookshop [shopName=" + shopName + ", books=" + books + "]";
	}
	
	//gives shallow copy
	//@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
	
	@Override
	protected Bookshop clone() throws CloneNotSupportedException {
		Bookshop shop=new Bookshop();
		for(Book b : this.getBooks()){
			shop.getBooks().add(b);
			
	}
		return shop;
	}
	 
	 
	

}
