package mirea.gibo04.pr8;

public class Main {
    public static void main(String[] args) {
        Circle abc = new Circle("Blue", true, 15.2);
        Rectangle rec = new Rectangle("Blac", false, 5,8);
        System.out.println(abc);
        System.out.println("Периметр равен: " + abc.getPerimetr());
        System.out.println("Площадь равна: " + abc.getArea());

        System.out.println("Периметр равен: " + rec.getPerimetr());
        System.out.println("Площадь равна: " + rec.getArea());


    }
}
