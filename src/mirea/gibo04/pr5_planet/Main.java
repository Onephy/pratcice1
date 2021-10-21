package mirea.gibo04.pr5_planet;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Week day= Week.СУББОТА;
        Week num= day;
        System.out.println(day.ordinal()+1);
        System.out.println(num.name());
        for(Week i:day) {
            System.out.println(Week.values());
        }*/
        Planet planet = Planet.EARTH;
        System.out.println("Ваш вес: ");
        Scanner sc = new Scanner(System.in);
        int ves=sc.nextInt();
        double mas=ves/planet.surfaceGravity();
        for (Planet p : Planet.values())
            System.out.printf("Your weight on %s is %f%n", p, p.surfaceWeight(mas));
        DecimalFormat fmt=new DecimalFormat("#.##");
        for (Planet p : Planet.values())
            System.out.println("Вы весите на этой планете: "+p+" "+fmt.format(p.surfaceWeight(mas)));

    }
}
