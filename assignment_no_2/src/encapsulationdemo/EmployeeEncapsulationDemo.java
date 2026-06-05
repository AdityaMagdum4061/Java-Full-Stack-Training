package encapsulationdemo;

// Q2. Write a Java program to create an Employee class with private fields such as employee ID, name, and salary, and access them using getter and setter methods.

class Employee {
    private int employeeId;
    private String name;
    private double salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class EmployeeEncapsulationDemo {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setEmployeeId(1001);
        e.setName("Rahul");
        e.setSalary(45000);

        System.out.println("ID: " + e.getEmployeeId());
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
    }
}