package ss4_ClassAndObject.bai_tap.Fan;

import java.util.PrimitiveIterator;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.on = false;
        this.radius = 5.0;
        this.color = "blue";
        this.speed = SLOW;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    @Override
    public String toString() {
        if (on) {
            return "fan is on\nSpeed: " + speed + "\nColor: " + color + "\nRadius: " + radius;
        } else {
            return "fan is off\nColor: " + color + "\nRadius: " + radius;
        }
    }
}
