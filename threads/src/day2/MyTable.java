package day2;

public class MyTable extends Thread {
	Table t1;
	MyTable(Table t1){
		this.t1=t1;
	}
	public void run() {
		t1.printTable(5);
	}
}
