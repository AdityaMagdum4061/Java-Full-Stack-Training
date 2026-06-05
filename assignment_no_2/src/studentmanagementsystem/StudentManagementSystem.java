package studentmanagementsystem;

// Design a Student Management System using encapsulation principles.

class StudentManagement {
    private int rollNo;
    private String name;
    private double marks;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        StudentManagement s = new StudentManagement();

        s.setRollNo(1);
        s.setName("Aditya");
        s.setMarks(89.5);

        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
    }
}