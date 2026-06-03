package oops_concept;

class Bank {
	Bank(){}
	private int accNo;
	private int accBal;
	
	public void setAccNo(int accNo) {
		this.accNo=accNo;
	}
	public void setBalance(int accBal) {
		this.accBal=accBal;
	}
	public int getAccNo() {
		return this.accNo;
	}
	public int getBalance() {
		return this.accBal;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b = new Bank();
		b.setAccNo(798654654);
		b.setBalance(65545);
		
		System.out.println("Account No : "+b.getAccNo());
		System.out.println("Total Balance : "+b.getBalance());

	}

}


