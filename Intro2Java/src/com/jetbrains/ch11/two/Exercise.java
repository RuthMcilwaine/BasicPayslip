package com.jetbrains.ch11.two;

public class Exercise {
    public static void main(String[] args) {
        Person person = new Person("Ann");
//        person.setName("Ann");
        System.out.println(person);

        Student student = new Student("Ben", "freshman");
//        student.setName("Ben");
        System.out.println(student);

        Staff staff = new Staff("Sara", "Manager");
//        staff.setName("Sara");
        System.out.println(staff);

        Employee employee = new Employee("Tom");
//        employee.setName("Tom");
        System.out.println(employee);

        Faculty faculty = new Faculty("Bob", "committee");
//        faculty.setName("Bob");
        System.out.println(faculty);

        MyDate date = new MyDate("2019", "Feb", "31");
        employee.setDateHired(date);
        System.out.println(date);

    }
}
//TODO: remove all setters