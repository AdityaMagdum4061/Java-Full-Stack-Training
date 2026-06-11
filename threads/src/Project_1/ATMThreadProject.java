package Project_1;

public class ATMThreadProject {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(10000);
		
		Withdraw customer1 = new Withdraw("Aditya",15000,account);
		Deposite customer2 = new Deposite("Pratik",150000,account);
		
		customer1.start();
		
		try {
			Thread.sleep(300);
		}catch(Exception e) {}
		
		customer2.start();
	}

}
