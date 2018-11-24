package bank_Account_with_Arrays;
import java.util.ArrayList;

/**
 * This class defines a Bank Account as an object with an account number as its "name" and the balance of the account
 * The class also includes methods depositing and withdrawing from the account
 */
public class BankAccount {
	
	//Private instance variables
	private int accountNumber;
	private double balance;
	private ArrayList<Double> transactions;
	private int total_transactions;
	private double average;
	

	//One Constructor for initialization
	/** This constructor initializes the creation of a Bank Account
	 * @param initAccountNumber
	 * Input the account number to name this Bank Account
	 * @param initBalance
	 * Input the intial balance of this Bank Account
	 */
	public BankAccount(int initAccountNumber, double initBalance)
	{
		accountNumber = initAccountNumber;
		balance = initBalance;
		transactions = new ArrayList<Double>();
	}
	
	//Five methods to follow this comment
	/** This method retrieves the account number of the Bank Account
	 * @return
	 * returns account number
	 */
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	/**This method retrieves the balance of the Bank Account
	 * @return
	 * returns the balance of the account
	 */
	public double getBalance()
	{
		return balance;
	}
	
	/**This method deposits the user-specified value into the account(the balance)
	 * @param dep_amount
	 * This parameter is the amount you would like to deposit
	 */
	public void deposit(double dep_amount)
	{
		transactions.add(dep_amount);
		balance = balance + dep_amount;
		total_transactions = total_transactions + 1;
	}
	
	/**This method withdraws the user-specified value from the balance of the chosen account
	 * @param with_amount
	 * Input the amount desired to be withdrawn
	 */
	public void withdraw(double with_amount)
	{
		transactions.add(with_amount);
		balance = balance - with_amount;
		total_transactions = total_transactions + 1;
	}
	
	/**This method computes the average transaction amount after all transactions on the specific account are complete
	 * @return
	 * The method will return the transaction average
	 */
	public double getAverage()
	{
		double total = 0;
		for (int i = 0; i < transactions.size(); i++)
		{
			total = total + Math.abs(transactions.get(i));		
		}
		average = total/total_transactions;
		return average;
	}
	
}
