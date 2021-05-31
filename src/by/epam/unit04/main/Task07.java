package by.epam.unit04.main;

import java.util.Random;

public class Task07 {
    public static void main(String[] args) {
//        Задача 7
//        Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали

        int[][] mas = new int[5][5];
        Random rand = new Random();

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(9);
            }
        }

        for (int[] ma : mas) {
            for (int i : ma) {
                System.out.printf("[%1d] ", i);
            }
            System.out.println();
        }

        System.out.println("\n-------------------");
        System.out.println("Числа по диагонали: ");
        System.out.println("-------------------");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i == j) {
                    System.out.printf("[%1d] ", mas[i][j]);
                }
            }
        }
        System.out.println("\n-------------------");
        for (int i=mas.length-1,j=0;i>=0;i--) {
            System.out.printf("[%1d] ", mas[i][j]);
            j++;
        }
        System.out.println("\n-------------------");

    }
}
