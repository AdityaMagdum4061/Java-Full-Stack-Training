package day2;

public class MyTable2 extends Thread{

	Table t2;
	MyTable2(Table t2){
		this.t2=t2;
	}
	public void run() {
		t2.printTable(10);
	}
}
