package by.epam.unit02.main;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение: X" +"\n" + "значение X в диапазоне:  X <= -3 или X > 3");

        int xValue  = sc.nextInt();

        int x;
        double fx;

        x = xValue;

        if (x <= -3) {
            fx = 9;
        } else if(x > 3) {
            fx = 1 / (Math.pow(x, 2) + 1);
        } else {
            System.out.println("Неверный X");
            return;
        }

        System.out.println("F(x)=" + fx);


    }

}
