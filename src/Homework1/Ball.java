package Homework1;

public class Ball {
    private double radius;
    private String color;

    public Ball(double radius, String color) {
        this.radius = radius;
        this.color = color;
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
        return "Ball{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public void Limination() {
        if (radius * 2 * 3.14 <= 70 && radius * 2 * 3.14 >= 68) {
            System.out.println("Т.к. длина окружности равна: " + (radius * 2 * 3.14) + " мяч является футбольным!");
        } else if (radius * 2 * 3.14 <= 78.0 && radius * 2 * 3.14 >= 74.9) {
            System.out.println("Т.к. длина окружности равна: " + (radius * 2 * 3.14) + " мяч является баскетбольным!");
        } else {
            System.out.println("Т.к. длина окружности равна: " + (radius * 2 * 3.14) + " мяч ни футбольный ни баскетбольный!");
        }
    }

}
