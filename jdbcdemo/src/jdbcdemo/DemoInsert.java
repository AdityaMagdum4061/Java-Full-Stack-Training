package jdbcdemo;

import java.sql.*;
import java.sql.DriverManager;
import java.util.Scanner;

public class DemoInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			// Database Connection Details
			String url = "jdbc:mysql://localhost:3306/sitj2";
			String username = "root";
			String password = "root";
			
			//Establish Connection
			Connection con = DriverManager.getConnection(url, username, password);
			
			//Take Input from user
			System.out.println("Enter Employee ID : ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Employee name : ");
			String name = sc.nextLine();
			
			System.out.println("Enter Salary : ");
			Double salary = sc.nextDouble();
			
			//SQL Query
			String query = "INSERT INTO emp(id,name,salary) VALUES(?,?,?)";
			
			
			PreparedStatement ps = con.prepareStatement(query);
			
			//Set VAlues
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setDouble(3, salary);
			
			int rows = ps.executeUpdate();
			
			if(rows > 0) {
				System.out.println("Employee Inserted Successfully.");
			}
			else{
				System.out.println("Insertion Failed.");
			}
			
			ps.close();
			con.close();
			sc.close();
		}
		catch(Exception e) {
			System.out.println("Error : "+e.getMessage());
		}
	}

}
