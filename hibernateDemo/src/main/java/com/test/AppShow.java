package com.test;

import org.hibernate.Session;

public class AppShow {

    public static void main(String[] args, Session HibernateUtil) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        // Fetch a department and its employees
        Department department = session.get(Department.class, 1L);  // Assuming department ID is 1

        System.out.println("Department: " + department.getName());
        System.out.println("Employees:");
        for (Employee emp : department.getEmployees()) {
            System.out.println(emp.getName());
        }

        session.close();
    }
}

