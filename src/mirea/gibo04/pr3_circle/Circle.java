package mirea.gibo04.pr3_circle;

import java.util.Scanner;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public void dCircle() {
        System.out.println("Диаметр круга равен: " + radius*2);
        System.out.println("Площадь круга равна: " + 3.14*radius*radius);
    }
    public void diamCircle(){
        radius = radius*2;
    }
    public void radCircle(){
        radius = 3.14*radius*radius;
    }

    @Override
    public String toString() {
        return "" + radius;

    }
}
