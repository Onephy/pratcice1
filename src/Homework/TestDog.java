package Homework;

public class TestDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bobby", 1);
        Dog dog2 = new Dog("Jimmy", 2);
        Dog dog3 = new Dog("Andy", 7);
        dog3.setAge(3);
        System.out.println(dog1);
        dog1.intoHumanAge();
        dog2.intoHumanAge();
        dog3.intoHumanAge();
        }

}


