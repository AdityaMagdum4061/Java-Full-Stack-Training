package jdbcdemo;

import java.sql.*;

public class DemoRetrieve {

    public static void main(String[] args) {

        try {
            // Database Connection Details
            String url = "jdbc:mysql://localhost:3306/sitj2";
            String username = "root";
            String password = "root";

            // Establish Connection
            Connection con = DriverManager.getConnection(url, username, password);

            // SQL Query
            String query = "SELECT * FROM emp";

            // Create Statement
            PreparedStatement ps = con.prepareStatement(query);

            // Execute Query
            ResultSet rs = ps.executeQuery(query);

            // Display Data
            System.out.println("-------------------------");
            System.out.println("ID\tNAME\tSALARY");
            System.out.println("-------------------------");

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");

                System.out.println(id + "\t" + name + "\t" + salary);
            }

            // Close Resources
            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}