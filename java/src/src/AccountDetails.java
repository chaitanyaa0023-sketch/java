package src;

public class AccountDetails {


	private long accNum;
	private double balance;
	private PersonDetails accHolder;
	private static long counter=100001;
	
	public AccountDetails( PersonDetails accHolder, double balance) {
		this.accNum = counter++;
		this.accHolder = accHolder;
		this.balance = balance;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public PersonDetails getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(PersonDetails accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposit(double amount)
	{
		balance+=amount;
	}
	public void withdraw(double amount)
	{
		if(balance-amount >=500)
		{
			balance-=amount;
		}
		else
		{
			System.out.println("Minimum balance 500 is required");
		}
	}
	@Override
	public String toString() {
		return "AccountNo : " + accNum + ", balance=" + balance ;
	}
	

}