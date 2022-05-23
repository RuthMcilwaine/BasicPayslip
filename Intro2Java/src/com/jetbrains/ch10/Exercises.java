package com.jetbrains.ch10;

public class Exercises {
    public static void main(String[] args) {
//        MyInteger myInteger = new MyInteger(5);
//        Integer integer = new Integer(5);
//
//        System.out.println(myInteger.isOdd()); //calling from an instance
//        System.out.println(MyInteger.isOdd(6)); // calling an int from a static method
//        System.out.println(MyInteger.isOdd(myInteger)); // calling myInteger from the
//        System.out.println(integer.intValue());

        MyPoint myPoint = new MyPoint();
        MyPoint myPoint1 = new MyPoint(10, 30.5);
//        System.out.println(myPoint.distance(myPoint1));
        System.out.println(myPoint1.distance(myPoint));
    }
}
