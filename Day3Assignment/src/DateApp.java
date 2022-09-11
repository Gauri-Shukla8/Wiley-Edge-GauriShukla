
public class DateApp {

	public static void main(String [] args) {
		
		Date date=new Date(29,8,2003);
		Date date1=new Date(29,2,2003);
		Date date2=new Date(9,12,2000);
		Date date3=new Date(07,8,2022);
		Boolean check=date.checkDate();
		 date.displayDate(check);
		 Boolean check1=date1.checkDate();
		 date1.displayDate(check1);
		 Boolean check2=date2.checkDate();
		 date2.displayDate(check2);
		 Boolean check3=date3.checkDate();
		 date3.displayDate(check3);
	}
}
