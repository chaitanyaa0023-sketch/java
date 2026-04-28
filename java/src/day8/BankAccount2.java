package day8;
import src.Person;
public abstract class BankAccount2 {
	private static long accCounter = 1000;
    private long accNum;
    protected double balance;
    private Person accHolder;

    public BankAccount2(double balance, Person accHolder) {
        this.accNum = ++accCounter;
        this.balance = balance;
        this.accHolder = accHolder;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        }
    }

    public abstract boolean withdraw(double amount);

    public double getBalance() { return balance; }
    public long getAccNum() { return accNum; }
    public Person getAccHolder() { return accHolder; }

    @Override
    public String toString() {
        return "BankAccount2 [AccNum=" + accNum + ", Balance=" + balance + ", Holder=" + accHolder + "]";
    }
}
