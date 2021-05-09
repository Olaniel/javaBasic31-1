package by.epam.unit02.main;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
//        Задача 1
//        Найдите значение функции: z = (a – 3 ) * b / 2 + c.

        double a,b,c,z;

        Scanner scA = new Scanner(System.in);
        System.out.println("Введите значение a=");
        a = scA.nextDouble();

        Scanner scB = new Scanner(System.in);
        System.out.println("Введите значение b=");
        b = scB.nextDouble();

        Scanner scC = new Scanner(System.in);
        System.out.println("Введите значение c=");
        c = scC.nextDouble();


        z = (a - 3) * b / 2 + c;

        System.out.println("z = " + z);

    }
}
