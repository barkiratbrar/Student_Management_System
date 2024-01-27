package com.example.student_management_system;

public class Student {
    // Fields for student's id, name, and major
    private String id;
    private String name;
    private String major;

    // Constructor to create a new student with id, name, and major
    public Student(String id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }
}
