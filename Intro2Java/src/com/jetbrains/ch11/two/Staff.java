package com.jetbrains.ch11.two;

public class Staff extends Employee {
    private final String title;


    public Staff(String name, String title) {
        super(name);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff " + this.getName();
    }
}
