package com.objectmodelling.selfproblem.universitymanagment;
import java.util.*;
public class University {
	private String name;

    // Composition : Departments belong ONLY to this University
    private List<Department> departments;

    // Aggregation : Faculty exists independently
    private List<Faculty> facultyMembers;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void showUniversityDetails() {
        System.out.println("\nUniversity: " + name);

        System.out.println("Departments:");
        for (Department d : departments) {
            System.out.println("- " + d.getDeptName());
        }

        System.out.println("Faculty Members:");
        for (Faculty f : facultyMembers) {
            System.out.println("- " + f.getName());
        }
    }

    // Simulate deleting the university
    public void closeUniversity() {
        System.out.println("\nClosing University: " + name);
        System.out.println("All Departments will be destroyed!");

        departments.clear();   // Composition effect
        // Faculty list not cleared — they still exist
    }
}
