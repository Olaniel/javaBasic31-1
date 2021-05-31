package by.epam.unit04.main;

import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
    //        Задача 2
    //        Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину
    //        числовой оси, содержащую все эти числа

        int[] mas = new int[10];
        int max;
        int min;
        Random rand=new Random();

        for (int i=0; i<mas.length; i++) {
            mas[i]=rand.nextInt(9);
            System.out.printf("[%1d]", mas[i]);
        }

        System.out.println("\n------------------------------");

        max=mas[0];
        min=mas[0];

        for (int ma : mas) {
            if (max < ma) {
                max = ma;
            } if (min > ma) {
                min = ma;
            }
        }

        System.out.println("max=" + max + ";\n" + "min="+min + ";\n"+ "diff="+(max-min));
    }
}
