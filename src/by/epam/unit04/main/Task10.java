package by.epam.unit04.main;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
//        Задача 10
//        Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

        int[][]  mas =new int[6][6];

        for (int[] ma : mas) {
            Arrays.fill(ma, 1);
        }
        for (int i = 1; i < mas.length - 1; i++) {
            for (int j = 1; j < mas[i].length - 1; j++) {
                mas[i][j] = 0;
            }
        }
        for (int[] ma : mas) {
            for (int i : ma) {
                System.out.printf("[%2d] ", i);
            }
            System.out.println();
        }
    }
}
