package mirea.gibo04.pr8;

public class Rectangle extends Shape {
    protected int a;
    protected int b;

    public Rectangle(String color, boolean fill, int a, int b) {
        super(color, fill);
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", color='" + color + '\'' +
                ", fill=" + fill +
                '}';
    }

    @Override
    public double getArea() {
        return (this.a * this.b);
    }

    @Override
    public double getPerimetr() {
        return(2 * (this.a + this.b));
    }
}
