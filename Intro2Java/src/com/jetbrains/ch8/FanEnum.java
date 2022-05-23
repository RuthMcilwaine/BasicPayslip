package com.jetbrains.ch8;


public class FanEnum {

    //    final static int SLOW = 1;
//    final static int MEDIUM = 2;
//    final static int FAST = 3;
//    private boolean on = false;
    private double radius = 5;
    String color = "blue";
    private FanSpeed speed = FanSpeed.OFF;

    public FanEnum() {
    }

    public boolean isOn() {
        return speed != FanSpeed.OFF;
    }

    public void setOn() {
        speed = FanSpeed.SLOW;
    }

    public void setOff() {
        speed = FanSpeed.OFF;
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

    public FanSpeed getSpeed() {
        return speed;
    }

    public void setSpeed(FanSpeed speed) {
        this.speed = speed;
    }
}

enum FanSpeed {
    OFF, SLOW, MEDIUM, FAST

}
