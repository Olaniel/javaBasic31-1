package by.epam.unit04.main;

import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
//        Задача 4
//        Реализовать сортировки выбором или пузырьком по убыванию.

        int[] mas = new int[10];

        Random rand = new Random();

        for(int i=0; i<mas.length; i++) {
            mas[i]=rand.nextInt(9);
            System.out.printf("[%1d]",mas[i]);
        }

        int max;
        int temp;

        for (int i = 0; i < mas.length - 1; i++) {
            max = i;

            for (int j = i + 1; j < mas.length; j++) {
                if (mas[j] > mas[max]) {
                    max = j;
                }
            }

            temp = mas[i];
            mas[i] = mas[max];
            mas[max] = temp;
        }

        System.out.println("\n------------------------------");

        for (int ma : mas) {
            System.out.printf("[%1d]", ma);
        }

    }
}
