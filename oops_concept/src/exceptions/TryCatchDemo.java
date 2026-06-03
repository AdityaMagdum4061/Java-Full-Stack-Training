package exceptions;
// demo of one try with multiple catch block
public class TryCatchDemo {

	public static void main(String[] args) {
   try {
		int a = 1;
		int b = 0;
		int c = a / b;
		System.out.println(c);

	}catch(ArithmeticException e) {
		System.out.println("ArithmeticException");
		
	}
   catch(ClassCastException e) {
		System.out.println("ClassCastException");
		
	}
   
   finally {
	   
	   System.out.println(" from finally");
   }
	}

}
