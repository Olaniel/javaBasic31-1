package by.epam.unit04.main;

import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
//        Задача 3
//        Дан массив действительных чисел, размерность которого N. Подсчитать,
//        сколько в нем отрицательных, положительных и нулевых элементов.


        int[] mas = new int[10];
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = -10 + rand.nextInt(10 - (-10));
        }


        int a=0;
        int x=0;
        int y=0;

        for (double ma : mas) {
            System.out.printf("[%4.2f]", ma);

            if (ma < 0) {
                x++;
            } else if (ma > 0) {
                a++;
            } else {
                y++;
            }
        }
        System.out.println("\n------------------------------");
        System.out.println("element negative = " + x
                + "\nelement positive = " + a
                + "\nelement zero = " + y);
    }
}
