package mirea.gibo04.pr3_Human;

public class Leg {

    private int legSize;

    public Leg(int legSize) {
        this.legSize = legSize;
    }

    public int getLegSize() {
        return legSize;
    }

    public void setLegSize(int legSize) {
        this.legSize = legSize;
    }

    @Override
    public String toString() {
        return "" + legSize;
    }

    public void sizeLeg() {
        System.out.println("Размер ноги - " + legSize);
    }
}
