package by.epam.unit04.main;

import java.util.Random;

public class Task08 {
    public static void main(String[] args) {
//        Задача 8
//        Дана матрица. Вывести k-ю строку и p-й столбец матрицы

        int n=5;
        int m=5;

        int[][] mas=new int[n][m];
        Random  rand =new Random();

        for (int i=0; i<mas.length; i++) {
            for (int j=0; j<mas[i].length; j++) {
                mas[i][j]=rand.nextInt(9);
                System.out.printf("[%1d]",mas[i][j]);
            }
            System.out.println();
        }

        System.out.println("_______________\n");

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i == 2 | j == 2) {
                    System.out.printf("[%1d]", mas[i][j]);
                } else {
                    System.out.print("[*]");
                }
            }
            System.out.println();
        }
    }
}
