package mirea.gibo04.pr3_Human;

public class HumanTest {

    public static void main(String[] args) {
        Human[] humans = new Human[3];
        Hand hand1 = new Hand(50);
        Hand hand2 = new Hand(51);
        Hand hand3 = new Hand(45);

        Head head1 = new Head(60);
        Head head2 = new Head(52);
        Head head3 = new Head(58);

        Leg leg1 = new Leg(42);
        Leg leg2 = new Leg(45);
        Leg leg3 = new Leg(39);

        Human human1 = new Human("Борис", hand1, head1, leg1);
        Human human2 = new Human("Денис", hand2, head2, leg2);
        Human human3 = new Human("Ирина", hand3, head3, leg3);


        human1.printState();

        System.out.println();

        human2.printState();

        System.out.println();

        human3.printState();

        // Нахождение максимального размера ноги:
    }

}
