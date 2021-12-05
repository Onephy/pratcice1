package mirea.gibo04.pr10;

public class Rectangle extends Shape {
    protected int width;
    protected int length;

    @Override
    public double getArea() {
        return(this.length * this.width);
    }

    public double getPerimeter() {
        return((this.length + this.width) * 2);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public Rectangle(String color, boolean filled, int width, int length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
}
