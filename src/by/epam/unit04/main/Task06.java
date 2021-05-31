package by.epam.unit04.main;

import java.util.Random;

public class Task06 {
    public static void main(String[] args) {
//        Задача 6
//        Дан двухмерный массив n×m элементов. Определить, сколько раз встречается
//        число 7 среди элементов массива

        int[][] mas = new int[10][10];
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(9);
            }
        }

        for (int[] ma : mas) {
            for (int i : ma) {

                System.out.printf("[%1d]", i);
            }
            System.out.println();
        }

        int count=0;

        for (int[] ma : mas) {
            for (int i : ma) {
                if (i == 7) {
                    count++;
                }
            }
        }
        System.out.println("------------------------------");
        System.out.println("number 7 is repeated = "+count);

    }
}
