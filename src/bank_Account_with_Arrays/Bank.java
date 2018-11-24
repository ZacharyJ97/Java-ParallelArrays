package bank_Account_with_Arrays;
import java.util.ArrayList;

/**
 * This class sets up a Bank to store the BankAccunt objects in the form of an arraylist
 *
 */
public class Bank {
	
	private ArrayList<BankAccount> accounts;
	
	//Constructor Bank to hold BankAccounts
	/**
	 * Initialize a new bank with an arraylist for the BankAccounts
	 */
	public Bank()
	{
		//Initializes a listarray set to store the objects of the class BankAccount
		accounts = new ArrayList<BankAccount>();
	}

	/**This method sets up a new account to add to the bank
	 * @param acct_number
	 * This is where to input the account number for the new Bank Account
	 * @param acct_balance
	 * This is where to input the starting balance for the new Bank Account
	 * @return
	 * This method will return the newly made account
	 */
	public BankAccount add_Account(int acct_number, double acct_balance)
	{
		BankAccount new_account = new BankAccount(acct_number, acct_balance);
		accounts.add(new_account);
		return new_account;
	}
	
	/** This method allows the user to look for a bankAccount within the bank
	 * @param acct_number 
	 * This parameter is where the user should type in the account number of the desired
	 * account to be found
	 * @return
	 * This method will return the bank account to the user if it is found;
	 * if not found, then this method will return null
	 */
	public BankAccount get_BankAccount(int acct_number)
	{
		//This for loop is looking through the accounts arraylist with BankAccounts in it
		for (int i = 0; i < accounts.size(); i++)
		{
			//found_number is temporarily storing the account number found within each subscript 
			//of the ArrayList for imminent comparison using a double method that pulls the object
			//from the ArrayList accounts and then pulls the account number from that object
			int found_number = accounts.get(i).getAccountNumber();
			if (acct_number == found_number)
			{
				//Accounts.get(i) is the current bank account being looked at in the accounts arraylist
				return accounts.get(i);
			}
		}
		// returns nothing if bank account is not found
		return null;
	}
	
	/**This method checks for the bank account with the lowest balance
	 * @return
	 * returns the bank account with the lowest balance
	 */
	public BankAccount get_LowBankAccount()
	{
		BankAccount lowest_balance = accounts.get(0);
		//This for loop is looking through the accounts arraylist with BankAccounts in it
		for (int i = 0; i < accounts.size(); i++)
		{
			double found_balance = accounts.get(i).getBalance();
			
			if (found_balance < lowest_balance.getBalance())
			{
				lowest_balance = accounts.get(i);
			}
		}
		return lowest_balance;
	}
	
	/**This method checks for the bank account with the highest balance
	 * @return
	 * returns the bank account with the highest balance
	 */
	public BankAccount get_HighBankAccount()
	{
		BankAccount highest_balance = accounts.get(0);
		//This for loop is looking through the accounts arraylist with BankAccounts in it
		for (int i = 0; i < accounts.size(); i++)
		{
			double found_balance = accounts.get(i).getBalance();
			
			if (found_balance > highest_balance.getBalance())
			{
				highest_balance = accounts.get(i);
			}
		}
		return highest_balance;
	}
}
