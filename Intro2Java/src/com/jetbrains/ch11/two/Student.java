package com.jetbrains.ch11.two;

public class Student extends Person {
    private final String classStatus;


    public Student(String name, String classStatus) {
        super(name);
        this.classStatus = classStatus;
    }

    @Override
    public String toString() {
        return "Student " + this.getName();
    }
}
