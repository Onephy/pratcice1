package Homework1;

public class TestDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Sully", 2);
        Dog dog2 = new Dog("Boyle", 7);
        Dog dog3 = new Dog("Charles", 4);
        dog3.setAge(1);
        System.out.println(dog1);
        dog1.intoHumanAge();
        dog2.intoHumanAge();
        dog3.intoHumanAge();
        }
}


