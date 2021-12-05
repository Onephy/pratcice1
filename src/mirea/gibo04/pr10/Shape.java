package mirea.gibo04.pr10;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public abstract double getPerimeter();
    public abstract double getArea();
}

