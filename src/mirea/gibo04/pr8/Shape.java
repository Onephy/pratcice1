package mirea.gibo04.pr8;

public abstract class Shape {
    protected String color;
    protected boolean fill;

    public Shape(String color, boolean fill) {
        this.color = color;
        this.fill = fill;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", fill=" + fill +
                '}';
    }

    public abstract double getArea();
    public abstract double getPerimetr();
}
