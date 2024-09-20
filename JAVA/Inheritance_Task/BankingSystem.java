package Inheritance_Task;

// Hierarchical inheritance example.

//Exercise 1: Banking System
//Create a basic banking system with three classes: Account, SavingsAccount, and CheckingAccount.

//Account Class:
//Properties: accountNumber, balance
//Methods: deposit(double amount), withdraw(double amount), and a constructor to set the account number and initial balance.

//SavingsAccount Class (subclass of Account):
//Additional Property: interestRate
//Method: addInterest(), which adds interest to the account balance based on the interest rate.

//CheckingAccount Class (subclass of Account):
//Additional Property: overdraftLimit
//Method: withdraw(double amount), which allows withdrawing funds up to the overdraft limit.
//Write a Main class to demonstrate the use of these classes by creating instances of both SavingsAccount and CheckingAccount.

class Acount {

	long acountNumber;
	double balance;

	public Acount(long acountNumber, double balance) {

		this.acountNumber = acountNumber;
		this.balance = balance;
		
		System.out.println("The Acount Number is : "  + acountNumber);
		System.out.println("The intial balance is : "  + balance);
		
	}

	public void deposite(double amount) {

		System.out.println("Total deposite amount is : " + amount);

	}

	public void withdraw(double amount) {
		
		System.out.println("Total withdraw amount is : " + amount);
	}

}

class SavingAcount  extends Acount {
	
	double interest;
	
	public SavingAcount(long acountNumber , double balance ,double interest) {
		
		super(acountNumber,balance);
		this.interest = interest;
		
	}
	
	public void addInterest() {
		
		System.out.println("The interest is : " +interest*balance);
	}

}

class CheckingAcount extends Acount {
	
	int overdraftLimit;
	
	public CheckingAcount(long acountNumber , double balance, int overdraftLimit) {
		
		super(acountNumber,balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	public void withdraw(double amount) {
		
		if(amount>overdraftLimit) {
			
			System.out.println("You have no sufficiant balsance ");
			
		}
			
			else {
				System.out.println("The amount withdraw succesfully of " +amount);
			}
	}

}

public class BankingSystem {

	public static void main(String[] args) {
		
		SavingAcount SA = new SavingAcount(9012345678L,100000,3.15);
		SA.deposite(15000);
		SA.withdraw(5000);
		SA.addInterest();
		
		System.out.println("---------------------------------------------");
		
		CheckingAcount CA = new CheckingAcount(1234567890L,50000,10000);
		SA.deposite(1000);
		CA.withdraw(5000);
		

	}

}


//Output:

//The Acount Number is : 9012345678
//The intial balance is : 100000.0
//Total deposite amount is : 15000.0
//Total withdraw amount is : 5000.0
//The interest is : 315000.0
//---------------------------------------------
//The Acount Number is : 1234567890
//The intial balance is : 50000.0
//Total deposite amount is : 1000.0
//The amount withdraw succesfully of 5000.0
