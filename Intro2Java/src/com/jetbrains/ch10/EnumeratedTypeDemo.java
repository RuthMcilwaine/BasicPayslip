package com.jetbrains.ch10;

public class EnumeratedTypeDemo {
    static enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

    ;

    public static void main(String[] args) {
        Day day1 = Day.FRIDAY;
        Day day2 = Day.THURSDAY;

        System.out.println("day1's name is " + day1.name());
        System.out.println("day2's name is " + day2.name());
        System.out.println("day1's ordinal is " + day1.ordinal());
        System.out.println("day2's ordinal is " + day2.ordinal());

        System.out.println("day1.equals(day2) returns " +
                day1.equals(day2));                                 //returns true if day1 and day2 have the same ordinal value
        System.out.println("day1.toString() returns " +
                day1.toString());
        System.out.println("day1.compareTo(day2) returns " +
                day1.compareTo(day2));                            //returns the difference between day1's ordinal value to day2's.

    }
}
