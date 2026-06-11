package collectionframework;

import java.util.ArrayList;
import java.util.Scanner;

class emp {
    int id;
    String name;
    double salary;
    String designation;

    emp(int id, String name, double salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }
}
public class EmployeeManagement {
    static int ind = 1;
    static public void addEmp(ArrayList<emp> list, Scanner sc) {
        sc.nextLine();
        System.out.println("Enter the name of Emp:");
        String name = sc.nextLine();
        System.out.println("Enter the salary:");
        double salary = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the designation:");
        String designation = sc.nextLine();
        list.add(new emp(ind++, name, salary, designation));
        System.out.println("Employee Added Successfully!");
    }
    static public void getEmp(ArrayList<emp> list, Scanner sc) {
        System.out.println("Enter the id of Emp:");
        int id = sc.nextInt();
        if (id > list.size() || id <= 0) {
            System.out.println("Invalid id");
        } else {
            emp e = list.get(id - 1);
            System.out.println("Employee ID : " + e.id);
            System.out.println("Name : " + e.name);
            System.out.println("Salary : " + e.salary);
            System.out.println("Designation : " + e.designation);
        }
    }
    static public void deleteEmp(ArrayList<emp> list, Scanner sc) {
        System.out.println("Enter the id of Emp to delete:");
        int id = sc.nextInt();
        if (id > list.size() || id <= 0) {
            System.out.println("Invalid id");
        } else {
            list.remove(id - 1);
            System.out.println("Delete Successful!!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<emp> list = new ArrayList<>();
        System.out.println("Welcome to Emp System");
        for (;;) {
            System.out.println("\n1.Add New Employee\n2.View Employee\n3.Delete Employee\n4.Exit\n");
            System.out.println("Choose An Option:");
            char choice = sc.next().charAt(0);
            switch (choice) {
            case '1':
                EmployeeManagement.addEmp(list, sc);
                break;
            case '2':
                EmployeeManagement.getEmp(list, sc);
                break;
            case '3':
                EmployeeManagement.deleteEmp(list, sc);
                break;
            case '4':
                System.exit(0);
                break;
            default:
                System.out.println("Please Insert Correct Data!");
            }
        }
    }
}