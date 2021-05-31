package by.epam.unit04.main;

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
//        Задача 1
//        Дана последовательность натуральных чисел а1 , а2 ,..., а. Создать массив из
//        четных чисел этой последовательности. Если таких чисел нет, то вывести
//        сообщение об этом факте.

        int[] mas = new int[10];
        int[] evenNumbers;
        int count = 0;
        Random rand = new Random();

        for (int i=0; i<mas.length; i++) {
            mas[i]= rand.nextInt(9);
            System.out.printf("[%1d]", mas[i]);
        }
        System.out.println();

        for (int ma : mas) {
            if (ma % 2 == 0) {
                count++;
            }
        }

        evenNumbers = new int[count];
        System.out.println("------------------------------");
        if(count==0) {
            System.out.println("there are no even numbers");
        } else {
            for(int i=0, x=0; i<mas.length; i++) {
                if(mas[i]%2==0) {
                    evenNumbers[x++]=mas[i];
                }
            }

            for (int evenNumber : evenNumbers) {
                System.out.printf("[%1d]", evenNumber);
            }
        }
    }
}
