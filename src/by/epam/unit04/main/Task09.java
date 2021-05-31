package by.epam.unit04.main;

public class Task09 {
    public static void main(String[] args) {
//        Задача 9
//        Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

        int[][]  mas =new int[6][6];

        for (int i=0, j=mas[i].length-1; i<mas.length; i++) {
            mas[i][j--]=i+1;
        }

        for (int[] ma : mas) {
            for (int i : ma) {
                System.out.printf("[%1d]", i);
            }
            System.out.println();
        }

    }
}
