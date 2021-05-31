package by.epam.unit03.main;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
           //Задача 8
           //Написать программу, в которой вводятся два операнда Х и Y и знак операции
           //(+, –, /, *). Вычислить результат Z в зависимости от знака. Предусмотреть
           //реакции на возможный неверный знак операции, а также на ввод Y=0 при
           //делении. Организовать возможность многократных вычислений без
           //перезагрузки программа (т.е. построить цикл). В качестве символа
           //прекращения вычислений принять ‘#’

        Scanner sc = new Scanner(System.in);

        String sign;
        double x;
        double y;
        double result = 0;

        for (;true;) {
            System.out.print("Ввести значение X = ");
            if (sc.hasNext("#")) {
                System.out.print("Прекращение вычислений");
                sc.close();
                break;
            }
            while (!sc.hasNextDouble()) {
                System.out.print("");
                sc.nextLine();
            }
            x = sc.nextDouble();
            System.out.print("Ввести значение Y = ");
            if (sc.hasNext("#")) {
                System.out.print("Прекращение вычислений");
                sc.close();
                break;
            }
            while (!sc.hasNextDouble()) {
                System.out.print("");
                sc.nextLine();
            }
            y = sc.nextDouble();
            System.out.print("Ввести знак операции (+, –, /, *)");
            if (sc.hasNext("#"))  {
                System.out.print("Прекращение вычислений");
                sc.close();
                break;
            }
            sign = sc.next();
            switch (sign) {
                case "+":
                    result = x + y;
                    break;
                case "-":
                    result = x - y;
                    break;
                case "/":
                    if (y == 0) {
                    System.out.println("!!!Деление на ноль невозможно!!!");
                    } else {
                    result = x / y;
                    }
                    break;
                case "*":
                    result = x * y;
                    break;
                default :
                    System.out.println("Неизвестный знак");
                    break;
            }
            System.out.println("result = " + result);
        }



    }// Зачтено
}
