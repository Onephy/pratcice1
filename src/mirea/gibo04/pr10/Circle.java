package mirea.gibo04.pr10;

public class Circle extends Shape {
    private int radius;

    @Override
    public double getArea() {
        double s;
        s = this.getRadius() * this.getRadius() * Math.PI;
        s = Math.pow(this.getRadius(),2) * Math.PI;
        return s;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public  double getPerimeter() {
        return (2 * 3.14 * this.getRadius());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public Circle(String color, boolean filled, int radius) {
        super(color, filled);
        this.radius = radius;
    }
}
