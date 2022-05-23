package com.jetbrains.ch10;

public class Course {
    private String courseName;
    private String[] students = new String[100]; //create students
    private int numberOfStudents;

    public Course(String courseName) {        //add a course
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        //exercise 10.9
    }

}
