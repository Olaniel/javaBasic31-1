package by.epam.unit03.main;

public class Task02 {

    public static void main(String[] args) {
        //Задача 2
        //С помощью оператора while напишите программу определения суммы всех
        //нечетных чисел в диапазоне от 1 до 99 включительно.
        int x;
        int y;
        int sum;

        x = 1;
        y = 99;
        sum = 0;

        while (x <= y){
            sum = x + sum;
            x = x + 2;
        }

        System.out.println("sum = " + sum);
    }
}
