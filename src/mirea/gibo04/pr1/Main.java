package mirea.gibo04.pr1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Car auto1 = new Car(2001, "BMW", "Black", 260);
        System.out.println(auto1);
        auto1.setColor("Blue");
        auto1.setName("Audi");
        auto1.setSpeed(250);
        auto1.setYear(2019);
        System.out.println(auto1);

        Laptop model1 = new Laptop(8, "Dell", "Intel", 6);
        System.out.println(model1);
    }
}






