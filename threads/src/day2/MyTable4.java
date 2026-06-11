package day2;

public class MyTable4 extends Thread{
	Table t4;
	MyTable4(Table t4){
		this.t4=t4;
	}
	public void run() {
		t4.printTable(20);
	}
}
