package mirea.gibo04.pr3_Human;

public class Hand {

    private int lengthHand;

    public Hand(int lengthHand) {
        this.lengthHand = lengthHand;
    }

    public int getLengthHand() {
        return lengthHand;
    }

    public void setLengthHand(int lengthHand) {
        this.lengthHand = lengthHand;
    }

    @Override
    public String toString() {
        return ""+lengthHand;
    }


}
