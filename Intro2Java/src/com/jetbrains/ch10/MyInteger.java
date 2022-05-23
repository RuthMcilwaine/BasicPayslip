package com.jetbrains.ch10;

public class MyInteger {
    int value;

    public MyInteger(int value) {
        this.value = value;
    }

    //getters
    public int getValue() {
        return value;
    }

    //instance methods
    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return !isEven();
    }


    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    //
//    //static methods
//    public static boolean isEven(MyInteger num) {
//        return num.isEven();
//    }
//
    public static boolean isOdd(MyInteger num) {
        return num.isOdd();
    }

    public boolean equals(int num) {
        return this.value == num;
    }

    public boolean equals(MyInteger num) {
        return this.value == num.getValue();
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
