package mirea.gibo04.pr5_DayOfWeek;

import java.util.*;

public class WorkDays {
    public void takeLunch(Week dayOfWeek) {
        switch (dayOfWeek) {
            case SUNDAY:
                System.out.println("Воскресный обед! Сегодня можно даже немного сладкого");
                break;
            case MONDAY:
                System.out.println("Обед для понедельника: куриная лапша!");
                break;
            case TUESDAY:
                System.out.println("Вторник, сегодня суп из сельдерея :(");
                break;
            //...и так далее до конца
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Week.values()));

        int sundayIndex = Week.SUNDAY.ordinal();
        System.out.println(sundayIndex);

        Week sunday = Week.valueOf("SUNDAY");
        System.out.println(sunday);
    }

}
