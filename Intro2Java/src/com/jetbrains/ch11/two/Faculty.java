package com.jetbrains.ch11.two;

import com.jetbrains.ch8.Fan;

public class Faculty extends Employee {
    private String officeHours;
    private final String rank;

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public Faculty(String name, String rank) {
        super(name);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Faculty " + this.getName();

    }
}
