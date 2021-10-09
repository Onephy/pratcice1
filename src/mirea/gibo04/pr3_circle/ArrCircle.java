package mirea.gibo04.pr3_circle;

import java.util.*;
public class ArrCircle {

    public static void main(String[] args) {
        Circle[] circleArr = new Circle[3];
        /*
        circleArr[0] = new Circle(34);
        circleArr[1] = new Circle(20);
        circleArr[3] = new Circle(11);
        */
        int count = circleArr.length;
        Scanner sc = new Scanner(System.in);

        double radius;
        int min = 0;
        int max = 0;
        for (int i = 0; i < count; i++){
            System.out.println("Введите радиус окружности: ");
            radius = sc.nextDouble();
            circleArr[i] = new Circle(radius);
            if (circleArr[i].getRadius() < max) {
                max = i;
            }
            if (circleArr[i].getRadius() > min){
                min = i;
            }
        }

        for (int i = 0; i<circleArr.length; i++) {
            for (int j = 0; j < circleArr.length; j++){
                if (circleArr[i].getRadius() > circleArr[j].getRadius()) {
                    Circle temp = circleArr[i];
                    circleArr[i] = circleArr[j];
                    circleArr[j] = temp;
                }
            }
        }

        System.out.println("Сортировка окружностей по их радиусу:");
        for (int i = 0; i < circleArr.length; i++) {
            int c = 1;
            System.out.println(c + "-й круг с диаметром = " + circleArr[i] + " сантиметров");
            c += 1;
        }
        System.out.println("Самая маленькая окружность с радиусом: " + circleArr[min] + " сантиметров");
        System.out.println("Самая большая окружность с радиусом: " + circleArr[max] + " сантиметров");
    }

}

