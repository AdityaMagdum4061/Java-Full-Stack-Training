package day2;

public class TestSync {

	public static void main(String[] args) {
		Table tb = new Table();
		MyTable mt1 = new MyTable(tb);
		MyTable2 mt2 = new MyTable2(tb);
		MyTable3 mt3 = new MyTable3(tb);
		MyTable4 mt4 = new MyTable4(tb);
		
		
		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();

	}

}
