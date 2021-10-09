package mirea.gibo04.pr3_Human;

public class Head {
    private int headSize;

    public Head(int headSize) {
        this.headSize = headSize;
    }

    public int getHeadSize() {
        return headSize;
    }

    public void setHeadSize(int headSize) {
        this.headSize = headSize;
    }

    @Override
    public String toString() {
        return "" + headSize;
    }

    public void headSize() {
        System.out.println("Размер головы = " + headSize);
    }

}
