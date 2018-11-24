package bank_Account_with_Arrays;
import java.util.Scanner;


public class BankTester {

	public static void main(String[] args) 
	{
		//Just creating a randomly named bank here...
		Bank Reynolds_Bank = new Bank();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter an account number, followed by a starting balance or type -1 to quit: ");
		int new_account_number = scan.nextInt();
		double new_account_balance = scan.nextDouble();
		
		//The while loop will check for the -1 in the new_account_number variable even if typed in at this beginning point
		//The user will have to type a second number anyway before the while will test for the -1 and quit
		//Note that typing a -1 for the very first value will result in a code error because the program
		//will attempt to do the procedures below the while loop concerning high and low bank accounts but
		//there are no accounts within the bank at such a point
		while (new_account_number != -1)
		{
			
			BankAccount New_Account = Reynolds_Bank.add_Account(new_account_number, new_account_balance);
			
			System.out.print("Please enter an amount to withdraw: ");
			double withdraw_amount = scan.nextDouble();
			System.out.print("Please enter an amount to deposit: ");
			double deposit_amount = scan.nextDouble();
			
			New_Account.withdraw(withdraw_amount);
			New_Account.deposit(deposit_amount);
			
			System.out.print("Please enter a new account number or -1 to quit: ");
			new_account_number = scan.nextInt();
			
			//Leaves loop at this point if the new account number input is -1
			//Will not ask for a balance
			if (new_account_number == -1)
			{
				break;
			}
			
			System.out.println("Please enter a balance for the new account: ");
			new_account_balance = scan.nextDouble();
		}
		
		int Highest_Account_Number = Reynolds_Bank.get_HighBankAccount().getAccountNumber();
		double Highest_Account_Balance = Reynolds_Bank.get_HighBankAccount().getBalance();
		
		int Lowest_Account_Number = Reynolds_Bank.get_LowBankAccount().getAccountNumber();
		double Lowest_Account_Balance = Reynolds_Bank.get_LowBankAccount().getBalance();
		
		double High_Average = Reynolds_Bank.get_HighBankAccount().getAverage();
		double Low_Average = Reynolds_Bank.get_LowBankAccount().getAverage();
		
		System.out.println("Account with the Highest Balance: ");
		System.out.println("#" + Highest_Account_Number + ", resulting balance =  " + Highest_Account_Balance + ", average transaction amount = " + High_Average );
		
		System.out.println("Account with the Lowest Balance: ");
		System.out.println("#" + Lowest_Account_Number + ", resulting balance =  " + Lowest_Account_Balance + ", average transaction amount = " + Low_Average );
		
		scan.close();
	}

}
