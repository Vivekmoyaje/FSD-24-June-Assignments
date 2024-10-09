package Exception_Handling_Tasks;

import Exception_Handling_Tasks.InsufficientFundException.BankAcount;

class InsufficientFundException extends Exception{
	
	public InsufficientFundException(String message) {
		super(message);
	}
	
}
	
	class BankAcount {
		private double balance;
		
		public BankAcount(double initialBalance) {
			
			this.balance = initialBalance;
		}
		
		public void withdraw(double amount) throws InsufficientFundException{
			
			if(amount > balance) {
				
				throw new InsufficientFundException("Insufficient fund to withdraw : " +amount);
				
			}
			
			balance-=amount;
			
		}
	}
	


public class CustomCheckedExceptionUsage {
	
	public static void main(String[] args) {
		
		BankAcount acount = new BankAcount(5000.0);
		
		try {
			acount.withdraw(6000.0);
		}
		catch(InsufficientFundException e) {
			System.out.println("InsufficientFundException caught : " +e.getMessage());
		}
		
	}

}
