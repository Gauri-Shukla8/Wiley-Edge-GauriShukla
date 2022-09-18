
public class BankApp {

	
	public static void main(String []args) {
		BankAccount bankaccount=new BankAccount(101,"Gauri Shukla",980,AccountType.CURRENT);
		//double ans=bankaccount.getCurrentBalance();
		BankAccount bankaccount1=new BankAccount(103,"kajal",98880,AccountType.CURRENT);

		bankaccount.displayTotalBalance();
		bankaccount.withdrawAmount(100);
		bankaccount.displayTotalBalance();

		bankaccount1.displayTotalBalance();
		bankaccount1.withdrawAmount(100);
		bankaccount1.displayTotalBalance();
    
		
		
	}
}
