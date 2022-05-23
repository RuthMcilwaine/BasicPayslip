package com.jetbrains.ch10;

public class MyPoint {
    double x;
    double y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint point) {
        double xDistance = this.getX() - getX();
        double yDistance = this.getY() - getY();
        double arg1 = Math.pow(xDistance, 2);
        double arg2 = Math.pow(yDistance, 2);

        return 1;
    }


}
