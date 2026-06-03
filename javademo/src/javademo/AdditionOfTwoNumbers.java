package javademo;
import java.util.Scanner;

public class AdditionOfTwoNumbers {
	public static void main(String[] args) {
		//	String 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int n1 = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int n2 = sc.nextInt();
		
		int sum = n1 + n2;
		System.out.println("Addition of "+n1+" and "+n2+" is : "+sum);
		sc.close();
	}

}


//		In System.out.println();
//		System is a class
