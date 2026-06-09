package jdbcdemo;

import java.sql.*;
import java.util.Scanner;

public class DemoDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			// Database Connection Details
            String url = "jdbc:mysql://localhost:3306/sitj2";
            String username = "root";
            String password = "root";
            
            Connection con = DriverManager.getConnection(url, username, password);
            
            System.out.println("Enter Employee ID : ");
            int id = sc.nextInt();
            
            String query = "DELETE FROM emp WHERE id =?";
            
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setInt(1, id);
            
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Deleted Successfully.");
            } else {
                System.out.println("Employee ID Not Found.");
            }

            // Close Resources
            ps.close();
            con.close();
            sc.close();
		}catch(Exception e) {
			System.out.println("Error : "+e.getMessage());
		}
	}

}
