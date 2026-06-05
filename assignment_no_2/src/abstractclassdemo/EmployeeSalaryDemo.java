package abstractclassdemo;

// Q3. Write a Java program to create an abstract class Employee with an abstract method calculateSalary(). Implement the method in FullTimeEmployee and PartTimeEmployee classes.

abstract class EmployeeSalary {
    abstract void calculateSalary();
}

class FullTimeEmployee extends EmployeeSalary {
    void calculateSalary() {
        System.out.println("Full Time Salary: 50000");
    }
}

class PartTimeEmployee extends EmployeeSalary {
    void calculateSalary() {
        System.out.println("Part Time Salary: 15000");
    }
}

public class EmployeeSalaryDemo {
    public static void main(String[] args) {
        EmployeeSalary e1 = new FullTimeEmployee();
        EmployeeSalary e2 = new PartTimeEmployee();

        e1.calculateSalary();
        e2.calculateSalary();
    }
}