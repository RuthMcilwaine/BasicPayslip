package com.jetbrains.ch8;

public class Rectangle {
    double width = 1;
    double height = 1;

    public Rectangle() {

    }

    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * ( width + height );

    }
}
