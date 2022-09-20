

//The main class should create object of BankAccount and provide the 
//accounttype. It should  later invoke the calculateTotalInterest() by providing 
//arguments. Print the total interest on  investments. 
//8. Modify the above BankAccount class by connecting it with 
//DepositAmountException. This exception should be generated if the 
//amount passed in the calculateTotalInterest is not positive. 


public class BankAccount {
	
	private int accountId;
	private String accountHolderName;
	private AccountType account;


public BankAccount(int accountId, String accountHolderName, AccountType account) {
		//super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.account = account;
	}


public int getAccountId() {
		return accountId;
	}


	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}


	public String getAccountHolderName() {
		return accountHolderName;
	}


	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}


	public AccountType getAccount() {
		return account;
	}


	public void setAccount(AccountType account) {
		this.account = account;
	}


 double calculateTotalInterest(double amount, int years) throws DepositException{
	
	double ans=0;
	int interest=0;
	if(amount>0) {
	if(this.account.name().equals("savings"))
	{
		interest=this.account.getInterest();
		ans=(amount*years*interest)/100;
	}
	else if(this.account.name().equals("current")) {
		interest=this.account.getInterest();
	   ans=(amount*years*interest)/100;
	}
	return ans;
	}
	else
		throw new DepositException("Please Enter a positive amount");
	
}
}