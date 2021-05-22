package by.epam.unit02.main;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

        int x,y,x1,y1;

        Scanner scx = new Scanner(System.in);
        System.out.println("Введите значение X (от -6 до 8)");
        x = scx.nextInt();

        if (x >= -6 && x <= 8) {
            x1 = x;
        } else {
            System.out.println("Неверное число");
            return;
        }

        Scanner scy = new Scanner(System.in);
        System.out.println("Введите значение Y (от -4 до 7)");
        y = scy.nextInt();

        if (y >= -4 && y <= 7) {
            y1 = y;
        } else {
            System.out.println("Неверное число");
            return;
        }

        if (x1 >= -2 && x1 <= 2 && y1 >= 0 && y1 <= 4) {
            System.out.println("true");
        } else {
            if (x1 >= -4 && x1 <= 4 && y1 >= -3 && y1 <= 0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
