package Project_1;

public class Deposite extends Thread{
	private double amount;
	//@SuppressWarnings("unused")
	private BankAccount account;
	
	public Deposite(String name, double amount, BankAccount account) {
		super(name);
		this.amount = amount;
		this.account = account;
	}
	public void run() {
		account.deposite(amount);
	}
}