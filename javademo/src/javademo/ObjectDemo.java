package javademo;

class TataCar{
	// behavior of Functionality
	
	void ApplyBreaks() {
		System.out.println("Applied Breaks.");
	}
}

//In a class only one public class is there
public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TataCar tc = new TataCar();
		tc.ApplyBreaks();

		//TataCar tc = new TataCar();

		//TataCar is class name
		//tc is object or variable
		//new is a operator
		//TataCar() is a constructor		
		
	}

}



 