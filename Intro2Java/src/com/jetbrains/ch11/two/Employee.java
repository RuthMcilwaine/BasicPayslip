package com.jetbrains.ch11.two;

public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee(String name) {
        super(name);
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee "
                + this.getName();
    }
}
