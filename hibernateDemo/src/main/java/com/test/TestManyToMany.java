package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestManyToMany {

    public static void main(String[] args) {
        // Create session factory and session
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Project.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            // Create new employee and project objects
            Employee employee1 = new Employee("John Doe");
            Employee employee2 = new Employee("Jane Smith");

            Project project1 = new Project("Project A");
            Project project2 = new Project("Project B");

            // Establish relationships
            employee1.addProject(project1);
            employee1.addProject(project2);
            employee2.addProject(project1);

            // Start a transaction
            session.beginTransaction();

            // Save the employee (and projects will be saved automatically because of CascadeType)
            session.save(employee1);
            session.save(employee2);

            // Commit the transaction
            session.getTransaction().commit();

            System.out.println("Employees and Projects saved successfully!");
        } finally {
            factory.close();
        }
    }
}
