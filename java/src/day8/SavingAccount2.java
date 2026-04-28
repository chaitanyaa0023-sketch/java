package day8;
import src.Person;

	public class SavingAccount2 extends BankAccount2 {
	    private static final double MINIMUM_BALANCE = 500;

	    public SavingAccount2(double balance, Person accHolder) {
	        super(balance, accHolder);
	    }

	    @Override
	    public boolean withdraw(double amount) {
	        if (balance - amount >= MINIMUM_BALANCE) {
	            balance -= amount;
	            return true;
	        } else {
	            System.out.println("Withdrawal denied! Minimum balance of INR " + MINIMUM_BALANCE + " must be maintained.");
	            return false;
	        }
	    }
	}


