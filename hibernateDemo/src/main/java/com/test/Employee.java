package com.test;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "employee_project",  // The junction table
        joinColumns = @JoinColumn(name = "employee_id"), // The foreign key in the junction table
        inverseJoinColumns = @JoinColumn(name = "project_id") // The foreign key to the other table
    )
    private Set<Project> projects = new HashSet<>();

    // Constructors, Getters, and Setters
    public Employee() {}
    
    public Employee(String name) {
        this.name = name;
    }

    public void addProject(Project project) {
        this.projects.add(project);
        project.getEmployees().add(this);  // Ensure both sides of the relationship are updated
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
