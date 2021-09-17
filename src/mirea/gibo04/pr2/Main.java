package mirea.gibo04.pr2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("Как тя звать?");
        //String name = in.nextLine();
        //int i = 2;
        //System.out.println("Привет " + name + "! Я компьютер");


        /*
        int a, b, c;
        System.out.println("Введите число");
        a = in.nextInt();
        System.out.println("Введите число");
        b = in.nextInt();
        c = a + b;
        System.out.println("C = " + c);
        */

        /*
        double[] mas = {3.14,4.15,5.12};
        for (int i = 0; i < mas.length;i++){
            System.out.println("Mas[" + i + "]=" + mas[i]);

        }


        double k = 0;
        for (int i = 0; i < mas.length; i++){
            k += mas[i];
        }
        System.out.println(k);

        */

        //ввод значений с клавиатуры и вывод на экран
        int[] var = new int[3];

        for (int i = 0; i < var.length; i++) {
            System.out.println("Введите число");
            var[i] = in.nextInt();
        }

        for (int i = 0; i < var.length; i++) {
            System.out.println("mas[" + i + "] = " + var[i]);
        }

        //среднее значение
        int summ = 0;
        int sr = 0;
        for (int i = 0; i < var.length; i++) {
            summ = summ + var[i];
        }

        sr = summ / var.length;
        System.out.println(summ);
        System.out.println(sr);


        // по убыванию - пузырьковая сортировка
        for (int i = 0; i < var.length; i++) {
            for (int j = 0; j < var.length; j++) {
                if (var[i] >= var[j]) {
                    int x = var[i];
                    var[i] = var[j];
                    var[j] = x;

                }
            }
        }

        for (int i = 0; i < var.length; i++) {
            System.out.println("var[" + i +"]=" + var[i]);
        }

        System.out.println();

        //по возрастанию - пузырьковая сортировка
        for (int j = 0; j<var.length; j++) {
            for (int k = 0; k < var.length; k++){
                if (var[j] < var[k]) {
                    int buffer = var[j];
                    var[j] = var[k];
                    var[k] = buffer;
                }
            }
        }

        for (int i = 0; i < var.length; i++) {
            System.out.println("var[" + i +"]=" + var[i]);
        }


        int min = var[0];
        int max = var[0];
        for (int i = 0; i < var.length; i++){
            if (min < max) {
                max = var[i];
            }
            else{
                min = var[i];
            }
        }

        System.out.println("Минимальное число в массиве: " + min);
        System.out.println("Максимальное число в массиве: " + max);
    }
}