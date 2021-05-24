package by.epam.unit03.main;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        //Задача 6
        //Даны два числа. Определить цифры, входящие в запись как первого так и второго числа

        Scanner in = new Scanner(System.in);

        int a;
        int b;

        System.out.print("Введите c: ");
        int c = in.nextInt();
        System.out.print("Введите d: ");
        int d = in.nextInt();

        System.out.println("c = " + c + ", " + "d = " + d);

        while (c > 0) {
            b = c % 10;
            c = c / 10;
            a = d;
            while (a > 0) {
                if (a % 10 == b) {
                    System.out.println("Совпадающие цифры: " + b);
                    break;
                }
                a = a / 10;

            }

        }


    }
}
