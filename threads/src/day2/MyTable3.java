package day2;

public class MyTable3 extends Thread{

	Table t3;
	MyTable3(Table t3){
		this.t3=t3;
	}
	public void run() {
		t3.printTable(15);
	}
}
