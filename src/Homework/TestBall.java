package Homework;

public class TestBall {
    public static void main(String []args){

        Ball ball1 = new Ball(12.5, "White");
        Ball ball2 = new Ball(13.6, "Orange");
        Ball ball3 = new Ball(10.5,"Blue");
        ball3.setRadius(28.0);
        System.out.println(ball2);
        System.out.println(ball1);
        System.out.println(ball3);
    }
}
