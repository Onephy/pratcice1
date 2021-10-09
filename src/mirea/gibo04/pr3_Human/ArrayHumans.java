package mirea.gibo04.pr3_Human;

import java.util.*;
public class ArrayHumans {


    public static void main(String[] args) {
        Human[] humans = new Human[3];
        Scanner sc = new Scanner(System.in);

        // заполнение массива через консоль (ввод данных)
        int count = 1;
        String name;
        for (int i = 0; i < humans.length; i++) {
            System.out.println("Введите Имя человека " + count + "-го человека: ");
            name = sc.next();

            System.out.println("Размер руки: ");
            Hand hand = new Hand(sc.nextInt());

            System.out.println("Размер головы: ");
            Head head = new Head(sc.nextInt());

            System.out.println("Размер ноги: ");
            Leg leg = new Leg(sc.nextInt());

            humans[i] = new Human(name, hand, head, leg);
            count += 1;

        }

        // вывод данных массива
        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i]);
        }
        Human min = humans[0];
        Human max = humans[0];

        // подсчет минимального и максимального значения руки
        for (int i = 0; i < humans.length; i++) {
            if (max.getLL() > humans[i].getLL()) {
                max = humans[i];
            }
            if (min.getLL() < humans[i].getLL()) {
                min = humans[i];
            }
            if (max.getLH() > humans[i].getLH()){
                max = humans[i];
            }
            if (min.getLH() < humans[i].getLH()){
                min = humans[i];
            }
        }
        // сортировка людей по размеру рук, от большего к меньшему.
        for (int i = 0; i < humans.length-1; i++){
            for(int j = 0; j < humans.length-1; j++){
                if(humans[i].getLH() > humans[j].getLH()) {
                    Human tmp = humans[i];
                    humans[i] = humans[j];
                    humans[j] = tmp;
                }
            }
        }

        count = 1;
        // вывод отсортированного массива
        for (int i = 0; i < humans.length; i++) {
            System.out.println("У этого человека " + count + "-й размер руки из всех людей по счету (от большего)");
            System.out.println(humans[i]);
            count++;
        }

        // сортировка людей по размеру ноги, от меньшего к большему.
        for (int i = 0; i < humans.length-1; i++){
            for(int j = 0; j < humans.length-1; j++){
                if(humans[i].getLL() < humans[j].getLL()) {
                    Human tmp = humans[i];
                    humans[i] = humans[j];
                    humans[j] = tmp;
                }
            }
        }

        count = 1;
        for (int i = 0; i < humans.length; i++) {
            System.out.println("У этого человека " + count + "-й размер ноги из всех людей по счету (от меньшего)");
            System.out.println(humans[i]);
            count ++;
        }

     }
}

