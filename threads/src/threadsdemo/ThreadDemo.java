//package threadsdemo;   
//
//class Table {
//
//     void printTable() {
//
//    	Table(5);
//    }
//    synchronized void Table(int n) {
//    	for(int i=1;i<=5;i++) {
//    		System.out.println(i);
//    		
//    	}
//    }
//}
//
//public class ThreadDemo {
//    public static void main(String[] args) {
//    	Table t1 = new Table();
//    	Table t2 = new Table();
//    	Table t3 = new Table();
//    	Table t4 = new Table();
// 
//        t1.start();
//        System.out.println("---------------------------");
//        t2.start();
//        System.out.println("---------------------------");
//        t3.start();
//        System.out.println("---------------------------");
//        t4.start();
//    
//    }
//}