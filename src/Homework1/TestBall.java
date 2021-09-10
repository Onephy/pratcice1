package Homework1;

public class TestBall {
    public static void main(String []args){

        Ball ball1 = new Ball(10.9, "White");
        Ball ball2 = new Ball(12.25, "Orange");
        Ball ball3 = new Ball(33.2,"Blue");
        ball3.setRadius(28.0);
        ball1.Limination();
        ball2.Limination();
        ball3.Limination();
    }
}
