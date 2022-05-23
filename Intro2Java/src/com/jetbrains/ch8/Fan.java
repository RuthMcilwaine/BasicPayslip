package com.jetbrains.ch8;


public class Fan {

    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private boolean on = false;
    private double radius = 5;
    String color = "blue";
    private int speed = SLOW;

    public Fan() {
    }

    public boolean isOn() {

        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    @Override
    public String toString() {
        if (isOn()) {
            return "Fan{" +
                    " radius=" + radius +
                    ", color='" + color + '\'' +
                    ", speed=" + speed +
                    '}';
        } else {
            return "Fan{" +
                    " radius=" + radius +
                    ", color='" + color + '\'' +
                    ", fan is off " +
                    '}';
        }

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
