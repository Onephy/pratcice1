package mirea.gibo04.pr8;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, boolean fill, double radius) {
        super(color, fill);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", fill=" + fill +
                '}';
    }

    @Override
    public double getArea() {
        return (this.radius * this.radius * 3.14);
    }

    @Override
    public double getPerimetr() {
        return (2*3.14*this.radius);
    }
}
