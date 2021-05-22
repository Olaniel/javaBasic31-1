package by.epam.unit02.main;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
//        Задача 3
//        Дано натуральное число Т, которое представляет длительность прошедшего
//        времени в секундах. Вывести данное значение длительности в часах, минутах
//        и секундах в следующей форме: ННч ММмин SSc.
        int hour, min, sec,enteredSeconds;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите секунды: T=");
        int timeInSeconds = sc.nextInt();

        enteredSeconds = timeInSeconds;

        if ((timeInSeconds > 86400) || (timeInSeconds < 0)) {
            System.out.println("Неверное значение.");
            return;
        }

        hour = timeInSeconds / 3600;
        timeInSeconds = timeInSeconds - hour * 3600;
        min = timeInSeconds / 60;
        timeInSeconds = timeInSeconds - min * 60;
        sec = timeInSeconds;

        System.out.println("В " + enteredSeconds + " секундах: " + "\n" +
                hour + "ч. " + min + "мин. " + sec + "сек.");
    }

}
