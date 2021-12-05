package mirea.gibo04.pr10;

public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle("Blue", true, 4);
        System.out.println(circle1);
        System.out.println("Perimeter of circle: " + circle1.getPerimeter());
        System.out.println("Area of circle: " + circle1.getArea());
        Rectangle rectangle1 = new Rectangle("Green",true,4,9);
        System.out.println("Perimeter of a rectangle: " + rectangle1.getPerimeter());
        System.out.println("Area of a rectangle: " + rectangle1.getArea());
        Shape shape1 = new Rectangle("Black",false,2,10);
        System.out.println("Perimeter of shape: " + shape1.getPerimeter());
        System.out.println("Area of shape: " + shape1.getArea());

    }
}
