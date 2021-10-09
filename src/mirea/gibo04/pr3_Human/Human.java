package mirea.gibo04.pr3_Human;

public class Human {

    private Hand hand;
    private Head head;
    private Leg leg;
    private String name;


    public Human(String name, Hand hand, Head head, Leg leg) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Характеристика человека по имени: " + name +
                "\nРазмер руки = " + hand +
                "\nРазмер головы = " + head +
                "\nРазмер ноги: " + leg + "\n";
    }

    public void printState() {
        System.out.println("Размер ноги пользователя \"" + name + "\"" + ": " + leg.getLegSize());
        System.out.println("Размер головы пользователя \"" + name + "\"" + ": " + head.getHeadSize());
        System.out.println("Длина руки пользователя \"" + name + "n\"" + ": " + hand.getLengthHand());
    }


    public int maxLeg(){
        int maxLeg = 0;
        int minLeg = 0;

        if (leg.getLegSize() < maxLeg) {
            maxLeg = leg.getLegSize();
            System.out.println(maxLeg);
        }
        return maxLeg;
    }

    public int getLL() {
        return leg.getLegSize();
    }

    public int getLH() {
        return hand.getLengthHand();
    }

}
