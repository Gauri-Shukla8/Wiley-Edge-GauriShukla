
public class BankAccount {
	
	 int accountId;
	 String accountHolderName;
	 double openingBalance, currentBalance, totalBalance;
	 AccountType accountType;
	 
	 BankAccount( int accountId,String accountHolderName,double openingBalance,AccountType accountType){
		 
		    this.accountId=accountId;
		    this.accountHolderName=accountHolderName;

			if (accountType == AccountType.CURRENT )
				if( openingBalance<1000)
				{System.out.println("Enter amount greater than 1000");
				 this.openingBalance=0;
				 this.currentBalance=0;
				}
			  else {
				 this.openingBalance=openingBalance;
				 this.currentBalance=openingBalance;}
			
			if (accountType == AccountType.SAVINGS )
				if(openingBalance<500)
				{System.out.println("Enter amount greater than 500");
				 this.openingBalance=0;
				 this.currentBalance=0;}
				
				  else {
						 this.openingBalance=openingBalance;
						 this.currentBalance=openingBalance;}
				
			 
			
		  
			 this.accountType = accountType;

		 
	 }
	double depositAmount(double amount){
		System.out.println("Amount deposited "+amount);
		double balance= getCurrentBalance();
		System.out.println("Current Amount "+balance);
		currentBalance=amount+balance;
		return currentBalance;
	}
	
	
	double withdrawAmount(double amount){
	    double newCurrent=0;
		double balance= this.getCurrentBalance();
		if(amount>balance)
		System.out.println("Enter amount less than current balance");
		else
			newCurrent =balance-amount;
		
		if(accountType==AccountType.SAVINGS && newCurrent<500)
			{System.out.println("Min balance requird :500");
			return this.getCurrentBalance();
			}
	
		if(accountType==AccountType.CURRENT && newCurrent<1000)
			{System.out.println("Min balance requird :500");
			return this.getCurrentBalance();}
			
		
		this.currentBalance=newCurrent;
		return this.currentBalance;
	}
	double getCurrentBalance(){
		return this.currentBalance;
	}
     void displayTotalBalance(){
	 System.out.println("Account holder ID "+ accountId);
	 System.out.println("Account holder Name " +accountHolderName);
	 System.out.println("Account Type " + this.accountType);
	 System.out.println("Total Balance " + this.getCurrentBalance());
	}


	
}