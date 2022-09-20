
public class MyBankApp {
public static void main(String args[])
{
	AccountType account1=AccountType.savings;
	AccountType account2=AccountType.current;
	BankAccount bank=new BankAccount(81,"Kajal,",account1);
	BankAccount bank1=new BankAccount(811,"gauri",account2);
	try {
			System.out.println("The interest calculated is  "+bank1.calculateTotalInterest(-700, 10));
		
	} catch (DepositException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		System.out.println("The interest calculated is    "+bank.calculateTotalInterest(560, 6));
	} catch (DepositException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}